package test03;

public class StringTest2 {

	public static void main(String[] args) {
		
///	String str = " "; //"": 빈 문자열  & " ": space;    근데 ""이랑 " "은 달라 //빈문자열은 값이 없는게 아님.// String str; 이런게 값이 없는거지
//		System.out.println(str);
		
		//Q"adf"큰 따옴표는 그저 string의 시작과 끝을 알려주는 기호같은거임. 그러면 console에다가 "adf"자체를 입력하고 싶으면 어떻게 해야해?
		
		//역 slash를 사용하면 됨 \" 요렇게.!
		//	String str = "\"asd\"";
		//System.out.println(str);
		
		String str = "잘생겼어요~";
		int [] nums = new int [3];
		
//		System.out.println(nums.length);
		//length는 괄호가 안붙었지 그럼 얘는 속성이야. 나이, 키, IQ, 등등 이런것 처럼 속성이야. 근데 움직인다. 뛴다 같은 동사! 는 method래. 그러므로 length는 함수가 아니다.
	
		
		System.out.println(str.length());// 6이 나옴. 잘생겼어요~ str.length라는 method.
		
		
		/* String str = "12345";
		 * System.out.println(str.indexOf("1"));
		 * System.out.println(str.length());
		 * 
		 * answer은  0, 5
		 * 
		 *밑에 처럼 이렇게도 쓸 수 있어요. 왜냐하면 str = "12345"이기 떄문.
		 * System.out.println("12345".indexOf("1"));
		 * System.out.println("12345".length());
		 */
		
	
		
		

	}
}
