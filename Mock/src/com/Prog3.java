package com;

public class Prog3 {
	
	
	public static int solve(String s)
	{
		int sum=0;
		for(int i=0;i<s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9')
			{
				sum+=ch-'0';
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		
		
		String s="4hi1are3you";
		
		int res=solve(s);
		System.out.println(res);
	}

}
