package JavaSessions;

public class Assignment2 {
	//private static final Object Object = null;

	public static void main(String[] args) {
		String a = "I am Bataman";
		int b = 1;

		for (int i = 1; i <= 9; i++) {
			System.out.println(a + b++);

		}
		System.out.println("---------------");

		int x = 10;
		while (x >= 1) {
			System.out.println(x);
			x--;
		}
		System.out.println("---------------");

		int y = 10;
		do {
			System.out.println(y);
			y--;
		} while (y >= 1);

		System.out.println("---------------");

		int r = 1;
		String q = "Hello world";
		while (r <= 10) {
			System.out.println(q);
			r++;
		}

		System.out.println("---------------");

		int j = 1;
		for (; j <= 10; j++) {
			System.out.println(j);
			if (j % 7 == 0) {
				break;
			}
		}
		System.out.println("---------------");

		int o = 0;
		for (int k = 0; k <= 39; k++) {
			if (k <= 9) {
				System.out.print(0);
			}
			System.out.print(k + " ");
			o++;
			if (o % 10 == 0) {
				System.out.print("\n");
			}

		}
		System.out.println("---------------");

		Object ob[] = new Object[7];
		ob[0] = "Name = Virat Kohli";
		ob[1] = "Age =" + 30;
		ob[2] = "Team = India";
		ob[3] = "DOB = 01/02/1991";
		ob[4] = "Gender = " + 'M';
		ob[5] = "Strike Rate = " + 95.2;
		ob[6] = "IS Active = " + true;
		for (Object e : ob) {
			System.out.println(e);
		}

		Object ob1[] = new Object[7];
		ob1[0] = "Name = Shikhar Dhawan";
		ob1[1] = "Age =" + 28;
		ob1[2] = "Team = India";
		ob1[3] = "DOB = 13/06/1993";
		ob1[4] = "Gender = " + 'M';
		ob1[5] = "Strike Rate = " + 85.2;
		ob1[6] = "IS Active = " + true;
		for (Object f : ob1) {
			System.out.println(f);
		}

		Object ob2[] = new Object[7];
		ob2[0] = "Name = Rohit Sharma";
		ob2[1] = "Age =" + 25;
		ob2[2] = "Team = India";
		ob2[3] = "DOB = 11/09/1997";
		ob2[4] = "Gender = " + 'M';
		ob2[5] = "Strike Rate = " + 75.2;
		ob2[6] = "IS Active = " + true;
		for (Object g : ob2) {
			System.out.println(g);
		}
       
		System.out.println("---------------");

		int c = 4;
		while (c >= 0) {
			System.out.println("n = " + c);
			c--;
		}

	}
}