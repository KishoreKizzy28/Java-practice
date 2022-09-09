package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate {
	public static void main(String[] args) {
		List<String> nameLst = new ArrayList<>();
		nameLst.add("Nilang");
		nameLst.add("Sam");
		nameLst.add("Peter");
		nameLst.add("Denial");
		nameLst.add("Peter");
		System.out.println("Original List :: "+nameLst);
		Set<String> uniqueNameSet = new HashSet<>(nameLst);
		List<String> uniqueNameLst = new ArrayList<>(uniqueNameSet);
		System.out.println("Updated List :: "+uniqueNameLst);
	}
	
}
