import java.util.*;

public class fruits {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        List<String> fruits = new ArrayList<>();

        System.out.print("How many fruits do you want to add?");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1 ; i <=n; i++) {
            System.out.print("Enter fruit"+i+":");
            String fruit = sc.nextLine();
            fruits.add(fruit);
        }
        System.out.println("\nList of Fruits");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        sc.close();

    }
}
