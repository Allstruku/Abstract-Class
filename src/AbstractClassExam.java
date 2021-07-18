
public class AbstractClassExam {
	public static void main(String[] args) {
		AbstractClassChild a1 = new AbstractClassChild();
		a1.abstractObj();
		a1.inheritObj();
		// AbstractClass a2 = new AbstractClass();
		// 추상 클래스는 instance를 생성하지 못한다
	}
}
