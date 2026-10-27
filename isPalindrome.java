import java.util.Scanner;
public class isPalindrome{
	public static boolean isPalindrome(String str){
		str = str.toLowerCase();
		String clean = " ";
	
		for(int i = 0; i<str.length();i++){
			char c = str.charAt(i);
			if(Character.isLetter(c)){
				clean+=c;
			}
		}
		for(int i = 0; i<clean.length() / 2;i++){
			char c = str.charAt(i);
			if(clean.charAt(i) != clean.charAt(clean.length() - 1 - i)){
				return false;
			}
		}
		return true;
	
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("enter a string: ");
		String input = in.nextLine();
		if (isPalindrome(input)){
			System.out.println("It is a palindrome.");
		}else{
			System.out.println("It is not a palindrome.");
		}	
	}


}

