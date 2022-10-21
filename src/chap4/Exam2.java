package chap4;

import java.util.Scanner;

/*
 * 점수를 입력받아
 * 60점 이상이면 합격, 60점 미만이면 불합격을 출력하도록 
 * switch 구문으로 작성하기
 */
public class Exam2 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
//		double score = scan.nextDouble();
		/*
		 * switch(조건값) : 조건값의 자료형은 
		 * 		byte, short, int, char, String만 가능
		 */

		
		switch(score/10) {
		case 10: 
		case 9 :
		case 8 :
		case 7 :
		case 6 : System.out.println("합격");
				break;
		default : System.out.println("불합격");
		}
		
	
	}

}
