public class MyThreeDigitCodes {
    public static void main(String[] args) {
        int count = 0;

        for(int i = 1; i <= 4; i++)
        {
            for(int j = 1; j <= 4; j++)
            {
                for(int k = 1; k <=4; k++)
                {
                    if (i == j || j == k || i == k)
                        continue;
                    System.out.print(i);
                    System.out.print(j);
                    System.out.println(k);
                    count++;
                }
            }
        }
        System.out.println("\nTotal combinations with non-repeated digits: " + count);
    }
}
