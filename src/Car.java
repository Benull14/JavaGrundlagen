public class Car {
    String hersteller;
    String modell;
    int baujahr;


    //Konstroktur
    public Car(String hersteller, String modell, int baujahr){
        this.hersteller = hersteller;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public void fahren(){
        System.out.println("Auto "+ modell + " fährt");
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }


    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    public String getModell() {
        return modell;
    }

    public void infos(){
        System.out.println("Hersteller: " + hersteller + ", Modell: " + modell + ", Baujahr: " + baujahr);
    }
}
