package model;

public class Dept {
	
	private String OLA;
	private String ADIOS;
	
	
	public Dept(String oLA, String aDIOS) {
		OLA = oLA;
		ADIOS = aDIOS;
	}


	public String getOLA() {
		return OLA;
	}


	public void setOLA(String oLA) {
		OLA = oLA;
	}


	public String getADIOS() {
		return ADIOS;
	}


	public void setADIOS(String aDIOS) {
		ADIOS = aDIOS;
	}


	@Override
	public String toString() {
		return "Dept [OLA=" + OLA + ", ADIOS=" + ADIOS + "]";
	}
	
}
