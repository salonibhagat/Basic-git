package january12;

public class Student {

	String name;
	int id;
	String collegeName;
	String department;
	
	Student(String iname, int iid, String iCollege, String idepartment)
	{
		name = iname;
		id =iid;
		collegeName = iCollege;
		department = idepartment;
		
	}
	
	Student(String iName, int iid, String iDepartment)
	{
		name = iName;
		id = iid;
		department = iDepartment;
		collegeName = "Dole Patil";
	}
	
	void attendsLecture()
	{
		System.out.println( name + " attends lecture");
	}
	void appearsForExam()
	{
		System.out.println(name + "attends exam with id" + id);
	}
	void studiesInDepartment() {
		System.out.println(department);
	}
		
	void goesToCollege()
	{System.out.println( "goes to college " + collegeName );
	}
	
		
}
