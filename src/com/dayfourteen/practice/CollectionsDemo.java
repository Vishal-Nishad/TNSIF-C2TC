package com.dayfourteen.practice;

import java.util.*;

public class CollectionsDemo {
	public static void main(String args[]) {
		ArrayList vobj =new ArrayList();
	vobj.add(126);
	vobj.add("Vishal");
	vobj.add("Nishad");
	vobj.add(96.6f);
	System.out.println(vobj);
	vobj.remove(3);
	vobj.add(3,"hello vishal");
	System.out.println(vobj);
	vobj.set(3, 96f);
	System.out.println(vobj);
	}
}
