class Item {
	int id;
	String name;
	double price;
	char A;

	public Item(int id, String name, double price, char a) {
		this.id = id;
		this.name = name;
		this.price = price;
		A = a;
	}
//TODO add variable.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public char getA() {
		return A;
	}

	public void setA(char a) {
		A = a;
	}

	//TODO constructor

	//TODO setters and getters

	double taxReturn () {
		double tax=0.0;
		double DDV=0.0;
		DDV=getPrice()*0.18;
		tax=DDV*0.15;
		return tax;
		//TODO
	}
}