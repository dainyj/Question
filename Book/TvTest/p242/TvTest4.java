package p242;
import p235.Tv;
public class TvTest4 {

	public static void main(String[] args) {
		Tv[] tvArr = new Tv[3];
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();
			tvArr[i].setchannel = i + 10;
		}
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d\n", i, tvArr[i].getchannel);
		}
	}

}
