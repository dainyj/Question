package p235;

public class Tv {
	private String Tv;
	private boolean power;
	private int channel;
	
	void setChannel() {
		
	}
	void power() {
		power = !power;
	}

	 public void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
	public int setchannel;
	public int getchannel;

}
