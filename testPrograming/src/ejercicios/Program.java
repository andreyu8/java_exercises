package ejercicios;


/*
 *  x= 5 and pr.x= 5 
 * 
 * */

public class Program {

	static int x = 20;
	
	public static void main(String args[]){
	   Program pr = new Program();

	   pr.x = 5;
	   int y = x/pr.x;
	
	   System.out.print("y = ");
	   System.out.print(y);
	}
 

}
