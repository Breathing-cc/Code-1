public class Practice4 {
//折半查找(查找对象为有序数组)
    public static int binarySearch(int[]a,int i){
        int begin = 0;
        int end = a.length-1;
        while(begin <= end){
            int mid = (begin + end)/2;
            if(mid == i){
                return mid;
            }else if(mid > i){
                end = a.length-1-mid;
            }else{
                begin = mid;
            }
        }                             //返回值int类型的函数返回
        return -1;                    //return 0：一般用在主函数结束时，按照程序开发的一般惯例，表示成功完成本函数。
    }                                 //return -1:表示返回一个代数值，一般用在子函数结尾。按照程序开发的一般惯例，表示该函数失败。
    public static void main(String[] args) {
        System.out.println("折半查找：");
        System.out.println(binarySearch(new int [] {1,2,3,4,5,6,7,8},2));
    }
}
