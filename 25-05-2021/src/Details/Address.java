package Details;

public class Address {
	private String hno;
	private String colName;
	private String cityname;
	
	public Address(String hno,String colName,String cityName) {
		this.hno=hno;
		this.colName= colName;
		this.cityname=cityName;

}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colName=" + colName + ", cityname=" + cityname + "]";
	}
}