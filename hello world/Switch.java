public class Switch{
	public static void main(String []args)throws Exception{
		System.out.println("请输入字符：");
		  char x = (char) System.in.read();
		switch (x){
			case'a':{
				System.out.println("1");
				break;
			}	
            case'b':{
				System.out.println("2");
				break;
	        }
			default:{
				System.out.println("3");
			}
	    }
	}
}
