import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator{
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		
		for(int i = 0; i < args.length; i++){
			list.add(args[i]);
		}
		
		Iterator<String> iter = list.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next() + " ");
		}
	}
}