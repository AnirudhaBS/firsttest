import java.util.Scanner;

module calculator {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1,n2,ans;
		char sign; 
		System.out.print("No. 1: "); 
		n1=input.nextInt(); 
		System.out.print("No. 2: ");
		n2=input.nextInt();
		System.out.print("Enter the mathematical operator to be used: "); 
		sign=input.next().charAt(0);
		if (sign == 'A' ){
			ans=n1 + n2;
			System.out.println(n1 +" "+sign +" "+n2 +"= "+" "+ ans );
		}
		else if(sign == 'S')
		{
			ans=n1-n2;
			System.out.println(n1 +" "+sign +" "+n2 +"= "+" "+ ans );
		}
		else if(sign == 'D'){
				ans=n1/n2;
				System.out.println(n1 +" "+sign +" "+n2 +"= "+" "+ ans );
	    }
		else if(sign == 'M'){
					ans=n1*n2;
					System.out.println(n1 +" "+sign +" "+n2 +"= "+" "+ ans );
		}
		else
			
		System.out.println("invalid input");
		
		
			
	}
}