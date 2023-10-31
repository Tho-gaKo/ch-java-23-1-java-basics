public class main {

    public static void main(String[] args) {

        String name = "Hello World!";

        int age = 18;
        long verBigNumber = 13000000000L;

        float kommazahl32 = 0.01f;
        double kommazahl64 = 0.02;

        char oneCharacter = 'A';

        boolean wahrheitswert = true; //false

        System.out.println(name);
        System.out.println(age);
        System.out.println(verBigNumber);
        System.out.println(kommazahl32);
        System.out.println(kommazahl64);

        System.out.println(oneCharacter);
        System.out.println(wahrheitswert);


        int sum = age / 3;

        double result = 0.3 + 0.1;

        String text = "Hallo" + "Welt" + kommazahl32 + wahrheitswert;

        System.out.println(sum);

        boolean same = "Hallo" == "Welt";
        boolean notSame = "Hallo" != "Welt";


        System.out.println(same);
        System.out.println(notSame);

        boolean isBigger = 3 > 0;
        boolean islower = 3 <= 5;

        System.out.println(isBigger);
        System.out.println(islower);

        System.out.println(name == "Test123");


        boolean isValue1 = true;
        boolean isValue2 = false;

        System.out.println("Wahr: " + (isValue1 && isValue2));
        System.out.println("Wahr: " + (isValue1 || isValue2));
    }


}
