package problem1;

public class MorseCode {

	private static final String[] code = {".-" , "-...", "-.-.", "-..", ".", "..-.", 
		"--.",	"....", "..", ".---", "-.-", ".-..", 
		"--", "-.", "---", ".--.", "--.--", ".-.", 
		"...", "-", "..-", "...-", ".--", "-..-",
		"-.--", "--.." };
	public static String encode(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>'Z'||s.charAt(i)<'A')&&s.charAt(i)!=' ') return "Error";
			else if(s.charAt(i)==' ') r+=' ';
			else r+=code[s.charAt(i)-'A']+" ";
		}
		return r;
	}
	
	public static String decode(String s) {
		String morse="";
		String r="";
		s+=" ";
		while(!s.equals("")) {
			if(s.charAt(0)==' ') {
				for(int i=0;i<code.length;i++) {
					if(morse.equals(code[i])) r+= (char)('A'+i);
				}
				morse="";
			}else {
				morse+=s.charAt(0);
			}
			s=s.substring(1);
			
		}
		return r;
		
	}
}
