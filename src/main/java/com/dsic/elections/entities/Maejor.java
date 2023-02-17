package com.dsic.elections.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maejor {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	 private int numBureau;
	 private int nbrInscrits;
	 private int nbrMos;
	 private int feuillesSupprimes;
	 private int voix;
	 private int table1;
	 private int table2;
	 private int table3;
	 private int sommeTables;
	 public int getSommeTables() {
		return sommeTables;
	}
	public void setSommeTables(int sommeTables) {
		this.sommeTables = sommeTables;
	}
	private float pourcentage;
	 private boolean confirmation = true;
	 public boolean isConfirmation() {
		return confirmation;
	}
	public void setConfirmation(boolean confirmation) {
		this.confirmation = confirmation;
	}
	public float getPourcentage() {
		return pourcentage;
	}
	public void setPourcentage(float pourcentage) {
		this.pourcentage = pourcentage;
	}
	public boolean isConfirmSum() {
		return confirmSum;
	}
	public void setConfirmSum(boolean confirmSum) {
		this.confirmSum = confirmSum;
	}
	private boolean confirmSum;

	public Maejor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public Maejor(int numBureau) {
		super();
		this.numBureau = numBureau;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumBureau() {
		return numBureau;
	}
	public void setNumBureau(int numBureau) {
		this.numBureau = numBureau;
	}
	public int getNbrInscrits() {
		return nbrInscrits;
	}
	public void setNbrInscrits(int nbrInscrits) {
		this.nbrInscrits = nbrInscrits;
	}
	public int getNbrMos() {
		return nbrMos;
	}
	public void setNbrMos(int nbrMos) {
		this.nbrMos = nbrMos;
	}
	public int getFeuillesSupprimes() {
		return feuillesSupprimes;
	}
	public void setFeuillesSupprimes(int feuillesSupprimes) {
		this.feuillesSupprimes = feuillesSupprimes;
	}
	public int getVoix() {
		return voix;
	}
	public void setVoix(int voix) {
		this.voix = voix;
	}
	public int getTable1() {
		return table1;
	}
	public void setTable1(int table1) {
		this.table1 = table1;
	}
	public int getTable2() {
		return table2;
	}
	public void setTable2(int table2) {
		this.table2 = table2;
	}
	public int getTable3() {
		return table3;
	}
	public void setTable3(int table3) {
		this.table3 = table3;
	}
	 
	 
	 
}
