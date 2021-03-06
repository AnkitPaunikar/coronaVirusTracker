package Ankit.Coronavirus.tracker.model;

public class LocationStats {
	private String state;
	private String country;
	private int latestTotalCases;
	private int diffromprevday;
	
	
	
	public int getDiffromprevday() {
		return diffromprevday;
	}
	public void setDiffromprevday(int difffromprevday) {
		this.diffromprevday = difffromprevday;
	}
	
	public String getState() {
		if(state == "") {
			return "Default";
		}else {
			return state;
		}
		
	}
	public String getCountry() {
		return country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setState(String state) {
			this.state = state;
		}
		
	
	public void setCountry(String country) {
		this.country = country;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	
	@Override
	public String toString() {
		return "LocationStats [state=" + state + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
	
	
}
