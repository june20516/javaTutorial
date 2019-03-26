package org.opentutorials.javatutorials;

public class Loop {

	public static void main(String[] args) {
		//while
		int i = 0;
		while (i < 5) {
			System.out.println("i = " + i);
			i++;
		}
		System.out.println("i = " + i); // 변수 i 가 남아있음
		
		//for
		for (int j = 0; j < 10; j++) {
			System.out.println("j = " + j);
		}
		// System.out.println(j); 변수 j 가 남아있지 않으므로 에러 발
		
		// break and continue
		
		for (int j = 0; j != 10; j++) {  //break 조건에 걸리면 반복문 탈출 
			if ( j == 5)
				break;
			System.out.println("j = "+ j);
		}
		
		for (int j = 0; j != 10; j++) {  // continue 조건에 걸리면 반복문 건너뛰기 
			if ( j == 7)
				continue;
			System.out.println("j = "+ j);
		}
		
		int k = 0;
		while ( k != 10) {  //while 문에서 인덱스를 재설정 하지 않고 continue를 쓰려면 어떻게 해야 할까?
			k++;
			if ( k == 5)
				continue;
			System.out.println("k " + k);
		}
	}

}
