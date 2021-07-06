package JavaSessions;

//import java.lang.Math.*;

public class FunctionsInJava {
	public int add(int a, int b) {
		int c = a + b;
		return c;

	}

	public int product(int a, int b) {
		int c = a * b;
		return c;

	}

	public void circle(int a) {
		double c = 2 * Math.PI * a;
		System.out.println("the circumference of the circle is :" + c);
		double d = Math.PI * a * a;
		System.out.println("the area of the circle is :" + d);

	}

	public int maxNum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println("a is max num");
			return a;
		}

		else if (b > a && b > c) {
			System.out.println("b is max num");
			return b;
		} else {
			System.out.println("c is max num");
			return c;
		}
	}

	public int minNum(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("a is min num");
			return a;
		}

		else if (b < a && b < c) {
			System.out.println("b is min num");
			return b;
		} else {
			System.out.println("c is min num");
			return c;
		}

	}

	public void evenOrOdd(int a) {
		if (a % 2 == 0) {
			System.out.println("even num");
		} else {
			System.out.println("odd num");
		}
	}

	public void vote(int a) {
		if (a >= 18) {
			System.out.println("eligible to vote");
		} else {
			System.out.println("not eligible to vote");
		}
	}

	public boolean primeNum(int a) {
		boolean isPrime = true;

		for (int e = 2; e <= a - 1; e++) {
			if (a % e == 0) {
				isPrime = false;
				break;
			}
		}

		return isPrime;
	}

	public String studentMarks(int a) {
		if (a <= 40) {
			return "fail";
		} else if (a >= 41 && a <= 50) {
			return "DD";
		} else if (a >= 51 && a <= 60) {
			return "CD";
		} else if (a >= 61 && a <= 70) {
			return "BC";
		} else if (a >= 71 && a <= 80) {
			return "BB";
		} else if (a >= 81 && a <= 90) {
			return "AB";
		} else if (a >= 91 && a <= 100) {
			return "AA";
		} else {
			return "Invalid marks";
		}

	}

	public static void main(String[] args) {
		FunctionsInJava f1 = new FunctionsInJava();
		int x = f1.add(45, 15);
		System.out.println(x);
		int y = f1.product(2, 5);
		System.out.println(y);
		f1.circle(3);
		int z = f1.maxNum(21, 4, 6);
		System.out.println(z);
		int w = f1.minNum(223, 54, 866);
		System.out.println(w);
		f1.evenOrOdd(8);
		f1.vote(13);
		boolean isPrimeNumber = f1.primeNum(44);
		if (isPrimeNumber == true) {
			System.out.println("its a prime num");
		} else {
			System.out.println("not a prime num");
		}
		String g = f1.studentMarks(101);
		System.out.println(g);

	}

}
