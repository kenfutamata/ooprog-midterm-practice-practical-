import java.util.*;
public class UseInsurance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String insurancetype;

        System.out.println("Enter insurance type: ");
        insurancetype = input.next();

        if(insurancetype.equals("LIFE")|| insurancetype.equals("life")||insurancetype.equals("Life")){
            Life L = new Life(insurancetype);
            L.display();
        }
        else if(insurancetype.equals("Health")|| insurancetype.equals("HEALTH")|| insurancetype.equals("health")){
            Health H = new Health(insurancetype);
            H.display();
        }else{
            System.out.println("Invalid insurance!");
        }
    }
}
