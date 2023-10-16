public class UndergraduateStudent extends Student{


    public UndergraduateStudent(int idnumber, String lname) {
        super(idnumber, lname);
    }

    @Override
    public int setTuition() {
        int UndergraduateStudenttuition = 4000;
        return UndergraduateStudenttuition;
    }


}
