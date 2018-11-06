package ba.unsa.etf.rpr.tutorijal1;
import java.util.List;

public abstract class Subject {
    private List<Student> enrolledStudents;
    private String subjactName;
    private String responsibleTeacher;
    private int numberOfECTSPoints;

    public Subject(String subjactName, String responsibleTeacher, int numberOfECTSPoints) {
        this.subjactName = subjactName;
        this.responsibleTeacher = responsibleTeacher;
        this.numberOfECTSPoints = numberOfECTSPoints;
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public int getNumberOfECTSPoints() {
        return numberOfECTSPoints;
    }

    public String getSubjactName() {
        return subjactName;
    }

    public String getResponsibleTeacher() {
        return responsibleTeacher;
    }
    public void enrollStudents(Student student){
    }
    public void deleteStudents(int index){

    }
    public String printStudents(){
        String no="mee";
        return no;
    }
}
