package interviewProgram;

public class ReplaceSymbol {

	public static void main(String[] args) {
		String given="automation852$^";
		
		String replaceWords=given.replaceAll("[^a-zA-Z]", " ");
		
      System.out.println(replaceWords);
	}

}
