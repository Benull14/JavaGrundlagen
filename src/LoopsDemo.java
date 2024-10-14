public class LoopsDemo {
    public static void main(String[] args) {
        // for-Schleife
        System.out.println("For-Schleife Beispiel");
        for (int i = 0; i < 10; i++) {
            System.out.println("Durchlauf Nummer " + i);
        }
        // While-Schleife
        System.out.println("\n---------------------\nWhile-Schleife Beispiel");
        int i = 0;
        while (i < 10) {
            System.out.println("While-Durchlauf Nummer " + i);
            i = i + 1;
        }

        //Do-While-Schleife
        System.out.println("\n--------------------\nDo-While-Schleife Beispiel");
        int j = 10;
        do {
            System.out.println("Durchlauf Nummer " + j);
            j--;
        } while (j > 0);

    }


}
