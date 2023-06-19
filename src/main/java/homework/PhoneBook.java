package homework;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();
    public static int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name,number);
        } else {
            System.out.println("The contact exists");
        }
        return phoneBook.size();
    }
}
