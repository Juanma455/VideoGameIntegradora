package ui;

import java.util.Scanner;
import model.VideoGame;

public class Main{

	private Scanner reader;
	private VideoGame videogame;

	public Main(){
		reader = new Scanner(System.in);
		videogame = new VideoGame();
	}

	public VideoGame getVideoGame(){
		return videogame;
	}

	public Scanner getReader(){
		return reader;
	}

	public static void main(String[] args){
		Main main = new Main();
		int option = 0;
		do{
			option = main.getOptionShowMenu(); 
			main.executeOption(option);
		}
		while(option != 0);
		main.getReader().close();
	}

	public int getOptionShowMenu(){
		int option = 0; 
		System.out.println("\n" +
			"<<<<< Welcome to VideoGame >>>>>");
		System.out.println(
				"1. Crear un jugador.\n" +
				"2. Crear un nivel.\n" +
				"3. Agregar un tesoro a un nivel.\n" +
				"4. Agregar un enemigo a un nivel.\n" +
				"5. Cambiar el puntaje de un jugador.\n" +
				"6. Incrementar el nivel de un jugador.\n" +
				"7. Informar los tesoros y enemigos de un nivel.\n" +
				"8. Informar la cantidad de un tesoro encontrada.\n" +
				"9. Informar la cantidad de un tipo de enemigo encontrada.\n" +
				"10. Informar el enemigo que otorga una mayor puntuacion.\n" +
				"11. Informar el tesoro mas repetido.\n" +
				"12. Informar las consonantes en el nombre de los enemigos.\n" +
				"13. Top 5 de jugadore.\n" +
				"0. Exit. " +
				"\n");
		option = reader.nextInt(); 

		return option; 
	}

	public void executeOption(int option){
		String name = ""; 
		String type = "";
		String idName = "";
		String idNumber = "";
		double scoreAwarded = 0; 
		String url = ""; 
		double losingScore;
	    double victoryScore;
		double nextPoints = 0;
		double initialScore = 0;
		String nickname = "";

		switch(option){
			case 1: 

				System.out.println("Ingrese el nombre: ");
				name = reader.next();
				System.out.println("Ingrese el nickname: ");
				nickname = reader.next();

				String msj = videogame.createPlayer(name, nickname);
				System.out.println(msj);

				break;

			case 2:

				System.out.println("Numero identificador del nivel: ");
				idNumber = reader.next();
				System.out.println("Puntos para pasar al siguiente nivel: ");
				nextPoints = reader.nextDouble();

				msj = videogame.createLevel(idNumber, nextPoints);
				System.out.println(msj);
				
				break; 

			case 3: 

				System.out.println("Ingrese el ID del nivel a agregar el tesoro: ");
				idNumber = reader.next();
				boolean isEmpty = videogame.callEmptyTreasurePos(idNumber);
				if(isEmpty){
					System.out.println("Nombre del tesoro: "); 
			        name = reader.next(); 
				    System.out.println("Puntaje a otorgar: "); 
				    scoreAwarded = reader.nextDouble();
				    System.out.println("URL imagen del tesoro: "); 
				    url = reader.next();

				    videogame = new VideoGame();
				    msj = videogame.addTreasureToLevel(name, url, scoreAwarded, idNumber); 
				    System.out.println(msj); 
				}else{
					System.out.println("El nivel no se encuentra en el Video Juego.");
				}
				
				break; 

			case 4: 

				System.out.println("Ingrese el ID del nivel a agregar el enemigo: ");
				idNumber = reader.next();
				isEmpty = videogame.callEmptyEnemyPos(idNumber);
				if(isEmpty){
					System.out.println("Nombre identificador del enemigo: "); 
			        idName = reader.next(); 
				    System.out.println("Tipo de enemigo: "); 
				    type = reader.next();
				    System.out.println("Puntaje que quita si derrota al jugador: "); 
				    losingScore = reader.nextDouble();
				    System.out.println("Puntaje que otorga derrotar el enemigo: "); 
				    victoryScore = reader.nextDouble();

				    msj = videogame.addEnemyToLevel(idName, type, losingScore, victoryScore, idNumber); 
				    System.out.println(msj); 
				}else{
					System.out.println("El nivel no se encuentra en el Video Juego.");
				}			

				break; 

			case 5: 

				System.out.println("Ingrese el nickname del jugador: ");
				nickname = reader.next();
				System.out.println("Ingrese el puntaje a cambiar: ");
				initialScore = reader.nextDouble();
				msj = videogame.changePlayerScore(nickname, initialScore);
				System.out.println(msj);
				
				break; 

			case 6:

				System.out.println("Ingrese el nickname del jugador a incrementar nivel: ");
				nickname = reader.next();
				msj = videogame.increasePlayerLevel(nickname, initialScore);
				System.out.println(msj);

				break;

			case 7:

				System.out.println("Ingrese el ID del nivel a informar: ");
				idNumber = reader.next();
				isEmpty = videogame.callEmptyTreasurePos(idNumber);
				if(isEmpty){
					msj = videogame.printTreasuresAndEnemys(idNumber);
				    System.out.println(msj);
				}else{
					System.out.println("El nivel no se encuentra en el Video Juego.");
				}

				break;

			case 8:

				System.out.println("Ingrese el nombre del tesoro: ");
				name = reader.next();

				msj = videogame.printTotalTreasures(name);
				System.out.println(msj);

				break;

			case 9:
				System.out.println("Ingrese el tipo del enemigo: ");
				type = reader.next();

				msj = videogame.printTotalEnemys(type);
				System.out.println(msj);

				break;

			case 10:

				msj = videogame.printMaxEnemy();
				System.out.println(msj);

			case 11:


				break;

			case 12:

				msj = videogame.printToTalConsonants();
				System.out.println(msj);

				break;

			case 13:

				



				break;

			case 0:
				System.out.println("Exit program.");
				break; 

			default: 
				System.out.println("Invalid Option");
				break; 
		}
	}

}
