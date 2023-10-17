public class MetalElement extends  Element{

    public MetalElement(String symbol, int atomicnumber, double atomicweight){
        super(symbol, atomicnumber, atomicweight);
    }

    public MetalElement(){
        String symbol = "";
        int atomicnumber;
        double atomicweight;
    }
    @Override
    public String getSymbol(){
        return symbol;
    }

    @Override
    public int getAtomicnumber() {
        return super.atomicnumber;
    }

    @Override
    public double getAtomicweight() {
        return atomicweight;
    }

    @Override
    public void describeElement() {
        System.out.println("Symbol: "+getSymbol()+" Atomic number: "+getAtomicnumber()+" Atomic weight: "+getAtomicweight());
        System.out.println("Metals are good conductors of heat and electricity, and are malleable");
        System.out.println(" (they can be hammered into sheets) and ductile (they can be drawn into wire). ");
        System.out.println("Most of the metals are solids at room temperature, with a characteristic silvery shine (except for mercury, which is a liquid).  ");
    }
}
