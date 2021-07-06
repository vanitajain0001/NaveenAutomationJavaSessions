package JavaSessions;

import java.util.ArrayList;

public class Browser {
	private String browserName;
	private String vendorName;
	private String currentVersion;
	private ArrayList<String> plugins;
	
	public Browser(String browserName, String vendorName, String currentVersion, ArrayList<String> plugins ) {
		
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.plugins = plugins;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getCurrentVersion() {
		return currentVersion;
	}

	public void setCurrentVersion(String currentVersion) {
		this.currentVersion = currentVersion;
	}

	public ArrayList<String> getPlugins() {
		return plugins;
	}

	public void setPlugins(ArrayList<String> plugins) {
		this.plugins = plugins;
	}
	
	


}
