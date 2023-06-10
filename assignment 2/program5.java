class Sahil4{
	public static void main(String[] args){

		int digit = 3471369;


		while(digit!=0){
			
			int rem = digit % 10;

			if(rem % 2==0){

				System.out.println((rem*rem) + " ");

			}

			digit /= 10;


		}

		System.out.println("\n");


	}

}
