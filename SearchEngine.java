import java.util.ArrayList;
import java.util.Scanner;

public class SearchEngine {

    private Phonebook contacts;
    private Searchhandler searchhandler;

    //private ArrayList<Profiles> profilelist;

    Scanner sc = new Scanner(System.in);

    public SearchEngine(Phonebook contacts, Searchhandler searchhandler) {
        this.contacts = contacts;
        this.searchhandler = searchhandler;

    }


    public void searchEngine() {

        System.out.println("Choose a search function: [1] Search by firstname \n[2] Search by lastname " +
                "[3] Search by Phonenumber " + " [4] Search with no filter");

        boolean isprogramRunning = true;
        //while (isprogramRunning == true) {


            int alternatives = Integer.parseInt(sc.nextLine());

            switch (alternatives) {

                case 1:
                    searchhandler.firstname();
                    //use a method for each search function
                    break;


                case 2:
                    searchhandler.lastname();
                    break;



                case 3:
                    searchhandler.phonenumber();
                    break;



                case 4:
                    searchhandler.nofilter();
                    break;



                default:
                    System.out.println("System Error");
                    break;


            }





    }




}


