import java.util.Scanner;

class primeNumber{
	public static void main(String args[]){
		Scanner userin = new Scanner(System.in);
		int userInput = userin.nextInt();
		int i;
		int primeFlag = 0;
		if (userInput==1 || userInput==0){
			System.out.println(userInput+" is not a prime number");
		}
		else{
			for (i=2; i<userInput; i++){
				if (userInput%i==0){
					primeFlag = 1;
					System.out.println(userInput+ " is not a prime number");
					break;
				}
			}
			if (primeFlag==0){
				System.out.println(userInput+ " is a prime number");

			}
		}
	}
}