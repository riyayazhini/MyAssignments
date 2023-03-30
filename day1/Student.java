package week1.day1;

public class Student {
	public void studentName() {
		int rollNo = 10;
		System.out.println("Riya");
		System.out.println(rollNo);
	}
     public void collegeName() {
    	 int markScored = 1500;
    	 float cgpa =92.5f;
    	 System.out.println("Stella Maris College");
    	 System.out.println(markScored);
    	 System.out.println(cgpa);
    	 
     }
     
    	
    	 
    
	public static void main(String[] args) {
		Student riya=new Student();
		riya.studentName();
		riya.collegeName();
	}

}
