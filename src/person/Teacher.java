package person;

public class Teacher extends Person {

    private String mainSubject;
    private int experienceYear;

    public String getmainSubject() {
        return mainSubject;
    }

    public void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setexperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Teacher(String name, String surname, String jmbg) {
        super(name, surname, jmbg);

    }

    public Teacher(String name, String surname, String jmbg, String mainSubject, int experienceYear) {
        super(name, surname, jmbg);
        this.mainSubject = mainSubject;
        this.experienceYear = experienceYear;

    }

    @Override
    public void showData() {
        super.showData();
        System.out.println("Main Subject:" + getmainSubject());
        System.out.println("Experience Year:" + getExperienceYear());
    }

}
