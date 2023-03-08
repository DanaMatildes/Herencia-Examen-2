package herencia;

public class Main {

public static void main(String[] args) {
		
		Atributos array = new Atributos();
		Menu miMenu = new Menu();

		Persona personaje1 = new Personaje("Areli");
		Persona personaje2 = new Personaje("Joshua");
		Persona personaje3 = new Personaje("Germán");
		Persona personaje4 = new Personaje("Cass");
		Persona personaje5 = new Personaje("Emiliano");
		Persona personaje6 = new Personaje("Pedro");
		Persona personaje7 = new Personaje("Dafne");
		Persona personaje8 = new Personaje("Samanta");
		Persona personaje9 = new Personaje("Antonio");
		Persona personaje10 = new Personaje("Abril");
		
		
		String[] personajes = new String[10];
		personajes[0] = "Areli";
		personajes[1] ="Joshua";
		personajes[2] = "Germán";
		personajes[3] ="Cass";
		personajes[4] ="Emiliano";
		personajes[5] ="Pedro";
		personajes[6] ="Dafne";
		personajes[7] ="Samanta";
		personajes[8] ="Antonio";
		personajes[9] ="Abril";
		
		
		System.out.println("Nombre: "+ personaje1.getNombre());
		String[][] matriz1= personaje1.setAtributos2(array.arrayAtributos(), personaje1.getNombre());
		array.imprimeMatriz(matriz1);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje2.getNombre());
		String[][] matriz2= personaje2.setAtributos2(array.arrayAtributos(), personaje2.getNombre());
		array.imprimeMatriz(matriz2);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje3.getNombre());
		String[][] matriz3= personaje3.setAtributos2(array.arrayAtributos(), personaje3.getNombre());
		array.imprimeMatriz(matriz3);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje4.getNombre());
		String[][] matriz4= personaje4.setAtributos2(array.arrayAtributos(), personaje4.getNombre());
		array.imprimeMatriz(matriz4);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje5.getNombre());
		String[][] matriz5= personaje5.setAtributos2(array.arrayAtributos(), personaje5.getNombre());
		array.imprimeMatriz(matriz5);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje6.getNombre());
		String[][] matriz6= personaje6.setAtributos2(array.arrayAtributos(), personaje6.getNombre());
		array.imprimeMatriz(matriz6);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje7.getNombre());
		String[][] matriz7= personaje7.setAtributos2(array.arrayAtributos(), personaje7.getNombre());
		array.imprimeMatriz(matriz7);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje8.getNombre());
		String[][] matriz8= personaje8.setAtributos2(array.arrayAtributos(), personaje8.getNombre());
		array.imprimeMatriz(matriz8);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje9.getNombre());
		String[][] matriz9= personaje9.setAtributos2(array.arrayAtributos(), personaje9.getNombre());
		array.imprimeMatriz(matriz9);
		System.out.println("\n");
		
		System.out.println("Nombre: "+ personaje10.getNombre());
		String[][] matriz10= personaje10.setAtributos2(array.arrayAtributos(), personaje10.getNombre());
		array.imprimeMatriz(matriz10);
		System.out.println("\n\n");
		
		System.out.println("\t\t\tV    F");
		array.imprimeValores(personaje1.conteoValores(matriz1, matriz2, matriz3, matriz4, matriz5, matriz6, matriz7, matriz8, matriz9, matriz10, array.arrayAtributos()), array.arrayAtributos());
		
		miMenu.menu(array.arrayAtributos()); //imprime el menú las preguntas
		
		String[][] personajeAlAzar = miMenu.personaAlAzar(matriz1, matriz2, matriz3, matriz4, matriz5, matriz6, matriz7, matriz8, matriz9, matriz10);
		
		String[][] respuesta1 = miMenu.preguntas(personajeAlAzar, array.arrayAtributos(), matriz1);
		System.out.println("\n\nPosibles personajes: ");
		miMenu.compruebaPersonajes(respuesta1, matriz1, matriz2, matriz3, matriz4, matriz5, matriz6, matriz7, matriz8, matriz9, matriz10);
		
		String[][] respuesta2 = miMenu.preguntas(personajeAlAzar, array.arrayAtributos(), matriz1);
		System.out.println("\n\nPosibles personajes: ");
		miMenu.compruebaPersonajes(respuesta2, matriz1, matriz2, matriz3, matriz4, matriz5, matriz6, matriz7, matriz8, matriz9, matriz10);
		
		String[][] respuesta3 = miMenu.preguntas(personajeAlAzar, array.arrayAtributos(), matriz1);
		System.out.println("\n\nPosibles personajes: ");
		miMenu.compruebaPersonajes(respuesta3, matriz1, matriz2, matriz3, matriz4, matriz5, matriz6, matriz7, matriz8, matriz9, matriz10);
	
		System.out.println("\n--------------");
		System.out.print("\nPersonajes:\n");
		array.imprimeArrayStrings(personajes);//imprime lista de personajes
		
		miMenu.comprobar(personajeAlAzar, personajes);

}
}