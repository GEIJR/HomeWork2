package Lesson4;

import java.util.*;

public class Lesson4 {
  public static void main(String[] args) {

//Задание 1
    String[] words = new String[]{"likeable", "sin", "tease", "exotic",
            "somber", "zealous", "sin", "challenge", "elegant", "pleasant", "kettle", "ladybug",
            "elegant", "paint", "exotic", "risk", "zealous", "obey", "kettle", "design"};
    Map<String, Integer> map = new HashMap<>();
    for (String word : words) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }
    System.out.println(map);
    System.out.println(" ");

    Set<String> word = new HashSet<>(Arrays.asList(words));
    System.out.println(word);
    System.out.println(" ");
    doPhoneBook();
  }
    // Задание 2 Телефонный справочник  к любому ключу выдает значение null
   //  В чем проблема так и не поняла(((

  private static void doPhoneBook() {
    TelephoneBook telephoneBook = new TelephoneBook();
    telephoneBook.addContact("Василиса ", "8956  234");
    telephoneBook.addContact("Василиса ", "8956234  4");
    telephoneBook.addContact("Василиса ", "895 62 34");

    telephoneBook.addContact("Михаил ", "568945238");
    telephoneBook.addContact("Виктор ", "6986854778");
    telephoneBook.addContact("Юлия ", "58954338445");
    telephoneBook.addContact("Антон ", "244568432326");
    telephoneBook.addContact("Антон ", "569823458");


    System.out.println("Антон: " + telephoneBook.getTelephonesName("Антон"));
    System.out.println("Dfcbkb: " + telephoneBook.getTelephonesName("Dfcbkb"));
    System.out.println("Василиса: " + telephoneBook.getTelephonesName("Василиса"));
    System.out.println("Юлия: " + telephoneBook.getTelephonesName("Юлия"));
  }
}



