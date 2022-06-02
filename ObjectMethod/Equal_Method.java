package com.capgemini.ObjectMethod;

import java.util.Objects;

  class Student
{
   String name;
   String college;
   int id;
   String branch;
   String gender;



      public Student() {
	super();
	// TODO Auto-generated constructor stub
}
      


	public Student(String name, String college, int id, String branch, String gender) {
		super();
		this.name = name;
		this.college = college;
		this.id = id;
		this.branch = branch;
		this.gender = gender;
	}



	public void displayStudent() 
      {

	   System.out.println("Name of Student:"+name);
	   System.out.println("Name of college:"+college);
	   System.out.println("ID of Student"+id);
	   System.out.println("Gender:"+gender);
	   System.out.println("Branch of Student:"+branch);
     }


	@Override
	public String toString()
	{
		return "Equal_Method [name=" + name + ", college=" + college + ", id=" + id + ", branch=" + branch + ", gender="
				+ gender + "]";
	}
	
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(branch, other.branch) && Objects.equals(college, other.college)
				&& Objects.equals(gender, other.gender) && id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public int hashCode() {
		return Objects.hash(branch, college, gender, id, name);
	}



    
        

}
