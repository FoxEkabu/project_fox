package lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PhoneBookRunner {
    public static void main(String[] args) {
        List<PhoneBook> phonebook = new ArrayList();
        String fioValue = "";
        char symbol;
        for (int i = 1; i <= 10000; i++) {
            fioValue = "";

            for (int tt = 1; tt < 4; tt++) {
                for (int j = 1; j < Math.random() * 14 + 5; j++) {
                    fioValue += (char) Math.round(Math.random() * 32 + 1040);
                }
                if (tt < 3)  {fioValue += " ";}

            }
            System.out.println(fioValue);
            phonebook.add(new PhoneBook(fioValue, 1234343, true, 123456, 123456));

        }
        System.out.println(phonebook);
    }
}
