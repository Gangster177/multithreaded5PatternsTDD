package homework;

import java.util.*;

public class PhoneBook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static int add(String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
        } else {
            System.out.println("The contact exists");
        }
        return phoneBook.size();
    }

    public static String findByNumber(String number) {
        if (phoneBook.containsValue(number)) {
            for (var entry : phoneBook.entrySet()) {
                if (entry.getValue().equals(number)) {
                    return entry.getKey();
                }
            }
        }
        return "The number is not in the contacts";
    }

    public static String findByName(String name){
        return phoneBook.get(name);
    }

    public static List<String> printAllNames(){
        return null;
    }
}
