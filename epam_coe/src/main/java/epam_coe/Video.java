package epam_coe;

public class Video {
	String videoName;
	boolean checkout;
	int rating;
	public Video(String videoName) {
		super();
		this.videoName = videoName;
	}
	public String getName() {
		return videoName;
	}
	public void doReturn(String videoName) {
		this.videoName = videoName;
		checkout=false;
		System.out.println(videoName+"returned successfully");
	}
	public boolean getCheckout() {
		return checkout;
	}
	public void doCheckout() {
		checkout=true;
	}
	public int getRating() {
		return rating;
	}
	public void recieveRating(int rating) {
		this.rating = rating;
	}
	
}
