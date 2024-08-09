
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.json.CDL;
import org.json.JSONTokener;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
public class JSONMain {

	public static void main(String[] args) {
		//using map
		Map m=new HashMap();
		m.put("virat", 18);
		m.put("dhoni",7 );
		m.put("sachin",10);
		System.out.println(m);
		String JSONText=JSONValue.toJSONString(m);
		System.out.println(JSONText);
		
		//using array
		int[] ar=new int[5];
		ar[0]=1;
		ar[1]=2;
		ar[3]=4;
		ar[2]=5;
		ar[4]=6;
		System.out.println(Arrays.toString(ar));
		String JsonText=JSONValue.toJSONString(Arrays.toString(ar));
		System.out.println(JsonText);
		JSONArray arr=new JSONArray();
		arr.add("sindhu");
		arr.add("sowmitha");
		arr.add("lakku");
		arr.add("pranu");
		
		String JSONText1=JSONValue.toJSONString(arr);
		
		// json array into jsonobject
		System.out.println(JSONText1);
		JSONObject ob=new JSONObject();
		ob.put("Names", arr);
		System.out.println(ob.toJSONString());
		
		// Access the array from the JSONObject
		JSONArray arrayFromJson = (JSONArray) ob.get("Names");

		System.out.println(arrayFromJson);
		arrayFromJson.set(0,"nihi");  // Change the value 5 to 10
		
  
		// Print the modified JSONObject
		System.out.println(ob.toJSONString());
		
		
		
		
		        // Create an instance of Employee
		              
		Scanner scan=new Scanner(System.in);
		Employee emp=null;
		 List l = new ArrayList(); 
		   
		   
		   System.out.println("Enter the No.of employees");
		int n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Employee "+(i+1)+" Details:(id,name,desigination,salary)");
			
			String input=scan.nextLine();
			String[] s=input.split(",");
			int eId=Integer.parseInt(s[0]);
			String eName=s[1];
			String eDesign=s[2];
			double eSalary=Double.parseDouble(s[3]);
			
			emp=new Employee(eId,eName,eDesign,eSalary);
			JSONObject jsonObject = new JSONObject();
			   jsonObject.put("id", emp.getId());
		        jsonObject.put("name", emp.getName());
		        jsonObject.put("designation", emp.getDesignation());
		        jsonObject.put("salary", emp.getSalary());
		        
		        l.add(jsonObject);
		       
		}
		System.out.println(l);
		 String employees=JSONValue.toJSONString(l);
		 System.out.println();
	        System.out.println(employees);
	        
		       
	        
	        JSONArray jsonArray = (JSONArray) JSONValue.parse(employees);
	        System.out.println(jsonArray);

	        for (Object emply : jsonArray) {
	            JSONObject jsonObj = (JSONObject) emply;
	            int id = ((Long) jsonObj.get("id")).intValue();  
	            String name = (String) jsonObj.get("name");
	            String designation = (String) jsonObj.get("designation");
	            double salary = (double) jsonObj.get("salary");

	         
	            Employee employ = new Employee(id, name, designation, salary);
	            System.out.println();
              
                System.out.println("Employee Details: " +employ.getId());
                System.out.println("ID: " + employ.getId());
                System.out.println("Name: " + employ.getName());
                System.out.println("Designation: " + employ.getDesignation());
                System.out.println("Salary: " + employ.getSalary());
	           
	        }
		        
//		       String s="{\"city\":\"chicago\",\"name\":\"jon doe\",\"age\":\"22\"}" ;            
//	        JSONObject jo = new JSONObject();
//	        String st=JSONValue.toJSONString(s);
//	        System.out.println(st);
	        String string = "name, city, age \n" +
	        		  "john, chicago, 22 \n" +
	        		  "gary, florida, 35 \n" +
	        		  "sal, vegas, 18";

	        		org.json.JSONArray result = CDL.toJSONArray(string);
	        		System.out.println(result);
		  
	 
	  
	  
	
		                
		            
		        

		    
		


		
		
		                
	}

}
