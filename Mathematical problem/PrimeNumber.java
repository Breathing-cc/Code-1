public class PrimeNumber {     
    public static boolean isPrime(int num) {   
       for(int i = 2; i <= Math.sqrt(num); i++) {
           if(num % i == 0) {
             return false;
           }
       }
       return true;
    }
    public static void main(String[] args) {
		int num = 0;
        for(int j = 2; j <= 100; j++) {
            if(PrimeNumber.isPrime(j)) {
                System.out.println("素数：" + j);
				num++;
				System.out.println("素数的个数是：" + num);
            }
        }      	
    }
}