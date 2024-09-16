package interviewProgram;

public class Palindrome {

	public static void main(String[] args) {
		String input="madam1";
		
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--) {
			
			reverse=reverse+input.charAt(i);
		}
       if(input.equals(reverse)) {
    	   System.out.println("palindrome");
       }else {
    	   System.out.println("Not palindrome");
       }
	}

}
