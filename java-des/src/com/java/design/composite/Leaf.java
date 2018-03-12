package com.java.design.composite;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {

		System.out.println("A leaf could not add component");
	}

	@Override
	public void delete(Component component) {

		System.out.println("A leaf could not delete component");
	}

	@Override
	public void show(int index) {

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < index; i++) {
			stringBuilder.append("-");
		}
		System.out.println(stringBuilder.toString() + this.name);
	}
}
