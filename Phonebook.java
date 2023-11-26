import java.util.ArrayList;

public class Phonebook {


    private Addcontact contact;
    private existingprofiles databank;


    public Phonebook(Addcontact contact, existingprofiles databank) {
        this.contact = contact;
        this.databank = databank;

    }

    public void addProfileToBook() {
        contact.addProfile();
    }


    public ArrayList<Profiles> getProfiles() {


        ArrayList<Profiles> profilesFromContact = contact.getProfiles();
        ArrayList<Profiles> profilesFromDatabank = databank.getProfiles();

        // Combine profiles from both sources
        ArrayList<Profiles> combinedProfiles = new ArrayList<>(profilesFromContact);
        combinedProfiles.addAll(profilesFromDatabank);

        return combinedProfiles;

    }


    public void getList() {

        ArrayList<Profiles> profileList = getProfiles();

        for (Profiles profile : profileList) {
            System.out.println("First Name: " + profile.getFirstname());
            System.out.println("Last Name: " + profile.getLastname());
            System.out.println("Age: " + profile.getAge());
            System.out.println("PhoneNumber: " + profile.getPhoneNumber());
            System.out.println("City: " + profile.getCity());
            System.out.println("Zip Code: " + profile.getZipcode());
            System.out.println("County: " + profile.getCounty());
            System.out.println("StreetName: " + profile.getStreetName());
            System.out.println("StreetNumber: " + profile.getStreetNumber());
            System.out.println("-----------------------");

        }

    }


    public void removeProfileFromBook(Profiles profile) {
        contact.removeProfile(profile);
        databank.removeProfile(profile);
    }


}
