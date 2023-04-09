public class ReduceToZero {
    public static void main(String[] args) {

        System.out.println("The number of steps to zero is " + numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {

        // Initialise variable to count steps
        int stepCounter = 0;

        // While number is not zero, divide by 2 if even, subtract 1 if odd
        while (num != 0) {
            switch(num % 2) {
                case 0:
                    System.out.print("Step " + (stepCounter + 1) + ") ");
                    System.out.println(num + " is even; divide by 2 and obtain " + (num / 2));
                    num /= 2;
                    stepCounter++;
                    break;

                case 1:
                    System.out.print("Step " + (stepCounter + 1) + ") ");
                    System.out.println(num + " is odd; subtract 1 and obtain " + (num - 1));
                    num -= 1;
                    stepCounter++;
                    break;
            }
        }
        return stepCounter;
    }
}
