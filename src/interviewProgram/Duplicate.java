package interviewProgram;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"java","selenium","test","java"};
		
		for(int i=0;i<str.length-1;i++) {
			
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println(str[i]);
				}
			}
		}

	}

}
