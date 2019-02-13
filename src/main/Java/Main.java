import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(" ");
        System.out.print("PLEASE ENTER A STRING TO ENCRYPT: ");

        Scanner s = new Scanner(System.in);
        String userInput = s.nextLine();

        System.out.println(" ");
        System.out.println("'?-/|?' ENCRYPTING '?-/|?'");
        System.out.println(" ");
        System.out.print("STRING AFTER ENCRYPTION: ");

        Encrypt encrypt = new Encrypt();
        System.out.print(encrypt.moderateEncrypt(userInput)); // change to encrypt.basicEncrypt for basic encryption

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

}
