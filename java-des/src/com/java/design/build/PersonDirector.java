package com.java.design.build;

public class PersonDirector {

	public Person construtorPerson(PersonBuilder pb) {

		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();

		return pb.buildPerson();

	}
}
