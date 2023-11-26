import java.util.ArrayList;

public class existingprofiles {


    private ArrayList<Profiles> profilelist = new ArrayList<>();


    public void databank() {
        Profiles createprofile1 = new PhonebookProfileCreator();
        createprofile1.setFirstname("Erik");
        createprofile1.setLastname("Andersson");
        createprofile1.setAge("32");
        createprofile1.setPhoneNumber("073-755 92 76");
        createprofile1.setCity("Stockholm");
        createprofile1.setZipcode("57345");
        createprofile1.setCounty("Stockholm County");
        createprofile1.setStreetName("Bagargatan");
        createprofile1.setStreetNumber("42");

        profilelist.add(createprofile1);

        Profiles createprofile2 = new PhonebookProfileCreator();
        createprofile2.setFirstname("Tomas");
        createprofile2.setLastname("Johansson");
        createprofile2.setAge("45");
        createprofile2.setPhoneNumber("073-894 92 76");
        createprofile2.setCity("Stockholm");
        createprofile2.setZipcode("45245");
        createprofile2.setCounty("Stockholm County");
        createprofile2.setStreetName("Torpargatan");
        createprofile2.setStreetNumber("67");

        profilelist.add(createprofile2);

        Profiles createprofile3 = new PhonebookProfileCreator();
        createprofile3.setFirstname("Jakob");
        createprofile3.setLastname("Rud");
        createprofile3.setAge("55");
        createprofile3.setPhoneNumber("073-898 55 99");
        createprofile3.setCity("Goteborg");
        createprofile3.setZipcode("45763");
        createprofile3.setCounty("Vastra Gotaland");
        createprofile3.setStreetName("Smedvagen");
        createprofile3.setStreetNumber("126");

        profilelist.add(createprofile3);

        Profiles createprofile4 = new PhonebookProfileCreator();
        createprofile4.setFirstname("Sara");
        createprofile4.setLastname("Oscarsson");
        createprofile4.setAge("32");
        createprofile4.setPhoneNumber("070-998 25 71");
        createprofile4.setCity("Karlstad");
        createprofile4.setZipcode("65732");
        createprofile4.setCounty("Wermland");
        createprofile4.setStreetName("Manssmedsvag");
        createprofile4.setStreetNumber("76");

        profilelist.add(createprofile4);

        Profiles createprofile5 = new PhonebookProfileCreator();
        createprofile5.setFirstname("Erik");
        createprofile5.setLastname("Oscarsson");
        createprofile5.setAge("32");
        createprofile5.setPhoneNumber("073-528 64 24");
        createprofile5.setCity("Karlstad");
        createprofile5.setZipcode("65442");
        createprofile5.setCounty("Wermland");
        createprofile5.setStreetName("Europavagen");
        createprofile5.setStreetNumber("76");

        profilelist.add(createprofile5);

        Profiles createprofile6 = new PhonebookProfileCreator();
        createprofile6.setFirstname("Bertil");
        createprofile6.setLastname("Karlsson");
        createprofile6.setAge("73");
        createprofile6.setPhoneNumber("0554-554 02 88");
        createprofile6.setCity("Karlstad");
        createprofile6.setZipcode("63275");
        createprofile6.setCounty("Wermland");
        createprofile6.setStreetName("Europavagen");
        createprofile6.setStreetNumber("72");

        profilelist.add(createprofile6);

    }

    public void removeProfile(Profiles profile) {
        profilelist.remove(profile);
    }

    public ArrayList<Profiles> getProfiles() {
        return profilelist;
    }


}
