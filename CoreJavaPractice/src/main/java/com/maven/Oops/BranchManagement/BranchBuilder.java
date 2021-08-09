package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class BranchBuilder {

		ArrayList<Branch> branch = new ArrayList<Branch>();
		
		public void addBranch(Branch b)
		{
			boolean flag = false;
			for(Branch brch : branch )
			{
				if(brch.equals(b))
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				branch.add(b);
			}
		}
		
		public void printBranch()
		{
			System.out.println("the data is");
			for(Branch brch : branch)
			{
				System.out.println(brch);
			}
		}
		
		public void updateBranch(Branch current, Branch update)
		{
			boolean flag = false;
			for(Branch brch : branch)
			{
				if(brch.equals(current))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				branch.remove(current);
				branch.add(update);
			}
		}
		
		public void removeBranch(Branch b)
		{
			boolean flag = false;
			for(Branch brch : branch)
			{
				if(brch.equals(b))
				{
					flag = true;
					break;
				}
			}
			if(flag)
			{
				branch.remove(b);
			}
		}
}
