package com.OOPS.MiniProject;

import java.util.ArrayList;

public class VideoStore extends Video {
	
	ArrayList<Video> store = new ArrayList<>();
	
	public void addVideo(String name) {
		store.add(new Video(name));
	}
	
	public boolean doCheckout(String name) {
		for (Video video : store) {
			if (name.equals(video.getVideoName()))
				return video.doCheckout();
		}
		System.out.println("Video not found.");
		return false;
	}
	
	public boolean doReturn(String name) {
		for (Video video : store) {
			if (name.equals(video.getVideoName()))
				return video.doReturn();
		}
		
		
		System.out.println("Video not found.");
		return false;
	}
	
	public boolean receiveRating(String name, int rating) {
		for (Video video : store) {
			if (name.equals(video.getVideoName())) {
				video.receiveRating(rating);
				return true;
			}
		}
		System.out.println("Video not found");
		return false;
	}
	
	public void listInventory() {
		System.out.format("%-20s%-20s%-20s\n", "Video Name", "CheckOut Status", "Rating");
		for (Video video : store) {
			System.out.format("%-20s%-20s%-20s\n", video.getVideoName(), video.getCheckout(), video.getRating());
		}
		
		System.out.println();
	}
	
}
