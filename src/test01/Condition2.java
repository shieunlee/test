package test01;

public class Condition2 {
	public static void main(String[] args) {
		int a = 99;
		if(a<100) {
			System.out.println("a는 100보다 작네요"); //만약에 여기서 조건을 만족 시킨다면 밑에건 비교하지도 않음.
		}else if(a>100) {
			System.out.println("a는 100보다 크네요");
		}else {
			System.out.println("a는 100 이였군!!"); 
		}
		
	//2개를 비교하고 싶을 때 방법 #1
	int b = 10;
	int c = 11;
	if(b<100) {
		if(c<100) {
			System.out.println("b,c 모두 100보다 작군요");
		}
	}
	
	//2개 비교하고 싶을 때 방법 #2
	int d = 10;
	int e = 11;
	if(d<100 && e<100) {
		System.out.println("d와 e는 모두 100보다 작습니다.");
		//&& (n percent 조건)은 모두 다 참이어야지 true이다.
	}
	
	
	//  ||는 or이라는 뜻이래
	int f = 10;
	int g = 101;
	if(f<100 || g<100) {
		System.out.println("신기하다 둘중에 하나가 참이면 이게 프린트가 되는거지. 둘다 false일때만 error나오고 ㅎㅎㅎ신기해");
	}
	}
	
}
