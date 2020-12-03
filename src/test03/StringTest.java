package test03;

public class StringTest {

	public static void main(String[] args) {
		//String str; // 이렇게 하면 에러남 외냐하면 '초기화'를 안 했으니까
//		String str = "안녕하세요";
//		System.out.println(str.indexOf("안")); //'안'의 인덱스(는 뭐니?
		//'안'이 몇번째에 있는지 알아보자고...program에서 method는 함수 래.
		
//		String str = "하이요,안녕하세요";
//		System.out.println(str.indexOf("요")); //2만 나옴. 왜냐하면 프로그램이 읽고 2가 먼저 있으면 그 뒤는 읽지 않기때문. 
//		
//		String str = "하이요,안녕하세요";
//		System.out.println(str.indexOf("이요")); //1이 나옴. 
		
//		String str = "하이요,안녕하세요";
//		System.out.println(str.indexOf("하하")); //아무것도 만족하지 않을 때는 -1이 나옴.
//	
	//indexOf를 사용하면 내가 찾으려는 글자가 있다, 없다를 찾을 수 있음/.
		
		//if를 이용해서 글자가 있으면 있다, 없으면 없다를 출력하시오
		
		String str = "하이요,안녕하세요";
		String search = "하이루";
		
		if(str.indexOf(search)==-1) {
			System.out.println("없어.");
		}else {
			System.out.println("있어.");
		}
		System.out.println( 1==1.1); //data type이 다르면 비교할 수 없어 ex. 1=="1" 은 안됨. 하지만 저거는 
		
		//indexOf.는 int 타입
	}
	//print.ln()과 같이 괄호가 있는거 if whlie for switch 이런것들을 제외하고 첫글자가 소문자면서, 괄호열기 닫기가 있는걸 '함수'라고 부른다. 
	//e.x. print.ln(), main() <-main함수
	//method: 함수 //객체지향인거
	//function: 함수  //객체지향이 아닌거
	// . '점'은 : ~의라는 뜻이래
	//즉 System.out.println 에서 System의 out. out의 println.
	//자바는 어떤 프로그램인지 아시나요? 객체지향 프로그밍 : Object Orientation Project. OOP
	//객체지향 프로그래밍 중에 하나가 java
	

}
