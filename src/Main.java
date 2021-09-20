import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>(); 
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101, "Kim", 23);
		al.add(s1);
		al.add(new Student(102,"Choi", 21));
		al.add(new Student(103,"Kang", 27));
		al.add(new Student(104,"Lee", 26));
		al.add(new Student(105,"Baek", 30));
		al.add(new Student(106,"Jin", 18));
		al.add(new Student(107,"Eun", 28));
		al.add(new Student(108,"Jo", 25));
		al.add(new Student(109,"Yoon", 21));
		al.add(new Student(110,"Jeon", 21));
		
		Collections.sort(al);
		for(Student s :al) {
			System.out.println(s.toString());
		}
		System.out.println("Student list (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
	}
}
