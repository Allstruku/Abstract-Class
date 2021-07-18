
public class AbstractClassChild extends AbstractClass {

	@Override
	public void abstractObj() {
		System.out.println("This was inherited as an Abstract class");
	}
	// 추상 클래스를 부모로 가지게 되는 자녀 클래스를 선언하게 되면, 자동으로 윗 코드가 생긴다
	// 이때, 메소드가 실행이 될 때 실행할 코드를 작성하면 된다
}
