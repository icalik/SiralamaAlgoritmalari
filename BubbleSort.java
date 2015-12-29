
public class BubbleSort {
	public static void bublesort(int[] x) {
		int n = x.length;
		int tut, j, i;
		boolean sirali = false;
		for (i = 0; (i < n - 1) && !sirali; i++) {
			sirali = true;
			for (j = 0; j < n - i - 1; j++) {
				if (x[j] > x[j + 1]) {
					tut = x[j];
					x[j] = x[j + 1];
					x[j + 1] = tut;
					sirali = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] x = { 4, 34, 2, 1, 6, 8, 67, 35, 6, 39, 7 };
		bublesort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

}
