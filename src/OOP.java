import java.util.ArrayList;

public class OOP {
    public static void main(String[] args) {
        //Erstellen eines neuen Auto-Obejekts
        Car audiA6 = new Car("Audi", "A6", 2010);
        Car audiA7 = new Car("Audi", "A7", 2011);
        audiA6.infos();
        audiA7.infos();

        System.out.println("\n------------------------------");
        ArrayList<Car> autos = new ArrayList<>();
        autos.add(audiA6);
        autos.add(audiA7);

        for (Car car : autos) {
            car.infos();
        }

        System.out.println("\n-------------------------------");
        audiA6.fahren();
        audiA7.fahren();

        System.out.println("\n-------------------------------");
        System.out.println(audiA6.getBaujahr());
        audiA6.setBaujahr(2009);
        System.out.println(audiA6.getBaujahr());


    }

}
