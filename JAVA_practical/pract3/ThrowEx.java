public class ThrowEx {
    public static void main(String[] args) {
        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("You must be at least 18 years old to vote.");
        }
        System.out.println("You are eligible to vote.");
    }
}
