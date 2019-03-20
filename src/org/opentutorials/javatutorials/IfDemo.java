package org.opentutorials.javatutorials;

public class IfDemo {

	public static void main(String[] args) {
		String id = args[0];
		String pw = args[1];
		if(id.equals("june20516")) {
			if(pw.equals("1234")) {
				System.out.println("Right");
			} else {
				System.out.println("Wrong");
			}
		} else {
			System.out.println("Wrong");
		}
		
	}

}
