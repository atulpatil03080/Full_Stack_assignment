package StringPrograms;

import java.util.Scanner;

public class StringProgram1 {

	String newstring = "";

	public String NewString(String Firstname, String secondname, int index) {

		for (int i = 0; i < Firstname.length(); i++) {

			if (i != index) {

				newstring = newstring + Firstname.charAt(i);
			} else {

				newstring = newstring + secondname;
				newstring = newstring + Firstname.charAt(i);
			}

		}

		return newstring;

	}

	public static void main(String[] args) {
		System.out.println("enter first name:");
		Scanner sc = new Scanner(System.in);
		String Firstname = sc.nextLine();
		System.out.println("enter second name:");
		String secondname = sc.nextLine();
		System.out.println("enter index value:");
		int index = sc.nextInt();
		StringProgram1 sp = new StringProgram1();
		System.out.println(sp.NewString(Firstname, secondname, index));

	}

}
