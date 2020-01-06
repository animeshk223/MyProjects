import java.util.Comparator;

public class SubjectComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.subject.compareToIgnoreCase(o2.subject);
	}

}
