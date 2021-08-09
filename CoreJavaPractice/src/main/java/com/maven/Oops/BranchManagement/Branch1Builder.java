package com.maven.Oops.BranchManagement;
import java.util.ArrayList;

public class Branch1Builder {

	
	ArrayList<Branch1> branch = new ArrayList();
	
	public boolean addBranch(Branch1 b)				/* adding branch using return type boolean */
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
	
	
	public ArrayList<Branch1> getAllBranches()		/* to show all branches so list is used */
	{
		return branch;
	}
	
	
	public boolean removeBranch(Branch1 b)			/* to remove a branch which is same and returning it with boolean type */
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
	
	
	public boolean updateBranch(Branch1 current, Branch1 update)	/* updating branch by removing current branch */
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
			addBranch(update);
		}
		return flag;
	}
	
	
	public Branch1 getBranch1(int id)		/* getting branch with id */
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
	
	
	public ArrayList<Branch1> getBranch1ByBranchName(String branchName)		/* getting branch by branchname */
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
	
	
	public ArrayList<Branch1> getBranch1ByBranchHead(String branchHead)		/* getting branch by branchhead */
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
