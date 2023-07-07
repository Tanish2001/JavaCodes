import java.util.Scanner;

class factorial{
	public static void main(String args[]){
		System.out.print("Enter the number to findout factorial : ");
		Scanner userin = new Scanner(System.in);
		int userinput = userin.nextInt();
		long factorialOfInput = 1;
		//System.out.println("This is your input " +userinput);
		if (userinput == 0){
		System.out.print("Factorial of "+userinput+" is 1");
		}
		else{
			System.out.print("Factorial of "+userinput+" is as follows ");
			for (int i =1; i<= userinput; i++){
				
				factorialOfInput = i*factorialOfInput;
					if (i< userinput) {
						System.out.print(i+"*");
					}
					else{
						System.out.print(i+ " = " + factorialOfInput);
					}
			}
		}
	}
}