import java.util.ArrayList;
import java.util.Scanner;

public class Addcontact {

    private ArrayList<Profiles> profilelist = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void addProfile() {
        Profiles createprofile = new PhonebookProfileCreator();
        System.out.println("First name: ");
        String firstname = sc.nextLine();
        createprofile.setFirstname(firstname);
        System.out.println(firstname);

        System.out.println("Last name: ");
        String lastname = sc.nextLine();
        createprofile.setLastname(lastname);

        System.out.println("Age: ");
        String age = sc.nextLine();
        createprofile.setAge(age);

        System.out.println("Phonenumber: ");
        String phonenumber = sc.nextLine();
        createprofile.setPhoneNumber(phonenumber);

        System.out.println("City: ");
        String city = sc.nextLine();
        createprofile.setCity(city);

        System.out.println("Zipcode: ");
        String zipcode = sc.nextLine();
        createprofile.setZipcode(zipcode);

        System.out.println("County: ");
        String county = sc.nextLine();
        createprofile.setCounty(county);

        System.out.println("Street: ");
        String street = sc.nextLine();
        createprofile.setStreetName(street);

        System.out.println("Street number: ");
        String streetnr = sc.nextLine();
        createprofile.setStreetNumber(streetnr);

        profilelist.add(createprofile);

    }

    public void removeProfile(Profiles profile) {
        profilelist.remove(profile);
    }


    public ArrayList<Profiles> getProfiles() {
        return profilelist;
    }


}
