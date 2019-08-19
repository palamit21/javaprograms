package com.java.test;

public class TestCombinerAndProvider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataCombiner<Project> dataCombiner = (Project p) -> {
			
			if(p.getLocation() == null) {
				return p.getPname()+" : " + p.getTeamLead();
			} else {
				return p.getPname()+" : " + p.getTeamLead() + " : " + p.getLocation();
			}
			
		};

		

		ExtraInfoProvider<Project> extraInfoProvider = (Project p) -> {
			
        	p.setLocation("aq");
        	return p;
        	
        };
        
        InfoProvider<Employee, Project> infoProvider = (Employee emp) -> {
        	
			if(emp.getId() > 100) {
				return new Project("ABCD", emp.getName());
			} else {
				return new Project("PQRS", emp.getName());
			}
			
		};

		String s = infoProvider.addMore(extraInfoProvider)
				.addCombiner(dataCombiner).combine(new Employee(1000, "Mahesh"));

		System.out.println(s); 
	  DataCombiner<Employee> s1=	infoProvider.addMore(extraInfoProvider)
		.addCombiner(dataCombiner);
	System.out.println(s1);
		
		

	}

}
