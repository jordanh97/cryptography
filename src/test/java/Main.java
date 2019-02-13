import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" ");
        System.out.print("PLEASE ENTER A MESSAGE TO BE ENCRYPTED: ");

        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();

        System.out.println(" ");
        System.out.println("Please wait while your message is being encoded...");
        System.out.println(" ");
        System.out.print("YOUR MESSAGE AFTER ENCRYPTION: ");

        Encrypt encrypt = new Encrypt();
        System.out.print(encrypt.moderateEncrypt(userInput)); // change to encrypt.basicEncrypt for basic encryption

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("----------------------------------------------------------------------------");
    }

}
