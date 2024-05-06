package generic;

interface Availiable {
	
	void selfIntroduction();
}

class Tree {
	private String sort;
	private int age;
	
	public Tree() {}
	
	public Tree(String sort, int age) {
		this.sort = sort;
		this.age = age;
	}
	
	public void info() {
		System.out.printf("[INFO] 종류 : %s, 나이" : );

	}
}

class Maple extends Tree implements Availiable {

	
	
	
	public Maple(String sort, int age) {
		super(sort, age);
	
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 단풍이다!");
		
	}
	
}

class Pine extends Tree implements Availiable {
	
	//alt shit + s + constructor

	public Pine(String sort, int age) {
		super(sort, age);
		
	}

	@Override
	public void selfIntroduction() {
		System.out.println("나는 소나무이다.!");
		
	}	
}

public class Ex04 {
	//[자료형에 안전하지 않은 코드] availiable로 변환이가능한애들을 타입으로 제한을둬야한다. 
	//제네릭에서 쓰는 parameter에 제한을 둔다
//	public static <T> void callSelfIntroduction(T t) {
//		((Availiable) t).selfIntroduction();
//	}
//	
//		
//	public static <T> void callInfo(T t) {
//		((Tree) t).info();
//	}
	
	// [자료형에 안전한 코드] <>에 들어갈수있는건 avaliable 자식이랑 그자신
	// : class와 interface를 구분하지않고 키워드 extends 사용
	// geneirc type parameter에 제한을뒀다.
	public static <T extends Availiable> void callSelfIntroduction(T t) {
		((Availiable) t).selfIntroduction();
	}
	
	public static <T extends Tree> void callInfo(T t) { //extends 상속을나타내는게아니라 generic에서사용하는 타입변수다 상속의개념이 아니다 extends는
		((Tree) t).info();
	}

	public static void main(String[] args) {
		Maple maple = new Maple("당단풍나무" , 25);
		Pine pine = new Pine("금강고로쇠" , 33);
		
		callSelfIntroduction(maple);
		callInfo(maple);
		
		callSelfIntroduction(pine);
		callInfo(pine);
		
		String name = "홍길동";
	//	callSelfIntroduction(name); //  실행 runtime error
		
		callInfo(name);
	}

}
