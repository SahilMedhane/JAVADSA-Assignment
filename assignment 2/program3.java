class Sahil2{

	public static void main(String[] args){

		int digit = 834762938;

		int count = 0;

		while(digit != 0){

			count++;
			digit= digit/10;


		}

		System.out.println("Number of digits is "+ count);

	}
}
