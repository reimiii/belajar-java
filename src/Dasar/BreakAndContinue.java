package Dasar;

public class BreakAndContinue {
    /*
     * Pada switch statement, kita sudah mengenal kata kunci break,
     * yaitu untuk menghentikan case dalam switch
     * Sama dengan pada perulangan, break juga digunakan untuk menghentikan seluruh perulangan.
     * Namun berbeda dengan continue, continue digunakan untuk menghentikan
     * perulangan saat ini, lalu melanjutkan ke perulangan selanjutnya
     * */
    public static void main(String[] args) {
//        kode break
        var c = 1;
        while (true) {
            System.out.println("Break ke-" + c);
            c++;

            if (c > 10) {
                break;
            }
        }

//        kode continue
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) {
                continue;
            }

            System.out.println("Perulangan Ganjil-" + i);
        }
    }
}
