class Practice2 {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int pop = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)){
                rev = 0;
                break;
            }else if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && x < Integer.MIN_VALUE % 10)){
                rev = 0;
                break;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}