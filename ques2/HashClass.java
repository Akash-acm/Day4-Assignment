package assignment.ques2;
import java.util.*;
public class HashClass {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("Delhi");
		hs.add("Patna");
		hs.add("Kolkata");
		hs.add("Bhopal");
		hs.add("Jaipur");
		hs.add("Itanagar");
		hs.add("Raipur");
		hs.add("Lucknow");
		hs.add("Dehradun");
		hs.add("Shimla");
		System.out.println(hs.contains("Bhopal"));
		System.out.println("Elements in Hashset before removing "+hs);
		System.out.println(" ");
		hs.remove("Jaipur");
		System.out.println("Elements in Hashset After removing "+hs);
		System.out.println(" ");
		System.out.println("--HashSet iteration using Iterator--");
		Iterator<String> it=hs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("--HashSet iteration using Enhanced Loop--");
		for(String s:hs) {
			System.out.print(s+" ");
		}

	}

}