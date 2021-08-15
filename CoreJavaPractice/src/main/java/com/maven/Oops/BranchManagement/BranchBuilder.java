package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class BranchBuilder {

	
	ArrayList<Branch> branch = new ArrayList();
	
	/**
	 * to add branch if id's are equal
	 * 
	 * @param b
	 * @return true or false based on Parameter
	 */
	public boolean addBranch(Branch b)
	{
		boolean flag = false;
		for(Branch brch : branch)
		{
			if(brch.getId() == b.getId())
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			branch.add(b);
		}
		return flag;
	}
	
	/**
	 * to get List of branches
	 * 
	 * @return List of branches
	 */
	public ArrayList<Branch> getAllBranches()
	{
		return branch;
	}
	
	/**
	 * to remove a branch which is same
	 * 
	 * @param b
	 * @return true or false based on parameter
	 */
	public boolean removeBranch(Branch b)
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
		return flag;
	}
	
	/**
	 * to update a branch by removing the current branch
	 * 
	 * @param current --- existing branch
	 * @param update --- new branch
	 * @return true or false based on parameters
	 */
	public boolean updateBranch(Branch current, Branch update)
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
		return flag;
	}
	
	/**
	 * to get branch with id
	 * 
	 * @param id
	 * @return branch based on parameter
	 */
	public Branch getBranch(int id)
	{
		Branch b = null;
		for(Branch brch : branch)
		{
			if(brch.getId() == id)
			{
				return brch;
			}
		}
		return b;
	}
	
	/**
	 * to get List of Branches using branch name
	 * 
	 * @param branchName
	 * @return branch name
	 */
	public ArrayList<Branch> getBranchByBranchName(String branchName)		
	{
		ArrayList<Branch> branchNameBranch = new ArrayList();
		for(Branch brch : branch)
		{
			if(brch.getBranchName().equals(branchName))
			{
				branchNameBranch.add(brch);
			}
		}
		return branchNameBranch;
	}
	
	/**
	 * to get list of branch by branch head
	 * 
	 * @param branchHead
	 * @return branch details by Branch Head
	 */
	public ArrayList<Branch> getBranchByBranchHead(String branchHead)		
	{
		ArrayList<Branch> branchHeadBranch = new ArrayList();
		for(Branch brch : branch)
		{
			if(brch.getBranchHead().equals(branchHead))
			{
				branchHeadBranch.add(brch);
			}
		}
		return branchHeadBranch;
	}
	
	/**
	 * to get List of Subjects in a branch by Subject id
	 * 
	 * @param id
	 * @return List of subjects
	 */
	public ArrayList<String> getSubjectsById(int id)		
	{
		for(Branch brch : branch)
		{
			if(brch.getId() == id)
			{
				return brch.getSubjects();
			}
		}
		return null;
	}
}
