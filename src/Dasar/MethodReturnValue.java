package Dasar;

public class MethodReturnValue {
    /*
     * Secara default, method itu tidak menghasilkan value apapun, namun jika kita ingin,
     * kita bisa membuat sebuah method mengembalikan nilai
     * Agar method bisa menghasilkan value, kita harus mengubah kata kunci void
     * dengan tipe data yang dihasilkan
     * Dan di dalam block method, untuk menghasilkan nilai tersebut, kita harus
     * menggunakan kata kunci return, lalu diikuti dengan data yang sesuai dengan
     * tipe data yang sudah kita deklarasikan di method
     * Di Java, kita hanya bisa menghasilkan 1 data di sebuah method,
     * tidak bisa lebih dari satu
     * */

    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int c = jumlah(a, b);

        System.out.println(c);
    }

    // method return value
    static int jumlah(int value_1, int value_2) {
        int total = value_1 + value_2;
        return total;
    }
}
