public class fib{
	public static void main(String[] args){
		int n1 = 1;
		int n2 = 1;
		for(int i = 0;i < 5;i++){
			System.out.print(n1+"  "+n2+"  ");
			n1 = n1 + n2;
			n2 = n1 + n2;
		}
	}
}
