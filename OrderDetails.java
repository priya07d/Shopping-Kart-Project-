package shoppingKartusingarray;

public class OrderDetails {
	private int orderId;
	private int productId;
       private String ProductNname,brand;
       private int quantity;
       private double totalAmount;
       
	
	
	public OrderDetails(int orderId, int productId, String productNname, String brand, int quantity,
			double totalAmount) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		ProductNname = productNname;
		this.brand = brand;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductNname() {
		return ProductNname;
	}
	public void setProductNname(String productNname) {
		ProductNname = productNname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
       
}
