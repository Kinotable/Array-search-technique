import java.util.Scanner;

public class Vowels {
    public static void IsVowel(String word) {
        int countCons = 0;//number of consonents
        int countVow = 0;// number vowels
        char letter;
        String[] vowels = {"a", "e", "i", "o", "u" };

        for (int i = 0; i < word.length(); i++) {//main loop to check each letter in the word
            letter = word.charAt(i);
            boolean isVowel = false;//boolean to avoid using if statement inside the loop

            for (String vowel : vowels) {
                if (letter == vowel.charAt(0)) {//comparing the letter to each vowel
                    isVowel = true;
                    countVow++;
                    break; //so tht it works
                }
            }

            if (!isVowel) {
                countCons++;
            }
        }

        System.out.println("Consonants: " + countCons);
        System.out.println("Vowels: " + countVow);
    }

    public static void main(String[] args) {
        String word;
        System.out.println("Enter the word please:");
        Scanner s = new Scanner(System.in);
        word = s.nextLine();
        IsVowel(word);
    }
}
