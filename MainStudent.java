
public class MainStudent extends Student{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setName("Manisha Singh");
		s.setAge(24);
		s.setRollno(28);
		
		System.out.println(s.getInstitute());
		System.out.println("Name is : "+s.getName());
		System.out.println("Age is : "+s.getAge());
		System.out.println("Roll Number is : "+s.getRollno());

}
}