public class ifElse {


    public static void main(String[] args) {

        int age = 17;

        if (age >= 18) {
            System.out.println("Die Person ist volljährig.");
        }
        else if (age == 17) {
            System.out.println("Die Person braucht einen Muttizettel.");  // Eine Zustimmung der Eltern
        }
        else{
            System.out.println("Die Person ist zu Jung.");
        }

        System.out.println("-----------------------------------------------------");

        turnOffLights();

        turnOffLights();

        turnOffLights();

        System.out.println("------------------------------------------------------");

        int result1 = addieren(8, 13);
        int result2 = addieren(34, 14);
        int result3 = addieren(489, 4546);

    }

    public static void turnOffLights() {
        System.out.println("Aufstehen");
        System.out.println("Zum lichtschalter gehen");
        System.out.println("Den Lichtschalter betätigen");
    }

    public static int addieren(int valueA, int valueB) {
        return valueA + valueB;
    }

    public static String concat(String text, boolean valueA) {
        return text + valueA;
    }
}
