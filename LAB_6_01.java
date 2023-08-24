package LAB_6;

public class LAB_6_01 {
    public static void main(String[] args) {
        //Given input string: "2hrs and 5 minutes"
        //Please calculate how many minutes in total

        String myString = "2 hrs and 5 minutes";
        String myStringRegex = myString.replaceAll("[^0-9]", "");
        String hour = myStringRegex.substring(0, 1);
        String minute = myStringRegex.substring(1);
        int sum = Integer.parseInt(hour) * 60 + Integer.parseInt(minute);
        System.out.println(sum);


    }
}
