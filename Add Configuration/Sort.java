public class Sort {
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j;
            for (j = i - 1; j >= 0 && array[j] > key; i--) {
                array[j + i] = array[j];
            }
            array[j + 1] = key;
        }
    }

    public static void swap(int[] a, int i, int j) {
        int num = a[i];
        a[i] = a[j];
        a[j] = a[i];
    }
    public static void Sort(int []a,int i ,int j){
        for(i = 0;i <a.length - i;i++){
            for(j = 0;j < a.length - 1 - i;j++){
                if(a[j] > a[j + 1]){
                    swap(a,j,j+1)
                }.
            }
        }
    }
}
