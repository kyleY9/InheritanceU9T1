public class Teacher extends People {
    private String subject;
    private int numStudents;

    public Teacher(String name, int age, String subject, int numStudents) {
        super(name, age);
        this.subject = subject;
        this.numStudents = numStudents;
    }

    public String getSubject() {
        return subject;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void teacherInfo() {
        System.out.println("I teach " + subject + ", and I currently have " + numStudents + " students.");
    }
}
