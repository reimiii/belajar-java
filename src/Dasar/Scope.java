package Dasar;

public class Scope {
    public static void main(String[] args) {
        love("Rei", "Strugle", "I love you");
    }

    static void love(String name, String toName, String confes) {
        String request = "req: " + confes + " " + toName + ", pls be my girlfriend";
        String response = "res: Thank you :) " + name;
        if (name.isBlank() && confes.isBlank() && toName.isBlank()) {
            String responseBlank = "Hii";
            System.out.println(responseBlank);
        } else {
            System.out.println(request);
            System.out.println(response);
        }
//        System.out.println(responseBlank);
    }
}
