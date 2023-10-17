public class Health extends Insurance{

    public Health(String insurancetype){
        super(insurancetype);
    }

    @Override
    public double setCost() {
        double health = 196;
        return health;
    }

    @Override
    public void display(){
        System.out.println("You choose "+getInsurancetype()+" insurance!");
        System.out.println("The cost of the health insurance is "+setCost());
    }
}
