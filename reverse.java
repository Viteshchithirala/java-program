import java.util.*;
class reverse {
	
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		String revStrWords;

		sc= new Scanner(System.in);
		
		System.out.print("Enter String to Reverse its Letters =  ");
		revStrWords = sc.nextLine();
		
		String[] strArray = revStrWords.split(" ");
		
		for(int i = 0; i < strArray.length; i++) 
		{
			char[] ch = strArray[i].toCharArray();
			for(int j = ch.length - 1; j >= 0; j--) 
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}