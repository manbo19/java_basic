package Chap06_Object;
/*
 
 22 호출스택(call stack)
 
 호출스택은 메서드의 작업에 필요한 메모리 공간을 제공한다.
 메서드가 호출되면, 호출스택에 호출된 메서드를 위한 메모리가 할당된다.
 이 메모리는 메서드가 작업을 수행하는 동안
 지역변수(매개변수 포함)들과 연산의 중간 결과 등을 저장하는 데 사용된다.
 그리고 메서드가 작업을 마치면 할당되었던 메모리 공간은 반환되어 비워진다.
 
 <호출스택의 특징>
 1. 메서드가 호출되면 수행에 필요한 만큼의 메모리를 스택에 할당받는다.
 2. 메서드가 수행을 마치고 나면 사용했던 메모리를 반환하고 스택에서 제거된다.
 3. 호출스택의 제일 위에 있는 메서드가 현재 실행 중인 메서드이다.
 4. 아래에 있는 메서드가 바로 위의 메서드를 호출한 메서드이다.
 
 반환타입(return type)이 있는 메서드는 종료되면서 결과값을 자신을 호출한 메서드(caller)에게 반환한다.
 대기상태에 있던 메서드(caller)는 넘겨받은 반환값으로 수행을 계속 진행하게 된다.
 
 */

public class Java022_callStack {
	public static void main(String[] args) {
		System.out.println("HELLO");
	}

}
