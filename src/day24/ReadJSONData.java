package day24;

import java.io.File;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONData {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> employees=null;
        try {
            employees = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/employee.json"),									  //relative path
                new TypeReference<List<Employee>>() {}
            );
            
            System.out.println(employees);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //fetch names of emp working in IT dept
        List<String> itDeptemployees= employees.stream()
        .filter(emp->emp.getDepartment().equalsIgnoreCase("it")) //[{},{},{}]
        .map(emp->emp.getName()) //[A,B,C]
        .toList();
        
        System.out.println(itDeptemployees);
	}

}
