package ustbatchno3.TestNG;

/**
 * Hello world!
 *
 */
public class Employee
{
  private String name;
  private int age;
  private String dep;
public Employee(String name, int age, String dep) {
	super();
	this.name = name;
	this.age = age;
	this.dep = dep;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @return the age
 */
public int getAge() {
	return age;
}
/**
 * @return the dep
 */
public String getDep() {
	return dep;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @param age the age to set
 */
public void setAge(int age) {
	this.age = age;
}
/**
 * @param dep the dep to set
 */
public void setDep(String dep) {
	this.dep = dep;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", dep=" + dep + "]";
}
  
}
