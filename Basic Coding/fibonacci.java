class fibonacci{
	public static void main(String args[]){
		int firstNumber= 0;
		int secondNumber =1;
		int i;
		System.out.print("0 1 ");
		for (i=0 ; i<=6; i++){
			int nextNumber = firstNumber + secondNumber;
			System.out.print(nextNumber+" ");
			firstNumber= secondNumber;
			secondNumber= nextNumber;
		}
		
	}
}