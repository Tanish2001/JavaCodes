import java.util.Scanner;

class  TreasureIsland{
	public static void main(String args[]){
		System.out.println("Welcome to Treasure Isalnd");
		System.out.println("Enter Left or Right");
		Scanner sc = new Scanner(System.in);
		String userinput = sc.nextLine();
		
		if (userinput.equalsIgnoreCase("left")){
			System.out.println("Enter swim or wait");
			//Scanner sc = new Scanner(System.in);
			userinput = sc.nextLine();

			if (userinput.equalsIgnoreCase("wait")){
				System.out.println("Which door? Red, Blue or Yellow?");
					userinput = sc.nextLine();
					if (userinput.equalsIgnoreCase("red")){
						System.out.println("Burned by fire. Over");
					}
					else if (userinput.equalsIgnoreCase("Blue")){
						System.out.println("Eaten by beast. Over");
					}
					else if (userinput.equalsIgnoreCase("Yellow")){
						System.out.println("You Win");
					}
					else{
						System.out.println("Game Over");
					}
					}
			else{
				System.out.println("Attacked by trout. Game over");
			}
		}
		else{
			System.out.println("U fall into hole. Game Over!!");
		}
		}

	}
