package Dasar;

public class Aritmatika {
    public static void main(String[] args) {
        // operasi aritmatika
        int a = 100;
        int b = 10;

        System.out.println(a + b); // penjumlahan
        System.out.println(a - b); // pengurangan
        System.out.println(a * b); // perkalian
        System.out.println(a / b); // pembagian
        System.out.println(a % b); // sisa pembagian

        /*
         *
         * Operasi Matematika
         * a = a + 10
         * a = a - 10
         * a = a * 10
         * a = a / 10
         * a = a % 10
         *
         * Augmented Assingnments
         * a += 10
         * a -= 10
         * a *= 10
         * a /= 10
         * a %= 10
         *
         * */

        int c = 100;

        c += 10;
        System.out.println(c);

        c -= 10;
        System.out.println(c);

        c *= 10;
        System.out.println(c);

        c /= 10;
        System.out.println(c);

        c %= 10;
        System.out.println(c);

        /*
        * Unary Operator
        * Operator      Keterangan
        * ++            a = a + 1
        * --            a = a - 1
        * -             Negative
        * +             Positive
        * !             Boolean Kebalikan
        * */

        int d = +100;
        int f = -10;

        d++;
        System.out.println(d);

        d--;
        System.out.println(d);

        System.out.println(!false);

    }
}
