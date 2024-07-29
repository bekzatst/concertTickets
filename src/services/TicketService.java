package services;

import models.Id;
import models.Ticket;
import users.Admin;
import users.Client;

public class TicketService extends Id {
    public static void main(String[] args){
        Ticket emptyTicket = new Ticket();
        System.out.println(emptyTicket);

        Ticket fullTicket = Ticket.createFullTicket("12C4", "Blue Hall", 254, 1721826000, true, 'A', 5.0);
        System.out.println(fullTicket);

        Ticket limitedTicket = Ticket.createLimitedTicket("Main Hall", 326, 1721826000);
        System.out.println(limitedTicket);

        fullTicket.changeTime(1721827000);

        fullTicket.changeStadiumSector('B');

        System.out.println(fullTicket);

        fullTicket.share("+7 123 456 78 90");

        fullTicket.share("+7 123 456 78 90", "john@mail.com");
        fullTicket.print();

        Client client = new Client();
        client.getTicket();
        client.printRole();

        Admin admin = new Admin();
        admin.setId(1278);
        System.out.println("Id of admin object: " + admin.getId());
        admin.checkTicket();
        admin.printRole();
    }
}
