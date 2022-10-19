package model;
import java.lang.Math;

public class Enemy{

	private String idName;
	private String type;
	private double losingScore;
	private double victoryScore;
	private int positionX = (int) (Math.random() * 1280);
	private int positionY = (int) (Math.random() * 720);

	/**
	 * Enemy: enemy class constructor.
	 * @param idName enemy identifier name. 
	 * @param type type that the enemy adopts.
	 * @param losingScore score that the enemy subtracts if the player loses.
	 * @param victoryScore score the enemy awards if the player wins.
	 * */

	public Enemy(String idName, String type, double losingScore, double victoryScore){
		this.idName = idName;
		this.type = type;
		this.losingScore = losingScore;
		this.victoryScore = victoryScore;
		positionX = 0;
		positionY = 0;
	}

	/**
	 * getIdName: returns the identifier name of the enemy.
	 * @return return identifier name.
	 * */

	public String getIdName(){
		return idName;
	}

	/**
	 * getType: returns the type of the enemy.
	 * @return type of the enemy.
	 * */

	public String getType(){
		return type;
	}

	/**
	 * getVictoryScore: returns the score that is awarded if the player wins.
	 * @return return victory score.
	 * */

	public double getVictoryScore(){
		return victoryScore;
	}

	/**
	 * getPositionX: choose a random value for x.
	 * @param positionX value where position x is found.
	 * @return new position in x.
	 * */

	public int getPositionX(int positionX){
		positionX = 0;
		positionX = (int) (Math.random() * 1280); 

		return positionX;
	}

	/**
	 * getPositionX: choose a random value for y.
	 * @param positionY value where position y is found.
	 * @return new position in y.
	 * */

	public int getPositionY(int positionY){
		positionY = 0;
		positionY = (int) (Math.random() * 720);

		return positionY;
	}

	/**
	 * toString: informs the data of the enemy.
	 * @return enemy data.
	 * */

	public String toString(){
		return "****Datos del enemigo****\n" +
		"Tipo: " + idName + "\n" +
		"Nombre identificador: " + type + "\n" +
		"Puntuacion de derrota: " + losingScore + "\n" +
		"Puntuacion de victoria: " + victoryScore + "\n" +
		"Posicion en X: " + getPositionX(positionX) + "\n" +
		"Posicion en Y: " + getPositionY(positionY) + "\n";
	}
	
}