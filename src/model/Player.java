package model;

public class Player{

	private double initialScore;
	private int numberOfLives;
	private String nickname;
	private String name;

	/**
	 * Player: player class constructor.
	 * @param nickname players nickname.
	 * @param name players name.
	 * */

	public Player(String nickname, String name){
		this.nickname = nickname;
		this.name = name;
		initialScore = 10;
		numberOfLives = 5;
	}

	/**
	 * getNickName: return the player's nickname.
	 * @return return nickname.
	 *  
	 */

	public String getNickName(){
		return nickname;
	}

	/**
	 * getName: return the player's name.
	 * @return return name.
	 */


	public String getName(){
		return name;
	}

	/**
	 * getInitialScore: return the player's score.
	 * @return return initialScore.
	 * */

	public double getInitialScore(){
		return initialScore;
	}

	public void setInitialScore(double initialScore){
		this.initialScore = initialScore;
	}

	/**
	 * getNumberOdLives: return the player's lives.
	 * @return return initials number of lives.
	 * 
	 * */

	public int getNumberOfLives(){
		return numberOfLives;
	}

	/**
	 * toString: informs the data of a player.
	 * @return data player.
	 * */
	public String toString(){
		return "****Datos del jugador****\n" +
		"Nombre: " + name + "\n" +
		"Nickname: " + nickname + "\n" +
		"Puntuacion: " + initialScore + "\n" +
		"Numero de vidas: " + numberOfLives +  "\n";
	}

}