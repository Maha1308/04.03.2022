package com.stringBuffer;

public class example2 {

	public static void main(String[] args) {

		StringBuffer name = new StringBuffer("Keshava");
		
		name.append("Devi");
		
		System.out.println(name);	
		
		System.out.println("==================");
		
		StringBuilder myName = new StringBuilder("Maha");
		
		myName.append(" Lakshmi");
		
		System.out.println(myName);
	}

	}


