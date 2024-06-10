package comparator;

public class Fruit {

	public String name;
	public int price;
	
	public Fruit(String name, int price) { // 생성자
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() { // toString 기능 새로 덮어씌우기
		return  name + ":" + price;
	}
}