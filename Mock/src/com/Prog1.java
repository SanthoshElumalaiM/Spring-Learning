package com;

public class Prog1 {
	
	public static void solve(String s [])
	{
		
		for (int i = 0; i < s.length; i++)
		{
			int count = 1;
			boolean flag = false;
			
			for (int k = 0; k < i; k++)
			{
				if (s[i].equals(s[k]))
				{
					flag = true;
					break;
				}
			}

			if (flag)
				continue; 
			for (int j = i + 1; j < s.length; j++) 
			{
				if (s[i].equals(s[j])) 
				{
					count++;
				}
			}

			
			
			
			System.out.println(s[i] + "-" +  count );
		
		}
	}

		public static void main(String[] args) 
		{
			String s[]  = { "hi", "how", "are", "hi", "how" };
			
			solve(s);
			
		}

}
