package co.edu.unbosque.codecraftersforrestm;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.ManagedProperty;

import javax.faces.bean.SessionScoped;

import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.util.List;

@ManagedBean

@SessionScoped

public class MusicPlayerBean {

	private Player player;
	private Thread playerThread;
	private boolean paused = false;

	//////////////////

	private String currentSongPath; 
	private String currentImage;
	private String currentArtist;
	private String currentSong;

	private boolean playing = false;

	private int currentSongPathPathIndex = 0; 
	private int currentImageIndex = 0;
	private int currentArtistIndex = 0;
	private int currentSongIndex = 0;

	@ManagedProperty("#{trackBean}")

	private TrackBean trackBean;

	private List<String> songPaths;
	private List<String> imagePaths;
	private List<String> artists;
	private List<String> songs;

	public MusicPlayerBean() {
		// TODO Auto-generated constructor stub
	}

	public MusicPlayerBean(String path) {

	}

	@PostConstruct

	public void init() {

		songPaths = trackBean.getSongPaths();
		imagePaths = trackBean.getImagePaths();
		artists = trackBean.getArtists();
		songs = trackBean.getSongs();

		if (!songPaths.isEmpty()) {

			currentSongPath = songPaths.get(0);
			currentImage = imagePaths.get(0);
			currentArtist = artists.get(0);
			currentSong = songs.get(0);
		}

	}

	public void updatecurrentSongPath(String newSong) {

		setcurrentSongPath(newSong);
		play();
	}

	public void togglePlayPause() {
	
		if (!playing) {
			playing = true;
			if (currentSongPath != null && !currentSongPath.isEmpty()) {
				if (!paused) {
					play(); 
				} else {
					resume(); 
				}
			} else {
			}
		} else {
		
			pause();
			playing = false;
		}
	}

	public void play() {
		try {
			FileInputStream fis = new FileInputStream(currentSongPath);
			player = new Player(fis);
			playerThread = new Thread(() -> {
				try {
					player.play();
				} catch (Exception e) {
				}
			});
			playerThread.start();
		} catch (Exception e) {
		}

	}

	public void pause() {
		if (player != null && playerThread != null && playerThread.isAlive()) {
			player.close(); 
			paused = true;
		}
	}

	public void resume() {
		if (paused) {
			paused = false;
			play();
		}
	}

	public void skipSong() {

		currentSongPathPathIndex++;
		currentImageIndex++;
		currentArtistIndex++;
		currentSongIndex++;

		if (currentSongPathPathIndex >= songPaths.size()) {

			currentSongPathPathIndex = 0;
			currentImageIndex = 0;
			currentArtistIndex = 0;
			currentSongIndex = 0;

		}

		currentSongPath = songPaths.get(currentSongPathPathIndex);
		currentImage = imagePaths.get(currentImageIndex);
		currentArtist = artists.get(currentArtistIndex);
		currentSong = songs.get(currentSongIndex);

		togglePlayPause();

		togglePlayPause();

	}

	public void backwardSong() {

		if (currentSongPathPathIndex > 0) {
			currentSongPathPathIndex--;
			currentImageIndex--;
			currentArtistIndex--;
			currentSongIndex--;
		} else {
			
			return;
		}
		currentSongPath = songPaths.get(currentSongPathPathIndex);
		currentImage = imagePaths.get(currentImageIndex);
		currentArtist = artists.get(currentArtistIndex);
		currentSong = songs.get(currentSongIndex);

		togglePlayPause();

		togglePlayPause();

	}

	public String getCurrentSongPath() {
		return currentSongPath;
	}

	public void setCurrentSongPath(String currentSongPath) {
		this.currentSongPath = currentSongPath;
	}

	public String getCurrentSong() {
		return currentSong;
	}

	public void setCurrentSong(String currentSong) {
		this.currentSong = currentSong;
	}

	public int getCurrentSongPathPathIndex() {
		return currentSongPathPathIndex;
	}

	public void setCurrentSongPathPathIndex(int currentSongPathPathIndex) {
		this.currentSongPathPathIndex = currentSongPathPathIndex;
	}

	public int getCurrentImageIndex() {
		return currentImageIndex;
	}

	public void setCurrentImageIndex(int currentImageIndex) {
		this.currentImageIndex = currentImageIndex;
	}

	public int getCurrentArtistIndex() {
		return currentArtistIndex;
	}

	public void setCurrentArtistIndex(int currentArtistIndex) {
		this.currentArtistIndex = currentArtistIndex;
	}

	public int getCurrentSongIndex() {
		return currentSongIndex;
	}

	public void setCurrentSongIndex(int currentSongIndex) {
		this.currentSongIndex = currentSongIndex;
	}

	public List<String> getImagePaths() {
		return imagePaths;
	}

	public void setImagePaths(List<String> imagePaths) {
		this.imagePaths = imagePaths;
	}

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	public String getCurrentArtist() {
		return currentArtist;
	}

	public void setCurrentArtist(String currentArtist) {
		this.currentArtist = currentArtist;
	}

	public String getCurrentImage() {
		return currentImage;
	}

	public void setCurrentImage(String currentImage) {
		this.currentImage = currentImage;
	}

	public String getcurrentSongPath() {

		return currentSongPath;

	}

	public void setcurrentSongPath(String currentSongPath) {

		this.currentSongPath = currentSongPath;

	}

	public boolean isPlaying() {

		return playing;

	}

	public int getcurrentSongPathPathIndex() {

		return currentSongPathPathIndex;

	}

	public void setcurrentSongPathPathIndex(int currentSongPathPathIndex) {

		this.currentSongPathPathIndex = currentSongPathPathIndex;

	}

	public TrackBean getTrackBean() {

		return trackBean;

	}

	public void setTrackBean(TrackBean trackBean) {

		this.trackBean = trackBean;

	}

	public List<String> getSongPaths() {

		return songPaths;

	}

	public void setSongPaths(List<String> songPaths) {

		this.songPaths = songPaths;

	}

	public void setPlaying(boolean playing) {

		this.playing = playing;

	}

}