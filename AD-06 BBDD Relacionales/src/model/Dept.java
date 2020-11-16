package model;

public class Dept {
	
	@Override
	public String toString() {
		return "Dept [depno=" + depno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	public Integer getDepno() {
		return depno;
	}
	public void setDepno(Integer depno) {
		this.depno = depno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public Dept(Integer depno, String dname, String loc) {
		super();
		this.depno = depno;
		this.dname = dname;
		this.loc = loc;
	}
	private Integer depno;
	private String dname;
	private String loc;

}
