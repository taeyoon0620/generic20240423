// 형변환을 안해도 타입을구체화하지않고 일반화형태로만듬
// 제네릭 변수가있어야한다 <> 외부에서 결정 기본타입올수없고 레퍼런스 타입만올수있다
package generic;

class TestTwo {
	private Object element;
	
	public void setElement(Object element) {
		this.element = element;
	}
	public Object getElement() {
		return element;
	}
}

public class Ex02 {

	public static void main(String[] args) {

		TestTwo t = new TestTwo();
		t.setElement("안녕");
		System.out.println(t.getElement());
		String t_value = (String)t.getElement();
		
		TestTwo t2 = new TestTwo();
		t.setElement(5);
		System.out.println(t2.getElement());
		
		Integer t2_value = (Integer)t2.getElement();
	}

}
