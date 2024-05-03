package test_20240503;

import java.util.Iterator;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10까지 출력하는 for문을 작성
		
		// 파이썬 : for i in range(1,11):
		// print(i)
		
		//int i;
		for(int i=1;i<=100;i++) { //초;조;증 -> 초기값; 조건식; 증가식
			System.out.println(i);
	}
		
		for(int i=100;i>=1;i--) {
			System.out.println(i);
		}

		
		for(int i=1;i<=100;i=i+2) {
			System.out.println(i);
		}

		//1~1000 사이의 수 중 짝수만 출력하는 for문
		
		for(int i=0;i<=1000;i=i+2) {
			System.out.println(i);
		}
		
		System.out.println("_______________________________________________");
		//1~100까지의 합을 출력하는 for문을 작성하시오
		// sum = sum+i
		int sum = 0;
		for(int i=1;i<=100;i++) {
			sum = sum + i;
//			System.out.println(sum);
		}

		//마지막 것만 찍으려면 for문 밖에서
		System.out.println(sum);
	}	
}