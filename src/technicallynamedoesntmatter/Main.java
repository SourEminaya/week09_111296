package technicallynamedoesntmatter;

public class Main {
	
	public static void displayInfo(Smartphone smartphone) {
		System.out.println("Device info: Brand: "+smartphone.getBrand()+", Model: "+smartphone.getModel());
	}

	public static void main(String[] args) {
		Smartphone samsoong= new Smartphone("Samsung", "Galaxy S21");
		displayInfo(samsoong);
		samsoong.turnOn();
		samsoong.increaseVolume(5);
		samsoong.dereaseVolume(3);
		samsoong.connectToWifi("HomeNetwork");
		samsoong.disconnectFromWifi();
		samsoong.turnOff();

	}

}
