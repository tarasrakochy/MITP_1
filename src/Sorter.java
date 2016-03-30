
public class Sorter {

    public void quickSort(int[] arr, int i, int j) {
        int start = i, finish = j;
        if (i >= j) {
            return;
        }
        if (j - i == 1) {
            if (arr[i] > arr[j]) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
            return;
        }
        int min = arr[i], max = arr[i];
        for (int k = i; k < j + 1; k++) {
            if (arr[k] > max) {
                max = arr[k];
            }
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        if (min == max) {
            return;
        }
        int pivotIndex = (i + j) / 2;
        int pivot = arr[pivotIndex];
        arr[pivotIndex] = arr[j];
        arr[j] = pivot;
        while (j != i) {
            while (arr[i] < pivot) {
                if (i == j) {
                    break;
                }
                i++;
            }
            while (arr[j] >= pivot) {
                if (j == i) {
                    break;
                }
                j--;
            }

            if (i != j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            if (i == j) {
                arr[finish] = arr[j];
                arr[j] = pivot;
            }
        }
        if (i > 0) {
            quickSort(arr, start, i - 1);
        }
        quickSort(arr, j, finish);
    }
}
