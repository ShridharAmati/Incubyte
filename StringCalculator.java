public class Stringcalculator {
	int Add(String numbers) {
static int Add(String numbers) {
		if(numbers.isEmpty()) 
		{
//		return 0;
			System.out.println("0");
		}
		
		return 0;
		}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String numbers=sc.nextLine();
		String[] arr = numbers.split(",");
		if(arr.length<=2) 
		{
		Add(numbers);
		}
	}

}
