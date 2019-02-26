import java.util.Scanner;


interface If{
	void then();
};

class disgusting {
	public enum bool{
		FALSE(0),TRUE(1);
		public final int val;
		private bool(int val){
			this.val = val;
		}
	};
	
	public static void main(String[] args){
		If[] iF = {()->System.out.println("false"),()->System.out.println("true")};
		bool[] bools = {bool.FALSE,bool.TRUE};
		Scanner scn = new Scanner(System.in);
		System.out.println("0 or 1");
		bool input = bools[scn.nextInt()];
		iF[input.val].then();
	}
}