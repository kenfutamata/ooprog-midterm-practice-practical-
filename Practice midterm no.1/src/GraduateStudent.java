public class GraduateStudent extends UndergraduateStudent{

    public GraduateStudent(int idnumber, String lname){
        super(idnumber, lname);
    }

    @Override
    public int setTuition() {
        int GraduateStudent = 6000;
        return GraduateStudent;
    }

}
