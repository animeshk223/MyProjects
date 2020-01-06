import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class studentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] studentArr=new Student[4];
		studentArr[0]=new Student(5, "Raj", "math");
		studentArr[1]=new Student(2, "Rajesh", "science");
		studentArr[2]=new Student(1, "kishor", "sst");
		studentArr[3]=new Student(8, "kajal", "moralscience");
		
		
		System.out.println("Before sorting:---------");
		System.out.println(studentArr[0].roll);
		System.out.println(studentArr[1].roll);
		System.out.println(studentArr[2].roll);
		System.out.println(studentArr[3].roll);
		
		System.out.println("After sorting:----------");
		Arrays.sort(studentArr);
		System.out.println(studentArr[0].roll);
		System.out.println(studentArr[1].roll);
		System.out.println(studentArr[2].roll);
		System.out.println(studentArr[3].roll);
		
	}

}
