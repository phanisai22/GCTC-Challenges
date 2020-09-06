package com.oops.miniproject;

public class Video {
	String videoName;
	boolean checkout = true;
	int rating;	
	
	public Video() {
	}
	
	public Video(String videoName) {
		this.videoName = videoName;
	}
	
	public String getVideoName() {
		return videoName;
	}
	
	public boolean doCheckout() {
		if(checkout) {
			checkout = false;
			return true;
		}
		
		System.out.println("Video \""+ videoName +"\" is already checked out");
		return false;
		
	}
	
	public boolean doReturn() {
		if(!checkout) {
			checkout = true;
			return true;
		}
		System.out.println("Video \""+ videoName +"\" is available.");
		return false;
}
	
	public void receiveRating(int rating) {
		this.rating = rating;
	}
	
	public int getRating() {
		return rating;
	}

	public boolean getCheckout() {
		return checkout;
	}

}
