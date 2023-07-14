import java.util.Scanner;
public class waterBill {
    public static void main(String args[]){
        Scanner userin = new Scanner(System.in);
        System.out.println("Enter the units ");
        int units = userin.nextInt();
        int meterCharge = 75;
        int charge = 0;
        if (units<=100){
            charge = units*5;
        }
        else if (units<=250){
            charge = units*10;
        }
        else{
            charge = units * 20;
        }


        int totalWaterBill = charge + meterCharge;

        System.out.println(totalWaterBill);

    }
}
