public class OperasiBoolean {
    public static void main(String[] args) {
        /*
         * Operasi Boolean
         *
         * Operator      Keterangan
         * &&            Dan
         * ||            Atau
         * !             Kebalikan
         * */

        /*
         * Operator &&
         *
         * nilai1     operator    nilai2       hasil
         * true       &&          true         true
         * true       &&          false        false
         * false      &&          true         false
         * false      &&          false        false
         * */

        /*
         * Operator ||
         *
         * nilai1     operator    nilai2       hasil
         * true       ||          true         true
         * true       ||          false        true
         * false      ||          true         true
         * false      ||          false        false
         * */

        /*
         * Operasi !
         *
         * Operator  nilai1    hasil
         * !         true      false
         * !         false     true
         * */

        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        System.out.println(lulusAbsen);

        var lulusNilai = nilaiAkhir >= 75;
        System.out.println(lulusNilai);

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);


    }
}
