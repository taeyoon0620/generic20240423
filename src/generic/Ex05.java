package generic;
// 제네릭의기본적인형태 

/*
 * 1. 제네릭 타입은 해당 {} 영역 내에서만 유효
 * : 제네릭 타입 선언 형태
 * : 1-1. 인터페이스
 * : 1-2. 클래스
 * : 1-3. 메소드
 * 
*/

// 1-1. [generic interface]
interface InterfaceName<T> {}

// 1-2 . [Generic class]
class ClassOne<T> {}

// 2.  제네릭 타입은 두개 이상 가능
class ClassTwo<K, V> {}

// 클래스 상속
class ClassSuper {}
class ClassSub extends ClassSuper {}

public class Ex05 {
	
	// 1-3. [generic method]
	public static <T> void show(T  t) {
		System.out.println(t);
	}
	
	// 제네릭인 메서드
	
	// [extends와 super] ====================== type 제한둔거 generic의 매개타입<>
	// [타입 중심] 제네릭 메서드임
	// <T extends 타입> : 가능
	// <T super 타입> : 불가능
	public <T extends ClassSuper> void one(T t) {}
	// class super 와 extends 의 자식들만오게함
	//public <T super Classsuper> void two(T t) {} 	// super 모든부모 <문법적으로 불가능>
	
	
	//제네릭 타입이아닌 메서드 
	
	// [기능 (동작) 중점] 타입보다는 기능(동작) 그 자체에 초점을 둔 메소드 // 제네릭메서드가아님  일반적인 메서드 
	// 제네릭 인터페이스 또는 제네릭 클래스를 파라미터의 타입으로 사용
	// ?				: 와일드 카드 (Wildcard) 
	// ClassOne<?> : 비한정적 와일드카드 타입(Unbounded wildcard type)
	// <? extends 타입> : 가능
	// <? super 타입> : 가능
	
	public void three(ClassOne<?> name) {}
	public void four(ClassOne<? extends ClassSuper> name) {} // 이하
	public void five(ClassOne<? super ClassSub> name) {} //이상
	
	// 제네릭 타입(타입 파라미터)을 타입 제한(한정시킨다)----------------------
	public <T extends ClassOne<?>> void six(T t) {}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
