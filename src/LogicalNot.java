public class LogicalNot {
    public static void main(String[] args) {
        System.out.println("Is the string equal to 'Lisandro'?");

        String text = "Lisandro";

        if (!(text.equals("Lisandro")))
        {
            System.out.println("No!");
        }
        else
        {
            System.out.println("Yes!");
        }

    }
}
