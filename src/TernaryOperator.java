public class TernaryOperator {

    /*
     * Ternary operator adalah operator sederhana dari if statement
     * Ternary operator terdiri dari  kondisi yang dievaluasi, jika menghasilkan true maka nilai
     * pertama diambil, jika false, maka nilai kedua diambil
     * */
    public static void main(String[] args) {
        // kode tampa ternary operator
        var nilai = 75;
        String ucapan;

        if (nilai >= 75) {
            ucapan = "Selamat Anda Lulus!!";
            System.out.println(ucapan);
        } else {
            ucapan = "Kurang Beruntung";
            System.out.println(ucapan);
        }

        // kode dengan ternary operator

        ucapan = nilai >= 75 ? "Selamat Bang anda Lulus!!" : "Lu salah jurusan";
        System.out.println(ucapan);
    }


}
