public class TipeDataArray {
    public static void main(String[] args) {
        // membuat array
        String[] arrayString;

        arrayString = new String[3];
        arrayString[0] = "Hilmi";
        arrayString[1] = "Akbar";
        arrayString[2] = "Muharrom";

        System.out.println(arrayString[0]);
        System.out.println(arrayString.length);

        arrayString[0] = "imii";
        System.out.println(arrayString[0]);
        System.out.println(arrayString.length);

        // Array initializer

        int[] arrayInt = new int[]{
                10, 90, 80, 67, 29
        };

        long[] arrayLong = {
                10, 90, 80, 67, 29
        };

        System.out.println(arrayLong[0]);

        arrayLong[0] = 1000L;
        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        // Array di dalam array
        String[][] members = {
                {"Hilmi","Akbar","Muharrom"},
                {"Momo","Yuko","Shamiko"},
                {"Yue","Akari"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][1]);
        System.out.println(members[2][0]);

        // todo watch the  video
    }
}














