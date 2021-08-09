package com.maven.Oops.Collections;
	
public class Main
{
	public static void main(String[] args)
	{
		/*Student std=new Student(11, "Rajendra", "cse");
		System.out.println(std);
		
		Student std1=new Student(11, "Rajendra", "cse");
		System.out.println(std1);
		
		System.out.println(std.equals(std1));
		
		Student std2=new Student(12,"Psychoo",null);
		System.out.println(std2);
		
		std2.setid(22);
		std2.setname("swetha");
		std2.setbranch("cse");
		System.out.println(std2);
		
		System.out.println(std.getname() +" , " + std1.getname() +" , " + std2.getname());*/
		
		/*Employee emp=new Employee(11, "Rajendra", "MentalEngineer");
		System.out.println(emp);
		
		Employee emp1=new Employee(11, "Rajendra", "Psychoo");
		System.out.println(emp1);
		
		System.out.println(emp.equals(emp1));
		
		Employee emp2=new Employee(12,"Psychoo",null);
		System.out.println(emp2);
		
		emp2.setid(22);
		emp2.setname("swetha");
		emp2.setrole("softwareEngineer");
		System.out.println(emp2);
		
		System.out.println(emp.getrole() +" , " + emp1.getrole() +" , " + emp2.getrole());*/
		
		
		/*Teacher tch=new Teacher();
		System.out.println(tch);
		
		tch.setid(11);
		tch.setname("Rajendra");
		tch.setsubject("pshychoism");
		System.out.println(tch);
		
		Teacher tch1=new Teacher(11, "Rajendra", "Psychoistic");
		System.out.println(tch1);
		
		Teacher tch2=new Teacher(12,"Psychoo",null);
		System.out.println(tch2);
		
		tch2.setid(22);
		tch2.setname("swetha");
		tch2.setsubject("english");
		System.out.println(tch2);
		
		System.out.println(tch1.equals(tch2));
		
		System.out.println(tch.getid() +" , " + tch1.getid() +" , " + tch2.getid());*/
		
		/*House hos=new House();
		System.out.println(hos);
		
		hos.setid(11);
		hos.setname("Rajendra");
		hos.setnumofrooms(3);
		System.out.println(hos);
		
		House hos1=new House();
		System.out.println(hos1);
		
		hos1.setid(11);
		hos1.setname("Psychoo");
		hos1.setnumofrooms(5);
		System.out.println(hos1);
		
		System.out.println(hos.equals(hos1));
		
		House hos2=new House();
		System.out.println(hos2);
		
		hos2.setid(22);
		hos2.setname("Swetha");
		hos2.setnumofrooms(4);
		System.out.println(hos2);
		
		System.out.println(hos.getnumofrooms() +" , " + hos1.getnumofrooms() +" , " + hos2.getnumofrooms());*/
		
		/*Branch branch = new Branch(01,"cse");
		Student1 std = new Student1(07, "swetha", branch);
		System.out.println(std);*/
		
		/*Subject subject = new Subject(01,"English");
		Teacher1 tch = new Teacher1(07, "swetha", subject);
		System.out.println(tch);*/
		
		/*Hall hall = new Hall(4, 14, true);
		House1 hos = new House1(07, "swetha", hall);
		System.out.println(hos);*/
		
		/*Role role = new Role(7, "AC", true);
		Employee1 emp = new Employee1(7, "swetha" , 2, true, role);
		System.out.println(emp);*/
		
		Gender gender = new Gender("female");
		Person1 per = new Person1(7,23, "swetha" , 50.2, 156, true, gender);
		System.out.println(per);
	}
	}
