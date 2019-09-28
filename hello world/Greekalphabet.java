public class Greekalphabet {
    public static void main(String[] args) {
        int firstLetter, lastLetter;
	    char firstG = 'α', lastG = 'ω';  
		firstLetter = (int)firstG;
		lastLetter = (int)lastG;
		System.out.println("希腊字母表： ");
		for(int i = firstLetter; i <= lastLetter; ++i){
            char greekLetter;
			greekLetter = (char)i;
			System.out.print(" "+greekLetter);
		}
	}
}