package users;

public class Admin extends User{
    private final String role = "Admin";

    public void checkTicket(){
        System.out.println("Admin is checking the ticket");
    }

    @Override
    public void printRole() {
        System.out.println("Role: " + this.role);
    }
}
