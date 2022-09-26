package Practice;

import java.util.ArrayList;

public class ArraylistPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
//		for(int i=1;i<=al.size();i++)
//		{
//			System.out.println(al.indexOf(4));
//		}
		
		System.out.println(al.contains(1));
		System.out.println(al.indexOf(1));
		//al.remove(1);
		System.out.println(al.size());
		
	}

}
