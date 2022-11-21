package Chap06_Object;
/*
 
 21 반환값
 
 return문의 반환값으로 주로 변수가 오긴 하지만 항상 그런 것은 아니다.

 int add(int x, int y) {
 	int result = x + y;
 	return result;
 }
 
 int add(int x, int y) {
 	return x + y;
 }
 
 -> 수학에서처럼 result의 값이 'x+y'와 같으므로 result 대신 'x+y'를 쓸 수 있다고 생각하면 된다.
 
 */
public class Java021_return {

//	int abs(int x) {
//		if (x >= 0) {
//			return x;
//		} else {
//			return -x;
//		}

	// 간단한 메서드의 경우 if문 대신 조건연산자를 사용하기도 한다.
	int abs(int x) {
		return x >= 0 ? x : -x;

	}
}// end class
