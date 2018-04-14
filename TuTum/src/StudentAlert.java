import java.time.LocalDateTime;

public class StudentAlert {
	//level of danger
	private int level;
	private String message = "";
	
	private LocalDateTime date;
	
	//constructor
	public StudentAlert(int level, String message, LocalDateTime date) {
		this.level = level;
		this.message = message;
		this.date = date;
	}
	//print method
	public String toString() {
		return (level + "/t" + date.toString());
	}
	//getter for date
	public LocalDateTime getDate() {
		return date;
	}
	//getter for level
	public int getLevel() {
		return level;
	}
	//method to change level
	public void resolveAlert() {
		this.level = 0;
	}
	//
	public void increaseLevel() {
		if(this.level < 3)
			this.level++;
	}
	//method to write message
	public void writeMessage(String message) {
		this.message = message;
	}
	
	
}


	