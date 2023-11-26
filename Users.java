import java.util.Scanner;

public class Users {

    private Admin admin;

    public Users(Admin admin) {
        this.admin = admin;
    }

    private String username;
    private String password;
    private boolean adminstatus;

    Scanner sc = new Scanner(System.in);

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean getAdminstatus() {
        return this.adminstatus;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAdminstatus(boolean adminstatus) {
        this.adminstatus = adminstatus;
    }


    public void authenticator() {
        System.out.println("Username: ");
        String user = sc.nextLine();
        setUsername(user);
        if(!getUsername().equalsIgnoreCase("Admin")) {
            System.out.println("DENIED ACCESS");
            setAdminstatus(false);
        }
        System.out.println("Password: ");
        String pass = sc.nextLine();
        setPassword(pass);
        if(!getPassword().equalsIgnoreCase("1234")) {
            System.out.println("DENIED ACCESS");
            setAdminstatus(false);
        }
        else if (getUsername().equalsIgnoreCase("Admin") && getPassword().equalsIgnoreCase("1234")) {
            setAdminstatus(true);
            System.out.println("Administrator Access granted");
            admin.admin();

        }


    }

}
