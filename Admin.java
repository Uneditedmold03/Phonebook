import java.util.Scanner;

public class Admin {

    private Phonebook contacts;
    private SearchEngine search;
    private Updateprofileinfo updateprofileinfo;

    Scanner sc = new Scanner(System.in);

    public Admin(Phonebook contacts, SearchEngine search, Updateprofileinfo updateprofileinfo) {
        this.contacts = contacts;
        this.search = search;
        this.updateprofileinfo = updateprofileinfo;

    }

    public void admin() {

        System.out.println("You now have Administrator privileges");

        boolean isprogramRunning = true;
        while (isprogramRunning == true) {


            System.out.println("To view the Phonebook press [1] \n" +
                    "To add a profile press [2] \n" +
                    "To search for a profile in the Phonebook press [3] \n" +
                    "To update an existing profile press [4] \n" +
                    "To Delete a profile press [5] \n" +
                    "To Logout press [6]");


            int Options = Integer.parseInt(sc.nextLine());

            switch (Options) {

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
                    updateprofileinfo.getListNumber();
                    System.out.println("\nSelect which Existing Profile to Update");

                    int input = Integer.parseInt(sc.nextLine());
                    updateprofileinfo.getProfileByIndex(input);
                    break;

                case 5:
                    updateprofileinfo.getListNumber();
                    System.out.println("\nSelect profile to remove");

                    int input1 = Integer.parseInt(sc.nextLine());
                    updateprofileinfo.removeProfileByIndex(input1);
                    break;

                case 6:
                    System.out.println("Logout");
                    isprogramRunning = false;
                    break;

                default:
                    System.out.println("System Error");
                    break;

            }

        }

    }


}
