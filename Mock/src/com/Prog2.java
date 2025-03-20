package com;

public class Prog2 {

	
	public static void solve(String s) {
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			int count = 0;

			
			for (int j = 0; j < s.length(); j++) 
			{
				if (s.charAt(j) == ch) {
					count++;
				}
			}

			
			if (count == 1) {
				System.out.print(ch + " ");
			}
		}
	}
	public static void main(String[] args)
	{
		String s = "hello";
		
		solve(s);

		
	}

}
