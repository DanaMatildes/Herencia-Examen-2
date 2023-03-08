package herencia;

public class Atributos {

	public String[] arrayAtributos() {
		String[] atributos= new String[16];
		atributos[0]= "Usa lentes      ";
		atributos[1]= "Tiene perro     ";
		atributos[2]= "Tiene pareja    ";
		atributos[3]= "Es Universitario";
		atributos[4]= "Hace deporte    ";
		atributos[5]= "Usa Botas       ";
		atributos[6]= "Fuma            ";
		atributos[7]= "Toma café       ";
		atributos[8]= "Es foráneo	   ";
		atributos[9]= "Tiene peluches  ";
		atributos[10]= "Es alto		   ";
		atributos[11]= "Prefiere jamaica";
		atributos[12]= "Estudia ciencias";
		atributos[13]= "Tiene gato      ";
		atributos[14]= "Usa anillos     ";
		atributos[15]= "Reprobó TICs    ";
		return(atributos);
	}
	
	
	public void imprimeMatriz (String[][]matriz) {
		for(int i=1; i<matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ "   ");
			}
		}
	}
	
	public void imprimeValores (int[][]matriz, String[]array) {
		for(int i=0; i<matriz.length; i++) {
			System.out.println(" ");
			System.out.print(array[i]+ "\t");
			for(int j=0; j<matriz[0].length; j++) {
				System.out.print(matriz[i][j]+ "    ");
			}
		}
	}
	
	public void imprimeArrayStrings(String[]array) {
		for(int i=0; i<array.length; i++) {
			System.out.print("\n"+ i+ ")" + array[i]);
		}
	}
	

}