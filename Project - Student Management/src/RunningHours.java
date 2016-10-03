
public class RunningHours 
{
	public enum DAY {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	private DAY day;
	private Integer from, to;
	
	public RunningHours (DAY day, Integer from, Integer to) {
		this.day = day;
		this.from = from;
		this.to = to;
	}
	
	@Override
	public String toString(){
		return "RunningHours [day=" + day + ", from=" + from + ", to=" + to + ", isAllDay=" + isAllDay + "]";
	}

}
