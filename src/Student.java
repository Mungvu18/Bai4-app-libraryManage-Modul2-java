public class Student {
    private String name;
    private String studentId;
    private String birthDay;
    private String classOfStudent;

    public Student(String name, String studentId, String birthDay, String classOfStudent) {
        this.name = name;
        this.studentId = studentId;
        this.birthDay = birthDay;
        this.classOfStudent = classOfStudent;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", classOfStudent='" + classOfStudent + '\'';
    }
}
