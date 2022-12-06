package p324;

public class TV_VCR {

	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		System.out.println(tvcr.power);
		tvcr.power();
		System.out.println(tvcr.power);
		tvcr.channelUp();
		tvcr.channelDown();
		tvcr.play();
		tvcr.stop();
		tvcr.rew();
		tvcr.ff();
	}

}
