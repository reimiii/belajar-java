package Dasar;

public class MethodOverloading {
    /*
     * Method overloading adalah kemampuan membuat method dengan nama yang sama lebih dari sekali.
     * Namun ada ketentuannya, yaitu data parameter di method tersebut harus berbeda-beda, enta
     * jumlah atau tipe data parameternya
     * Jika ada yang sama, maka program Java kita akan error
     * */
    public static void main(String[] args) {
        sayHello();
        sayHello("Yuko");
        sayHello("Momo", "Shamiko");
    }

    // Method Overloading
    static void sayHello() {
        System.out.println("Hellow");
    }

    static void sayHello(String name) {
        System.out.println("Hii " + name);
    }

    static void sayHello(String name, String response) {
        System.out.println("Hii "+ name + " - i like " + response);
    }

}
