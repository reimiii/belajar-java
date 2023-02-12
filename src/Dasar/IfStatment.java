package Dasar;

public class IfStatment {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 90;

        var hasil = nilai >= 75 && absen >= 75;
        System.out.println(hasil);

        if (hasil) {
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Kurang Beruntung");
        }

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");
        }
    }
}
