package test;

public class Check {
	
	int []a;
	public void show(){
		int[]a = new int[1] ;
		a[0] = 10;
		System.out.println("in abc code update here ");
		System.out.println(a[0]);
	}
	public static void main(String [] str){
	 int a=10;
	 new Check().show();
	}
}
