package generic;

class Apple {
	@Override
	public String toString() {
		return " 사과는 맛있다.";
	}
}

class Banana {
	@Override
	public String toString() {
		return "바나나는 멸종 위기이다.";
	}
}

class InstanceType {
	private int count;
	
	//==============================================
//	// 1. [parameter type : Apple]
//	public void showInstanceType(Apple apple) {
//		System.out.println("type >> " + apple);
//		count++;
//	}
	
//	// 2. [parameter type : Object]
//	public void showInstanceType(Object object) {
//		System.out.println("type >> " + object);
//		count++;
//	}
	
	// 3. [parameter type : generic type]
	public <T> void showInstanceType(T type) {
		System.out.println("type >> " + type);
		count++;
	}
	
	
	//==============================================
	
	public void showCount() {
		System.out.println("count >> " + count);
	}
}


public class Ex03 {

	public static void main(String[] args) {
		
		Apple apple = new Apple();
		Banana banana = new Banana();
		
		InstanceType in = new InstanceType();
		in.showInstanceType(apple);
		in.<Apple>showInstanceType(apple);
		in.showCount();
		
		in.showInstanceType(banana);
		in.<Banana>showInstanceType(banana);
		in.showCount();

		
	}

}
