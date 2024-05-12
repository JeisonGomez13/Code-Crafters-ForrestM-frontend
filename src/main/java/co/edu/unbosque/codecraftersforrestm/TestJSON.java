package co.edu.unbosque.codecraftersforrestm;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TestJSON {

	private static URL url;
	private static String sitio = "http://localhost:8088/";

	public static ArrayList<Station> getJSONStation() throws IOException, ParseException {
		url = new URL(sitio + "station/listar");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i < inp.length; i++) {
			json += (char) inp[i];
		}
		ArrayList<Station> lista = new ArrayList<Station>();
		lista = parsingStation(json);
		http.disconnect();
		return lista;
	}

	public static ArrayList<Track> getJSONTrack() throws IOException, ParseException {
		url = new URL(sitio + "track/listar");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i < inp.length; i++) {
			json += (char) inp[i];
		}
		ArrayList<Track> lista = new ArrayList<Track>();
		lista = parsingTrack(json);
		http.disconnect();
		return lista;
	}
	
	public static ArrayList<AllSongs> getJSONAllSongs() throws IOException, ParseException {
		url = new URL(sitio + "allSongs/listar");
		HttpURLConnection http = (HttpURLConnection) url.openConnection();
		http.setRequestMethod("GET");
		http.setRequestProperty("Accept", "application/json");
		InputStream respuesta = http.getInputStream();
		byte[] inp = respuesta.readAllBytes();
		String json = "";
		for (int i = 0; i < inp.length; i++) {
			json += (char) inp[i];
		}
		ArrayList<AllSongs> lista = new ArrayList<AllSongs>();
		lista = parsingAllSongs(json);
		http.disconnect();
		return lista;
	}

	public static ArrayList<Station> parsingStation(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Station> lista = new ArrayList<Station>();
		JSONArray stations = (JSONArray) jsonParser.parse(json);
		Iterator i = stations.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			Station station = new Station();

			station.setStationName(innerObj.get("stationName").toString());
			station.setTransmissionMode(innerObj.get("transmissionMode").toString());
			station.setMusic(innerObj.get("music").toString());

			lista.add(station);
		}
		return lista;
	}

	public static ArrayList<Track> parsingTrack(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<Track> lista = new ArrayList<Track>();
		JSONArray tracks = (JSONArray) jsonParser.parse(json);
		Iterator i = tracks.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			Track track = new Track();

			track.setGenre(innerObj.get("genre").toString());
			track.setNameMusic(innerObj.get("nameMusic").toString());
			track.setNameArtist(innerObj.get("nameArtist").toString());
			track.setFileMP3(innerObj.get("fileMP3").toString());

			lista.add(track);
		}
		return lista;
	}

	public static ArrayList<AllSongs> parsingAllSongs(String json) throws ParseException {
		JSONParser jsonParser = new JSONParser();
		ArrayList<AllSongs> lista = new ArrayList<AllSongs>();
		JSONArray tracks = (JSONArray) jsonParser.parse(json);
		Iterator i = tracks.iterator();
		while (i.hasNext()) {
			JSONObject innerObj = (JSONObject) i.next();
			AllSongs allsongs = new AllSongs();

			allsongs.setGenre(innerObj.get("genre").toString());
			allsongs.setNameMusic(innerObj.get("nameMusic").toString());
			allsongs.setNameArtist(innerObj.get("nameArtist").toString());
			allsongs.setFileMP3(innerObj.get("fileMP3").toString());

			lista.add(allsongs);
		}
		return lista;
	}

	public static int postJSONStation(Station station) throws IOException {
		url = new URL(sitio + "station/guardar");

		HttpURLConnection http;
		http = (HttpURLConnection) url.openConnection();
		try {
			http.setRequestMethod("POST");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{" + "\"stationName\":\"" + station.getStationName() + "\",\"transmissionMode\": \""
				+ station.getTransmissionMode() + "\",\"music\": \"" + station.getMusic() + "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}

	public static int postJSONTrack(Track track) throws IOException {
		url = new URL(sitio + "track/guardar");

		HttpURLConnection http;
		http = (HttpURLConnection) url.openConnection();
		try {
			http.setRequestMethod("POST");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{" + "\"genre\":\"" + track.getGenre() + "\",\"nameMusic\": \"" + track.getNameMusic()
				+ "\",\"nameArtist\": \"" + track.getNameArtist() + "\",\"fileMP3\":\"" + track.getFileMP3() + "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}

	public static int postJSONAllSongs(AllSongs allsongs) throws IOException {
		url = new URL(sitio + "allSongs/guardar");

		HttpURLConnection http;
		http = (HttpURLConnection) url.openConnection();
		try {
			http.setRequestMethod("POST");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		http.setDoOutput(true);
		http.setRequestProperty("Accept", "application/json");
		http.setRequestProperty("Content-Type", "application/json");
		String data = "{" + "\"genre\":\"" + allsongs.getGenre() + "\",\"nameMusic\": \"" + allsongs.getNameMusic()
				+ "\",\"nameArtist\": \"" + allsongs.getNameArtist() + "\",\"fileMP3\":\"" + allsongs.getFileMP3()
				+ "\"}";
		byte[] out = data.getBytes(StandardCharsets.UTF_8);
		OutputStream stream = http.getOutputStream();
		stream.write(out);
		int respuesta = http.getResponseCode();
		http.disconnect();
		return respuesta;
	}
}
