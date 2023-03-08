package herencia;
import java.util.Random;


public class Personaje extends Persona{
	private String nombre;
	
	public Personaje(String nombre) {
		super(nombre);
		this.nombre= nombre;
	}
	
	public String getNombre() {
		return(nombre);
	}
	
	//devuelve una matriz de [atributo][true/false]
	public String[][] setAtributos2(String[]array, String nombre) {
		int cont=0;

		String[] trueORfalse = new String[2];  //para hacer el random
		trueORfalse[0] = "false";
		trueORfalse[1] = "true";

		String[][] atributos = new String[5][2];  //5 filas: nombre y 4 atributos
		atributos[0][0] = nombre;
		atributos[0][1] = " ";

		
		for(int i=1; i<atributos.length; i++) {
			
			Random random = new Random();
			int num = random.nextInt(array.length-cont);
			
			Random randomVF = new Random();
			int valor = randomVF.nextInt(2);
			
			atributos[i][0]=array[num];
			atributos[i][1]= trueORfalse[valor];
			
			if(num==16) {
				array[16]=" ";
			}else {
				for(int n=num; n<array.length; n++) {
					array[num] = array[num+1];
				}
			}
			
			cont++;	
		}
		
		return(atributos);
	}
	
	//suma las veces que se repite cierto atributo
	public int[][] conteoValores (String[][]mat1, String[][]mat2,  String[][]mat3, String[][]mat4, String[][]mat5, String[][]mat6, String[][]mat7, String[][]mat8, String[][]mat9, String[][]mat10, String[]arrayAtr){
		int[][] matConteo = new int[arrayAtr.length][2];
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat1.length; j++) {
				if(arrayAtr[i].equals(mat1[j][0])) {
					if(mat1[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat1[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat2.length; j++) {
				if(arrayAtr[i].equals(mat2[j][0])) {
					if(mat2[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat2[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat3.length; j++) {
				if(arrayAtr[i].equals(mat3[j][0])) {
					if(mat3[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat3[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat4.length; j++) {
				if(arrayAtr[i].equals(mat4[j][0])) {
					if(mat4[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat4[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat5.length; j++) {
				if(arrayAtr[i].equals(mat5[j][0])) {
					if(mat5[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat5[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat6.length; j++) {
				if(arrayAtr[i].equals(mat6[j][0])) {
					if(mat6[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat6[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat7.length; j++) {
				if(arrayAtr[i].equals(mat7[j][0])) {
					if(mat7[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat7[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat8.length; j++) {
				if(arrayAtr[i].equals(mat8[j][0])) {
					if(mat8[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat8[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat9.length; j++) {
				if(arrayAtr[i].equals(mat9[j][0])) {
					if(mat9[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat9[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		for(int i=0; i<arrayAtr.length; i++) {
			for(int j=0; j<mat10.length; j++) {
				if(arrayAtr[i].equals(mat10[j][0])) {
					if(mat10[j][1].equals("true")) {
						matConteo[i][0]++;
					}else if(mat10[j][1].equals("false")) {
						matConteo[i][1]++;
					}
				}
			}
		}
		
		return(matConteo);
		
	}

	

}