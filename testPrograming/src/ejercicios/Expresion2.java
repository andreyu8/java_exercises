package ejercicios;

public class Expresion2 {

	//generar un expresion que imprima lo siguiente "99 - 4455 - 4450 - 95" en la consola.
	
	public static void main (String args[]) {
		
		int decimal = 44;
		int decimal1 = 55;
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( Integer.parseInt(String.valueOf(decimal1).substring(0,1)) + Integer.parseInt(String.valueOf(decimal).substring(0,1)) ) ;
		sb.append( Integer.parseInt(String.valueOf(decimal1).substring(1,2)) + Integer.parseInt(String.valueOf(decimal).substring(1,2)) ) ;
		sb.append("-");
		sb.append(decimal + "" + decimal1);
		sb.append("-");
		sb.append(decimal + "" + (decimal1 -  (Integer.parseInt(String.valueOf(decimal1).substring(0,1)))));
		sb.append("-");
		sb.append( Integer.parseInt(String.valueOf(decimal1).substring(0,1)) + Integer.parseInt(String.valueOf(decimal).substring(0,1)) ) ;
		sb.append( String.valueOf(decimal1).substring(1,2) ) ;
		
		System.out.println(sb);
	
		
	}
	
}
