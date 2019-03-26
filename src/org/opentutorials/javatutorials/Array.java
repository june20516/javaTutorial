package org.opentutorials.javatutorials;
import java.util.List;
import java.util.ArrayList;


public class Array {

	public static void main(String[] args) {
		
		int[] number = {5090, 5093};
		
		for ( int a : number) {
			System.out.println(a);
		}
		
		List<Integer> phoneNumber = new ArrayList<Integer>();
		phoneNumber.add(010);
		phoneNumber.add(5090);
		phoneNumber.add(5093);
		
		for (Integer a : phoneNumber) {
			System.out.println(a);
		}
		
		String[] squadMembers = new String[5];
		squadMembers[0] = "Jamie";
		squadMembers[1] = "Hngfu";
		squadMembers[2] = "Billy";
		squadMembers[3] = "Oingbong";
		squadMembers[4] = "Jaying";
		
		for (int i = 0; i <= squadMembers.length-1; i++) {
			System.out.println(squadMembers[i]+ " is our member.");
		}
		
		for(String a : squadMembers) {
			System.out.println(a + " is our member.");
		}
	}
	
}