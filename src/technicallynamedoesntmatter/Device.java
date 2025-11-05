package technicallynamedoesntmatter;

public class Device  {
	public String brand;
	public String model;

	
	interface Connectivity {
		void connectToWifi(String networkName);
		void disconnectFromWifi();
	}

	
	public Device(String brand, String model) {
		this.brand=brand;
		this.model=model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
}
