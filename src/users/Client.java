package users;

public class Client extends User{
    private final String role = "Client";

    @Override
    public void printRole(){
        System.out.println("Role: " + this.role);
    }
    public void getTicket(){
        System.out.println("This is client's ticket");
    }
}
