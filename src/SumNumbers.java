import java.util.Scanner;  // Import the Scanner class

public class SumNumbers {
    public static void main(String[] args) {
        int sumTotal = 0; // initialise integer sumTotal with value of 0
        // initialise sumTotal for counting total
        Scanner reader = new Scanner(System.in);
        // initialise object 'reader' to read user inout
        System.out.print
                ("Input a number to sum to: "); // ask user for input
        int sumTo = reader.nextInt(); // initialise integer
        int i = 1; // initialise integer i with value of 1

        while (i <= sumTo) // create while loop to iterate through numbers
        {
            sumTotal = sumTotal + i;
            // increase sumTotal by i on each pass throught the loop

            i++;//increase i by one on each pass
        }
        System.out.println("\nWhen i add all the integers from \"1\" up to and including \"" + sumTo + "\",");
        System.out.println("\nI get a total of " + sumTotal); // output result to screen
    }
}
