package Dasar;

public class MethodParameter {
    /*
    Kita bisa mengirim informasi ke method yang ingin kita panggil
    Untuk melakukan hal tersebut, kita perlu menambahkan parameter
    atau argument di method yang sudah kita buat
    Cara membuat parameter sama seperti cara membuat variabel
    Parameter ditempatkan di dalam kurung () di deklarasi method
    Parameter bisa lebih dari satu, jika lebih dari satu, harus dipisah menggunakan tanda koma
    */

    public static void main(String[] args) {
        theQandA("Kamu Cantik??", "Ga tau, kamu bisa nilai sendiri :)");
    }

    static void theQandA(String question, String answer) {
        System.out.println("Q: " + question);
        System.out.println("A: " + answer);
    }
}

