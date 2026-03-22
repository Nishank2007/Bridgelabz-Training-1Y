package out.gla.MarkerInterface;
public class UserData implements Backup {

    private String username;
    private String email;

    public UserData(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public void display() {
        System.out.println(username + " - " + email);
    }
}