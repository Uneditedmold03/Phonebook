import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Addcontact addcontact = new Addcontact();
        existingprofiles data = new existingprofiles();
        Phonebook contacts = new Phonebook(addcontact, data);
        Searchhandler searchhandler = new Searchhandler(contacts);
        SearchEngine search = new SearchEngine(contacts, searchhandler);
        Updateprofileinfo updateprofile = new Updateprofileinfo(contacts);
        Admin admin = new Admin(contacts, search, updateprofile);
        Users users = new Users(admin);


        ////////////////////////////////////////////////////////////////////////////////////
        // To login as admin on the system: The username is: admin, the password is: 1234 //
        ////////////////////////////////////////////////////////////////////////////////////


        Scanner sc = new Scanner(System.in);

        System.out.println("You are currently a guest user, sign in to gain administrator privileges");

        data.databank();

        boolean isprogramRunning = true;
        while (isprogramRunning == true) {

        System.out.println("To view the Phonebook press [1] 4\n" +
                "To add a profile press [2] \n" +
                "To search for a profile in the Phonebook press [3] \n" +
                "To sign in as an admin press [4] \n" +
                "To Exit program press [5]");


        int option = Integer.parseInt(sc.nextLine());


            switch (option) {

                case 1:
                    System.out.println("Phonebook");
                    contacts.getList();
                    break;

                case 2:
                    System.out.println("Add Profile");
                    contacts.addProfileToBook();
                    break;

                case 3:
                    System.out.println("Search for a Profile");
                    search.searchEngine();
                    break;

                case 4:
                    System.out.println("Login as admin");
                    users.authenticator();
                    break;

                case 5:
                    System.out.println("Exit Program");
                    isprogramRunning = false;
                    break;

                default:
                    System.out.println("System Failure");
                    break;

            }

        }

    }
}