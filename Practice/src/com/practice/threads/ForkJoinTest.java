package com.practice.threads;

import java.util.concurrent.RecursiveAction;

public class ForkJoinTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Process extends RecursiveAction{
		
		boolean face,voice;

		@Override
		protected void compute() {
			if(!face && !voice){
				Process face = new Process();
				face.fork();
			}
			if (!voice){
				processVoice();
			}
			
		}
		
		public void processFace(){
			System.out.println("Processed Face");
			face=true;
		}
		
		public void processVoice(){
			System.out.println("Processed Voice");
			voice=true;
		}
		
	}

}
