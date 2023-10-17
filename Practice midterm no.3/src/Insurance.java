abstract class Insurance {
    String insurancetype;
    double monthlyprice;

    public Insurance(String insurancetype){
        this.insurancetype = insurancetype;
    }
    public Insurance(){
        String insurancetype = "";
    }

    public String getInsurancetype(){
        return insurancetype;
    }

    public abstract double setCost();
    public abstract void display();
}
