package model;

public class VideoGame{

	public static final int SIZE_OF_LEVELS = 11;
	public static final int SIZE_OF_PLAYERS = 20;
	private Level[] levels;
	private Player[] players;

	public VideoGame(){
		levels = new Level[SIZE_OF_LEVELS];
		players = new Player[SIZE_OF_PLAYERS];

		players[0] = new Player("juanma233", "Juan");
		players[1] = new Player("juan1", "diaz");
		
		levels[0] = new Level("A00", 20);
		levels[1] = new Level("A01", 30);
		levels[2] = new Level("A02", 40);
		levels[3] = new Level("A03", 50);
		levels[4] = new Level("A04", 60);
		levels[5] = new Level("A05", 70);
		levels[6] = new Level("A06", 80);
		levels[7] = new Level("A07", 90);
		levels[8] = new Level("A08", 100);
		levels[9] = new Level("A09", 110);

		levels[0].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[0].addTreasure("Oro", "www.oro.com", 5);
		levels[0].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[0].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[0].addTreasure("Hierro", "www.hierro.com", 6);

		levels[1].addTreasure("Bronce", "www.bronces.com", 5);
		levels[1].addTreasure("Oro", "www.oro.com", 5);
		levels[1].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[1].addTreasure("Lapislazuli", "www.lapislazuli.com", 3);
		levels[1].addTreasure("Cobre", "www.cobre.com", 4);

		levels[2].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[2].addTreasure("Oro", "www.oro.com", 5);
		levels[2].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[2].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[2].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[3].addTreasure("Cobre", "www.cobre.com", 4);
		levels[3].addTreasure("Cobre", "www.cobre.com", 4);
		levels[3].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[3].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[3].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[4].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[4].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[4].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[4].addTreasure("Lapislazuli", "www.lapislazuli.com", 3);
		levels[4].addTreasure("Lapislazuli", "www.lapislazuli.com", 3);

		levels[5].addTreasure("Lapislazuli", "www.lapislazuli.com", 3);
		levels[5].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[5].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[5].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[5].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[6].addTreasure("Cobre", "www.cobre.com", 4);
		levels[6].addTreasure("Oro", "www.oro.com", 5);
		levels[6].addTreasure("Hierro", "www.hierro.com", 6);
		levels[6].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[6].addTreasure("Lapislazuli", "www.lapislazuli.com", 3);

		levels[7].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[7].addTreasure("Hierro", "www.hierro.com", 6);
		levels[7].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[7].addTreasure("Hierro", "www.hierro.com", 6);
		levels[7].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[8].addTreasure("Hierro", "www.hierro.com", 6);
		levels[8].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[8].addTreasure("Oro", "www.oro.com", 5);
		levels[8].addTreasure("Esmeralda", "www.esmeraldas.com", 8);
		levels[8].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[9].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[9].addTreasure("Oro", "www.oro.com", 5);
		levels[9].addTreasure("Diamante", "www.diamantes.com", 7);
		levels[9].addTreasure("Oro", "www.oro.com", 5);
		levels[9].addTreasure("Diamante", "www.diamantes.com", 7);

		levels[0].addEnemy("Enemy1", "Ogro", 5, 3);
		levels[0].addEnemy("Enemy2", "Abstracto", 6, 4);

		levels[1].addEnemy("Enemy3", "Jefe", 9, 5);
		levels[1].addEnemy("Enemy4", "Magico", 5, 6);

		levels[2].addEnemy("Enemy5", "Ogro", 5, 7);
		levels[2].addEnemy("Enemy6", "Magico", 5, 8);

		levels[3].addEnemy("Enemy7", "Jefe", 9, 9);
		levels[3].addEnemy("Enemy8", "Ogro", 5, 10);

		levels[4].addEnemy("Enemy9", "Jefe", 9, 11);
		levels[4].addEnemy("Enemy10", "Jefe", 9, 12);

		levels[5].addEnemy("Enemy11", "Abstracto", 6, 13);
		levels[5].addEnemy("Enemy12", "Magico", 5, 14);
		levels[5].addEnemy("Enemy13", "Abstracto", 6, 15);

		levels[6].addEnemy("Enemy14", "Ogro", 5, 16);
		levels[6].addEnemy("Enemy15", "Abstracto", 6, 17);
		levels[6].addEnemy("Enemy16", "Abstracto", 6, 18);

		levels[7].addEnemy("Enemy17", "Magico", 5, 19);
		levels[7].addEnemy("Enemy18", "Jefe", 9, 20);
		levels[7].addEnemy("Enemy19", "Magico", 5, 21);

		levels[8].addEnemy("Enemy20", "Jefe", 9, 22);
		levels[8].addEnemy("Enemy21", "Abstracto", 6, 23);
		levels[8].addEnemy("Enemy22", "Jefe", 9, 24);

		levels[9].addEnemy("Enemy23", "Magico", 5, 25);
		levels[9].addEnemy("Enemy24", "Jefe", 9, 26);
		levels[9].addEnemy("Enemy25", "Ogro", 5, 27);
	}

	/**
	 * getLevels: return levels.
	 * @return levels.
	 * */

	public Level[] getLevels(){
		return levels;
	}

	/**
	 * createPlayer: obtains the player data and validating in the array adds it to it.
	 * @param name player name.
	 * @param nickname player nickname.
	 * @return validation message when adding the enemy.
	 * */

	public String createPlayer(String name, String nickname){
		String msj = "Capacidad maxima de jugadores alcanzada.";
		Player newPlayer = new Player(name, nickname);
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_PLAYERS && !isEmpty; i++){
			if(players[i] == null){
				players[i] = newPlayer;
				isEmpty = true;
				msj = "Jugador agregado";
			}
		}
		return msj;

	}

	public String createLevel(String idNumber, double nextPoints){
		String msj = "Capacidad maxima de niveles alcanzada.";
		Level newLevel = new Level(idNumber, nextPoints);
		boolean isEmpty = false;
		for(int i = 0; i < SIZE_OF_LEVELS && !isEmpty; i++){
			if(levels[i] == null){
				levels[i] = newLevel;
				isEmpty = true;
				msj = "Nivel agregado.";
			}
		}
		return msj;
	}

	/**
	 * addTreasureToLevel: adds the treasure that was already created to a level.
	 * @param name treasure name.
	 * @param url treasure url.
	 * @param scoreAwarded score awarded by the treasure.
	 * @param idNumber identifier of the level to add.
	 * @return the validation message that was present when the treasure was created.
	 * */

	public String addTreasureToLevel(String name, String url, double scoreAwarded, String idNumber){
		String msj = "No se pudo agregar el tesoro.";
		Treasure newTreasure = new Treasure(name, url, scoreAwarded);
		int posLevel = seacrhLevelById(idNumber);
		if(posLevel != -1){
			msj = levels[posLevel].addTreasure(name, url, scoreAwarded);
		}
		return msj;
	}

	/**
	 * printMaxEnemy: prints the information of the enemy that gives the highest score.
	 * @return enemy information.
	 * */

	public String printMaxEnemy(){
		String msj = "";
		for(int i = 0; i < SIZE_OF_LEVELS; i++){
			if(levels[i] != null){
				msj = levels[i].getMaxEnemy();
			}
		}
		return msj;
	}

	/**
	 * printToTalConsonants: prints the consonants of the name of the enemies.
	 * @return consonants of the name of the enemies.
	 * */

	public String printToTalConsonants(){
		String msj = "";
		for(int i = 0; i < SIZE_OF_LEVELS; i++){
			if(levels[i] != null){
				msj = levels[i].getTotalConsonants();
			}
		}
		return msj;
	}


	/**
	 * printTotalTreasures: prints the information of a specific treasure.
	 * @param name treasure name. 
	 * @return treasure information.
	 * */

	public String printTotalTreasures(String name){
		String msj = "";
		for(int i = 0; i < SIZE_OF_LEVELS; i++){
			if(levels[i] != null){
				msj = levels[i].countTreasures(name);
			}
		}
		return msj;
	}

	/**
	 * printTotalEnemyss: prints the information of a specific enemy.
	 * @param type enemy type. 
	 * @return enemy information.
	 * */

	public String printTotalEnemys(String type){
		String msj = "";
		for(int i = 0; i < SIZE_OF_LEVELS; i++){
			if(levels[i] != null){
				msj = levels[i].countEnemys(type);
			}
		}
		return msj;
	}

	/**
	 * addTreasureToLevel: adds the enemy that was already created to a level.
	 * @param idName treasure name.
	 * @param type type that the enemy adopts.
	 * @param losingScore score that the enemy subtracts if the player loses.
	 * @param victoryScore score the enemy awards if the player wins.
	 * @param idNumber identifier of the level to add.
	 * @return the validation message that was present when the enemy was created.
	 * */

	public String addEnemyToLevel(String idName, String type, double losingScore, double victoryScore, String idNumber){
		String msj = "No se puedo agregar al enemigo.";
		Enemy newEnemy = new Enemy(idName, type, losingScore, victoryScore);
		int posLevel = seacrhLevelById(idNumber);
		if(posLevel != -1){
			msj = levels[posLevel].addEnemy(idName, type, losingScore, victoryScore);
		}
		return msj;
	}

	/**
	 * searchLevelById: the identifier of the level is sought to give its location in the array.
	 * @param idNumber identifier of the level to be searched.
	 * @return position of the array of the level that was searched.
	 * */

	public int seacrhLevelById(String idNumber){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i < SIZE_OF_LEVELS && !isFound; i++){
			if(levels[i] != null && levels[i].getIdNumber().equals(idNumber)){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}

	public boolean callEmptyTreasurePos(String idNumber){
		boolean isEmpty = false;
		int posLevel = seacrhLevelById(idNumber);
		if(posLevel != -1){
			isEmpty = levels[posLevel].hasEmptyTreasurePos();
		}
		return isEmpty;
	}

	public boolean callEmptyEnemyPos(String idNumber){
		boolean isEmpty = false;
		int posLevel = seacrhLevelById(idNumber);
		if(posLevel != -1){
			isEmpty = levels[posLevel].hasEmptyEnemyPos();
		}
		return isEmpty;
	}

	public int searchPlayerByname(String nickname){
		int pos = -1;
		boolean isFound = false;
		for(int i = 0; i < SIZE_OF_PLAYERS && !isFound; i++){
			if(players[i] != null && players[i].getNickName().equals(nickname)){
				pos = i;
				isFound = true;
			}
		}
		return pos;
	}

	public String changePlayerScore(String nickname, double initialScore){
		String msj = "No se pudo cambiar la puntuacion.";
		int posPlayer = searchPlayerByname(nickname);
		if(posPlayer != -1){
			players[posPlayer].setInitialScore(initialScore);
			msj = "Puntuje cambiado.";
		}
		return msj;
	}

	public String printTreasuresAndEnemys(String idNumber){
		String msj = "";
		int posLevel = seacrhLevelById(idNumber);
		if(posLevel != -1){
			if(levels[posLevel] != null){
				msj = levels[posLevel].toString();
			}
		}
		return msj;
	}

	public String increasePlayerLevel(String nickname, double initialScore){
		String msj = "El jugador no se encuentra en el video juego.";
		int posPlayer = searchPlayerByname(nickname);
		if(posPlayer != -1 && players[posPlayer].getInitialScore() < 20){
			msj = "Necesitas 20 puntos para pasar de nivel.";
		}else{
			if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 20 && players[posPlayer].getInitialScore() < 30){
				msj = "Necesitas 30 puntos para pasar de nivel.";
			}else{
				if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 30 && players[posPlayer].getInitialScore() < 40){
					msj = "Necesitas 40 puntos para pasar de nivel.";
				}else{
					if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 40 && players[posPlayer].getInitialScore() < 50){
						msj = "Necesitas 50 puntos para pasar de nivel.";
					}else{
						if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 50 && players[posPlayer].getInitialScore() < 60){
							msj = "Necesitas 60 puntos para pasar de nivel.";
						}else{
							if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 60 && players[posPlayer].getInitialScore() < 70){
								msj = "Necesitas 70 puntos para pasar de nivel.";
							}else{
								if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 70 && players[posPlayer].getInitialScore() < 80){
									msj = "Necesitas 80 puntos para pasar de nivel.";
								}else{
									if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 80 && players[posPlayer].getInitialScore() < 90){
										msj = "Necesitas 90 puntos para pasar de nivel.";
									}else{
										if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 90 && players[posPlayer].getInitialScore() < 100){
											msj = "Necesitas 100 puntos para pasar de nivel.";
										}else{
											if(posPlayer != -1 && players[posPlayer].getInitialScore() >= 100 && players[posPlayer].getInitialScore() < 110){
												msj = "Necesitas 110 puntos para pasar de nivel.";
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return msj;
	}

}