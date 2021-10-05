import java.util.HashMap;
import java.util.Map;

public class nonCompPlayer {
	public String solution(String[] p, String[] c) {
        Map<String, Integer> map = new HashMap<>();
        
        for(String s : c){
            if(map.containsKey(s)){
                int cnt = map.get(s);
                map.put(s,cnt+1);
            }else{
                map.put(s,1);
            }
        }
        for(String s : p){
            if(!map.containsKey(s)){
                return s;
            }else{
            	if(map.get(s)==0) {
            		return s;
            	}
                map.put(s, map.get(s)-1);
            }
        }
        return null;
	}
	
}
