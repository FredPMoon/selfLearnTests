package Child;

class Parent
{
	private int pnum_;
	private int gender_;
	public Parent()
	{
		pnum_ = 20;
		gender_ = 0;
	}
	public Parent(int num)
	{
		this.pnum_ = num;
	}
	public final int getNum()
	{
		return pnum_;
	}
	public int getGender_() {
		return gender_;
	}
	public void setGender_(int gender) {
		this.gender_ = gender;
	}
}

public class Child extends Parent
{
	private int cnum_;
	public Child(){};
	public Child(int num)
	{
		super(num);
		cnum_ = super.getNum() + 1;
	}

	public static void main(String[] args) 
	{
		Parent p = new Parent(38);
		Child c1 = new Child(18);
		Child c2 = new Child();
		anotherChild ac1 = new anotherChild();
		System.out.println("c1's number is: " + c1.getNum());
		System.out.println("c2's number is: " + c2.getNum());
		System.out.println("ac1's number is: " + ac1.getNum());
	}
}
