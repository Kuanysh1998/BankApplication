
import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BankApplication ba1 = new BankApplication("First Bank");
        BankApplication ba2 = new BankApplication("Second Bank");
        BankApplication ba3 = new BankApplication("Third Bank");

        ArrayList<BankApplication> allBanks = new ArrayList<>();

        ba1.addAccount(new Account(1, "Kuanysh","Koshpanov", 1000000));
        ba1.addAccount(new Account(2, "Naruto","Uzumaki", 100));
        ba1.addAccount(new Account(3, "Sasuke","Uchiha", 1000));
        ba1.addAccount(new Account(4, "Tom","Cruise", 90000000));
        ba1.addAccount(new Account(5, "Tony","Soprano", 510000));
        ba1.addAccount(new Account(6, "Aya","Shalkar", 7777777));
        ba1.addAccount(new Account(7, "Nursultan","Nazarbayev", 9999999999.0));
        ba1.addAccount(new Account(8, "Aleksandr","Kostylev", 1337000));
        ba1.addAccount(new Account(9, "Jaime","Lannister", 445000));
        ba1.addAccount(new Account(10, "Christiano","Ronaldo", 8888888));

        ba2.addAccount(new Account(1, "Jackie","Chan", 10000));
        ba2.addAccount(new Account(2, "Brad","Pit", 1234556));
        ba2.addAccount(new Account(3, "James","Cameron", 214700000));
        ba2.addAccount(new Account(4, "Walter","White", 75000000));
        ba2.addAccount(new Account(5, "Adil","Zhalelov", 6666666));
        ba2.addAccount(new Account(6, "Angelina","Jolie", 78951566));
        ba2.addAccount(new Account(7, "Ivanov","Ivan", 110));
        ba2.addAccount(new Account(8, "Steve","Jobs", 987654321));
        ba2.addAccount(new Account(9, "Elon","Mask", 30000000));
        ba2.addAccount(new Account(10, "Lionel","Messi", 8888887));

        ba3.addAccount(new Account(1, "Eren","Yager", 444));
        ba3.addAccount(new Account(2, "Tony","Montana", 34685950));
        ba3.addAccount(new Account(3, "Kairat","Nurtas", 77777777));
        ba3.addAccount(new Account(4, "Roman","Abramovich", 750450000));
        ba3.addAccount(new Account(5, "Margulan","Seisembay", 99999999));
        ba3.addAccount(new Account(6, "Beibit","Alibekov", 707707707));
        ba3.addAccount(new Account(7, "Bruce","Wayne", 987654124));
        ba3.addAccount(new Account(8, "Jack","Daniels", 99));
        ba3.addAccount(new Account(9, "Vladimir","Klichko", 0));
        ba3.addAccount(new Account(10, "Nurlan","Saburov", 6677000));

        allBanks.add(ba1);
        allBanks.add(ba2);
        allBanks.add(ba3);
        Collections.sort(allBanks);

        for(BankApplication ba : allBanks) {
            System.out.println(ba.getBankData());
        }


    }
}