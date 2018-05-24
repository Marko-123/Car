
public class Car {
    
    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarOn = false;
    String license = "ABC-123";
    char condition = 'A';
    double currenPrice = 3000;
    int mileagePassed = 50000;
    
    String model;
    int maxFuel;
    int currentFuel;
    int consumption;
    
    public Car() {
        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
    
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
    
    public void changeConsumption( int customCompsaption) {
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
}
    


