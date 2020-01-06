
/* 1.Comparable is interface from java.lang
 * 2.It provides compareTo method
 * 3.It allows sorting on single parameter
 * 4.It implements compareTo method which return -ve,0,+ve integer when this.object<object,so on..(gives ascending order)
 * 5.Class whose objects are to be sorted must implement Comparable interface
 */

public class Student implements Comparable<Student>{
	
	int roll;
	String name;
	String subject;
	
	Student(int roll,String name,String subject){
		this.roll=roll;
		this.name=name;
		this.subject=subject;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (this.roll-o.roll);
	}
	
	
}
