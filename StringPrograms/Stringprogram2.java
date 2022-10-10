package StringPrograms;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Stringprogram2 {

	public void AscDsc() {
		String str = "atul";
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;

		// Assending
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.println("String is:" + str);
		System.out.print("Asc:");
		System.out.println(arr);

		// Desc
		i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
			i++;
		}
		System.out.print("Desc:");
		System.out.println(arr);

	}

	public static void main(String[] args) {

		Stringprogram2 sp2 = new Stringprogram2();
		sp2.AscDsc();
	}
}
