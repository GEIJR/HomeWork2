package Lesson4;

public class Main {
    public static void  main(String[] args) {
        WordsArray wordsArray = new WordsArray(createArrayWords());
        wordsArray.doArrayWords();
    }

       private static String[] createArrayWords() {
            String[] strings = new String[10];
            strings[0] = "Mama";
            strings[1] = "Papa";
            strings[2] = "Puma";
            strings[3] = "Irbis";
            strings[4] = "Mama";
            strings[5] = "Papa";
            strings[6] = "Kot";
            strings[7] = "Sobaka";
            strings[8] = "Dochka";
            strings[9] = "Sobaka";
            return strings;
        }
    }

