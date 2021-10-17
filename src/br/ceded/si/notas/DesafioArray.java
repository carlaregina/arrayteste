package br.ceded.si.notas;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		String [] array1 = new String[3] ;
		 
		array1[0] = "A";
		array1[1] = "B";
		array1[2] = "C";
		
		String [] array2 = new String [array1.length * 2];
		
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
			
			System.out.println(array2[i]);
		}
		for (int i = 3; i < array2.length; i++) {
			if(i == 3) {
				array2[i] = "D";
				
			}
			System.out.println(array2[i]);
		}
		}
}

