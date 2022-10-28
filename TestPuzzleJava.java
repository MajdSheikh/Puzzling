import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {

	    PuzzleJava myArray = new PuzzleJava(); // this is the instance that we have to create in order to use the methods of "PuzzleJava" in the other file.
        System.out.println(myArray.getTenRolls());
        System.out.println(myArray.getRandomLetter());
        System.out.println(myArray.generatePassword());
        System.out.println(myArray.getNewPassword(7));

	}
}

