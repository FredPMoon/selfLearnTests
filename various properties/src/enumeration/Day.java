package enumeration;

public enum Day 
{
	MONDAY(1),
	TUESDAY(2), 
	WEDNESDAY(3), 
	THURSDAY(4), 
	FRIDAY(5), 
	SATURDAY(6), 
	SUNDAY(7);
	/*private */Day(int num)
	{
		setNum_(num);
	}
	public int getNum_() {
		return num_;
	}
	public void setNum_(int num_) {
		this.num_ = num_;
	}
	private int num_;
}

enum Name
{
	Fred, Carlos, Guy, Angel, Joey, George, Rob, Noah
}

enum GPA
{
	A, B, C, D
}