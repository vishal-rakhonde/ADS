/* Print reverse of a string using recursion */

public class RevStringByRecursion {

	public static void main(String[] args) {
		String s="Vishal";
		System.out.print(recursionRev(s));
	}
	private static String recursionRev(String s) {
		if(s==null||s.length()<=1) {		//we have to String is null or String is started at a index of 1 till to end 
			return s;
		}
		return recursionRev(s.substring(1))+s.charAt(0);	//s.substring(1) is the subString started at a index 1 at every time and added first index in the last position at the started index
	}
	 
}