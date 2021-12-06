package Lesson4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TelephoneBook {
    private HashMap<String, HashSet<String>> telephoneBook = new HashMap<>();

    public void addContact(String name, String contactNumber) {
        HashSet<String> contactNumbers;

        if (telephoneBook.containsKey(name)){
            contactNumbers = telephoneBook.get(name);
        } else {
            contactNumbers = new HashSet<>();

        }
        contactNumbers.add(contactNumber.replaceAll( " ", ""));
        telephoneBook.put(name, contactNumbers);


    }

    public Set<String> getTelephonesName(String name) {
                        return telephoneBook.get(name);

    }
}


