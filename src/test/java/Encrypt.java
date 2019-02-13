

import java.util.ArrayList;

public class Encrypt {

    private String input;

    public String basicEncrypt(String i) {
        input = i;
        String output = "";

        int k = input.length();
        int h = 0;

        do {
            char charValue = input.charAt(h);
            int newIntValue = (int) charValue + 3;
            char newCharValue = (char)newIntValue;
            output = new StringBuffer(output).insert(h, newCharValue).toString();

            h++;

        }while (h < k);

        return output;
    }

    public String moderateEncrypt(String i) {
        input = i;
        String output = "";

        int k = input.length();
        int h = 0;

        do {
            char charValue = input.charAt(h);
            int newIntValue = (int) charValue * 43;
            int middleInt = newIntValue / 12;
            int lastInt = middleInt -234;
            char newCharValue = (char)lastInt;
            output = new StringBuffer(output).insert(h, newCharValue).toString();

            h++;

        }while (h < k);

        return output;
    }
}

