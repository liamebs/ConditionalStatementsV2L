import java.util.Scanner;  // Import the Scanner class

public class TimesTable {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);  // initialise user input
        System.out.print
                ("What times table would you like? : ");
        int timesTable = reader.nextInt();
        // initialises integer variable to store inout

        for (int i = 0; i < 13; i++) {
            // start value for loop; finish condition for loop; increment value
            System.out.println(timesTable + " multiplied by " + i + " equals " + timesTable * i);
            // displays output in user-friendly style
        }
    }
}
