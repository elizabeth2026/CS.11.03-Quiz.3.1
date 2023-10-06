public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        }
        if (grade <= 89 && grade >= 80) {
            return 'B';
        }
        if (grade <= 79 && grade >= 70) {
            return 'C';
        }
        if (grade <= 69 && grade >= 60) {
            return 'D';
        }
        if (grade <= 59 && grade >= 50) {
            return 'E';
        }
        if (grade <= 49) {
            return 'F';
        } else if (grade <= 49) {
            return 'F';

        }
        return 'a';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int buzz){
        if(buzz%5==0 && buzz%3==0) {
            return "fizzbuzz";
        }
        if(buzz%3==0){
            return "fizz";
        }
        if(buzz%5==0){
            return "buzz";
        }
            return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String added) {

        if (added.length() >= 2) {
            String firstTwo = added.substring(0, 2);
            return (firstTwo + added + firstTwo);

        }
        return added;

    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c){
        if(a+b==c || b+c==a || c+a==b){
            return true;
        }
        return false;
    }

    // Question 5 - endUp
    public static String endUp(String capital){
        if(capital.length()>=3){
            String firstPart = capital.substring(0,capital.length()-3);
            String secondPart = capital.substring(capital.length()-3);
            String capitalized = secondPart.toUpperCase();

            return (firstPart + capitalized);
        }
        return capital.toUpperCase();
    }
}
