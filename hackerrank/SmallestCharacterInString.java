import java.util.*;

public class SmallestCharacterInString {
    
     public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		String str = scanner.next();
		
		//Declaring maximum and minimu charactter
		char max = 'A';
		char min = 'z';
		
		for(int i=0;i<str.length();i++) {
			
			//Checking minimum character
			if(str.charAt(i) < min) {
				min = str.charAt(i);
			}
			
			//Checking maximum character
			if(str.charAt(i) > max) {
				max = str.charAt(i);
			}
		}
		System.out.println("Max : "+max);
		System.out.println("Min : "+min);
 
       

    }

}
