public class Task15 {
	public static void main(String[] args) {
		final double eps = 0.000000000000000001;

		if ( (args.length != 3) ) {
            System.out.println("Wrong input 3 numbers required");
        }

        else {			
			long num1 = Long.parseLong( args[0] );
			long num2 = Long.parseLong( args[1] );
			long k = Long.parseLong( args[2] );

			printNeededNumber(num1, num2 ,k);
        }
	}

	static void printNeededNumber(long num1,long num2,long k){
		long differense = (num2 - num1);
		long result = (num1 + (k - 1) * differense);

		System.out.println(result);
	}
}
