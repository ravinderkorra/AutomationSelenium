package practicePrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//              String name="ravinder";
//				int len=name.length();     //4
//				String rev="";
//				
//				for(int i=len-1;i>=0;i--)    //3  2   1   0
//				{
//					rev=rev+name.charAt(i);  //rednivar
//					
//				}
//				
//				System.out.println("reverse of a given string id :"+rev);
//					
		
		
		
	// using character array
//		String name="ravinder";
//		String rev="";
//		char a[]=name.toCharArray();
//		int len=a.length;				
//				
//		for(int i=len-1;i>=0;i--) 
//		{
//				rev=rev+a[i];
//				
//			}
//			
//			System.out.println("reverse of a given string id :"+rev);
//				
		
		
//		using String Buffer Class
		
		
		
		

//public class ReverseString {
//
//	public static void main(String[] args) {
		String name="ravinder";
		String rev="";
		
		
			StringBuffer sb =new StringBuffer(name);
			System.out.println(sb.reverse());
		
		
		
	}

}
