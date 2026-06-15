package Java8features;
    import java.util.function.Predicate;

    public class LambdaUsage {



        // This method accepts a number AND a lambda condition
        public static void checkNumber(int num, Predicate<Integer> condition) {
            if (condition.test(num)) { // This executes the lambda!
                System.out.println("Condition passed!");
            }
        }




        public static void main(String[] args) {
            // Pass a lambda checking if a number is even
            checkNumber(4, (n) -> n % 2 == 0);
        }
    }


