package com.t4b.test.java.dp.sp.ap;

class AudioPlayer implements AudioPlayerIntf {
	@Override
	public void playAudio(String fileName) {
		System.out.println("Playing. Name: " + fileName);
	}
}