package com.nit.interfaceAbstract.Aug30;


interface MediaPlayer{
	public abstract void play();
	public abstract void stop();
	
}

interface AdvancedmediaPlayer extends MediaPlayer{
	public abstract void pause();
}

class MusicPlayer implements AdvancedmediaPlayer{
	
	String title;
	MusicPlayer(String title){
		if(title.equals(""))
		{
			System.out.println("Title is not be empty string.");
		}
		else {
			this.title=title;
			System.out.println("Music Player Started");
		}
	}
	@Override
	public void play() {
		System.out.println("Playing music : "+title);
	}
	
	public void stop() {
		System.out.println("Stopping music : "+title);
	}
	public void pause() {
		System.out.println("Pausing music : "+title);
	}
}


class VideoPlayer implements AdvancedmediaPlayer{
	String title;
	VideoPlayer(String title){
		if(title.equals(""))
		{
			System.out.println("Title is not be empty string.");
		}
		else {
			this.title=title;
			System.out.println("Video Player Started");
		}
	}
	@Override
	public void play() {
		System.out.println("Playing music : "+title);
	}

	@Override
	public void stop() {
		System.out.println("Stopping music : "+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing music : "+title);
	}
	
}

public class MediaPlayerTester {

	public static void main(String[] args) {
		VideoPlayer v=new VideoPlayer("Dhere Dhere");
		v.play();
		v.pause();
		v.stop();
		MusicPlayer m=new MusicPlayer("Despacito");
		m.play();
		m.pause();
		m.stop();
	}

}
