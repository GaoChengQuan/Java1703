package day3;

/**
 * brand(品牌)，price(价格)，color(颜色)
 * @author Gao
 *
 */
public class Car {
	String brand;//null
	double price;//0.0
	String color;//null
	
	void show() {
		System.out.println("brand: " + brand + ", price: " + price
				+ ", color: " + color);
	}
	
	void startup() {
		System.out.println(brand + "品牌的汽车启动");
	}
}
