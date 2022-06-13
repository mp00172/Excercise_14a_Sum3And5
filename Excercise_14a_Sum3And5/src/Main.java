public class Main {

    // Create a for statement using a range of numbers from 1 to 1000 inclusive.
    // Sum all the numbers that can be divided with both 3 and also with 5.
    // For those numbers that met the above conditions, print out the number.
    // Break out of the loop once you find 5 numbers that met the above conditions.
    // After breaking out of the loop print the sum of the numbers that met the above conditions.
    // NOTE: Type all code in main method

    public static void main(String[] args) {

        int countDivisibleNums = 0;
        int sumDivisibleNums = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("Number " + i + " is divisible by 3 and 5.");
                countDivisibleNums++;
                sumDivisibleNums += i;
            }
            if (countDivisibleNums == 5) {
                break;
            }
        }
        System.out.println("Summ of requested numbers equals " + sumDivisibleNums + ".");
    }

}
