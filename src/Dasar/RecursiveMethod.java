package Dasar;

public class RecursiveMethod {
    /*
     * Recursive method adalah kemampuan method memanggil method dirinya sendiri
     * Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan
     * recursive method, seperti contohnya kasus factorial
     * */
    public static void main(String[] args) {
        int num = 5;
        int req = factorial(num);
        int call = factorialRecursive(num);
        System.out.println("Recursive call: " + call);
        for (int i = num; i >= 1; i--) {
            System.out.print(i);
            if (i != 1) {
                System.out.print(" x ");
            } else {
                System.out.print(" = ");
            }
        }
        System.out.println(req);
        loop(num);
    }

    // factorial loop
    static int factorial(int n) {
        var res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // factorial recursive
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }

    /*
     * Problem Dengan Recursive
     * Walaupun recursive method itu sangat menarik, namun kita perlu berhati-hati
     * Jika recursive terlalu dalam, maka  akan ada kemungkinan  terjadi error StackOverflow,
     * yaitu error dimana stack method terlalu banyak di Java
     * Kenapa problem ini  bisa terjadi? Karena ketika kita memanggil method,
     * Java akan menyimpannya dalam stack, jika method tersebut memanggil method lain,
     * maka stack akan menumpuk terus,
     * dan jika terlalu dalam, maka stack akan terlalu besar, dan bisa menyebabkan
     * error StackOverflow
     * */

    //    Error stack Overflow
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop - " + value);
            loop(value - 1);
        }
    }
}
