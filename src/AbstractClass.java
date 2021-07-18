// 구체적이지 않은 클래스를 추상클래스라고한다
// 부모 클래스에서는 못 쓰지만 상속을 해서 child class에서 쓸 수 있도록 해준

public abstract class AbstractClass {
	// 클래스 중에서 메소드가 한개라도 abstract keyword를 쓰게 된다면 그 클래스 전체가 abstract해야된다
	// 클래스를 abstract 선언하려면 클래스 앞에 abstract keyword를 적으면 된다
	public abstract void abstractObj();
	// 추상 메소드는 리턴타입 앞에  abstract keyword를 적으면 된다
	public void inheritObj() {
		System.out.println("This method is inherited");
		// 추상 클래스 안에 일반 메소드를 넣을 수 있다
	}
}
