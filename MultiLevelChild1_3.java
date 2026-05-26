package inheritance.programs;

public class MultiLevelChild1_3 extends MultiLevelParent1_2 {

	public static void main(String[] args) {
		MultiLevelChild1_3 mul2 = new MultiLevelChild1_3();
		mul2.add();
		mul2.add(45, 90);
		mul2.sub();
		mul2.sub(78, 29);
	}
}
