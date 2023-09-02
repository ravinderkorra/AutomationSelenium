package idealabs;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			  int r,sum=0,copy;    
			  int n=444;
			  
			 copy=n;    
			  while(n>0)
			  { 
			   
			   r=n%10;   
			   sum=(sum*10)+r;    
			   n=n/10;
			   
			  }    
			  if(copy==sum)    
			   System.out.println(" given number is palindrome number ");
			  
			  else    
			   System.out.println("given number is not palindrome");    
			}  
			 
			
	

}
