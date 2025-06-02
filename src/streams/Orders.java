package streams;


import java.time.LocalDate;
import java.util.List;

public class Orders {
	int order_id;
	LocalDate order_date;
	List<Product> product_name;

	public Orders(int order_id, LocalDate order_date, List<Product> product_name) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.product_name = product_name;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public LocalDate getOrder_date() {
		return order_date;
	}

	public void setOrder_date(LocalDate order_date) {
		this.order_date = order_date;
	}

	public List<Product> getProduct_name() {
		return product_name;
	}

	public void setProduct_name(List<Product> product_name) {
		this.product_name = product_name;
	}
}
