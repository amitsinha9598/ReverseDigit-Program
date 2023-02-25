public class ReverseDigit {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("Enter any digits ");
	 int num = sc.nextInt();
	 System.out.print("The digits is "+num);
	 int tmp=0,rem=0,sum=0,rev_dig=0;
	 tmp = num;
	 while(num!=0) {
		 rem = num % 10;
		 sum += rem;
		 rev_dig = (rev_dig * 10 ) + rem;
		 num /= 10;
	 }
	 System.out.println("Sum Of digits "+sum);
	 System.out.println("Revrse Of digits "+rev_dig);
	 System.out.println("The digits is "+num);
	 
	 if(tmp == rev_dig)
		 System.out.println("The number is Palindrome... ");
	 else 
		 System.out.println("The number is not Palindrome... "); 
	 


	}

}