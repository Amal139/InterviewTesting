package interviewProgram;

public class ReversedSentence {

	public static void main(String[] args) {
		
		String given="my name is amalraj";
		
		String reverse="";
		
		String[] splitWords=given.split(" ");
		
		for(int i=splitWords.length-1;i>=0;i--) {
			System.out.print(splitWords[i]+" ");
		}

	}

}
