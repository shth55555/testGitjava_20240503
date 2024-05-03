package test_20240503;

public class MainClass3 {

	public static void main(String[] args) {
		
		//java의 if문 형식
//		if (10 > 50) {
//			System.out.println("10은 5보다 크다");
//			
//		} else {
//			System.out.println("10은 50보다 작다");
//		}
		
		
		int num1 = 100;
		int num2 = 100;
		if (num1 == num2) {    /////숫자값을 비교할 떄는 부등호를 사용 (==)
			System.out.println("축하합니다 100점입니다!");
		}
		
		String str1 = "KOREA";
		String str2 = "KOREA";
		if (str1.equals(str2)) {     /// 문자열을 비교할 때는 ==쓰지말고, equals로 비교를 하자
			System.out.println("당신은 한국입니다!");
		}
		
	}

}
