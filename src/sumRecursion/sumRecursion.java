package sumRecursion;
import java.util.*;
public class sumRecursion {
	
	 public static int toNumber(String s) {
	 if (s == null || s.length() == 0) {
	 return 0;
	 }
	 char next = s.charAt(0);
	 if (Character.isDigit(next)) {
	 return Character.digit(next, 10) + toNumber(s.substring(1));
	 } else {
	 return toNumber(s.substring(1));
	 }
	 }
	 
	 public static void main(String[] args){
		
		 Scanner console = new Scanner(System.in);
		 String toNumber = console.next();
		 System.out.println(toNumber(toNumber));
		 
	 }
}