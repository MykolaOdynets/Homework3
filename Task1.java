package Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		randomGen(10);

	}

	public static void randomGen(int k) {
		List<String> Pages = new ArrayList<>(k);

		for (int z = 0; z < k; z++) {
			
			Random random = new Random();
			Integer i = random.nextInt(9) + 6; // число від 6 до 15
			List<Integer> word = new ArrayList<>(i);
			for (int x = 0; x < i; x++) {
				Random rnd = new Random();
				int str = rnd.nextInt(10);
				word.add(str);
				System.out.println();
			}
			Pages.add(word.toString());
			
		}
		System.out.println(Pages.toString());
		
	}

}
