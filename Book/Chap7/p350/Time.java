package p350;

public class Time {
	private int hour, minute, second;

	Time(int hour, int minute, int second) { //set메서드를 이용해서 생성자 만듬.
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() { return hour;	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23) //이 조건에 들어가면 이 메서드에서 빠져나간다.
			return;
		this.hour = hour; //위 조건이 아니면 이 라인을 적용.
	}

	public int getMinute() { return minute;	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() { return second;	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
