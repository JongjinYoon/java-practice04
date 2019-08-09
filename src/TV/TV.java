package TV;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		setChannel(channel);
		setVolume(volume);
		isPower();
	}
	
	public TV() {
		
	}
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	
	
	public void status() {
		System.out.println( "TV [channel=" + channel + ", volume=" + volume + ", power=" + power + "]");
	}

	public void power(boolean b) {
		this.power = b;
	}

	public void volume(int i) {
		if(i > 100)
			setVolume(100);
		else if(i < 0)
			setVolume(0);
		else
			setVolume(i);
	}
	
	public void volume(boolean up) {
		if(up)
			setVolume(volume+1);
		else
			setVolume(volume-1);
	}

	public void channel(int i) {
		if(i > 255)
			setChannel(255);
		else if(i < 0)
			setChannel(0);
		else
			setChannel(i);
	}
	
	public void channel(boolean up) {
		if(up)
			setChannel(channel+1);
		
		else
			setChannel(channel-1);
	}
	
}
