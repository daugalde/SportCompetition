import java.util.ArrayList;
import java.util.Collections;

public class main {

	public static void main(String[] args) {
		
		
		ArrayList<player> arr= new ArrayList<player>();
		
		arr.add(new player ("maria"    ,11         ,23));
		arr.add(new player ("ana"    ,13         ,23));
		arr.add(new player ("lucia"    ,14         ,25));
		arr.add(new player ("kristel"    ,11         ,21));
		arr.add(new player ("maria"    ,13         ,23));
		arr.add(new player ("laura"    ,13         ,19));
		
		Collections.sort(arr);
		
		for (player c : arr) {
			System.out.println(c.toString());
			
		}

	}

}
