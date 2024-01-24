import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        if(a.length() <= 140){
            System.out.println("TWEET");
        }else {
            System.out.println("MUTE");
        }

        sc.close();
    }
}
