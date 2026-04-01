package com.tka.inheritance2;

public class Main {

	public static void main(String[] args) {
		AmazonShopping shopping = new AmazonShopping();
		shopping.company();
		shopping.shopping();
		System.out.println("-----------");
		
		AmazonPrime prime = new AmazonPrime();
		prime.company();
		prime.prime();
		System.out.println("--------------");

	}

}
