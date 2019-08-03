package org.mule4.test;

import java.util.Random;
import java.util.UUID;

public class DataGen {

	public Stub generateData(String name, String org, String location, String role) {

		Stub a = new Stub();
		a.setId(UUID.randomUUID().toString());
		a.setName(name);
		a.setOrg(org);
		a.setLocation(location);
		a.setRole(role);
		a.setBusinessOrg("Retail");
		Random r = new Random();
		
		a.setEmpId(r.nextInt(450000));
		a.setCapabilities("Java" + ","+ "Rest API Development");

		return a;
	}

}

class Stub {
	private String name;

	private String id;

	private String org;

	private String role;

	private String location;

	private String businessOrg;
	
	private int empId;
	
	private String capabilities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBusinessOrg() {
		return businessOrg;
	}

	public void setBusinessOrg(String businessOrg) {
		this.businessOrg = businessOrg;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getCapabilities() {
		return capabilities;
	}

	public void setCapabilities(String capabilities) {
		this.capabilities = capabilities;
	}

}
