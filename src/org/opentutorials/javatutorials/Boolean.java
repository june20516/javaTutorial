package org.opentutorials.javatutorials;

public class Boolean {

	public static void main(String[] args) {
		String a = "Hello";
		String b = new String("Hello");
		String c = "Hello";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==c);
		a = "Hello again";
		System.out.println(a==c);
	}
}
