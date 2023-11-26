import java.util.ArrayList;
import java.util.Scanner;

public class Searchhandler {

    private Phonebook contacts;

    Scanner sc = new Scanner(System.in);

    public Searchhandler(Phonebook contacts) {
        this.contacts = contacts;

    }


    public void firstname() {
        System.out.println("Search Firstname: ");
        String input = sc.nextLine();
        boolean userFound = false;

        ArrayList<Profiles> profilelist = contacts.getProfiles();


        for (Profiles profile : profilelist) {

            if (input.equalsIgnoreCase(profile.getFirstname())) {
                System.out.println("User found! \n----------------------------- ");
                System.out.println(profile);
                System.out.println("------------------------------ \n");
                userFound = true;

            }
        }
        if(!userFound) {
            System.out.println("User not found! ");
        }


    }


    public void lastname() {
        System.out.println("Search Lastname: ");
        String input = sc.nextLine();
        boolean userFound = false;

        ArrayList<Profiles> profilelist = contacts.getProfiles();

        for (Profiles profile : profilelist) {

            if (input.equalsIgnoreCase(profile.getLastname())) {
                System.out.println("User found! \n----------------------------- ");
                System.out.println(profile);
                System.out.println("------------------------------ \n");
                userFound = true;

            }

        }

        if(!userFound) {
            System.out.println("User not found! ");
        }

    }


    public void phonenumber() {
        System.out.println("Search Phonenumber: ");
        String input = sc.nextLine();
        boolean userFound = false;

        ArrayList<Profiles> profilelist = contacts.getProfiles();


        for (Profiles profile : profilelist) {

            if (input.equalsIgnoreCase(profile.getPhoneNumber())) {
                System.out.println("User found! \n----------------------------- ");
                System.out.println(profile);
                System.out.println("------------------------------ \n");
                userFound = true;
            }

        }

        if(!userFound) {
            System.out.println("User not found! ");
        }
    }


    public void nofilter() {
        System.out.println("No filter search: ");
        String input = sc.nextLine();
        boolean userFound = false;

        ArrayList<Profiles> profilelist = contacts.getProfiles();


        for (Profiles profile : profilelist) {


            if (profile.getFirstname().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getLastname().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getPhoneNumber().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getCity().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getZipcode().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getCounty().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getStreetName().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getStreetNumber().toLowerCase().contains(input.toLowerCase())) {
                System.out.println("User found! \n----------------------------- ");
                System.out.println(profile);
                System.out.println("------------------------------ \n");
                userFound = true;
            }
        }

        if(!userFound) {
                System.out.println("User not found! ");
            }



    }


    public void replace() {
        System.out.println("No filter search: ");
        String input = sc.nextLine();
        boolean userFound = false;

        ArrayList<Profiles> profilelist = contacts.getProfiles();


        for (Profiles profile : profilelist) {


            if (profile.getFirstname().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getLastname().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getPhoneNumber().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getCity().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getZipcode().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getCounty().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getStreetName().toLowerCase().contains(input.toLowerCase()) ||
                    profile.getStreetNumber().toLowerCase().contains(input.toLowerCase())) {
                System.out.println("User found! \n----------------------------- ");
                System.out.println(profile);
                System.out.println("------------------------------ \n");
                userFound = true;
            }
        }

        if(!userFound) {
            System.out.println("User not found! ");
        }



    }


}
