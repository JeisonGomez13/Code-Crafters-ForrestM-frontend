package co.edu.unbosque.codecraftersforrestm;

public class Station {

	private Integer id;
	private String stationName;
	private String transmissionMode;
	private String music;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStationName() {
		return stationName;
	}

	public void setStationName(String stationName) {
		this.stationName = stationName;
	}

	public String getTransmissionMode() {
		return transmissionMode;
	}

	public void setTransmissionMode(String transmissionMode) {
		this.transmissionMode = transmissionMode;
	}

	public String getMusic() {
		return music;
	}

	public void setMusic(String music) {
		this.music = music;
	}

	public Station() {
		super();
	}

	public Station(Integer id, String stationName, String transmissionMode, String music) {
		super();
		this.id = id;
		this.stationName = stationName;
		this.transmissionMode = transmissionMode;
		this.music = music;
	}

}
