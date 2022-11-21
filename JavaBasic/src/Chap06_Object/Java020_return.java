package Chap06_Object;
/*
 
 20 return문
 
 return문은 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
 지금까지 반환값이 있을 때만 return값을 썼지만,
 원래는 반환값의 유무에 관계없이 모든 메서드에는 적어도 하나의 return문이 있어야 한다.
 반환타입이 void인 경우, return문이 없이도 아무런 문제가 없었던 이유는
 컴파일러가 메서드의 마지막에 'return;'을 자동적으로 추가해주었기 때문이다.
 */
public class Java020_return {
	void printGugudan(int dan) {
		for (int i = 0; i <= 9; i++) {
			System.out.printf("%d %d = %d\n", dan, i, dan * i);
		}

	}
	// return; // 반환 타입이 void이므로 생략 가능. 컴파일러가 자동으로 추가함.

	int multiply(int x, int y) {
		int result = x * y;
		return result;// 반환타입이 void가 아니므로 생략불가
	}

	/*
	 아래의 코드는 두 값 중에서 큰 값을 반환하는 메서드이다.
	 if문 조건식의 결과에 따라 return문이 실행되지 않을 수도 있다.
	 이런 경우 if문의 else블럭에 return문을 추가해서,
	 항상 결과값이 반환되도록 해야 한다.
	 */
	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
		
	}// end main()
}// end class
