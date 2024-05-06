package generic;


class Thing{
	private String id;
	private String name;
	
	public Thing() {}
	
	public Thing(String id, String name) {
		this.id = id;
		this.name = name;
	}	
}
 
class Tv extends Thing {
	@Override
	public String toString() {
		return " 나는 새로운 TV이다!";
	}
}	

class Pen extends Thing {
	@Override
	public String toString() {
		return "나는 평생 사용 가능한 Pen이다!";
	}
}
class Box<T> {
	T item;
	
	public void store(T item) {
		System.out.println("[박스에 상품을 닫는다.");
		this.item = item;
	}
	public T out() {
		System.out.println("[박스에서 상품을 꺼낸다.]");
		return item;
	}
}

public class Ex06 {
	public static void openBox(Box<? extends Thing> box) { //파일검사
		Thing item = box.out();
		System.out.println(item);
	}
	
	public static void main(String[] args) {
		Box<Tv> one = new Box<Tv>();
		one.store(new Tv());
	
		openBox(one);
		
		Box<Pen> two = new Box<Pen>();
		two.store(new Pen());
		openBox(two);
		
		// thing에 상속을 받지않고있어서 apple이
//		Box<Apple> apple = new Box<Apple>();
//		apple.store(new Apple());
//		openBox(apple);

	}

}
