public class Practice1 {
    public static void main(String[] args) {
		int i ,j;
		System.out.println("完数:");
        for(i=1;i<=1000;i++){
			int sum = 0;
            for(j=1;j<i;j++){  
                if(i%j == 0){         //找出常熟i的因子j
                    sum = sum+j;      //将i的因子相加  
                }
            }
		    if(i==sum){
			System.out.printf("%d\n",i);
		    }	
        }
    }
}