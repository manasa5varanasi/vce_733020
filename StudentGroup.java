import java.util.Date;
import java.util.Scanner;
import java.Collections.*;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	public int i=0;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		this.length=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		Scanner s=new Scanner(System.in);
		int i=0;
		while(s.nextInt())
		{
			students[i]=s.nextInt();
			i++;
		}
		if(student==null)
		throw new IllegalArgumentException;
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(i<0||i>length)
		{
			throw new IllegalArgumentException;
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(students==null||i<0||i>length)
		{
			throw new IllegalArgumentException;
		}
		Scanner s=new Scanner(System.in);
		student[index]=s.next();
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		int i=0;l=0;
		while(student[i]!=null)
		{
			i++;
			l++;
		}
		if(student==null||index<0||index>=length)
			throw new IllegalArgumentException;
		Scanner s=new Scanner(System.in);
		student[index]=s.next();
			
			
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i=0;
		while(student[i]!=null)
			i++;
		Scanner s=new Scanner(System.in);
		student[index]=s.next();
		
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Scanner s=new Scanner(System.in);
		int ind=s.nextInt();
		int i=0,l=0;
		while(student[i]!=null){
			i++;
			l++;
		}
		if(student==null||ind<0||ind>l)
			
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
