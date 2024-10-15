public class MethodsDemo {

    public static void printGreeting(){
        System.out.println("Hallo, ich bin printGreeting-Methode");

    }

    public static int addNumbers(int a, int b){
        System.out.println("Hallo, ich bin ADD-Methode Für die Zahlen " +a+" + "+ b);
        int result = a + b;
        return result;
    }
    // Hier in dieser Methode wird das Quadrat einer Zahl berechnet
    public static int square(int a){
        System.out.println("Hallo, ich bin Quadrat-Methode");
        int result = a * a;
        return result;
    }


    public static void main(String[] args) {

        System.out.println("Greeting-Methode");
        printGreeting();


        System.out.println("\n--------------\nADD-Methode");
        // 4 + 5
        int sum = addNumbers(4,5);
        System.out.println("Die Summe von 4 + 5 = " + sum);
        // 8 + 12
        int sum2 = addNumbers(8,12);
        System.out.println("Die Summe von 8 + 12 = " + sum2);
        // 50 + 100
        int sum3 = addNumbers(50,100);
        System.out.println("Die Summe von 50 + 100 = " + sum3);

        // 9^2
        System.out.println("\n--------------\nQuadrat-Methode");
        int square = square(9);
        System.out.println("Das Quadrat von der Zahl 9 ist: " + square);

    }

}
