package Dasar;

public class WhileLoop {
    public static void main(String[] args) {
        /*
         * While loop adalah versi perulangan yang sederhana di bandingkan for loop
         * Di While loop, hanya terdapat kondisi perulangan, tampa ada init statement dan post statement
         *
         * */
//        Kode While loop
        var counter = 1;
        while (counter <= 10) {
            System.out.println("While ke-" + counter);
            counter++;
        }
    }
}
