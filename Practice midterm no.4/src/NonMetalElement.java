public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, int atomicnumber, double atomicweight){
    super(symbol, atomicnumber, atomicweight);
    }

    public NonMetalElement(){
        String symbol = "";
        int atomicnumber;
        double atomicweight;
    }

    public String getSymbol(){
        return symbol;
    }

    public int getAtomicnumber(){
        return atomicnumber;
    }

    @Override
    public double getAtomicweight() {
        return atomicweight;
    }

    @Override
    public void describeElement() {
        System.out.println();
        System.out.println("Symbol: "+getSymbol()+" Atomic number: "+getAtomicnumber()+" Atomic weight: "+getAtomicweight());
        System.out.println("Nonmetals are (usually) poor conductors of heat and electricity, and are not malleable or ductile");
        System.out.println("many of the elemental nonmetals are gases at room temperature, while others are liquids and others are solids.");

    }
}
