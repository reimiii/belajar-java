import java.util.Date;

public class ExpressionStatementAndBlock {
    /*
     * Expression
     * adalah kontruksi dari variable, operator dan pemanggilan method yang mengevaluasi menjadi
     * sebuah single value
     *
     * adalah core component dari statment
     * */
    public static void main(String[] args) {

        int value; // Expresi
        value = 10; // Expresi

        // ini statment    //ini expres
        System.out.println(value = 100);

        /*
         * Statment
         * Statment bisa di bilang adalah kalimat lengkap dalam bahasa
         * sebuah statment berisikan execution komplit, biasanya diakhiri dengan titik koma
         * ada beberapa jenis statment:
         * Assignment expession
         * Penggunaan ++ dan --
         * Method invocation
         * Object creation expression
         * */

        // Assignment expession
        double avalue = 9998.122;

        // increment statement
        System.out.println(avalue += 1);

        // method invocation statement
        System.out.println("Hello World!");

        // object creation statement
        Date date = new Date();
        System.out.println(date);

        /*
        * Block
        * block adalah kumpulan statement yang terdiri dari nol atau lebih statment
        * block diawali dan di akhiri dengan kurung kurawal {}
        *
        * */

    }
}
