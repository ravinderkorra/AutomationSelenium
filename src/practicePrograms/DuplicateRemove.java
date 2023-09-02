package practicePrograms;

public class DuplicateRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//String rs="aravindhasametha";
//
//StringBuilder sb1=new StringBuilder();
//rs.chars().distinct().forEach(c ->sb1.append((char)c));
//System.out.println(sb1);
//	}
//
//}
		
		
		
		
		
		
		String rs="aravindhasametha";
		
		StringBuilder sb=new StringBuilder();
	
	for (int i=0;i<rs.length();i++) {
		char ch =rs.charAt(i);
		int index=rs.indexOf(ch,i+1);
		if(index==-1) {
			sb.append(ch);
		}
		
	}
	
	System.out.println(sb);
	
	
	
	}}

		