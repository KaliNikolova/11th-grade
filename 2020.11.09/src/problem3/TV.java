package problem3;

public class TV {

	private int channel;
	private int volumeLevel;
	private boolean on;
	
	public TV(){
		channel =1;
		volumeLevel = 1;
		on = false;
	}
	
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	} 
	public void setChannel(int channel) {
		if(channel>120||channel<1) System.out.println("Error");
		else this.channel = channel;
	}
	public void setVolume(int volume) {
		if(volume>7||volume<1)System.out.println("Error");
		else volumeLevel = volume;
	}
	public void channelUp() {
		if(channel<120) channel++;
	}
	public void channelDown() {
		if(channel>1) channel--;
	}
	public void volumeUp() {
		if(volumeLevel<7) volumeLevel++;
	}
	public void volumeDown() {
		if(volumeLevel>1) volumeLevel--;
	}
	public int getVolume() {
		return volumeLevel;
	}
	public int getChannel() {
		return channel;
	}
	public String getOnOff() {
		if(on==true) return "on";
		else return "off";
	}
}
