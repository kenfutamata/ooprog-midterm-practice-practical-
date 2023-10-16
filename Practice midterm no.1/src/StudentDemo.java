
public class StudentDemo {
    public static void main(String[] args) {

        Student stu[] = new Student[6];

        stu[0] = new GraduateStudent(23260888, "Futamata");
        stu[1] = new UndergraduateStudent(12345678, "De los reyes");
        stu[2] = new StudentAtLarge(22245232, "Dela curz");
        stu[3] = new GraduateStudent(21285655, "Danao");
        stu[4] = new UndergraduateStudent(20252354, "Osmenia");
        stu[5] = new StudentAtLarge(20252354, "Osmenia");


        for(Student arr: stu){
            System.out.println("Students id number: "+arr.getIdnumber());
            System.out.println("Students last name: "+arr.getLname());
            System.out.println("Students tuition: "+arr.setTuition());
        }


    }
}
