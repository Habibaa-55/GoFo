package Booking;

import java.util.ArrayList;
import java.util.List;

public class Booking {
	private  List<String> playerSlots=new ArrayList<>();
	private  List<Player1> players=new ArrayList<>();
	private  List<Playground>playg=new ArrayList<>();
	//private double hoursNumber;
	public void addPlayer(Player1 p) {
		players.add(p);
	}
	public void addPlayground(Playground g) {
		playg.add(g);
	}
	public void printSlots() {
		for (int i=0; i<playg.size(); i++) {
			Playground g=playg.get(i);
			System.out.printf("PlaygroundID= %d%n",g.getId());
			g.printSlots();
		}
	}
	public void book(int id, Player1 p,String s) {
		playerSlots.add(String.valueOf(p.getPlayerID()));
		playerSlots.add(s);
		for (int i=0; i<playg.size(); i++) {
			if (playg.get(i).getId()==id) {
				playg.get(i).removeSlot(s);
				playg.get(i).setAvalibleHours(playg.get(i).getAvalibleHours()-1);
				break;
			}
		}
	}
}