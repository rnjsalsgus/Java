package chapter17.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name=null;
		int maxScore=0;
		int totalScore=0;
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(map.get("blue"));
		list.add(map.get("hong"));
		list.add(map.get("white"));
		
		if(list.indexOf(0)>list.indexOf(1)) {
			maxScore=list.indexOf(0);
		}else if(list.indexOf(1)>list.indexOf(2)) {
			maxScore=list.indexOf(1);
		}else maxScore=list.indexOf(2);
		
	}

}
