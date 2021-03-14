package CTF011038_JAVA132;

public class Employee {
	String firstname;
	String lastname;
	int salary;
	String position;

public Employee(String firstnameInput, String lastnameInput, int salaryInput, String positionInput) {
	firstname = firstnameInput;
	lastname = lastnameInput;
	salary = salaryInput;
	position = positionInput;
}

public void checkPosition() {
	System.out.println("My position is "+position);

}
public static void main(String [] args) {
	Employee em1 = new Employee("นาย D", "dot S", 20000, "Officer");
	em1.checkPosition();
	Employee em2 = new Employee("นายเอ","นามสมมติ",10000,"CEO");
	em2.getFullName();
}

public void getFullName() {
	System.out.println(firstname+" "+lastname);
}
}