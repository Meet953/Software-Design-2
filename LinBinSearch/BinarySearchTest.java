

import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.Scanner;

public class BinarySearchTest  {
	
	public static boolean search(int[] list,int target){

		boolean res = false;
		int li=0;
		int ui = list.length - 1;
		int mid = (ui+li)/2;
		while(res == false && ui>=li) {
			if(list[mid]== target ) {
				res = true;
			}
			else if(target < list[mid]) {
				ui = mid-1;
			}
			else {
				li = mid+1;
			}
			mid = (ui+li)/2;
		}
	        return   res;
}

public static void main(String[] args)
{		Scanner sc = new Scanner(System.in);
			int[] list={1,3,5,6,7,9,11,17};
			
			System.out.print("Enter Target:");
			int target =sc.nextInt();
			boolean res=search(list,target);
			System.out.println("Target Found: "+res);
			}
}
