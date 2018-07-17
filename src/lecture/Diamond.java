package lecture;

public class Diamond {
    public void draw() {
		// System.out.println("00100");
		// System.out.println("01110");
		// System.out.println("11111");
		// System.out.println("01110");
		// System.out.println("00100");
		int size = 5;
		for (int i = 0; i < size; i++) {
			int half = size / 2 - i;
			int positiveHalf = (half < 0)? -half : half;
			int[] row = new int[size];
			for (int j = 0; j < size; j++) {
				row[j] = (j < positiveHalf || (j > positiveHalf && -(j - size + 1) < positiveHalf))? 0 : 1;
			}
			for (int item: row) {
				System.out.print(item);
			}
			System.out.println();
		}
    }
}
