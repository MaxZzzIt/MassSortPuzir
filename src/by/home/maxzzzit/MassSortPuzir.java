package by.home.maxzzzit;

import java.util.Arrays;

//Сортировка массива "пузырьковая"!

public class MassSortPuzir {
	public static void main(String[] args) {
		int[] mass = { 123, 2, 4, 1, 6, 23, 8, 46 };
		int temp, count = 0;
		for (int i = 0; i < mass.length; i++) {
			System.out.print(mass[i] + " ");
		}
		do {
			count++;
			for (int i = 0; i < mass.length - 1; i++) {
				if (mass[i] > mass[i + 1]) {
					temp = mass[i + 1];
					mass[i + 1] = mass[i];
					mass[i] = temp;
				}
			}
		} while (count > 0);
		
		System.out.println();
		for (int i=0; i<mass.length;i++) {
			System.out.print(mass[i]+" ");
		}
//ИЛИ ТАК!
//		for (int array : mass) {
//			System.out.print(array + " ");
//		}
	}
}
