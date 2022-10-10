package StringPrograms;

import java.util.Scanner;

public class StringProgram4 {

	public void repetedchar(String a) {

		char arr[] = a.toCharArray();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			count = 1;
			if (ch != ' ') {
				for (int j = i + 1; j < arr.length; j++) {

					if (ch == arr[j]) {

						count++;
						arr[j] = ' ';
					}
				}
				System.out.println(ch + " " + count);

			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter String");
		String a = sc.next();
		StringProgram4 ap4 = new StringProgram4();
		ap4.repetedchar(a);

	}

}