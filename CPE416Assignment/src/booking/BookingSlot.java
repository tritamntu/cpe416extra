package booking;

public class BookingSlot {
	private TimePoint startTime;
	private Duration interval;
	private int confirmationId;
	
	//constructor
	public BookingSlot(TimePoint tp, Duration dr) {
		startTime = new TimePoint(tp.getDate(), tp.getHour(), tp.getMin());
		interval = new Duration(dr.getDay(), dr.getHour(), dr.getMin());
	}
	
	public int compareTime(TimePoint tp) {
		return this.startTime.compareTime(tp);
	}
	
	public int compareTime(BookingSlot slot) {
		return this.startTime.compareTime(slot.startTime);
	}
	
	// get and set method
	
	// get a update slot from this slot
	public BookingSlot getUpdateSlot(Duration dr) {
		BookingSlot updateSlot = null;
		TimePoint updateTP = new TimePoint(this.startTime, dr);
		updateSlot = new BookingSlot(updateTP, this.interval);
		return updateSlot;
	}
	
	public String toString() {
		String printStr = "Start at: " + this.startTime.toString() + "\n";
		printStr += "Duration: " + this.interval.getDay() + " day(s), " 
		         + this.interval.getHour() + " hour(s),"
		         + this.interval.getMin() + " min(s)";
		return printStr;
	}
	
	// get EndTime Method
	public TimePoint getEndTime() {
		return new TimePoint(startTime, interval);
	}
	
	public int getStartDate() {
		return this.startTime.getDate();
	}
	
	public int getStartHour() {
		return this.startTime.getHour();
	}
	
	public int getStartMin() {
		return this.startTime.getMin();
	}
	
	public int getIntervalDay() {
		return this.interval.getDay();
	}
	
	public int getIntervalHour() {
		return this.interval.getHour();
	}
	
	public int getIntervalMin() {
		return this.interval.getMin();
	}
	
	public int getConfirmationId() {
		return this.confirmationId;
	}
	
	public void setConfirmationId(int confirmationId) {
		this.confirmationId = confirmationId;
	}
}
