
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.TreeSet;

public class CalcArea{
	public static void main(String[] args){
		
		Map<Integer, Long> map = new TreeMap<Integer, Long>();
		
		for(int i = 1; i <= 50; i++){
			map.put(i, Math.round((Math.PI)*i*i));
		}
		
		Set<Integer> radius = map.keySet();
		System.out.println(radius);
		
		for(Integer i : radius){
			System.out.println("°ë¾¶: " + i + " Ãæ»ý: " + map.get(i));
		}
	}
}