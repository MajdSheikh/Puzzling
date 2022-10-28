import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ArrayList;


public class PuzzleJava {

    // array of 10 random number between 10 and 20
    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Random randomRolls = new Random();
        for (int i=0; i<10; i++) {
            myArray.add(randomRolls.nextInt(20) + 1);
        }
        return myArray;
    }

    // get random letter using array
    public String getRandomLetter() {
        Random rand = new Random();

        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String [] alphabet = new String[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = String.valueOf(alphabetString.charAt(i));

        }
        return alphabet [rand.nextInt(26)];
    }




    // get random letter without using an array
    // Public String getRandomLetter() {
    //     Random rand = new Random();
    //     String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    //     char randomChar = alphabetString.charAt(rand.nextInt(26));
    //     return String.valueOf(randomChar);
    // }



    // generate random password
    public String generatePassword() {
        String password= "";

        for(int i = 0; i < 8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    //Write a method that takes an int length as an argument and creates an array of random eight character words.
    public ArrayList<String> getNewPassword(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i < length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    }
