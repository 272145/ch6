import java.util.Scanner;
public class doubloon{
	public static void main(String[] args){
		Scanner in = new Scanner(system.in);
		System.out.print("enter a word");
		String word = in.nextLine();
		if(doubloon(word)){
			System.out.println(word+"is a doubloon");
		}else{
			System.out.println(word+"is not doubloon");
			
		}
		
		
		
		
	}
	public static boolean doubloon(String word){
		word = word.toLowerCase();
		for(int i = 0; i<word.length(); i++){
			int count = 0;
			for( int j=0; j<word.length(); j++){
				if(word.charAt(i) == word.charAt(j)){
					count++;
				}
			}
			if(count != 2){
				return false;
		
			}
		return true;
		}
	

	}


}
