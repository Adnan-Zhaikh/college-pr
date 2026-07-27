public class NumberExc {
    public static void main(String[] args) {
        String str = "absc";
        try{
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Invalid number Format");
        }
    }
}
