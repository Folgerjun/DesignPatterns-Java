package com.java.design.build;

public class ManBuilder implements PersonBuilder {

	Person person;

	public ManBuilder() {

		person = new Man();
	}

	@Override
	public void buildBody() {

		person.setBody("建造身体...");
	}

	@Override
	public void buildFoot() {

		person.setFoot("建造脚...");
	}

	@Override
	public void buildHead() {

		person.setHead("建造头...");
	}

	@Override
	public Person buildPerson() {
		return person;
	}
}
