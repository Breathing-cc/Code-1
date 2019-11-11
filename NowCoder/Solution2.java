public class Solution2 {
    public static int count(int[] A, int n) {
        int num = 0;
        if (n >= 5001) {
            return 0;
        } else {
            for (int i = 1; i < A.length; i++) {
                for (int j = i - 1; j < A.length - 1; j++) {
                    if (A[i] > A[j]) {
                        num++;
                    }
                }
            }
            System.out.println(num);
        }
        return 0;
    }

    public static void swap(int[] a, int i, int j) {
        int num = a[i];
        a[i] = a[j];
        a[j] = num;
    }

    public static void Bubble(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,5,6,7,0};
        Bubble(A);
        count(A,8);
    }
}