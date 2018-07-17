package lecture;

import java.util.HashSet;

public class Lotto {
    public void generateNumbers() {
		HashSet<Integer> lottoSet = new HashSet<>();
		while (lottoSet.size() < 6) {
			int min = 1;
			int max = 25;
			int value = min + (int)(Math.random() * ((max - min) + 1));
			lottoSet.add(value);
		}
		for (int number : lottoSet) {
			System.out.println(number);
		}
    }
}
