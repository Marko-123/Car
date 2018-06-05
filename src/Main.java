
import loops.Loops;
import person.Person;
import person.Student;
import person.Teacher;

public class Main {

    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.printMainAttributes();
//        
//        
//        
//        Car companyCar = new Car(150, 30, 2000, false, "EFG-456", 'B', 3500, 60000);
//        
//        companyCar.printAttributes();
//        
//        companyCar.changeModel("Fiat");
//        companyCar.ChangeMaxFuel(150);
//        companyCar.fuelUp();
//        
//        companyCar.changeConsumption(5);
//        
//        companyCar.printMainAttributes();
//        companyCar.travel(10);
//        companyCar.printMainAttributes();
//        
//        Car audi = new Car();
//        audi.changeModel("Audi");
//        audi.fuelUp();
//        audi.changeConsumption(20);
//        
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        audi.travel(3);
//        audi.printMainAttributes();
//        
//        Car testAuto = new Car();
//        
//        testAuto.getIn(1);
//        testAuto.printMainAttributes();
//        testAuto.getIn(2);
//        testAuto.printMainAttributes();
//        testAuto.getIn(3);
//        testAuto.printMainAttributes();
//        testAuto.getIn(4);
//        testAuto.printMainAttributes(); 
//        
//        testAuto.getOut(3);
//        testAuto.printMainAttributes();
//        testAuto.getOut(2);
//        testAuto.printMainAttributes();
        //While loop
        //Loops testLoop = new Loops();
//        Loops.testWhileLoop();
//        Loops.testDoWhileLoop();
//        Loops.testForLoop();
//        
//        Loops.testDubleForLoop();
//        
//        Loops.testMultiplicationTable();
        


        Person p1 = new Person();
        p1.showData();
        
        
        p1.setName("Marko");
        p1.setSurName("Barlovic");
        p1.setJmbg("6545646546");
        
        p1.showData();
        
        
        
        Person p2 = new Person("Marko", "Barlovic", "3216354687");
       
        p2.showData();
        
        
        Student studentMarko = new Student("Marko", "Markovic", "46574856456");
        studentMarko.setCurrentYear(5);
        studentMarko.setIndexNumber("fsd-5646");
        studentMarko.showData();
        
        Student studentMarija = new Student("Marija", "Maric", "6546546545", "inh-858 ", 3);
        studentMarija.showData();
//        
        
        Teacher teacherJovo = new Teacher("Jovo", "Jovic", "54654654654", "Oto", 25);
        teacherJovo.showData();

    }
}
