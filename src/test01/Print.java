package test01;

public class Print {
	public static void main (String[] args) {
		int i = 7;
		int j = 5;
		int sum = i+j;
		System.out.println(sum);
		
		System.out.println(i);  
		System.out.println(j);
		
		System.out.println(i+j);
// semicolon의 의미: 하나의 식입니다 라는 것을 알려주는 거래.
		
		double dec1 = 1.5;
		double dec2 = 2.5;
		double decSum = dec1+dec2;
		
		System.out.println(decSum);
//같은 영역 안에서 data type과 상관없이 변수 명은 중복 될 수 없다.

// equal means 같다 아니고 "대입"
		// equal 에는 (1) 같다 , 라는 뜻과 (2) 대입, 이라는 뜻이 있음.
		
		System.out.println(1==1); // == 은 "같다" 라는 거래. therefore 값은 "true"
		System.out.println(1==2); // therefore 값은 "false"
		
		System.out.println(1!=2); //!는 부정연산자  =/랑 같은 개념인듯. therefore the answer is "true"
		
		boolean smart = true;
		System.out.println(smart);
		
		//boolean smart = 1!=2; //면 오른쪽에서 계산 및 비교가 끝난 후 왼쪽에 대입
		
		/*자바의 data type은 크게
		 * 1. 숫자 저장
		 * 		1) 정수 저장
		 * 			a. byte
		 * 			b. short
		 * 			c. int
		 * 			d. long
		 * 		2) 실수 저장
		 * 			a. float
		 * 			b. double
		 * 2. 문자 저장 : char
		 * 3. 논리 저장: boolean
		 */
		
		
	//	boolean smart == 1; //음... 이건 안된다
	//	boolean smart != 1; //얘도 안돼... 개념 자체가 대입이 아니라 같다 등등이어여서 그런가보네...?
	}
	
	boolean smart = 1!=2; //면 오른쪽에서 계산 및 비교가 끝난 후 왼쪽에 대입[][][] 위에서 왜 오류가 났냐면 boolean smart가 이미 있어가지고 그래서 그래~
	
}
