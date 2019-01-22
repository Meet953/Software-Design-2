

import java.awt.Graphics;
import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class LinkedStore{
		private int arr[]=new int[4];;
		private int count;
		private int nextin;
		private int nextout;
		public  LinkedStore(){ 
			for(int i=0;i<4;i++)
				arr[i]=0;
				count=0;
				nextin=0;
				nextout=0;}

public synchronized void insert(int val) throws Exception{
	
	while(count == 4) {
		System.out.println("Wishing to insert");
		wait();
	}
		arr[nextin]=val;
		nextin=nextin+1;
		count++;
		if (nextin>3) nextin=0;
		notify();
		}

public synchronized int delete()  throws Exception
               {
	
	while(count==0) {
		System.out.println("Wishing to get");
		wait();
	}
	        int res=arr[nextout];
		nextout++;
		if (nextout>3) nextout=0;
		count--;
		notify();
		return res;
		}
   }
		


class Producer2 extends Thread {
	private LinkedStore store;

	public Producer2(LinkedStore ns){store=ns;}

	public void run() {
		for (int i = 1; i < 10; i++) {
			try{ store.insert(i);}
			catch(Exception e){}
			//System.out.println("Producer "+ " inserts : " + i);
			try {
	              sleep((int)( Math.random()*10)); }
			catch (InterruptedException e) {}      }
}
}

class Consumer2 extends Thread {
	private LinkedStore store;

	public Consumer2(LinkedStore ns){store=ns;}

	public void run() {
		int value = 0;
		for (int i = 1; i < 10; i++) {
			try{ value = store.delete();}
			catch(Exception e){}
			System.out.println("Consumer "+ " gets: " + value);
			try {  sleep((int)( Math.random()*30));}
			catch (InterruptedException e) {}    }
			}
}

public class SlicedStack2 {
public static void main(String[] args)
{
			LinkedStore ls=new LinkedStore();
			Producer2 p=new Producer2(ls);
			Consumer2 c=new Consumer2(ls);
			p.start();
			c.start();
			try{
			     System.in.read();}
			catch(Exception e){}
			}
}
