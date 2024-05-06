package generic;
/* [Generic] 제네릭================================
 * :타입을 일반화(generalize)함
 * :타입은 컴파일 할 때 결정
 * :generic은 type을 외부에서 결정(지정)합니다
 * :JDK 1.5 부터 도입(지원)
 * =================================================
*/
// <> 안에있는거 타입 파라미터

class Test <T>{
	//private 타입 element;
	private T element;
	
	public void setElement(T element) {
		this.element = element;
	}
	
	public T getElement() {
		return element;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		Test<String> t = new Test<String>();
		t.setElement("안녕");
		System.out.println(t.getElement());
		
		Test<Integer> t2 = new Test<Integer>();
		t2.setElement(5);
		System.out.println(t2.getElement());
  		//Test<int> t2 = new Test();
		//<>안에는primitive 타입올수 없고 Reference 타입만올수있다
	}
}
