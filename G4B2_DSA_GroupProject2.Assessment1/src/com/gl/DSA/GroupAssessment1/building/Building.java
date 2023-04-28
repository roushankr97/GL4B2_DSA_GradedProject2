package com.gl.DSA.GroupAssessment1.building;

/* In this implementation, the Building class is an abstract class that defines the behavior of the building,
 * including setting the floor size and constructing the building. 
 */

import java.util.LinkedList;

public abstract class Building {
	/*
	 * The LinkedList is used to store the floor sizes entered by the user, and the
	 * setFloorSize method is called to add each floor size to the list. The
	 * construct method then constructs the building based on the floor sizes in the
	 * list.
	 */

	protected LinkedList<Integer> floorSizes;

	public Building() {
		floorSizes = new LinkedList<>();
	}

	public void setFloorSize(int size) {
		floorSizes.add(size);
	}

	public abstract void construct();
}
