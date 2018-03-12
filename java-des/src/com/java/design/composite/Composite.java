package com.java.design.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	List<Component> components = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {

		components.add(component);
	}

	@Override
	public void show(int index) {

		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < index; i++) {
			stringBuilder.append("-");
		}
		System.out.println(stringBuilder.toString() + this.name);
		for (Component component : components) {
			component.show(index + 2);
		}
	}

	@Override
	public void delete(Component component) {
		components.remove(component);
	}
}
