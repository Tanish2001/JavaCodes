import java.util.Scanner;

public class ridecalci {
    public static void main(String args[]) {
        Scanner userin = new Scanner(System.in);
        System.out.println("Enter your height");
        int height = userin.nextInt();
        int cost = 0;

        if (height < 120) {
            System.out.println("You can't ride.");
        }

        else {
            System.out.println("Enter your age");
            int age = userin.nextInt();
            userin.nextLine();

            if (age < 12) {
                cost += 5;
            } else if (age < 18) {
                cost += 7;
            } else if (age > 18) {
                cost += 12;
            } else {
                cost += 0;
            }

            System.out.println("Do you want photos?");
            String wantPhotos = userin.nextLine();
            if (wantPhotos.equalsIgnoreCase("yes")) {
                cost += 3;
                System.out.println("The total bill is " + cost);
            } else {
                System.out.println("The total bill is " + cost);
            }
        }
    }
}
