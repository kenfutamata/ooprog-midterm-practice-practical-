
public class ElementArray {
    public static void main(String[] args) {
        Element arr[] = new Element[2];

        arr[0] = new MetalElement("A", 13, 26.98);
        arr[1]= new NonMetalElement("H", 1, 1.007);

        for(Element final1:arr){
            final1.describeElement();
        }
    }
}
