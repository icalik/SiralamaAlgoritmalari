
public class SelectionSort {

	public static void selectionSort(int[] A) {
		int n = A.length + 1;
		int tmp;
		int min;
		for (int i = 0; i < n - 1; i++) {
			min = i;
			for (int j = i; j < n - 1; j++) {
				if (A[j] < A[min]) {
					min = j;
				}
			}
			tmp = A[i];
			A[i] = A[min];
			A[min] = tmp;
		}

	}

	public static void main(String[] args) {
		int[] A = { 2, 8, 3, 1, 7, 5 };
		selectionSort(A);
		for (int i = 0; i < A.length; i++) {
			System.out.println(A[i]);
		}

	}
}
