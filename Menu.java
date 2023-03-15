package herencia;
import java.util.Scanner;
import java.util.Random;

public class Menu {

	int pregunta;
	Scanner sc = new Scanner (System.in);
	Scanner input = new Scanner (System.in);
	
	//Imprime menu de preguntas
	public void menu(String[] array) {
		System.out.println("\n\n ");
		System.out.println("Preguntas: ");
		int a= array.length;
		int cont=0;
		for(int m=0; m<a; m++) {
			System.out.println(cont + ") ¿El personaje "+ array[m]+"?");
			cont++;
		}
	}
	
	//Selecciona personaje al azar, devuelve la matriz de sus características
	public String[][] personaAlAzar(String[][]mat1, String[][]mat2,  String[][]mat3, String[][]mat4, String[][]mat5, String[][]mat6, String[][]mat7, String[][]mat8, String[][]mat9, String[][]mat10){
		Random random = new Random();
		int number = random.nextInt(10)+1;
		if(number==1) {
			return(mat1);
		}
		if(number==2) {
			return(mat2);
		}
		if(number==3) {
			return(mat3);
		}
		if(number==4) {
			return(mat4);
		}
		if(number==5) {
			return(mat5);
		}
		if(number==6) {
			return(mat6);
		}
		if(number==7) {
			return(mat7);
		}
		if(number==8) {
			return(mat8);
		}
		if(number==9) {
			return(mat9);
		}else {
			return(mat10);
		}
		
	}
	
	
	//Comprueba si el personaje al azar tiene los atributos que pregunta el usuario
	public String[][] preguntas (String[][] matriz/*personajeAzar*/, String[] array/*de atributos*/, String[][]matriz1) { 
	
			System.out.print("\nInserte el número de la pregunta que desea: ");
			pregunta = sc.nextInt();
			
			String st = array[pregunta];
			
			String[][] atributoValor = new String[1][2];
			atributoValor[0][0]= st;
			
			for(int s=0; s<matriz.length; s++) {
				String at = matriz[s][0];
				
				if(st.equals(matriz[s][0])) {
					
					if(matriz[s][1].equals("true")) {
						System.out.print("true");
						atributoValor[0][1]= "true";
					}else if(matriz[s][1].equals("false")) {
						System.out.print("false");
						atributoValor[0][1]= "false";	
					}
				}else if(s==matriz.length && st!=at) {
					System.out.print("Atributo no definido\n");	
				}
			}
			return(atributoValor);
		}
	
	
	
	//Va comprobando si el atributo preguntado y su valor(V/F) lo contiene cada personaje
	public void compruebaPersonajes(String[][]atributo, String[][]mat1, String[][]mat2, String[][]mat3, String[][]mat4, String[][]mat5, String[][]mat6, String[][]mat7, String[][]mat8, String[][]mat9, String[][]mat10) {
		
		String at = atributo[0][0];
		String valor = atributo[0][1];
		
		for(int i=0; i<mat1.length; i++) {
			if(mat1[i][0].equals(at) && mat1[i][1].equals(valor)) {
				System.out.print("\n");
					for(int j=0; j<mat1.length; j++) {
						System.out.print("\n");
						for(int k=0; k<mat1[0].length; k++) {
							System.out.print(mat1[j][k] + "\t");
						}
				}
			}
		}

		for(int i=0; i<mat2.length; i++) {
			if(mat2[i][0].equals(at) && mat2[i][1].equals(valor)) {
				System.out.print("\n");
					for(int j=0; j<mat2.length; j++) {
						System.out.print("\n");
						for(int k=0; k<mat2[0].length; k++) {
							System.out.print(mat2[j][k] + "\t");
						}
				}
			}
		}
		
		for(int i=0; i<mat3.length; i++) {
			if(mat3[i][0].equals(at) && mat3[i][1].equals(valor)) {
				System.out.print("\n");
					for(int j=0; j<mat3.length; j++) {
						System.out.print("\n");
						for(int k=0; k<mat3[0].length; k++) {
							System.out.print(mat3[j][k] + "\t");
						}
				}
			}
		}
		
		for(int i=0; i<mat4.length; i++) {
			if(mat4[i][0].equals(at) && mat4[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat4.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat4[0].length; k++) {
						System.out.print(mat4[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat5.length; i++) {
			if(mat5[i][0].equals(at) && mat5[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat5.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat5[0].length; k++) {
						System.out.print(mat5[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat6.length; i++) {
			if(mat6[i][0].equals(at) && mat6[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat6.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat6[0].length; k++) {
						System.out.print(mat6[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat7.length; i++) {
			if(mat7[i][0].equals(at) && mat7[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat7.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat7[0].length; k++) {
						System.out.print(mat7[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat8.length; i++) {
			if(mat8[i][0].equals(at) && mat8[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat8.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat8[0].length; k++) {
						System.out.print(mat8[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat9.length; i++) {
			if(mat9[i][0].equals(at) && mat9[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat9.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat9[0].length; k++) {
						System.out.print(mat9[j][k] + "\t");
					}
				}
			}
		}
		
		for(int i=0; i<mat10.length; i++) {
			if(mat10[i][0].equals(at) && mat10[i][1].equals(valor)) {
				System.out.print("\n");
				for(int j=0; j<mat10.length; j++) {
					System.out.print("\n");
					for(int k=0; k<mat10[0].length; k++) {
						System.out.print(mat10[j][k] + "\t");
					}
				}
			}
		}
	}
	
	
	//Comprueba si el usuario adivinó
	public int comprobar (String[][]personajeAzar, String[]personajes) {
		System.out.println("\n\nInserte el número del personaje que cree que escogió el sistema: ");
		int numGuess = input.nextInt();
		String guess = personajes[numGuess];
		int t= 0;
		
		String personaje = personajeAzar[0][0];
		
		
		if(guess == personaje) {
			System.out.print("Felicidades! Adivinó el personaje");
			t= 1;
		}else if(guess!=personaje) {
			System.out.print("Incorrecto, el personaje era: "+ personaje + "\n Suerte para la próxima" );
			t=0;
		}
		
		return(t);
	}
	 

	
}
