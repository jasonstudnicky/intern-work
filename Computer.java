enum cpu_type {
	CORE_I3, CORE_I5, CORE_I7 
}
enum cpu_fan_type {
	LIQUID, AIR
}
enum case_fan_type {
	STATIC, PRESSURE, HIGH_AIR_FLOW
}
enum storage_type {
	HARD_DRIVE, OPTICAL, SSD 
}
enum video_card_type {
	NONE, NVIDIA_GEFORCE, ZOTAC_GAMING
}

public class Computer {
	private String name;
	private String motherboard;
	private int ram_maxiumum; //GB
	private int ram_installed; //GB
	private cpu_type cpu;
	private cpu_fan_type cpu_fan;
	private case_fan_type case_fan;
	private int powersupply_wattage;
	private int powersupply_voltage;
	private storage_type storage_drive;
	private video_card_type plugin_video_card;
	private boolean on;

	public Computer (String name) {
		this.name = name;
		motherboard = "ASUS";
		ram_maxiumum = 128;
		ram_installed = 32;
		cpu = CORE_I5;
		cpu_fan = AIR;
		case_fan = STATIC;
		powersupply_wattage = 350;
		powersupply_voltage = 110;
		storage_drive = HARD_DRIVE;
		plugin_video_card = NONE;
		on = false;
	}
	public String getName() {
	    return name;
	}

	public void setRam(int amount) {
	    ram_installed = amount;

	}
	public void setStorage(storage_type storage) {
	    storage_drive = storage;

	}
	public void turnOn(){
		on = true;
	}
	public void turnOff(){
		on = false;
	}
}

public static void main(String []args){

    Computer pc1 = new Computer("Intern Computer");
	Computer pc2 = new Computer("Kelvin's Computer");
	Computer pc3 = new Computer("Kimberly's Computer");  


	pc2.setRam(128);
	pc2.setStorage(SSD);
	pc2.turnOn();
}