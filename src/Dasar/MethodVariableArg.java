package Dasar;

public class MethodVariableArg {
    /*
     * Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
     * Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai
     * parameter di method tersebut
     * Namun di Java, kita bisa menggunakan variable argument, untuk mengirim
     * data yang berisi jumlah tak tentu, bisa nol atau lebih
     * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
     * */

    public static void main(String[] args) {
        int[] nilai = {
                61, 70, 79, 90
        };
        lulusArgs("Yuko", nilai);
        System.out.println(" ");
        lulusWithArgs("Samiko", 90, 90, 75, 80);
    }

    //    tampa variable args
    static void lulusArgs(String name, int[] values) {
        int total = 0;

        for (var value : values) {
            total += value;
        }

        int theFinal = total / values.length;

        System.out.println("With out var args");

        if (theFinal >= 75) {
            System.out.println("Lulus !!, Name: " + name + " - Nilai: " + theFinal);
        } else {
            System.out.println("Tidak Lulus !!, Name: " + name + " - Nilai: " + theFinal);
        }
    }

    //    dengan variable args
    static void lulusWithArgs(String nama, int... lists) {
        int total = 0;
        for (var list : lists) {
            total += list;
        }
        int akhir = total / lists.length;

        System.out.println("With var args");

        if (akhir >= 75) {
            System.out.println("Lulus !!, Name: " + nama + " - Nilai: " + akhir);
        } else {
            System.out.println("Tidak Lulus !!, Name: " + nama + " - Nilai: " + akhir);
        }
    }

}
