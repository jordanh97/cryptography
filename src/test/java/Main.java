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
        System.out.print(encrypt.basicEncrypt(userInput)); // change to encrypt.moderateEncrypt for moderate encryption

        System.out.println(" ");

        // begin decrypt

        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.print("PLEASE ENTER A STRING TO DECRYPT: ");

        Scanner a = new Scanner(System.in);
        String userInput2 = s.nextLine();

        System.out.println(" ");
        System.out.println("'?-/|?' DECRYPTING '?-/|?'");

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
        System.out.print("STRING AFTER DECRYPTION: ");

        Decrypt decrypt = new Decrypt();
        System.out.print(decrypt.basicDecrypt(userInput2));

        System.out.println(" ");
        System.out.println(" "); 
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }


}
