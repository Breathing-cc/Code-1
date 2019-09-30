public class Heap {
    public static void shiftDown(int[]array,int index,int size){
        int left = 2 * index + 1;
        while(left<size){
            int right = left + 1;
            int min = left;
            if(right < size){
                if(array[left] < array[right]){
                    array[left] = min;
                }else{
                    array[right] = min;
                }
            }
            if(array[index] > array[min]){
                swap(array,index,min);
            }else{
                return array;
            }
        }
    }
    public static void swap(int []arrray,int i,int j ){
        int num = array[i];
        array[i] = array[j];
        array[j] = array [num];
    }
    public static void main(String[] args) {
        int[]small = {39,15,3,18,40,5,6,51,};
    }
    public static void shiftUpSmall(int[]array,int i){
        while(i > 0){
            int p = (i - 1)/2;
            if(array[p] <= array[i]){
                break;
            }
            swap(array,p,i);
        }
    }
    public static void heapSort(int[]array){
        createHeapBig(array,array.length);
        for(int i = 0;i < array.length -1;i++){
            swap(array,0,array.length - i - 1);
            shiftDownbig(array,0,array.length - i -1);
        }
    }
}