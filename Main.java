package lab1.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		Controller.menu(list, sc);
	}

}
