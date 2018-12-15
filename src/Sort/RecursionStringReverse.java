package DSA;

public class RecursionStringReverse {

	public static void main(String[] args) {
		
		char[] name= {'D','A','R','S','H','A','N'};
     System.out.println(reverse(name,0));
	}
	public static String reverse(char[] name, int index) {
		
		
		if(index==name.length-1) {
			return name[index]+"";
		}
		
		String value=reverse(name, index+1)+name[index];
		return value;
		
	}

}
