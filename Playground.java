package Booking;
/**
 *
 * @author Merna
 */
import java.util.ArrayList;
import java.util.List;

public class Playground {
	private String name;
    private double playgroundSize;
    private double avalibleHours ;
    private Player1 owner;
    private double price;
    private int playGroundID;
    private List<String> slots=new ArrayList<String>();
    private String cancellationPeriod;
    private String playgroundLocation;
    public void setOwner(Player1 p) {
    	owner=p;
    }
    public Player1 getOwner() {
    	return owner;
    }
    public void setSlots(List<String> s) {
    	slots=s;
    }
    public void setName(String s) {
    	name=s;
    }
    public String getName() {
    	return name;
    }
    public void printSlots() {
    	System.out.println(slots);
    }
    public void removeSlot(String s) {
    	slots.remove(new String(s));
    }
    public int getId() {
    	return playGroundID;
    }
    public void setId(int id) {
    	playGroundID=id;
    }
    public List<String> getSlots(){
    	return slots;
    }
    public String getPlaygroundLocation() {
        return playgroundLocation;
    }

    public void setPlaygroundLocation(String playgroundlocation2) {
        this.playgroundLocation = playgroundlocation2;
    }

    public double getPlaygroundSize() {
        return playgroundSize;
    }

    public void setPlaygroundSize(double playgroundSize) {
        this.playgroundSize = playgroundSize;
    }

    public double getAvalibleHours() {
        return avalibleHours;
    }

    public void setAvalibleHours(double avalibleHours) {
        this.avalibleHours = avalibleHours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCancellationPeriod() {
        return cancellationPeriod;
    }

    public void setCancellationPeriod(String cancellationPeriod) {
        this.cancellationPeriod = cancellationPeriod;
    }
	
}
