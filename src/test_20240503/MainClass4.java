package test_20240503;

public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		
		int result = ++x ; // x= x+1
		int result2 = y++;  // y=y+1
		
		
		System.out.println(result);
		System.out.println(x);
		
		System.out.println(result2);
		System.out.println(y);
		
		int a = 1;
		int result3 = ++a + 10;
		System.out.println(result3);
		System.out.println(a);
		
		
		int b = 1;
		int result4 = b++ + 10;
		System.out.println(result4);
		System.out.println(b);
		
		int sum = 0;
		int i = 10;
		
		sum = sum + i;
		
		sum =+ i; // sum = sum + i
		
		sum = sum * i;
		
		sum *= i;  //sum = sum * i
				
		
	}

}
