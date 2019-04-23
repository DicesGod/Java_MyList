import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Check MyList
		
		Integer [] MyList = {1,2,3,4};
		
		MyList<Integer> emptylist = new MyList<Integer>();
		MyList<Integer> testlist = new MyList<Integer>(MyList);
		System.out.println("Check empty list: "+emptylist.isEmpty());
		System.out.println("Check testlist: "+emptylist.isEmpty());
		System.out.println("Test list: "+testlist);
		System.out.println("Array of objects: "+testlist.toArray());
		System.out.println("Data of first node: "+testlist.head());
		System.out.println("MyList without first node: "+testlist.tail());
		System.out.println("Data of last node: "+testlist.end());
		
		testlist.append(5);
		System.out.println("Create a node at the end of the MyList: "+testlist.toString());
		
		Integer [] MyList2 = {6,7,8};
		
		MyList<Integer> testlist2 = new MyList<Integer>(MyList2);
		testlist.concat(testlist2);
		System.out.println("Concatenated list: "+testlist.toString());
		
		//Create iterator
		Integer [] MyList3 = {1,2,3};
		MyList<Integer> testlist3 = new MyList<Integer>(MyList3);
		MyListIterator<Integer> itr = testlist3.iterator();
		
		//Check Iterator
	
		System.out.println("Check hasNext: "+itr.hasNext());
		System.out.println("Check hasPrevious: "+itr.hasPrevious());
		itr.next();
		itr.next();
		itr.next();
		System.out.println("Check hasNext: "+itr.hasNext());
		System.out.println("Check hasPrevious: "+itr.hasPrevious());
		
		itr.goToBegin();
		System.out.println("Check hasNext after goToBegin: "+itr.hasNext());
		System.out.println("Check hasPrevious after goToBegin: "+itr.hasPrevious());
		
		itr.goToEnd();
		System.out.println("Check hasNext after goToEnd: "+itr.hasNext());
		System.out.println("Check hasPrevious after goToEnd: "+itr.hasPrevious());
		
		itr.goToBegin();

		
		itr.next();
		
		itr.add(5);
		System.out.println("Add iteration E: "+testlist3.toString());
		
		
		itr.next(); 
		itr.remove();
		System.out.println("Remove iteration B: "+testlist3.toString());
		
		
		
	}

}
