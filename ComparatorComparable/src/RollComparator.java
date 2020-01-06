import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.roll-o2.roll;
	}

}
