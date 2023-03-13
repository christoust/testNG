package ustbatchno3.TestNG;


public class Material_customer {

	private String customer_name;
	private int customer_id;
	private int sq_feet;
	private String city;
	public Material_customer(String customer_name, int customer_id, int sq_feet,String city) {
		super();
		this.customer_name = customer_name;
		this.customer_id = customer_id;
		this.sq_feet = sq_feet;
		this.city=city;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}
	/**
	 * @return the customer_id
	 */
	public int getCustomer_id() {
		return customer_id;
	}
	/**
	 * @return the sq_feet
	 */
	public int getSq_feet() {
		return sq_feet;
	}
	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	/**
	 * @param customer_id the customer_id to set
	 */
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	/**
	 * @param sq_feet the sq_feet to set
	 */
	public void setSq_feet(int sq_feet) {
		this.sq_feet = sq_feet;
	}
	@Override
	public String toString() {
		return "Material_customer [customer_name=" + customer_name + ", customer_id=" + customer_id + ", sq_feet="
				+ sq_feet + ", city=" + city + "]";
	}
	
}
