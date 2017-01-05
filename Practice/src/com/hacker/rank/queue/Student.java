package com.hacker.rank.queue;

class Student implements Comparable<Student>{
	   private int token;
	   private String fname;
	   private double cgpa;
	   public Student(String fname, double cgpa, int id) {
	      super();
	      this.token = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getToken() {
	      return token;
	   }
	   public String getFname() {
	      return fname;
	   }
	   public double getCgpa() {
	      return cgpa;
	   }
	@Override
	public int compareTo(Student student) {
		if(this.getCgpa() > student.getCgpa()) return -1; // before
        else if(this.getCgpa() < student.getCgpa()) return 1; // after
        else { // gpa draw
            if(!this.getFname().equals(this.getFname() ) ) // diff names
                return this.getFname().compareTo(student.getFname() );
            else { // same names
                int token = 
                   this.getToken() < student.getToken()?
                      this.getToken() : student.getToken();
                return token;
            }   
        }
	}
	}


