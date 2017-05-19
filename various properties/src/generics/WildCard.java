package generics;

import java.util.*;

/*class Test extends Number
{
	public Test(){};
	public int data;
	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
}*/

public class WildCard 
{
	public static double first(ArrayList<? extends Number> list)
	{
		return list.get(0).doubleValue();
	}

	public static void main(String[] args) 
	{
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(5);
		double temp = WildCard.first(arrInt);
		System.out.println(temp);
		
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(10, "hello");
		map.put(11, "hola");
		map.put(12, "你好");
		String result = map.get(10);
		System.out.println(result);
		System.out.println(map.containsKey(20));
	}

}
