package com.t4b.test.java.dp.sp.ap;

class VideoPlayer implements VideoPlayerIntf {
	@Override
	public void playVideo(String fileName) {
		System.out.println("Playing. Name: " + fileName);
	}
}