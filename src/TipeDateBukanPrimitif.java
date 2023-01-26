public class TipeDateBukanPrimitif {
    public static void main(String[] args) {
        // kode tipe data bukan primitif
        Integer iniInt = 10;
        Long iniLong = 10L;
        Boolean iniBool = true;

        Short iniShort = null; // null

        System.out.println(iniShort);

        iniShort = 100;

        System.out.println(iniShort);

        // konversi dari tipe primitif
        int age = 18;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

    }
}
