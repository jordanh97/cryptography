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
            int newIntValue = (int) charValue + 72;
            int lastInt = newIntValue + h;
            char newCharValue = (char)lastInt;
            output = new StringBuffer(output).insert(h, newCharValue).toString();

            h++;

        }while (h < k);

        return output;
    }
}

