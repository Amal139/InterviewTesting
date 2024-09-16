package interviewProgram;

import java.util.HashMap;
import java.util.Map;

public class OccurenceCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="amalraj";
	char[] chars=	s.toCharArray();
	Map<Character,Integer> mapValue=new HashMap<Character, Integer>();
	
	for (char c : chars) {
		if(!mapValue.containsKey(c)) {
		mapValue.put(c, 1);
	}else
	{
	
	int value=	mapValue.get(c);
	mapValue.put(c, value+1);
	}
	}
	System.out.println(mapValue);	
	}}	

	


