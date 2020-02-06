package com.sandy.Car;


public class Dog {
	
	private String mDogName;
	private String mDogBreed;
	private int mDogAge;
	private int mDogWeight;
	private boolean mDogIsHappy;
	
	
	public Dog(String name,String breed) {
		this.mDogName=name;
		this.mDogBreed=breed;
		this.mDogWeight=5;
	}
	

	public void setName(String mDogName) {
		this.mDogName=mDogName;
	}
	
	public String getName() {
		return this.mDogName;
	}
	
	public String getBreed() {
		return this.mDogBreed;
	}
	
	public void setBreed(String mDogBreed) {
		this.mDogBreed=mDogBreed;
	}
	
	
	public void setWeight(int mDogWeight) {
		this.mDogWeight=mDogWeight;
	}
	
	public int getWeight() {
		return this.mDogWeight;
	}
	
	public void eat() {
		System.out.println("yum that was delicious");
		this.mDogWeight=this.mDogWeight+5;
	}
	
	public void play() {
		this.mDogIsHappy=true;
	}

}

