package ua.lviv.lgs.Lesson_10_1;

import java.util.Scanner;

public class Application1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����� � �'��� ����: ");
		String str = sc.next().toUpperCase();
		StringBuffer buffer = new StringBuffer(str);
		if (str.length() == 5 ) {
			if( str.equals(buffer.reverse().toString())) {
		      System.out.println("������� ������������ ����� " + buffer + " � ����������:");
			}
			else { System.out.println("������� ������������ ����� " + str + " �� � ����������:");}
		}
		else { System.out.println("Error! ������� ����� �� � 5 ����: "); }
 }
}
