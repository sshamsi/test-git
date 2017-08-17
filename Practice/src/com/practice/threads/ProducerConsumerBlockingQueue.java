package com.practice.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
		
		Producer p = new Producer(queue);
		new Thread(p).start();
		
		Consumer c = new Consumer(queue);
		new Thread(c).start();

	}
	
	public static class Producer implements Runnable{
	
		private BlockingQueue<Integer> queue;
		
		public Producer(BlockingQueue<Integer> queue){
			this.queue = queue;
		}

		@Override
		public void run() {
			for(int i=0; i<100; i++){
				try {
					queue.put(i);
					System.out.println("Producing "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class Consumer implements Runnable{
		
		private BlockingQueue<Integer> queue;
		
		public Consumer(BlockingQueue<Integer> queue){
			this.queue = queue;
		}

		@Override
		public void run() {
				int i;
			try {
				while( (i = queue.take())!=99){
					System.out.println("Consuming "+i);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
