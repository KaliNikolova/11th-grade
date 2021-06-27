
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder s1 = new StringBuilder("Java"); 
		StringBuilder s2 = new StringBuilder("HTML"); 
		s1.append(" is fun"); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.append(s2); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.insert(2, "is fun"); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.insert(1, s2); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		System.out.println(s1.charAt(2));
		s1 = new StringBuilder("Java");  
		System.out.println(s1.length());
		s1 = new StringBuilder("Java"); 
		s1.deleteCharAt(3); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.delete(1, 3); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.reverse(); 
		System.out.println(s1);
		s1 = new StringBuilder("Java"); 
		s1.replace(1, 3, "Computer"); 
		System.out.println(s1);
		s1 = new StringBuilder("Java");  
		System.out.println(s1.substring(1, 3));
		s1 = new StringBuilder("Java"); 
		System.out.println(s1.substring(2));
		

	}

}
