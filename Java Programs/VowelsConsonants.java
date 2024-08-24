package demo1;

public class VowelsConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string= "Surendra yadav";
		String str=string.toLowerCase();
		int vowels=0;
		int consonants=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch!=' ') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
					vowels++;
				}
				else {
					consonants++;
				}	
		    }
	}
        System.out.println("Number of vowels are :"+vowels);
        System.out.println("Number of consonants are :"+consonants);

}
}