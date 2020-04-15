package practice.com.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Employee {
	
	private String empid;
	private String name;

	public Employee(String empid ,String name) {
		this.empid=empid;
		this.name=name;
	}

	
	public String getEmpid() {
		return empid;
	}


	public void setEmpid(String empid) {
		this.empid = empid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empid == null) ? 0 : empid.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid == null) {
			if (other.empid != null)
				return false;
		} else if (!empid.equals(other.empid))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}


class Test
{
public static void main(String[] args) {
		
	    Employee e1 = new Employee("1", "Puneet");
	    Employee e2 = new Employee("2", "Puneet");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode()==e2.hashCode());
		
		Map<Employee,String> map = new HashMap<Employee, String>();
		map.put(e1, "1");
		map.put(e2, "1");
		System.out.println(map.size());
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		System.out.println(list.size());
		//////////////////////////////////Iterator////////////////////////////////////
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println("@@@@@@@@@@@@@@ Iterator "+ itr.next());
		}
		/////////////////////////////////For Loop ///////////////////////////////////
		for(Employee emp : list)
		{
			
			System.out.println(emp.getEmpid()+emp.getName());
		}
		
		/////////////////////////////////For Each //////////////////////////////////
		list.forEach((emp) -> {System.out.println(emp.getEmpid()+emp.getName());});
		
		
	}
}
