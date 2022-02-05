public class Stringcalculator {
	int Add(String numbers) {
static int Add(String numbers,int a[]) {
		if(numbers.isEmpty()) 
		{
//		return 0;
			System.out.println("0");
		}
		int add=0;
		for(int i=0;i<a.length;i++) {
			add+=a[i];
		}
		System.out.println(add);
		
		return 0;
		}
	public static void main(String[] args) 
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("String");
		String numbers=sc.nextLine();
		String[] arr = numbers.split(",");
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]); 
		}
// 		if(arr.length<=2) 
// 		{
		Add(numbers);
// 		}
	}

}
