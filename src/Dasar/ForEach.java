package Dasar;

public class ForEach {
    /*
     * Kadang kita biasa mengakses data array menggunakan perulangan
     * Mengakses data array menggunakan perulangan sangat bertele-tele
     * kita harus membuat counter, lalu mengakses array menggunakan counter yang kita buat
     * Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk
     * mengakses seluruh data di Array secara otomatis
     * */
    public static void main(String[] args) {
        String[] array = {
                "Hilmi", "Akbar", "Muharrom",
                "Rnd", "Center", "Server"
        };

//        Kode tampa forEach
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "- tampa for each");
        }

//        Kode for Each
        for (var value : array) {
            System.out.println(value + "- dengan for each");
        }

    }
}
