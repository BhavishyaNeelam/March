package Mar;

class Product {
	public int productId;
	public String name;
	
	public Product(int productId, String name) {
		productId = productId;
		name = name;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product(101, "Jeans");
		System.out.println("Product Id: "+ p1.productId);
		System.out.println("Product Name: "+ p1.name);       
	}
}
