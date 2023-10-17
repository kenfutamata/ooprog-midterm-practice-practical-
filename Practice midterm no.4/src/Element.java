abstract class Element {

    String symbol;
    int atomicnumber;

    double atomicweight;

    public Element(String symbol, int atomicnumber, double atomicweight){
        this.symbol = symbol;
        this.atomicnumber = atomicnumber;
        this.atomicweight = atomicweight;
    }

    public Element(){
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

    public double getAtomicweight(){
        return atomicweight;
    }

    public abstract void describeElement();
}
