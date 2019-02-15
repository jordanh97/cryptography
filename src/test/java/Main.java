import java.util.Scanner;
import java.lang.Thread;

public class Main {

    public static void sleep(long millis) throws InterruptedException {

    }

    public static void main(String[] args) throws Exception {

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.print("PLEASE ENTER A STRING TO ENCRYPT: ");

        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();

        System.out.println(" ");
        System.out.println("'?-/|?' ENCRYPTING '?-/|?'");

        for(int z = 1; 14 > z; z++) {
            try {
                Thread.sleep(150);
                System.out.print("*?");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("STRING AFTER ENCRYPTION: ");

        Encrypt encrypt = new Encrypt();
        System.out.print(encrypt.moderateEncrypt(userInput)); // change to encrypt.basicEncrypt for basic encryption

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
