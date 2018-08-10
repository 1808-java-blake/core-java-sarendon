package com.revature.eval.java.core;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int n = 3751;
		
		
	
	
	boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	
	}

}
