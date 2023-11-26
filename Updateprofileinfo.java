import java.util.ArrayList;
import java.util.Scanner;

public class Updateprofileinfo {

    private Phonebook phonebook;

    public Updateprofileinfo(Phonebook phonebook) {
        this.phonebook = phonebook;
    }

    public ArrayList<Profiles> getProfiles() {
        return phonebook.getProfiles();
    }


    Scanner sc = new Scanner(System.in);


    public void getListNumber() {

        ArrayList<Profiles> profileList = getProfiles();

        for (int i = 0; i < profileList.size(); i++) {
            Profiles profile = profileList.get(i);
            System.out.println("\nProfile Number: " + i + "\n---------------------------------");
            System.out.println("First Name: " + profile.getFirstname());
            System.out.println("Last name: " + profile.getLastname());
            System.out.println("Age: " + profile.getAge());
            System.out.println("Phonenumber: " + profile.getPhoneNumber());
            System.out.println("City: " + profile.getCity());
            System.out.println("Zipcode: " + profile.getZipcode());
            System.out.println("Country: " + profile.getCounty());
            System.out.println("StreetName: " + profile.getStreetName());
            System.out.println("StreetNumber: " + profile.getStreetNumber());

        }

    }



    public Profiles getProfileByIndex(int index) {
        ArrayList<Profiles> profileList = getProfiles();
        if (index >= 0 && index < profileList.size()) {
            Profiles profile = profileList.get(index);
            System.out.println("You have selected: \n" + profile);
            changeProfileinfo(profile);
            return profile;

        } else {
            System.out.println("Error: Profile not found! ");
            return null;
        }
    }


    public Profiles removeProfileByIndex(int index) {
        ArrayList<Profiles> profileList = phonebook.getProfiles();

        if (index >= 0 && index < profileList.size()) {
            Profiles profileToDelete = profileList.get(index);
            phonebook.removeProfileFromBook(profileToDelete);
            System.out.println("Profile removed successfully.");
            return profileToDelete;

        } else {
            System.out.println("Invalid index number");
            return null;
        }
    }

    public void changeProfileinfo(Profiles profile) {

        boolean isprogramRunning = true;
        while (isprogramRunning == true) {


            System.out.println("Which property do you want to change?");
            System.out.println("1: First name");
            System.out.println("2: Last name");
            System.out.println("3: Age");
            System.out.println("4: Phonenumber");
            System.out.println("5: City");
            System.out.println("6: Zipcode");
            System.out.println("7: Country");
            System.out.println("8: StreetName");
            System.out.println("9: StreetNumber");
            System.out.println("10: Exit");

            int Options = Integer.parseInt(sc.nextLine());

            switch (Options) {

                case 1:
                    System.out.println("Enter new first name: ");
                    String newFName = sc.nextLine();
                    profile.setFirstname(newFName);
                    System.out.println("First name changed to: " + profile.getFirstname());
                    break;

                case 2:
                    System.out.println("Enter new last name: ");
                    String newLName = sc.nextLine();
                    profile.setLastname(newLName);
                    System.out.println("Last name changed to: " + profile.getLastname());
                    break;

                case 3:
                    System.out.println("Enter new Age: ");
                    String newAge = sc.nextLine();
                    profile.setAge(newAge);
                    System.out.println("Age changed to: " + profile.getAge());
                    break;

                case 4:
                    System.out.println("Enter new Phonenumber: ");
                    String newPhone = sc.nextLine();
                    profile.setPhoneNumber(newPhone);
                    System.out.println("Phonenumber changed to:" + profile.getPhoneNumber());
                    break;

                case 5:
                    System.out.println("Enter new City: ");
                    String newCity = sc.nextLine();
                    profile.setCity(newCity);
                    System.out.println("City changed to: " + profile.getCity());
                    break;

                case 6:
                    System.out.println("Enter new Zipcode: ");
                    String newZip = sc.nextLine();
                    profile.setZipcode(newZip);
                    System.out.println("Zipcode changed to: " + profile.getZipcode());
                    break;

                case 7:
                    System.out.println("Enter new Country: ");
                    String newCountry = sc.nextLine();
                    profile.setCounty(newCountry);
                    System.out.println("Country changed to: " + profile.getCounty());
                    break;

                case 8:
                    System.out.println("Enter new Streetname: ");
                    String newStName = sc.nextLine();
                    profile.setStreetName(newStName);
                    System.out.println("Streetname changed to: " + profile.getStreetName());
                    break;

                case 9:
                    System.out.println("Enter new Streetnumber: ");
                    String newStNr = sc.nextLine();
                    profile.setStreetNumber(newStNr);
                    System.out.println("Streetnumber changed to: " + profile.getStreetNumber());
                    break;


                case 10:
                    isprogramRunning = false;
                    break;

                default:
                    System.out.println("System Error");
            }

        }


    }


}
