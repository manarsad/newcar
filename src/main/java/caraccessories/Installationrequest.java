package caraccessories;

public class Installationrequest {
	
	private int requestid;	
	private int productid;
	private String reqproductname;
	private String reqinstallername ;
	private String reqcostumername;
	private String day ;
	private String month;
	private int hour;
		
	public int getRequestid() {
		return requestid;
	}
	public void setRequestid(int requestid) {
		this.requestid = requestid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public String reqproductname() {
		return reqproductname;
	}
	public void setreqproductname(String reqproductname) {
		this.reqproductname = reqproductname;
	}
	public String reqinstallername() {
		return reqinstallername;
	}
	public void setreqinstallername(String reqinstallername) {
		this.reqinstallername =reqinstallername;
	}
	
	public String reqcostumername() {
		return reqcostumername;
	}
	public void setreqcostumername(String reqcostumername) {
		this.reqcostumername = reqcostumername;
	}
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public Installationrequest( int requestid  , String reqinstallername,int productid ,String reqproductname, String reqcostumername , String day , String month , int hour) {
		this.requestid=requestid;
		this.reqinstallername= reqinstallername;
		this.productid=productid;
		this.reqproductname=reqproductname;
		this.reqcostumername=reqproductname;
		this.day=day;
		this.month=month;
		this.hour=hour;
	}
	public Installationrequest() {
		
	}
    @Override
    public String toString() {
        return "InstallationRequest{" +
                "request id=" + requestid +
                ",installer name='" + reqinstallername + '\'' +
                ", product id=" + productid +
                ",product name='" + reqproductname + '\'' +
                ",costumer name='" + reqcostumername + '\'' +
                ", day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", hour=" + hour +
                '}';
    }
}
