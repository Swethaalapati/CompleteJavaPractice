package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class BranchBuilder {

		ArrayList<Branch> branch = new ArrayList<Branch>();
		
		/**
		 * to add branch details
		 * 
		 * @param b
		 */
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
		
		/**
		 * to get List of branch details
		 *  
		 */
		public void printBranch()
		{
			System.out.println("the data is");
			for(Branch brch : branch)
			{
				System.out.println(brch);
			}
		}
		
		/**
		 * to update branch details by removing current branch details
		 * 
		 * @param current -- existing branch details
		 * @param update -- new branch details
		 */
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
		
		/**
		 * to remove branch details using id
		 * 
		 * @param b
		 */
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
