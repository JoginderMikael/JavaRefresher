
public class primeNumber0_1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int i = 0; i <= 1000; i++) {
			if (isPrime(i)){
				count++;
			}
		}
		
		System.out.print(count);

	}
	
	
	static boolean isPrime(int number){
		if( number <= 1 ) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt (number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
