package com.wxx.circle;

class InstCnt{
	
	static int instNum = 0;
	int instNum2 = 0;
	
	public InstCnt() {
		instNum++;
		instNum2++;
		//System.out.println("instNum:" + instNum);
		System.out.println("instNum2: " + instNum2);
	}
	
	void Count() {
		instNum++;
	}
	
}

public class Circle2{
	public static void main(String[] args) {
		InstCnt n1 = new InstCnt();
		InstCnt n2 = new InstCnt();
		InstCnt n3 = new InstCnt();
		
		n3.Count();
		
		System.out.println(n3.instNum);
		
	}
}

