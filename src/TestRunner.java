public class TestRunner {
    public static void main(String[] args) {
        // testing the People class
        People person = new People("Juan El Pro", 18);
        System.out.println(person.getName());
        System.out.println(person.getAge());
        person.introduce();
        System.out.println();

        // testing the Student class
        Student student = new Student("Kyle Yang", 15, "Brooklyn Tech", 89.5);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getSchool());
        System.out.println(student.getGPA());
        student.studentInfo();
        System.out.println();

        // testing the Teacher class
        Teacher teacher = new Teacher("Mr. Smith", 45, "calculus", 120);
        System.out.println(teacher.getName());
        System.out.println(teacher.getAge());
        System.out.println(teacher.getSubject());
        System.out.println(teacher.getNumStudents());
        teacher.teacherInfo();
    }
}
