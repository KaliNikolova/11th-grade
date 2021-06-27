package problem3;

public class TestTV {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.setChannel(170);
		tv.setChannel(100);
		tv.setVolume(-1);
		tv.setVolume(3);
		tv.turnOn();
		tv.channelDown();
		System.out.println("The TV is: "+tv.getOnOff());
		System.out.println("Channel: "+tv.getChannel());
		System.out.println("Volume level: "+tv.getVolume());
	}

}
