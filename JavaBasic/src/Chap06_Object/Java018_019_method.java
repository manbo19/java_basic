package Chap06_Object;
/*
 
 18 메서드의 실행 흐름
 19 메서드의 실행 흐름 예제
 
 */

class Java018_019_method {
	public static void main(String[] args) {
		MyMAth mm = new MyMAth();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.substract(5L, 3L);
		long result3 = mm.mutiply(5L, 3L);
		double result4 = mm.divide(5L, 3L); // double 대신 long 값으로 호출하였다. (자동형변환됨)

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("substract(5L, 3L) = " + result2);
		System.out.println("mutiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}

}

class MyMAth {
	long add(long a, long b) {
		// long result = a+b;
		// return result;
		return a + b; // 위의 두 줄을 이와 같이 한 줄로 간단히 할 수 있다.
	}

	long substract(long a, long b) {
		return a - b;
	}

	long mutiply(long a, long b) {
		return a * b;
	}

	double divide(double a, double b) {
		return a / b;
	}

}

