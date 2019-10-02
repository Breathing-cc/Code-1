public class QuickSort {
    public static  void quickSort(int [] array){
        quickSortInter(array ,0,array.length-1);
    }
    private static void quickSorItnter(int[]a,int left,int right){
        if(left >= right){
            return;
        }
        int pivotIndex = partition(array,left,right);
        quickSorItnter(a,left,pivotIndex-1);
        quickSorItnter(a,pivotIndex+1,right);
    }
    public static void swap(int a[],int i, int j){
        int num = a[i];
        a[i] = a[j];
        a[j] = num;
    }
    public static int partition(int a[],int left,int right){
        int begin = left;
        int end = right;
        int pivot = a[left];
        while(begin < end){
            while(begin < end && a[end] >= pivot){
                end --;
            }
            while (begin < end && a[begin] <= pivot){
                begin++;
            }
            swap(a,begin,end);
        }
        swap(a,left,begin);
        return begin;
    }
    public static int partition1(int []a , int left, int right){
        int pivot = a[left];
        int d = left + 1;
        for(int i = left + 1;i <= left;i++ ){
            if(a[i] < pivot){
                swap(a,i,d++);
            }
        }
        swap(a,d - 1;left);
        return d - 1;
    }
    private static int partition3(int[] array, int left, int right) {
        int i = left;
        int j = right;
        int pivot = array[left];
        while (i < j) {
            while (i < j && array[j] >= pivot) {
                j--;
                }
            array[i] = array[j];
            while (i < j && array[i] <= pivot) {
                i++;
            }
            array[j] = array[i];
        }
        array[i] = pivot;
        return i;
    }

    public static void main(String[] args) {

    }
}
