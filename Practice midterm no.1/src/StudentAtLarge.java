public class StudentAtLarge extends GraduateStudent{

    public StudentAtLarge(int idname, String lname){
        super(idname, lname);
    }


    @Override
    public int setTuition(){
        int StudentAtLarge = 2000;
        return StudentAtLarge;
    }
}
