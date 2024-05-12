package co.edu.unbosque.codecraftersforrestm;

public class AllSongs {

	private long id;
	private String genre;
	private String nameMusic;
	private String nameArtist;
	private String fileMP3;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getNameMusic() {
		return nameMusic;
	}

	public void setNameMusic(String nameMusic) {
		this.nameMusic = nameMusic;
	}

	public String getNameArtist() {
		return nameArtist;
	}

	public void setNameArtist(String nameArtist) {
		this.nameArtist = nameArtist;
	}

	public String getFileMP3() {
		return fileMP3;
	}

	public void setFileMP3(String fileMP3) {
		this.fileMP3 = fileMP3;
	}

	public AllSongs() {
		super();
	}

	public AllSongs(Integer id, String genre, String nameMusic, String nameArtist, String fileMP3) {
		super();
		this.id = id;
		this.genre = genre;
		this.nameMusic = nameMusic;
		this.nameArtist = nameArtist;
		this.fileMP3 = fileMP3;
	}

}
