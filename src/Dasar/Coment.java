package Dasar;

public class Coment {
    /*
     * Kadang dalam membuat program, kita sering menempatkan komentar di kode program tersebut
     * Komentar adalah kode program yang akan di hiraukan saat proses kompilasi, sehingga di
     * binary code Java, tidak akan ada kode komentar tersebut
     * Biasanya komentar digunakan untuk dokumentasi
     * */
    public static void main(String[] args) {
        int hasil = sum(1,2);
        System.out.println(hasil);
    }

    /*
     * SUM
     * @param a nilai a
     * @param b nilai b
     * @return a + b
     * */
    static int sum(int a, int b) {
        return a + b;
    }
}
