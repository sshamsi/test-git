package com.hacker.rank.queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class StudentTest{

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      Student stud = null;
      PriorityQueue<Student> priorQueue = 
         new PriorityQueue<Student>();
      while(totalEvents>0){
         String event = in.next();
            
         if(event.equals("ENTER")) { // read Name, cgpa and token
             stud = 
                new Student(in.next(),in.nextDouble(),in.nextInt());
             priorQueue.add(stud);
         } 
         else if (event.equals("SERVED") ) {
             if(priorQueue.size() > 0) {
                 priorQueue.poll();
             }
         }
         totalEvents--;
      }   
         
         if(priorQueue.size() == 0) 
             System.out.println("EMPTY");
         else {
             while(priorQueue.size() > 0) {
                 stud = priorQueue.poll();
                 System.out.println(stud.getFname()+" "+stud.getToken());
             }
          }
           
    }
}
