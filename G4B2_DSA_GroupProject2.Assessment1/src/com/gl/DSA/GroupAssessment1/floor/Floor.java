package com.gl.DSA.GroupAssessment1.floor;

//Floor class to store the floor size and its day

/*The Floor class extends the Building class and implements  the construct method, 
* which constructs the building based on the floor sizes entered by the user.*/

/*Floor class extends the Building abstract class and implements the construct() method. The Main class contains the main() 
* method which reads the input from the user and creates an instance of Floor to construct the building.*/

import com.gl.DSA.GroupAssessment1.building.*;

public class Floor extends Building {
	int n;

	public Floor(int n) {
		this.n = n;
	}

	public void construct() {
		System.out.println("\nThe order of construction is as follows\n");
		boolean vis[] = new boolean[n + 1];
		int max = n;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			vis[floorSizes.get(i)] = true;

			sb.append("Day:").append(i + 1).append("\n");

			if (vis[max]) {
				while (vis[max]) {
					sb.append(max).append(" ");
					max--;
				}
			}

			sb.append("\n");
		}
		System.out.println(sb);

	}
}