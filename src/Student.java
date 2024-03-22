public class Student extends People{
    private String school;
    private double gpa;

    public Student(String name, int age, String school, double gpa) {
        super(name, age);
        this.school = school;
        this.gpa = gpa;
    }

    public String getSchool() {
        return school;
    }

    public double getGPA() {
        return gpa;
    }

    public void studentInfo() {
        System.out.println("I go to school at " + school + " and have a gpa of " + gpa + ".");
    }
}
