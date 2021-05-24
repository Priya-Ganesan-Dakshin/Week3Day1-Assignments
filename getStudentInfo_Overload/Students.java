package getStudentInfo_Overload;

public class Students {
	public void getStudentInfo(int StudentID)
	{
System.out.println("The StudentID is" + " " + StudentID);
	}
	public void getStudentInfo(int StudentID, String Name)
	{
System.out.println("The StudentID is" + " " + StudentID + "The Name of Student" + " " + Name);
	}
	
	public void getStudentInfo(String email, int phoneNumber)
	{
System.out.println("The email id is" + " " + email + " " + "The Phone number is" + " " + phoneNumber);
	}
	public static void main(String[] args) {
		Students info = new Students();
		info.getStudentInfo(12);
		info.getStudentInfo(15,"Priya Ganesan");
		info.getStudentInfo("Priyaa_ganesan@yahoo.co.in",950007486);

	}

}
