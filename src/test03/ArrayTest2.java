package test03;

public class ArrayTest2 {

	public static void main(String[] args) {
		double[] decs = new double[3]; // 사용하기 위해서 선언과 '초기화'를 해야한다. //'더블배열'을 대입할 수 있는거지 '더블'을 대입할 수 없음.
		// 자바에서 초기화(initialization)란 객체를 선언하고 값을 '최초'로 할당하는 것이다
		decs[0] = 1.1;
		decs[1] = 2.2;
		decs[2] = 10.2;

		for (int i = 0; i < decs.length; i++) {
			// 방번호 숫자는 0 1, 2니까 int인거고,
			System.out.println(decs[i]);

		}
	}
}
