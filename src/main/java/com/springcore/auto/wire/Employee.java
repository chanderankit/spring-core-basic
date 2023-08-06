package com.springcore.auto.wire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setter");
	}

	public Employee(Address address) {
		super();
		this.address = address;

		System.out.println("constructor");
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
