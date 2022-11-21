package Chap06_Object;
/*
 
 23 기본형 매개변수
 
 자바에서는 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다.
 매개변수의 타입이 기본형(primitive type)일 때는 기본형 값이 복사되겠지만,
 참조형(reference type)이면 인스턴스의 주소가 복사된다.
 
 메서드의 매개변수를 기본형으로 선언하면 단순히 저장된 값만 얻지만,
 참조형으로 선언하면 값이 저장된 곳의 주소를 알 수 있기 때문에
 값을 읽어오는 것은 물론 값을 변경하는 것도 가능하다.
 
 1. 기본형 매개변수(primitive type)
 	변수의 값을 읽기만 할 수 있다. (read only)
 
 2. 참조형 매개변수(reference type)
 	변수의 값을 읽고 변경할 수 있다. (read & write)
 */

class Data {
	int x;
}// end class Data

class Java023_primitiveType {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);

		change(d.x);
		// change 메서드의 매개변수 x의 값이 변경

		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
		
	}// end main()

	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}// end class Java023_primitiveType

/*
 
 [console]
 main() : x = 10
 change() : x = 1000
 After change(d.x)
 main() : x = 10
 
 1. change메서드가 호출되면서 'd.x'가 change메서드의 매개변수 x로 복사됨
 2. change메서드에서 x의 값을 1000으로 변경
 3. change메서드가 종료되면서 매개변수 x는 스택에서 제거됨
 
 
 => 'd.x'의 값이 변경된 것이 아니라, change메서드의 매개변수 x의 값이 변경된 것이다.
 	원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
 	이처럼 기본형 매개변수는 변수에 저장된 값만 읽을 수 있을 뿐 변경할 수는 없다.

*/
