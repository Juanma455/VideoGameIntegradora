package model;
import java.lang.Math;

public class Treasure{

	private String name;
	private String url;
	private double scoreAwarded;
	private int positionX;
	private int positionY;

	/**
	 * Treasure: treasure class constructor.
	 * @param name treasure name.
	 * @param url treasure url.
	 * @param scoreAwarded score awarded by the treasure.
	 * */

	public Treasure(String name, String url, double scoreAwarded){
		this.name = name;
		this.url = url;
		this.scoreAwarded = scoreAwarded;
		positionX = 0;
		positionY = 0;
	}

	/**
	 * getName: return treasure name.
	 * @return treasure name.
	 * */

	public String getName(){
		return name;
	}

	/**
	 * scoreAwarded: returns the score awarded by the treasure.
	 * @return return score awarded.
	 * */

	public double getScoreAwarded(){
		return scoreAwarded;
	}

	/**
	 * getPositionX: choose a random value for y.
	 * @param positionX value where position y is found.
	 * @return new position in y.
	 * */

	public int getPositionX(int positionX){
		int positionsX = 0;
		positionsX = (int) (Math.random() * 1280); 

		return positionsX;
	}

	/**
	 * getPositionX: choose a random value for y.
	 * @param positionY value where position y is found.
	 * @return new position in y.
	 * */

	public int getPositionY(int positionY){
		int positionsY = 0;
		positionsY = (int) (Math.random() * 720); 

		return positionsY;
	}

	/**
	 * toString: informs the data of the enemy.
	 * @return enemy data.
	 * */

	public String toString(){
		return "****Datos del tesoro****\n" +
		"Nombre: " + name + "\n" +
		"URL de imagen: " + url + "\n" +
		"Puntaje a otorgar: " + scoreAwarded + "\n" +
		"Posicion en X: " + getPositionX(positionX) + "\n" +
		"Posicion en Y: " + getPositionY(positionY) + "\n";
	}
}