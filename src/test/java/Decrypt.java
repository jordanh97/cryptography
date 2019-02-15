public class Decrypt {

    private String input;

    public String basicDecrypt(String i) {
        input = i;
        String output = "";

        int k = input.length();
        int h = 0;

        do {
            char charValue = input.charAt(h);
            int newIntValue = (int) charValue - 3;
            char newCharValue = (char)newIntValue;
            output = new StringBuffer(output).insert(h, newCharValue).toString();

            h++;

        }while (h < k);

        return output;
    }

}
