public class QuickImpl {
    public static void main(String[] args) {
        int arr[] = {9, 2, 1, 7, 3, 4};
        int n = arr.length;
        int res[] = QuickSort(arr, 0, n - 1);
        for (int i : res) System.out.print(i + " ");
    }

    public static int[] QuickSort(int arr[], int l, int h) {
        if (l < h) {
            int pivot = Partition(arr, l, h);
            QuickSort(arr, l, pivot - 1);
            QuickSort(arr, pivot + 1, h);
        }
        return arr;
    }

    public static int Partition(int arr[], int l, int h) {
        int i = l, j = h;
        int piv = arr[l];
        while (i < j) {
            while (arr[i] <= piv && i < h) {
                i++;
            }
            while (arr[j] > piv && j > l) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int tmp = arr[j];
        arr[j] = arr[l];
        arr[l] = tmp;

        return j;
    }
}