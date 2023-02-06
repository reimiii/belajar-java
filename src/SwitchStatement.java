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

    }
}
