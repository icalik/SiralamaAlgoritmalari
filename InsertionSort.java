public class InsertionSort {
	public static void insertionSıralama(int[] arr) {
		int i, j, Tasinan;
		for (i = 1; i < arr.length; i++) {
			Tasinan = arr[i];
			j = i;
			while (j > 0 && arr[j - 1] > Tasinan) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = Tasinan;
		}
	}
	public static void main(String[] args) {
		int[] a = { 5, 2, 4, 0, 6, 1, 3 };
		insertionSıralama(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
