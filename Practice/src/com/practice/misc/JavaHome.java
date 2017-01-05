package com.practice.misc;

import java.util.Scanner;

public class JavaHome {
	
	public static void main(String args[]){
		/*System.out.println("JAVA_HOME is "+System.getenv("JAVA_HOME"));
		System.out.println("JRE version is "+System.getProperty("java.version"));
		System.out.println("Java data model is "+System.getProperty("sun.arch.data.model"));
		String javaDataModel = System.getProperty("sun.arch.data.model");
		if(javaDataModel.equalsIgnoreCase("64")){
			System.out.println("Java data model is "+javaDataModel);
		}*/
		System.out.println("Enter IdentityX SRP 3.2.3 location:");
		Scanner scanIn = new Scanner(System.in);
		String baseDir_3_2_3 = scanIn.nextLine();
		
		System.out.println("Enter CognitecV9.0 frsdk.cfg location:");
		//Scanner cognitecScanIn = new Scanner(System.in);
		String frsdkFile = scanIn.nextLine();
		//cognitecScanIn.close();
		scanIn.close();
	}

}
