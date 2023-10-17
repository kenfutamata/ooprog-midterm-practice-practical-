public class Life extends Insurance{


    public Life(String insurancetype){
        super(insurancetype);
    }

    @Override
    public double setCost() {
        double life = 36;
        return life;
    }

    @Override
    public void display(){
        System.out.println("You picked a "+getInsurancetype()+" insurance!");
        System.out.println("The cost for the life insurance monthly is "+setCost());
    }
}
