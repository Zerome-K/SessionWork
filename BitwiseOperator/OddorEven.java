public class Swap(){
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	System.out.println(((a & 1) == 1)?"Odd":"Even");
	}

}