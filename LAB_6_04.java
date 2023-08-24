package LAB_6;

public class LAB_6_04 {
    public static void main(String[] args) {
        String url = "https://google.com";
//        Check http OR https; domain name, .com OR .net
        String[] substring = {"http", "https", ".com", ".net"};
        for (String item : substring) {
            if (url.contains(item)) {
                System.out.println(item + " : Found");
            } else System.out.println(item + " : Not found");
        }


    }

}
