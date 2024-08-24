package demo1;

public class ExpandingString {

	public static void main(String[] args) {
		String input="a5b3c5";
		String result=expandingString(input);
		System.out.println(result);
	}

	private static String expandingString(String input) {
		StringBuilder output=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if (Character.isLetter(ch)) {
                output.append(ch); 
            } 
			else if (Character.isDigit(ch)) {
                int count = ch - '0'; 
                char lastChar = output.charAt(output.length() - 1);
				for(int j=1;j<count;j++) {
					output.append(lastChar);
				}
			}
		}
		
		return output.toString();
	}

}


