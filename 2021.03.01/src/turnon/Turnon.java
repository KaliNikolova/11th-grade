package turnon;

import java.util.Scanner;

public class Turnon {

	static int n;
	static boolean[] lights;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		lights = new boolean[n];
		for (boolean l : lights) {
			l = false;
		}
		turnon(n - 1);
	}

	static void turnon(int i) {
		for (int j = i; j >= 0; j--) {
			if (!lights[j])
				changeThis(j);
		}
	}

	static boolean canChangeThis(int i) {
		if (i == 0)
			return true;
		if (lights[i - 1] == false)
			return false;
		for (int j = 0; j < i - 1; j++) {
			if (lights[j] == true)
				return false;
		}
		return true;
	}

	static void changeThis(int i) {
		if (isReady())
			return;
		if (canChangeThis(i)) {
			lights[i] = !lights[i];
			System.out.println((lights[i] ? "+" : "-") + (i + 1));
		} else {
			if (!lights[i - 1]) {
				changeThis(i - 1);
				if (isReady())
					return;
				lights[i] = !lights[i];
				System.out.println((lights[i] ? "+" : "-") + (i + 1));
			} else {
				turnOffAll(i - 2);
				lights[i] = !lights[i];
				System.out.println((lights[i] ? "+" : "-") + (i + 1));
			}
		}
		turnOffAll(i - 1);
	}

	static boolean isReady() {
		for (boolean l : lights) {
			if (!l)
				return false;
		}
		return true;
	}

	static void turnOffAll(int i) {
		for (int j = i; j >= 0; j--) {
			if (lights[j])
				changeThis(j);
		}
	}
}
