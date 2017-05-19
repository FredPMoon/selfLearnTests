package dataClasses;

public class DataType<T>
{
	private T data;
	private String typename;
	public DataType(){};
	public DataType(T num)
	{
		data = num;
		typename = "unknown";
	}
	public T getData()
	{
		return data;
	}
	public String getTypename()
	{
		return typename;
	}
}
