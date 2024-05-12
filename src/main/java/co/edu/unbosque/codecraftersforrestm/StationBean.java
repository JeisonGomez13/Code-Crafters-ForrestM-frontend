package co.edu.unbosque.codecraftersforrestm;

import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class StationBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String stationName;
	private String transmissionMode;
	private String music;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String agregarStation() {
		Station station = new Station();
		station.setStationName(stationName);
		station.setTransmissionMode(transmissionMode);
		station.setMusic(music);
		int respuesta = 0;
		try {
			respuesta = TestJSON.postJSONStation(station);
			if (respuesta == 200) {

				return "opciones.xhtml"; 
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

	public ArrayList<Station> listarStation() {
		ArrayList<Station> lista = new ArrayList<>();
		try {
			lista = TestJSON.getJSONStation();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	public String agregarYListar() {
		agregarStation();
		listarStation();
		return "opciones.xhtml";
	}
}
