package ustbatchno3.TestNG;

public class Material {
	private String city;
	private int p_without;
	private int p_with;
	public Material(String city, int p_without, int p_with) {
		super();
		this.city = city;
		this.p_without = p_without;
		this.p_with = p_with;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @return the p_without
	 */
	public int getP_without() {
		return p_without;
	}
	/**
	 * @return the p_with
	 */
	public int getP_with() {
		return p_with;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @param p_without the p_without to set
	 */
	public void setP_without(int p_without) {
		this.p_without = p_without;
	}
	/**
	 * @param p_with the p_with to set
	 */
	public void setP_with(int p_with) {
		this.p_with = p_with;
	}
	@Override
	public String toString() {
		return "Material [city=" + city + ", p_without=" + p_without + ", p_with=" + p_with + "]";
	}
	

}
