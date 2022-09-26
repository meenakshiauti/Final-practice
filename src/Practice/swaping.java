package Practice;

import java.util.HashMap;
import java.util.Map;

public class swaping {

	public static void main(String[] args) {
		
		String s="Meenakshi Vilas Auti";
		
		String[] s1=s.split(" ");
		
		String result="";
		
		for(int i=0;i<s1.length;i++)
		{
			if(i==s1.length-1)
			{
				result=s1[i]+result;
			}
			
			else
				result=" "+s1[i]+result;
		}
		System.out.println(result);
	}
}
	