package models;

import java.time.LocalDateTime;

public class Ticket extends Id {
    private String ID;
    private String concertHall;
    private int eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxAllowedBackpackWeight;
    private LocalDateTime creationTime;

    public Ticket(){
        this.creationTime = LocalDateTime.now();
    }

    public static Ticket createLimitedTicket(String concertHall, int eventCode, long time){
        Ticket limitedTicket = new Ticket();
        if (concertHall.length() > 10){
            throw new IllegalArgumentException("Concert Hall must be a maximum of 10 characters");
        }
        if (eventCode<100 || eventCode>999){
            throw new IllegalArgumentException("Event Code must be a 3 digits");
        }

        limitedTicket.concertHall = concertHall;
        limitedTicket.eventCode = eventCode;
        limitedTicket.time = time;
        limitedTicket.creationTime = LocalDateTime.now();

        return limitedTicket;
    }

    public static Ticket createFullTicket(String ID, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight){
        Ticket fullTicket = new Ticket();
        if (ID.length()>4){
            throw new IllegalArgumentException("ID must be a maximum of 4 digits and/or chars");
        }
        if (concertHall.length() > 10){
            throw new IllegalArgumentException("Concert Hall must be a maximum of 10 characters");
        }
        if (eventCode<100 || eventCode>999){
            throw new IllegalArgumentException("Event Code must be a 3 digits");
        }
        if (stadiumSector!='A' && stadiumSector!='B' && stadiumSector!='C'){
            throw new IllegalArgumentException("Stadium sector must be 'A', 'B' or 'C'");
        }

        fullTicket.ID = ID;
        fullTicket.concertHall = concertHall;
        fullTicket.eventCode = eventCode;
        fullTicket.time = time;
        fullTicket.isPromo = isPromo;
        fullTicket.stadiumSector = stadiumSector;
        fullTicket.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
        fullTicket.creationTime = LocalDateTime.now();

        return fullTicket;
    }

    public void changeTime(long time){
        this.time = time;
    }

    public void changeStadiumSector(char stadiumSector){
        if (stadiumSector!='A' && stadiumSector!='B' && stadiumSector!='C'){
            throw new IllegalArgumentException("Stadium sector must be 'A', 'B' or 'C'");
        }
        this.stadiumSector = stadiumSector;
    }

    public void share(String phone){
        System.out.println("Sharing ticket by phone number: " + phone);
    }

    public void share(String phone, String email){
        System.out.println("Sharing ticket by phone number: " + phone + " and email: " + email);
    }

    public String getID() {
        return ID;
    }

    public String getConcertHall() {
        return concertHall;
    }

    public int getEventCode() {
        return eventCode;
    }

    public long getTime() {
        return time;
    }

    public boolean isPromo() {
        return isPromo;
    }

    public char getStadiumSector() {
        return stadiumSector;
    }

    public double getMaxAllowedBackpackWeight() {
        return maxAllowedBackpackWeight;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    @Override
    public int hashCode() {
        int result = ID.hashCode();
        result = 31 * result + concertHall.hashCode();
        result = 31 * result + eventCode;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Ticket ticket = (Ticket) obj;
        return ID.equals(ticket.ID) && concertHall.equals(ticket.concertHall) &&
                eventCode == ticket.eventCode && time == ticket.time &&
                isPromo == ticket.isPromo && stadiumSector == ticket.stadiumSector &&
                maxAllowedBackpackWeight == ticket.maxAllowedBackpackWeight &&
                creationTime.equals(ticket.creationTime);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ID='" + ID + '\'' +
                ", concertHall='" + concertHall + '\'' +
                ", eventCode=" + eventCode +
                ", time=" + time +
                ", isPromo=" + isPromo +
                ", stadiumSector=" + stadiumSector +
                ", maxAllowedBackpackWeight=" + maxAllowedBackpackWeight +
                ", creationTime=" + creationTime +
                '}';
    }
}
