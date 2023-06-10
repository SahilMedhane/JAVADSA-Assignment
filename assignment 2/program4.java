class Sahil3{
	public static void main(String[] args) {

		int number = 394561034;
		int count = 0;

		while(number!=0){
			int rem = number % 10;
			
			if(rem % 2 ==1){
				count++;

			}

			number = number/10;
		}

		System.out.println("odd digits in number are "+ count);


	}

}
