package model;

public class Level{

	public static final int SIZE_OF_ENEMYS = 29;
	public static final int SIZE_OF_TREASURES = 59;
	private String idNumber;
	private double nextPoints;
	private Treasure[] treasures;
	private Enemy[] enemys;

	/**
	 * Level: constructor of the level class.
	 * @param idNumber level identification number.
	 * @param nextPoints points to go to the next level.
	 * */

	public Level(String idNumber, double nextPoints){
		this.idNumber = idNumber;
		this.nextPoints = nextPoints;
		treasures = new Treasure[SIZE_OF_TREASURES];
		enemys = new Enemy[SIZE_OF_ENEMYS];
	}

	/**
	 * getIdNumber: return the level identification number.
	 * @return level identification number.
	 * */

	public String getIdNumber(){
		return idNumber;
	}

	/**
	 * getNextPoints: return the points to go to the next level.
	 * @return next points.
	 * */

	public double getNextPoints(){
		return nextPoints;
	}

	/**
	 * hasEmptyTreasurePos: checks if there is an empty array in the treasures.
	 * @return boolean expression if it is empty or not.
	 * */

	public boolean hasEmptyTreasurePos(){
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_TREASURES && !isEmpty; i++){
			if(treasures[i] == null){
				isEmpty = true;
			}
		}
		return isEmpty;
	}

	/**
	 * hasEmptyEnemyPos: checks if there is an empty array in the enemys.
	 * @return boolean expression if it is empty or not.
	 * */


	public boolean hasEmptyEnemyPos(){
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_ENEMYS && !isEmpty; i++){
			if(enemys[i] == null){
				isEmpty = true;
			}
		}
		return isEmpty;
	}

	/**
	 * addTreasure: obtains the treasure data and validating in the array adds it to it.
	 * @param name treasure name.
	 * @param url treasure url.
	 * @param scoreAwarded score awarded by the treasure.
	 * @return validation message when adding the treasure.
	 * */

	public String addTreasure(String name, String url, double scoreAwarded){
		String msj = "Capacidad maxima alcanzada.";
		Treasure newTreasure = new Treasure(name, url, scoreAwarded);
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_TREASURES && !isEmpty; i++){
			if(treasures[i] == null){
				treasures[i] = newTreasure;
				isEmpty = true;
				msj = "Tesoro agregado.";
			}
		}
		return msj;
	}

	/**
	 * printTreasures: in the array look for the information of the treasures.
	 * @return treasure information.
	 * */

	public String printTreasures(){
		String msj = "";
		for(int i = 0; i < SIZE_OF_TREASURES; i++){
			if(treasures[i] != null && i < SIZE_OF_TREASURES - 1){
				msj += treasures[i].toString() + "\n";
			}
		}
		return msj;
	}

	/**
	 * searchTreasureByName: search for a treasure by its name in its respective array.
	 * @param name treasure name.
	 * @return treasure name.
	 * */

	public String searchTreasureByName(String name){
		boolean isFound = false;
		for(int i = 0; i < SIZE_OF_TREASURES && !isFound; i++){
			if(treasures[i] != null && treasures[i].getName().equals(name)){
				isFound = true;
			}
		}
		return name;
	}

	/**
	 * searchEnemyByName: search for a enemy by its type in its respective array.
	 * @param type enemy type.
	 * @return enemy type.
	 * */


	public String searchEnemyByType(String type){
		boolean isFound = false;
		for(int i = 0; i < SIZE_OF_ENEMYS && !isFound; i++){
			if(enemys[i] != null && enemys[i].getType().equals(type)){
				isFound = true;
			}
		}
		return type;
	}

	/**
	 * getMaxEnemy(): gets the enemy that gives the highest score.
	 * @return message with the information of the enemy.
	 * */

	public String getMaxEnemy(){
		String msj = "";
		double maxVictoryScore = enemys[0].getVictoryScore();
		int pos = 0;
		for(int i = 0; i < SIZE_OF_ENEMYS; i++){
			if(enemys[i] != null && enemys[i].getVictoryScore() > maxVictoryScore){
				maxVictoryScore = enemys[i].getVictoryScore();
				pos = i;
				msj = enemys[i].toString();
			}
		}
		return msj;
	}

	/**
	 * getTotalConsonants: identifies the vowels and with this determines the consonants of the names of the enemies.
	 * @return message with the number of consonants found.
	 * */

	public String getTotalConsonants(){
		String msj = "";
		int count1 = 0;
		int count2 = 0;
		int consonants = 0;

		for(int i = 0; i < SIZE_OF_ENEMYS; i++){
			if(enemys[i] != null){
				count1++;
			}
		}

		for(int i = 0; i < SIZE_OF_ENEMYS; i++){
			if(enemys[i] != null){
				if((enemys[i].getIdName().charAt(i) == 'a') || (enemys[i].getIdName().charAt(i) == 'e') || (enemys[i].getIdName().charAt(i) == 'i') || (enemys[i].getIdName().charAt(i) == 'o') || (enemys[i].getIdName().charAt(i) == 'u')){

					count2++;
				}
			}
		}
		consonants = count1 - count2;
		msj = "En el nombre de los enemigos se encuentran: " + consonants;
		return msj;
	}

	/**
	 * countTreasures: With the name of the treasure, he makes a partial tour and counts the treasures found.
	 * @param name treasure name.
	 * @return message with the number of treasures found.
	 * */

	public String countTreasures(String name){
		String msj = "";
		int count = 0;
		String typeFound = searchTreasureByName(name);
		for(int i = 0; i < SIZE_OF_TREASURES; i++){
			if(treasures[i] != null && treasures[i].getName() != typeFound){
				count++;
			}
		}
		msj = "La cantidad de tesoros encontrados es " + count;
		return msj;
	}

	/**
	 * countTreasures: With the type of the enemy, he makes a partial tour and counts the enemys found.
	 * @param type enemy type.
	 * @return message with the number of enemys found.
	 * */

	public String countEnemys(String type){
		String msj = "";
		int count = 0;
		String typeFound = searchEnemyByType(type);
		for(int i = 0; i < SIZE_OF_ENEMYS; i++){
			if(enemys[i] != null && enemys[i].getType().equals(type)){
				count++;
			}
		}
		msj = "La cantidad de enemigos encontrados es " + count;
		return msj;
	}

	/**
	 * printEnemys: in the array look for the information of the enemys.
	 * @return enemys information.
	 * */

	public String printEnemys(){
		String msj = "";
		for(int i = 0; i < SIZE_OF_ENEMYS; i++){
			if(enemys[i] != null && i < SIZE_OF_ENEMYS - 1){
				msj += enemys[i].toString() + "\n";
			}
		}
		return msj;
	}

	/**
	 * addEnemy: obtains the enemy data and validating in the array adds it to it.
	 * @param idName enemy identifier name.
	 * @param type type that the enemy adopts.
	 * @param losingScore score that the enemy subtracts if the player loses.
	 * @param victoryScore score the enemy awards if the player wins.
	 * @return validation message when adding the enemy.
	 * */

	public String addEnemy(String idName, String type, double losingScore, double victoryScore){
		String msj = "Capacidad maxima alcanzada";
		Enemy newEnemy = new Enemy(type, idName, losingScore, victoryScore);
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_ENEMYS && !isEmpty; i++){
			if(enemys[i] == null){
				enemys[i] = newEnemy;
				isEmpty = true;
				msj = "Enemigo agregado";
			}
		}
		return msj;
	}

	public String toString(){
		return
		"ID del nivel: " + this.idNumber + "\n" +
		"Puntos para pasar de nivel: " + this.nextPoints + "\n" +
		printEnemys() + "\n" +
		printTreasures();
	}

}