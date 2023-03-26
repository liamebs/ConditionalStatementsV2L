import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner bosh = new Scanner(System.in);
        // instantiate scanner object called 'reader'
        System.out.println("Input a string: ");
        // request string from user
        char[] letters = bosh.nextLine().toCharArray();
        // initialise character array called letters and pass chars in input as elements in array

        for(int i = letters.length - 1; i >= 0; i--)
        // create for loop parameters starting at length of array - 1 to zero, counting in reverse
        {
            System.out.print(letters[i]);
            // print output ON SAME LINE
        }

    }
}
