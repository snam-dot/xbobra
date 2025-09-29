public class Student extends User {
    private double gpa;
    private String[] courses = new String[100];
    private int indexOfCourses = 0;

    public Student() {
        super();
    }

    public Student(int id, String login, String password, String name, String surname, double gpa) {
        super(id, login, password, name, surname);
        this.gpa = gpa;
    }

    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    public void addCourse(String course) {
        if (indexOfCourses < courses.length) {
            courses[indexOfCourses++] = course;
        }
    }

    public void getCourses() {
        System.out.println("Courses:");
        for (int i = 0; i < indexOfCourses; i++) {
            System.out.println("- " + courses[i]);
        }
    }

    @Override
    public void getData() {
        super.getData();
        System.out.println("GPA: " + gpa);
        getCourses();
    }
}
