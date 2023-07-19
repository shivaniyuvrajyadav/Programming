import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Employee implements Comparable <Employee>{
	int id ;
	String name ;
	double salary ; 
	
public 	Employee(int id,String name , double salary){
		this.id = id;
		this.name=name;
		this.salary= salary;
	}

	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
	if (this.salary>e.salary) {
		return 1;
	}
	else if(this.salary<e.salary) {
		return -1;
		
	}
	else {
		return 0;
	}
	}

	@Override
	public String toString() {
		return id +" "+ name+" "+salary;
		
	}
	
	
	
}

public class Emp {
	public static void main(String[] args) {
		ArrayList <Employee> a = new ArrayList<>();
		a.add(new Employee(1,"shivani",4000));
		a.add(new Employee(2,"abc",3000));
		a.add(new Employee(3,"xyz",3333));
		
		Collections.sort(a);
		
		for(Employee e:a) {
			System.out.println(e);
		}
		
		
	}

}
