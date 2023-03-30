package week1.day2;

public class Tab {
	
	public int tabPrice(int tabPrice) {
		 return tabPrice;
	}

	public String tabBrand (String brandName) {
		return brandName;
	}
	
	public static void main(String[] args) {
		
		Tab tab = new Tab();
		int price = tab.tabPrice(50000);
		String brand = tab.tabBrand("ipad");
		System.out.println("Tab name is : " + brand );
	    System.out.println("Tab price is : " + price);
	}

}
