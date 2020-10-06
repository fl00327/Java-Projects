package demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JMap {

public static void main(String[] args) {
	Map<String,String> strMap = new HashMap<String,String>();
	Map<String,Double> dblMap = new HashMap<String,Double>();
	Map<String,List<Integer>> lstMap = new HashMap<String,List<Integer>>();
	strMap.put("parrot", "is a colorful bird");
	System.out.println(strMap.get("parrot"));
	
   dblMap.put("pi", 3.1421729);
   System.out.println(dblMap.get("pi"));
   
   List<Integer> intList = new ArrayList<Integer>();
   intList.add(25);
   intList.add(35);
   intList.add(45);
   lstMap.put("integer list",intList);
   intList = lstMap.get("integer list");
   for(int c = 0;c<intList.size();c++) {
	   System.out.println("c = " + c+" " +"value:"+ String.valueOf(intList.get(c)));
   }
	   
   
}
}
