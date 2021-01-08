package jsonproject.jsonproject;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadDataFromJSONFile {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub

		
		JSONParser jsonparser = new JSONParser();
		
			FileReader reader = new FileReader(".\\jsonFiles\\employee.json");
			
			Object obj = jsonparser.parse(reader);
			
			JSONObject empjsonobj = (JSONObject)obj;
			
			
			String fname = (String) empjsonobj.get("firstname");
			String lname = (String) empjsonobj.get("lastname");
			
			System.out.println("first " + fname);
			System.out.println("last " + lname);
			
			
			////////// loop
			
			JSONParser jsonparser2 = new JSONParser();
			
			FileReader reader2 = new FileReader(".\\jsonFiles\\employeeList.json");
			
			Object obj2 = jsonparser2.parse(reader2);
			
//			JSONObject jsO2 = (JSONObject) obj2;
//			link: https://www.youtube.com/watch?v=cFCgFlqF5kw&ab_channel=ProfessorSaad
			
			JSONArray empjsonobj2 = (JSONArray) obj2;
//			Iterator<JSONObject> iterator = empjsonobj2.iterator();  //JSONArray, JSONObject te döndü array element olarak
			
			
			
			int size =  empjsonobj2.size();
			
			
			JSONObject benJ = (JSONObject) empjsonobj2.get(1);
			String fname2 = (String) benJ.get("firstname");
			//String lname = (String) empjsonobj.get("lastname");
				
			System.out.println("size:  " + size);
			System.out.println("first " + fname2);
			//System.out.println("last " + lname);
			
			
			
	
		
		
		
	}

}
