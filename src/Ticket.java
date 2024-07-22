import java.time.LocalDateTime;

public class Ticket {
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

    public Ticket(String concertHall, int eventCode, long time){
        if (concertHall.length() > 10){
            throw new IllegalArgumentException("Concert Hall must be a maximum of 10 characters");
        }
        if (eventCode<100 || eventCode>999){
            throw new IllegalArgumentException("Event Code must be a 3 digits");
        }

        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.creationTime = LocalDateTime.now();
    }

    public Ticket(String ID, String concertHall, int eventCode, long time, boolean isPromo, char stadiumSector, double maxAllowedBackpackWeight) {
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

        this.ID = ID;
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxAllowedBackpackWeight = maxAllowedBackpackWeight;
        this.creationTime = LocalDateTime.now();
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
