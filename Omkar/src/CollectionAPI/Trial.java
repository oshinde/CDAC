package CollectionAPI;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trial {

	 void disp(List mylist)
		{
			 mylist.add("hello");
			Iterator it=mylist.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}	
		}
		public static void main(String args[])
		{
			List<Integer>m=new ArrayList<Integer>();
			m.add(20);
			m.add(40);
			Trial t=new Trial();
			t.disp(m);
			System.out.println("after returning");
			Integer ob=m.get(2); // this is risky
			System.out.println(ob);


		}
	
	
	
	
}
