package LAB_6;

public class LAB_6_03 {
    public static void main(String[] args) {
        String myStr = "12345nabc678";
        //NOT using REGEX, extract digit character from that String
        //Expected output: "100".
        //EX: "12345nabc678" -> "12345678"

        char[] myStrChar = myStr.toCharArray();
        for (char c : myStrChar) {
            if(Character.isDigit(c)) {
                System.out.print(c);
            }
        }
    }
}
