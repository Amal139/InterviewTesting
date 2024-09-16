package interviewProgram;

public class StringReverseChartAt {

	public static void main(String[] args) {
		String input="amalraj";
		
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			reverse=reverse+input.charAt(i);
			
		}
       System.out.println(reverse);
	}

}
