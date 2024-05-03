package test_20240503;

public class MainClass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 85;
		
		if (score >= 90) {
			System.out.println("수");
			//elif 조건:
		}else if (score >= 80) {
			System.out.println("우");
		}else if (score >=70) {
			System.out.println("미");
		}else if (score >= 60) {
			System.out.println("양");
		}else {
			System.out.println("가");
		}
		
		
		
		// 변수의 값이 분리되어 있는 경우 ( EX: 1,2,3 중 1개, A,B,C, 중 하나)
		//SWITCH 문이 IF문보다 간결하게 코드 작성 가능 
		String favor = "A";
		
		switch(favor) {
		case "A":
			System.out.println("안녕!");
			break;
		case "B":
			System.out.println("감사");
			System.out.println("고맙");
			break;
		case "C":
			System.out.println("hi");
			break;
		default:	
			System.out.println("잘가요");
		}
		

	}

}
