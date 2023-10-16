abstract class Student {
    int idnumber;
    String lname;

    int tuition;

    public Student(int idnumber, String lname){
        this.idnumber = idnumber;
        this.lname = lname;
    }

    public void setIdnumber(int idnumber){
        this.idnumber = idnumber;
    }

    public int getIdnumber(){
        return idnumber;
    }

    public void setLname(String lname){
        this.lname=lname;
    }

    public String getLname(){
        return lname;
    }

    public abstract int setTuition();


}
