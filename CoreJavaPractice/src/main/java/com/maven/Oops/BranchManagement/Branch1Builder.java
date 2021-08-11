package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class Branch1Builder {

	
	ArrayList<Branch1> branch = new ArrayList();
	
	/**
	 * to add branch if id's are equal
	 * 
	 * @param b
	 * @return true or false based on Parameter
	 */
	public boolean addBranch(Branch1 b)
	{
		boolean flag = false;
		for(Branch1 brch : branch)
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
	public ArrayList<Branch1> getAllBranches()
	{
		return branch;
	}
	
	/**
	 * to remove a branch which is same
	 * 
	 * @param b
	 * @return true or false based on parameter
	 */
	public boolean removeBranch(Branch1 b)
	{
		boolean flag = false;
		for(Branch1 brch : branch)
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
	public boolean updateBranch(Branch1 current, Branch1 update)
	{
		boolean flag = false;
		for(Branch1 brch : branch)
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
	public Branch1 getBranch1(int id)
	{
		Branch1 b = null;
		for(Branch1 brch : branch)
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
	public ArrayList<Branch1> getBranch1ByBranchName(String branchName)		
	{
		ArrayList<Branch1> branchNameBranch1 = new ArrayList();
		for(Branch1 brch : branch)
		{
			if(brch.getBranchName().equals(branchName))
			{
				branchNameBranch1.add(brch);
			}
		}
		return branchNameBranch1;
	}
	
	/**
	 * to get list of branch by branch head
	 * 
	 * @param branchHead
	 * @return branch details by Branch Head
	 */
	public ArrayList<Branch1> getBranch1ByBranchHead(String branchHead)		
	{
		ArrayList<Branch1> branchHeadBranch1 = new ArrayList();
		for(Branch1 brch : branch)
		{
			if(brch.getBranchHead().equals(branchHead))
			{
				branchHeadBranch1.add(brch);
			}
		}
		return branchHeadBranch1;
	}
	
	/**
	 * to get List of Subjects in a branch by Subject id
	 * 
	 * @param id
	 * @return List of subjects
	 */
	public ArrayList<String> getSubjectsById(int id)		/* getting subjects by id */
	{
		for(Branch1 brch : branch)
		{
			if(brch.getId() == id)
			{
				return brch.getSubjects();
			}
		}
		return null;
	}
}
