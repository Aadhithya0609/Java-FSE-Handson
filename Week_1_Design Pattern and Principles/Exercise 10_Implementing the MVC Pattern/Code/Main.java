public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ravi");
        student.setId("S101");
        student.setGrade("A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);
        controller.updateView();

        controller.setStudentName("Priya");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
