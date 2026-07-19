package practical;

public class ex2 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch(NullPointerException e) {
            System.out.println("string is null");
        }
    }
}
