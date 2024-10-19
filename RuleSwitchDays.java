/**
 * author: me
 * filename:
 * description: this program will give the user the number of letters in a day once the user enters
 * a day of the week and practices the rule switch statement
 */

import java.util.Scanner;

public class RuleSwitchDays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a day of the week in all caps: ");
            //this line should be apear to prompt the user to enter a day of the week in all caps
         String day = s.nextLine();
            int numLetters = 0;
			
            switch(day) {
                case "SUNDAY", "MONDAY", "FRIDAY" -> 
                    numLetters = 6;
                    //adding a comma between 1 and 2 allows you to do more than one case at once 
                case "TUESDAY" ->
                    numLetters = 7;
					
                case "THURSDAY", "SATURDAY" ->
                    numLetters = 8;
                    //each day of the week can be written out on separate or the same line
					
                case "WEDNSDAY" ->
                    numLetters = 9;
                default ->
                    System.out.println("Invalid Day :( ");
                    //the default message is printed when the user enters something that is not a week day
                    
	}
	System.out.println(numLetters);
    }
}