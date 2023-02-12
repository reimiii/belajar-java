package Dasar;

public class ForLoop {
    /*
     * For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
     * Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi
     *
     * sintak perulangan for
     *
     * for(init statement; kondisi; post statement){
     *  // block perulangan
     * }
     *
     * Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
     * kondisi akan di lakukan pengecekan dalam setiap perulangan, jika true
     * perulangan akan dilakukan jika false perulangan akan berhenti
     * Post statement akan dieksekusi setiap kali diakhir perulangan
     * Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti
     * Kondisi selalu ber nilai true
     * */
    public static void main(String[] args) {
        // perulangan tanpa henti
//        for (; ; ) {
//            System.out.println("Ga abis");
//        }

//        perulangan dengan kondisi
        var counter = 1;
        for (; counter <= 10; ) {
            System.out.println("Perulangan ke-" + counter);
            counter++;
        }

//        Perulangan dengan Init Statement
        for (var c = 1; c <= 10; ) {
            System.out.println("Init ke-" + c);
            c++;
        }

//        Perulangan dengan post statement
        for (var p = 1; p <= 10; p++) {
            System.out.println("Post ke-" + p);
        }

    }
}
