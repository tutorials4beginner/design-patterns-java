package com.t4b.test.java.dp.sp.ap;

class MediaPlayer implements MediaPlayerIntf {

	AudioPlayerIntf audioPlayer = new AudioPlayer();
	VideoPlayerIntf videoPlayer = new VideoPlayer();

	public MediaPlayer() {
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("avi")) {
			videoPlayer.playVideo(fileName);
		} else if (audioType.equalsIgnoreCase("mp3")) {
			audioPlayer.playAudio(fileName);
		}
	}
}