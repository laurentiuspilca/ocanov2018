public class ClassRoom {

    final String name;
    private final Student [] students;
    
    public ClassRoom(String name, Student [] students) {
        this.name = name;
        this.students = students;
    }
    
    public Student[] getStudents() {
        Student [] studentsCopy = new Student[students.length];
        for (int i=0; i<students.length; i++) {
            studentsCopy[i] = this.students[i];
        }
        return studentsCopy;
    }
    
}