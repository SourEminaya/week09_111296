package technicallynamedoesntmatter;

public class Smartphone extends Device implements Power, VolumeControl, Device.Connectivity {

	public Smartphone(String brand, String model) {
		super(brand, model);
		this.currentVolume=0;
		// TODO Auto-generated constructor stub
	}

	public int currentVolume;
	public String networkName;
	
	@Override
	public void increaseVolume(int level) {
		if(currentVolume<100) {
			currentVolume+=level;
			if(currentVolume>100) {
				currentVolume=100;
			}
		}
		System.out.println("Increasing volume by " + level+" Levels, current volume is "+currentVolume);
		
	}

	@Override
	public void dereaseVolume(int level) {
		if(currentVolume>0) {
			currentVolume-=level;
			if(currentVolume<0) {
				currentVolume=100;
			}
		}
		System.out.println("Decreasing volume by " + level+" Levels, current volume is "+currentVolume);
	}

	@Override
	public void turnOff() {
		System.out.println("Turning off device.");
		
	}

	@Override
	public void turnOn() {
		System.out.println("Turning on device");
		
	}

	@Override
	public void connectToWifi(String networkName) {
		this.networkName=networkName;
		System.out.println("Connecting to network: "+networkName);
	}

	@Override
	public void disconnectFromWifi() {
		System.out.println("Disconnecting from network "+networkName);
		this.networkName=null;
		
	}
	

}
