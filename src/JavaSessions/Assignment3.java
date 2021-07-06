package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment3 {
	public static void main(String[] args) {
		
		ArrayList<Integer> at = new ArrayList<Integer>();
		at.add(1);
		at.add(2);
		at.add(3);
		at.add(4);
		at.add(5);
		at.add(6);
		at.add(7);
		at.add(8);
		at.add(9);
		at.add(10);
		at.add(11);
		at.add(12);
		at.add(13);
		at.add(14);
		at.add(15);
		at.add(15);
		
		System.out.println(at);


		System.out.println("---------------");

		ArrayList<String> ak = new ArrayList<String>();
		ak.add("Abhi");
		ak.add("Vanita");
		ak.add("Vatsal");
		ak.add("Avni");

		System.out.println(ak);
		int j = ak.size();
		for (int l = 0; l < j; l++) {
			System.out.println(ak.get(l));

		}

		for (int u = j - 1; u >= 0; u--) {
			System.out.println(ak.get(u));
		}

		System.out.println("---------------");
		ArrayList<Integer> ah = new ArrayList<Integer>();
		ah.add(1);
		ah.add(2);
		ah.add(3);
		ah.add(4);
		ah.add(5);

		System.out.println(ah);
		ah.trimToSize();
		System.out.println(ah.size());

		System.out.println("---------------");
		ArrayList<Integer> ad = new ArrayList<Integer>();
		ad.add(1);
		ad.add(2);
		ad.add(3);
		ad.add(4);
		System.out.println(ad.removeAll(ad));
		System.out.println(ad);

		System.out.println("---------------");
		ArrayList<String> af = new ArrayList<String>();
		af.add("Neha");
		af.add("Parveen");
		af.add("Troy");
		af.add("Sheetal");
		af.add("Vanita");
		af.add("Shilpa");
		System.out.println(af.subList(2, 5));
		Collections.swap(af, 0, 5);
		System.out.println(af);

		System.out.println("---------------");

		ArrayList<Character> ai = new ArrayList<Character>();
		ai.add('V');
		ai.add('A');
		ai.add('N');
		ai.add('I');
		ai.add('T');
		ai.add('A');

		System.out.println(ai);
		Collections.reverse(ai);
		System.out.println(ai);

		System.out.println("---------------");

		ArrayList<Character> ac = new ArrayList<Character>();
		ac.add('A');
		ac.add('v');
		ac.add('n');
		ac.add('i');
		System.out.println(ac.set(3, 'u'));
		System.out.println(ac);
		System.out.println(ac.remove(3));
		System.out.println(ac);
		System.out.println(ac.add('i'));
		System.out.println(ac);
		System.out.println(ac.contains('v'));

		System.out.println("---------------");
		ArrayList<Integer> ab = new ArrayList<Integer>();
		ab.add(4);
		ab.add(9);
		ab.add(0);
		ab.add(2);
		ab.add(0, 11);
		ab.add(ab.size(), 45);
		System.out.println(ab);

		System.out.println("---------------");
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("red");
		ar.add("blue");
		ar.add("orange");
		ar.add("yellow");

		for (String e : ar) {
			System.out.println(e);

		}
	}

}
