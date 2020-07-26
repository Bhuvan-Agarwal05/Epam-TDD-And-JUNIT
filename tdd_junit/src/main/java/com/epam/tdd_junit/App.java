package com.epam.tdd_junit;


public class App 
{
	String ans="";
	public String Remove(String s)
	{   
		int len=s.length();
		if(len>=2)
		{
			char firstchar=s.charAt(0);
			char secondchar=s.charAt(1);
			if(firstchar=='A' && secondchar=='A' && len==2)
			{
				ans=ans+"NULL";
			}
			else if(firstchar=='A' && secondchar=='A')
			{
				ans=ans+s.substring(2,len);
			}
			else if(firstchar=='A' )
			{
				ans=ans+s.substring(1,len);
			}
			else if( secondchar=='A')
			{
				ans=ans+firstchar+s.substring(2,len);
			}
			else
			{
				ans=ans+s;
			}
		}
		
		
		
		
		return ans;
	}
	}