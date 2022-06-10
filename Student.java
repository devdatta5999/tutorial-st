class Student
   

	
{
	String name;
	int age;
	String address;
	
	 public Student(String name,int age,String address)
{
	this.name =name;
	this.age =age;
	this.address =address;
	
}
public void setName(String name)
{
	this.name = name;
}
public void setAge(int age)
{
	this.age = age;
}
public void setAddress(String  address)
{
	this.address = address;
}
public String getName()
{
	return name;
}
public int getAge()
{
return age;
}
public String getAddress()
{
	return address;
}
public static void main(String args[]){
Student dev = new Student("dev",25,"403 liberty jwel,california");
System.out.println(dev.toString());

	System.out.println(dev.getName());
	System.out.println(dev.getAge());
	System.out.println(dev.getAddress());

}
}

