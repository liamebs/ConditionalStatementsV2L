public class LogicalOr {
    public static void main(String[] args) {
        System.out.println("Is the number less than 200 or greater than 250?");

        int number = 190;

        if (number < 200 || number > 250) {
            System.out.println("Yes!");
        }
        else {
            System.out.println("No!");
        }
    }
}
