package GildNovember17Recursion;

public class RecursionInsideRecusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		predictTheOutput(3); 
	}
	public static void predictTheOutput(int x){
		if(x>0){
			predictTheOutput(--x);
			System.out.print("Value is"+x);
			predictTheOutput(--x);
		}
	}
}
