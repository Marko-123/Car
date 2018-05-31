
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ABC-123";
    char condition = 'A';
    double currenPrice = 1;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int consumption;

    int currentPassengers;
    int maxPassengers;

    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
        this.currentFuel = 3000;
        this.maxPassengers = 5;
        this.currentPassengers = 1;

    }

    public Car(int maxSpeed, int minSped, double weight, boolean isTheCarOn,
            String license, char condition, double currentPrice, int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarOn = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.currenPrice = currentPrice;
        this.mileagePassed = mileagePassed;

    }

    public void printAttributes() {
        System.out.println("Maksimalna br. je: " + this.maxSpeed);
        System.out.println("Maksimalna br. je: " + this.minSpeed);
        System.out.println("Registracioni br. je: " + this.license);
        System.out.println("Tezina je: " + this.weight);
        System.out.println("Trenutna cena je: " + this.currenPrice);
        System.out.println("Status rada je: " + this.isTheCarOn);
        System.out.println("Maksimalna br. je: " + this.condition);
        System.out.println("Predjeni put br. je: " + this.mileagePassed);
    }

    public void printMainAttributes() {
        System.out.println("Model. je: " + this.model);
        System.out.println("Gorivo br. je: " + this.maxFuel);
        System.out.println("Trenutno gorivo je: " + this.currentFuel);
        System.out.println("Predjeni put je: " + this.mileagePassed);
        System.out.println("Trenutno putnika: " + this.currentPassengers + ", maksimalno: " + this.maxPassengers);
        System.out.println();

    }

    public void changeModel(String customModel) {
        this.model = customModel;
    }

    public void ChangeMaxFuel(int customMaxFuel) {
        this.maxFuel = customMaxFuel;
    }

    public void fuelUp() {
        this.currentFuel = this.maxFuel;
    }

    public void changeConsumption(int customCompsaption) {
        this.consumption = customCompsaption;
    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.consumption;
            System.out.println("Putovali ste: " + distance);

        } else {
            System.out.println("Nema dovoljno goriva");
        }

    }
    
    public void getin(int numberOfPassengers) {
            if (this.currentPassengers + numberOfPassengers <= this.maxPassengers) {
                this.currentPassengers = this.currentPassengers + numberOfPassengers;
                System.out.println("Uslo " + numberOfPassengers + ", trenutno putnika: " + this.currentPassengers + "\n");
            } else {
                System.out.println("Nema mesta za " + numberOfPassengers + " putnika Slobodnih mesta: " + (this.maxPassengers - this.currentPassengers));
            }
                }
    
    public void getOut(int numberOfPassengers) {
        if (this.currentPassengers >= numberOfPassengers) {
            this.currentPassengers = this.currentPassengers - numberOfPassengers;
            System.out.println("Izaslo je " + numberOfPassengers + " putnika. Ostalo je " + this.currentPassengers);
        } else {
            System.out.println("Nema toliko putnika u automobilu.");
        }
    }
    
    
    
    
    public void getIn(int passengers) {
        if (this.currentPassengers < this.maxPassengers) {
            this.currentPassengers = this.currentPassengers + 1;
            System.out.println("Usao je jedan putnik, trnutno putnika: " + this.currentPassengers);

        } else {
            System.out.println("Nema vise mesta.");
        }

    }
    
    

    public void getOut() {
        if (this.currentPassengers > 0) {
            this.currentPassengers = this.currentPassengers - 1;
            System.out.println("Izasao je jedan putnik, trnutno putnika: " + this.currentPassengers);
        } else {
            System.out.println("Nema vise putnika");
        }

    }

    public void changeMaxPassengers(int newMax) {
        this.currentPassengers = newMax;
    }
        public void changeCurrentPassengers(int newCurrent) {
        this.currentPassengers = newCurrent;
    }
}
