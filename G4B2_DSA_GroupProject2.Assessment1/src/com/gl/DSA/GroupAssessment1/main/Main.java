package com.gl.DSA.GroupAssessment1.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.gl.DSA.GroupAssessment1.floor.*;
import com.gl.DSA.GroupAssessment1.building.*;

/*The main method creates an instance of the Sol class and calls the setFloorSize 
 * method to set the floor sizes, and then calls the construct method to construct the building.*/
/**
 * @author Anupama Voruganti,megharaj,Hari Gopi Krishna,Jaimin Bhatt,Roushan
 *         kumar
 * @version 1.0
 * @since 2023-04-18
 */

/*
 * Input ===== First Line: contains the total floors N in the building Second
 * Line onwards: Contains N inputs in which the ith integer denotes the size of
 * the floor that will be given to architect by factories on the ith day.
 * 
 * Output ==== You are required to print N lines. Print the size of the floor in
 * descending order, which can be assembled. If no floor can be assembled on the
 * ith day, leave the line empty.
 * 
 * Instructions :
 * 
 * 1) We can use any inbuilt java function/s to implement the above
 * functionalities 2) We can choose DataStructure(LinkedList) to implement the
 * above functionality.
 */

public class Main {

	public static void main(String args[]) throws IOException {
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the total number of floors in the building:");
		n = Integer.parseInt(br.readLine());

		Building building = new Floor(n);

		for (int i = 0; i < n; i++) {
			System.out.println("Enter the floor size given on each day:" + (i + 1));
			int num = Integer.parseInt(br.readLine());
			building.setFloorSize(num);
		}

		building.construct();
	}
}
