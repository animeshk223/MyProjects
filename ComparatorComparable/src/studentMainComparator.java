import java.sql.Array;
import java.util.Arrays;

/* 1.Comparator is interface from java.util
 * 2.It provides compare method
 * 3.It allows sorting on multiple parameter, for each parameter different class are defined in which compare method
 * is written.Classes for each parameter must implement Comparator interface.
 * 4.It implements compare method which return -ve,0,+ve integer when object1.<parameter><object2.<parameter>,so on..(gives ascending order)
 * 
 */

public class studentMainComparator {

	public static void main(String[] args) {
		Student[] studentArr=new Student[4];
		studentArr[0]=new Student(5, "Raj", "math");
		studentArr[1]=new Student(2, "Rajesh", "science");
		studentArr[2]=new Student(1, "kishor", "sst");
		studentArr[3]=new Student(8, "kajal", "moralscience");
		
		System.out.println("After sorting according to roll:----------");
		Arrays.sort(studentArr, new RollComparator());
		System.out.println(studentArr[0].roll);
		System.out.println(studentArr[1].roll);
		System.out.println(studentArr[2].roll);
		System.out.println(studentArr[3].roll);
		
		System.out.println("After sorting according to name:----------");
		Arrays.sort(studentArr, new NameComparator());
		System.out.println(studentArr[0].name);
		System.out.println(studentArr[1].name);
		System.out.println(studentArr[2].name);
		System.out.println(studentArr[3].name);
		
		System.out.println("After sorting according to subject:----------");
		Arrays.sort(studentArr, new SubjectComparator());
		System.out.println(studentArr[0].subject);
		System.out.println(studentArr[1].subject);
		System.out.println(studentArr[2].subject);
		System.out.println(studentArr[3].subject);
		
		

	}

}
