public class TicketService {
    public static void main(String[] args){
        Ticket emptyTicket = new Ticket();
        System.out.println(emptyTicket);

        Ticket fullTicket = new Ticket("12C4", "Blue Hall", 254, 1721826000, true, 'A', 5.0);
        System.out.println(fullTicket);

        Ticket limitedTicket = new Ticket("Main Hall", 326, 1721826000);
        System.out.println(limitedTicket);
    }
}
