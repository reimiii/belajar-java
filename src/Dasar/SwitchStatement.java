package Dasar;

public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "F";

        switch (nilai) {
            case "A":
                System.out.println("Wow anda Lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Anda salah jurusan");
        }

        /*
         * Switch Lambda Di Java 14++
         *
         * */

        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus dengan Baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Salah Jurusan :v");
            }
        }

        /*
         * Kata kunci yield
         * Di Java 14 untuk mengembalikan nilai switch statement
         * */

        // tampa yield
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Lulus Dengan Sangat Baik";
            case "B", "C" -> ucapan = "Lulus";
            case "D" -> ucapan = "Tidak Lulus";
            default -> ucapan = "Lu salah jurusan";
        }
        System.out.println(ucapan);

        // dengan yield

        String hasil = switch (nilai) {
            case "A":
                yield "Lulus dengan Baik";
            case "B", "C":
                yield "Lulus";
            case "D":
                yield "Anda Tidak Lulus";
            default:
                yield "Lu Ga di ajak";
        };
        System.out.println(hasil);
    }
}
