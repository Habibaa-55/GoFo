package Booking;


/**
 *
 * @author habiba
 */
public class Player1 {
 private String PlayerName;
 private int PlayerID;
 private String PlayerPassword;
 private String PlayerEmail;
 private int PhoneNumber;
 private String PlayerDefultLocation;

    /**
     *
     */
    public Player1(){
 
 }

    /**
     *
     * @param name
     * @param ID
     * @param password
     * @param email
     * @param phone
     * @param location
     */
    public Player1(String name,int ID,String password,String email,int phone,String location){
 PlayerName=name;
 PlayerID=ID;
 PlayerPassword=password;
 PlayerEmail=email;
 PhoneNumber=phone;
 PlayerDefultLocation=location;
 }

    /**
     *
     * @return
     */
    public String getPlayerName() {
        return PlayerName;
    }

    /**
     *
     * @param PlayerName
     */
    public void setPlayerName(String PlayerName) {
        this.PlayerName = PlayerName;
    }

    /**
     *
     * @return
     */
    public int getPlayerID() {
        return PlayerID;
    }

    /**
     *
     * @param PlayerID
     */
    public void setPlayerID(int PlayerID) {
        this.PlayerID = PlayerID;
    }

    /**
     *
     * @return
     */
    public String getPlayerPassword() {
        return PlayerPassword;
    }

    /**
     *
     * @param PlayerPassword
     */
    public void setPlayerPassword(String PlayerPassword) {
        this.PlayerPassword = PlayerPassword;
    }

    /**
     *
     * @return
     */
    public String getPlayerEmail() {
        return PlayerEmail;
    }

    /**
     *
     * @param PlayerEmail
     */
    public void setPlayerEmail(String PlayerEmail) {
        this.PlayerEmail = PlayerEmail;
    }

    /**
     *
     * @return
     */
    public int getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     *
     * @param PhoneNumber
     */
    public void setPhoneNumber(int PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     *
     * @return
     */
    public String getPlayerDefultLocation() {
        return PlayerDefultLocation;
    }

    /**
     *
     * @param PlayerDefultLocation
     */
    public void setPlayerDefultLocation(String PlayerDefultLocation) {
        this.PlayerDefultLocation = PlayerDefultLocation;
    }
}

