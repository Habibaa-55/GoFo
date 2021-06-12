package Booking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		Booking booking=new Booking();
		while(true) {
			System.out.println("1- register as Player" + "\r\n" + "2- register as playground Owner"+ "\r\n" +"3- exit");

            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            if (choice==1) {
            	Player1 player=new Player1();
                System.out.println("Please Enter Your Name!");
                String name =in.next();
                player.setPlayerName(name);
                
                System.out.println("Please Enter Your ID!");
                int ID=in.nextInt();
                player.setPlayerID(ID);
                
                System.out.println("Please Enter Your Password!");
                String password =in.next();
                player.setPlayerPassword(password);
                
                System.out.println("Please Enter Your Email!");
                String email =in.next();
                player.setPlayerEmail(email);
                
                System.out.println("Please Enter Your Phone!");
                int phone =in.nextInt();
                player.setPhoneNumber(phone);
                
                System.out.println("Please Enter Your Location!");
                String location =in.next();
                player.setPlayerDefultLocation(location);
                booking.addPlayer(player);
                System.out.println("1- book 2- back");
                int choice2 =in.nextInt();
                if (choice2==1) {
                	booking.printSlots();
                	System.out.println("choose the playground id and slot");
                	int id =in.nextInt();
                	String s =in.next();
                	booking.book(id, player,s);
                	System.out.println("Done");
                	continue;
                }
                else {
                	continue;
                }
                
            }
            if (choice==2) {
            	Player1 player=new Player1();
                System.out.println("Please Enter Your Name!");
                String name =in.next();
                player.setPlayerName(name);
                
                System.out.println("Please Enter Your ID!");
                int ID=in.nextInt();
                player.setPlayerID(ID);
                
                System.out.println("Please Enter Your Password!");
                String password =in.next();
                player.setPlayerPassword(password);
                
                System.out.println("Please Enter Your Email!");
                String email =in.next();
                player.setPlayerEmail(email);
                
                System.out.println("Please Enter Your Phone!");
                int phone =in.nextInt();
                player.setPhoneNumber(phone);
                
                System.out.println("Please Enter Your Location!");
                String location =in.next();
                player.setPlayerDefultLocation(location);
                booking.addPlayer(player);
                System.out.println("Please enter the Playground  information Name ,id, playground location , cancellation period, price, AvalibleHours, Playground Size: ");
                
                Playground playground=new Playground();
                playground.setOwner(player);
                System.out.println("name:");
                String playgroundName= in.next();
                playground.setName(playgroundName);
                System.out.println("id:");
                int id= in.nextInt();
                playground.setId(id);
                System.out.println("loc:");        
                String playgroundLocation= in.next();
                playground.setPlaygroundLocation(playgroundLocation);
                System.out.println("cancellationPeriod:");
                String cancellationPeriod= in.next();
                playground.setCancellationPeriod(cancellationPeriod);      
                System.out.println("price:");        
                Double price= in.nextDouble();
                playground.setPrice(price);
                System.out.println("hours:");  
                int avalibleHours= in.nextInt();
                playground.setAvalibleHours(avalibleHours);
                System.out.println("size:");  
                int PlaygroundSize= in.nextInt();
                playground.setPlaygroundSize(PlaygroundSize);
                List<String> slots=new ArrayList<>();
                for (int i=0; i<avalibleHours; i++) {
                	System.out.println("enter avalibale slot");
                	String slot= in.next();
                	slots.add(slot);
                        
                }
                playground.setSlots(slots);
                booking.addPlayground(playground);
                System.out.println("1-show avalibale slots 2-back");
                int choice3 =in.nextInt();
                if (choice3==1) {
                	playground.printSlots();
                }
                else {
                	continue;
                }
            }
            else {
            	break;
            }
		}
	}
}

