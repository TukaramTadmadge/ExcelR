package day24;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJSONData2 {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		List<Worker> workers=null;
        try {
        	workers = mapper.readValue(
            	//new File("D:\\EclipseJavaprogs2\\Test\\json\\employee.json"),	   //absolute path
                new File("json/worker.json"),									  //relative path
                new TypeReference<List<Worker>>() {}
            );
            
            System.out.println("Total Workers "+workers.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //display count of male workers
        
        long countOfMaleWorkers=workers.stream()
        .filter(worker->worker.getGender().equals("male"))
        .count();
        
        System.out.println("Male Count " +countOfMaleWorkers);
        
        //count og male and female using partitionBy
        
       Map<Boolean,Long> count= workers.stream()
        .collect(Collectors.partitioningBy(worker->worker.getGender().equals("male"), Collectors.counting()));
       
       System.out.println(count);
       
       Map<String,Long> count1= workers.stream()
    	        .collect(Collectors.groupingBy(Worker::getGender, Collectors.counting()));
    	       
       System.out.println(count1);
       
       
       List<String> fruits=new ArrayList(Arrays.asList("Apple","Mango"));
       List<String> vegs=new ArrayList(Arrays.asList("Potato","Brinjal"));
       System.out.println(fruits);  //[Apple,Mango]
       System.out.println(vegs);	//[Potato,Brinjal]
       List<List<String>> foods=new ArrayList();
       foods.add(fruits);
       foods.add(vegs);										//		flatmap
       System.out.println(foods);  // [[Apple,Mango], [Potato,Brinjal]] => [Apple,Mango,Potato,Brinjal]
       
       List<String> foods1=foods.stream()
       .flatMap(items->items.stream())
       .toList();									// [p1,p2],[p1],[p1,p2],[p3]
       
       System.out.println(foods1);  
       											// [  [ [p1,p2] ] [[p1]] [[p1,p2],p3] []  ]
       												//[ p1,p2,p1,p2,p1,p2,p3] // unique project names [p1,p2,p3]
       
      List<String> abc= workers.stream()
       .flatMap(worker->worker.getProjects().stream())
       .map(proj->proj.getProjectName())
       .distinct()
       .toList();
      
      System.out.println(abc);
	
	}													

}
