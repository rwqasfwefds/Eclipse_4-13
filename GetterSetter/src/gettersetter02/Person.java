package gettersetter02;

public class Person {
	String name;
	int height;
	int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
