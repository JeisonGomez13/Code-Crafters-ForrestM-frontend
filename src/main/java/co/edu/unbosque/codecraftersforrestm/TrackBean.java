package co.edu.unbosque.codecraftersforrestm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@SessionScoped
public class TrackBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private String genre;
	private String nameMusic;
	private String nameArtist;
	private String fileMP3;
	private Track opcionSeleccionada;
	private String artistSelected;
	private String genreSelected;
	private String image;

	private String selectedMp3;
	private String artist;
	private String song;
	private List<Track> cancionesPredefinidas;
	private List<String> songPaths = new ArrayList<String>();
	private List<String> imagePaths = new ArrayList<String>();
	private List<String> artists = new ArrayList<String>();
	private List<String> songs = new ArrayList<String>();

	private List<Track> cancionesElegidas;

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public List<String> getSongs() {
		return songs;
	}

	public void setSongs(List<String> songs) {
		this.songs = songs;
	}

	public List<String> getImagePaths() {
		return imagePaths;
	}

	public List<String> getArtists() {
		return artists;
	}

	public void setArtists(List<String> artists) {
		this.artists = artists;
	}

	public void setImagePaths(List<String> imagePaths) {
		this.imagePaths = imagePaths;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public List<String> getSongPaths() {
		return songPaths;
	}

	public void setSongPaths(List<String> songPaths) {
		this.songPaths = songPaths;
	}

	public List<Track> getCancionesPredefinidas() {
		return cancionesPredefinidas;
	}

	public void setCancionesPredefinidas(List<Track> cancionesPredefinidas) {
		this.cancionesPredefinidas = cancionesPredefinidas;
	}

	public Track getOpcionSeleccionada() {
		return opcionSeleccionada;
	}

	public void setOpcionSeleccionada(Track opcionSeleccionada) {
		this.opcionSeleccionada = opcionSeleccionada;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getArtistSelected() {
		return artistSelected;
	}

	public List<Track> getCancionesElegidas() {
		return cancionesElegidas;
	}

	public void setCancionesElegidas(List<Track> cancionesElegidas) {
		this.cancionesElegidas = cancionesElegidas;
	}

	public void setArtistSelected(String artistSelected) {
		this.artistSelected = artistSelected;
	}

	public String getGenreSelected() {
		return genreSelected;
	}

	public void setGenreSelected(String genreSelected) {
		this.genreSelected = genreSelected;
	}

	public String getSelectedMp3() {
		return selectedMp3;
	}

	public void setSelectedMp3(String selectedMp3) {
		this.selectedMp3 = selectedMp3;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	///////////////////////////////////////////////////////
	public String verifyMp3() {

		if (fileMP3.equalsIgnoreCase("TuHijoSoy.mp3")) {

			setSelectedMp3("music/TuHijoSoy.mp3");

			setImage("TuHijoSoy.jpg");

			setArtist("Barak");

			setSong("Tu Hijo Soy");

		} else if (fileMP3.equalsIgnoreCase("EternamenteAmor.mp3")) {

			setSelectedMp3("music/EternamenteAmor.mp3");

			setImage("EternamenteAmor.jpg");

			setArtist("Su Presencia");

			setSong("Eternamente Amor");

		} else if (fileMP3.equalsIgnoreCase("VivoEstas.mp3")) {

			setSelectedMp3("music/VivoEstas.mp3");

			setImage("VivoEstas.jpg");

			setArtist("Hillsong");

			setSong("Vivo Estás");

		} else if (fileMP3.equalsIgnoreCase("Fiesta.mp3")) {

			setSelectedMp3("music/Fiesta.mp3");

			setImage("Fiesta.jpg");

			setArtist("Un Corazón ft. Alex Zurdo");

			setSong("Fiesta");

		} else if (fileMP3.equalsIgnoreCase("watr.mp3")) {

			setSelectedMp3("music/watr.mp3");

			setImage("watr.jpg");
			setArtist("Nextwave");

			setSong("We Are The Revolution");

		} else if (fileMP3.equalsIgnoreCase("LaBateria.mp3")) {

			setSelectedMp3("music/LaBateria.mp3");

			setImage("LaBateria.jpg");

			setArtist("Su Presencia");

			setSong("La Bateria");

		} else if (fileMP3.equalsIgnoreCase("oigaMireVea.mp3")) {

			setSelectedMp3("music/oigaMireVea.mp3");

			setImage("OigaMireVea.jpg");

			setArtist("Guayacán Orquesta");

			setSong("Oiga, Mire, Vea");

		} else if (fileMP3.equalsIgnoreCase("PeriodicoDeAyer.mp3")) {

			setSelectedMp3("music/PeriodicoDeAyer.mp3");

			setImage("PeriodicoDeAyer.jpg");

			setArtist("Héctor Lavoe");

			setSong("Periódico De Ayer");

		}

		else if (fileMP3.equalsIgnoreCase("Idilio.mp3")) {

			setSelectedMp3("music/Idilio.mp3");

			setImage("Idilio.jpg");

			setArtist("Willie Colón");

			setSong("Idilio");

		} else if (fileMP3.equalsIgnoreCase("OjosChinos.mp3")) {

			setSelectedMp3("music/OjosChinos.mp3");

			setImage("OjosChinos.jpg");

			setArtist("El Gran Combo de Puerto Rico");
			setSong("Ojos Chinos");

		} else if (fileMP3.equalsIgnoreCase("AnotherBrickInTheWall.mp3")) {

			setSelectedMp3("music/AnotherBrickInTheWall.mp3");

			setImage("AnotherBrickInTheWall.jpg");

			setArtist("Pink Floyd");

			setSong("Another Brick in The Wall (Part 2)");

		} else if (fileMP3.equalsIgnoreCase("HotelCalifornia.mp3")) {

			setSelectedMp3("music/HotelCalifornia.mp3");

			setImage("HotelCalifornia.jpg");

			setArtist("The Eagles");

			setSong("Hotel California");

		} else if (fileMP3.equalsIgnoreCase("WakeMeupWhenSeptemberEnds.mp3")) {

			setSelectedMp3("music/WakeMeupWhenSeptemberEnds.mp3");

			setImage("WakeMeupWhenSeptemberEnds.jpg");

			setArtist("Green Day");

			setSong("Wake Me up When September Ends");

		} else if (fileMP3.equalsIgnoreCase("IntheEnd.mp3")) {

			setSelectedMp3("music/IntheEnd.mp3");

			setImage("IntheEnd.jpg");

			setArtist("Linkin Park");

			setSong("In The End");

		} else if (fileMP3.equalsIgnoreCase("StereoLove.mp3")) {

			setSelectedMp3("music/StereoLove.mp3");

			setImage("StereoLove.jpg");

			setArtist("Edward Maya feat. Jigulina");

			setSong("Stereo Love");

		} else if (fileMP3.equalsIgnoreCase("GiveMeEverything.mp3")) {

			setSelectedMp3("music/GiveMeEverything.mp3");

			setImage("GiveMeEverything.jpg");

			setArtist("Pitbull");

			setSong("Give Me Everything");

		} else if (fileMP3.equalsIgnoreCase("Animals.mp3")) {

			setSelectedMp3("music/Animals.mp3");

			setImage("Animals.jpg");

			setArtist("Martin Garrix");

			setSong("Animals");

		} else if (fileMP3.equalsIgnoreCase("SexyAndIKnowIt.mp3")) {

			setSelectedMp3("music/SexyAndIKnowIt.mp3");

			setImage("SexyAndIKnowIt.jpg");

			setArtist("LMFAO");

			setSong("Sexy And I Know It");

		} else if (fileMP3.equalsIgnoreCase("Criminal.mp3")) {

			setSelectedMp3("music/Criminal.mp3");

			setImage("Criminal.jpg");

			setArtist("Britney Spears");

			setSong("Criminal");

		} else if (fileMP3.equalsIgnoreCase("Baby.mp3")) {

			setSelectedMp3("music/Baby.mp3");

			setImage("Baby.jpg");

			setArtist("Justin Bieber");

			setSong("Baby");

		} else if (fileMP3.equalsIgnoreCase("Unwritten.mp3")) {

			setSelectedMp3("music/Unwritten.mp3");

			setImage("Unwritten.jpg");
			setArtist("Natasha Bedingfield");

			setSong("Unwritten");

		} else if (fileMP3.equalsIgnoreCase("HungUp.mp3")) {

			setSelectedMp3("music/HungUp.mp3");

			setImage("HungUp.jpg");
			setArtist("Maddona");

			setSong("Hung Up");

		} else if (fileMP3.equalsIgnoreCase("SwanLake.mp3")) {

			setSelectedMp3("music/SwanLake.mp3");

			setImage("SwanLake.jpg");
			setArtist("Piotr Ilich Chaikovski");
			setSong("Swan Lake");

		} else if (fileMP3.equalsIgnoreCase("BellasLullaby.mp3")) {

			setSelectedMp3("music/BellasLullaby.mp3");

			setImage("BellasLullaby.jpg");
			setArtist("Stan Whitmire");
			setSong("Bella's Lullaby");
		} else if (fileMP3.equalsIgnoreCase("MoonlightSonata.mp3")) {

			setSelectedMp3("music/MoonlightSonata.mp3");

			setImage("MoonlightSonata.jpg");
			setArtist("Beethoven");
			setSong("MoonLight Sonata");

		} else if (fileMP3.equalsIgnoreCase("FurElise.mp3")) {

			setSelectedMp3("music/FurElise.mp3");

			setImage("FurElise.jpg");
			setArtist("Beethoven");
			setSong("Fur Elise");

		} else if (fileMP3.equalsIgnoreCase("EnTuPelo.mp3")) {

			setSelectedMp3("music/EnTuPelo.mp3");

			setImage("EnTuPelo.jpg");
			setArtist("Javier Solis");
			setSong("En Tu Pelo");

		} else if (fileMP3.equalsIgnoreCase("LaBikina.mp3")) {

			setSelectedMp3("music/LaBikina.mp3");

			setImage("LaBikina.jpg");
			setArtist("Luis Miguel");
			setSong("La Bikina");

		} else if (fileMP3.equalsIgnoreCase("ElCigarrillo.mp3")) {

			setSelectedMp3("music/ElCigarrillo.mp3");

			setImage("ElCigarrillo.jpg");
			setArtist("Ana Gabriel");
			setSong("ElCigarrillo");

		} else if (fileMP3.equalsIgnoreCase("DeCarneYHueso.mp3")) {

			setSelectedMp3("music/DeCarneYHueso.mp3");

			setImage("DeCarneYHueso.jpg");
			setArtist("Helenita Vargas");
			setSong("De Carne Y Hueso");

		} else if (fileMP3.equalsIgnoreCase("AsiFue.mp3")) {

			setSelectedMp3("music/AsiFue.mp3");

			setImage("AsiFue.jpg");
			setArtist("Juan Gabriel");
			setSong("Así Fue");
		}
		return selectedMp3;
	}

	public String agregarCanciones() {
		AllSongs allsongs = new AllSongs();
		allsongs.setGenre(genre);
		allsongs.setNameMusic(nameMusic);
		allsongs.setNameArtist(nameArtist);
		allsongs.setFileMP3(fileMP3);
		int respuesta = 0;
		try {
			respuesta = TestJSON.postJSONAllSongs(allsongs);
			if (respuesta == 200) {

				return "opciones.xhtml";
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String agregarTrack() {
		verifyMp3();
		Track track = new Track();
		track.setGenre(genre);
		track.setNameMusic(nameMusic);
		track.setNameArtist(nameArtist);
		track.setFileMP3(fileMP3);
		int respuesta = 0;
		try {
			respuesta = TestJSON.postJSONTrack(track);
			if (respuesta == 200) {

				songPaths.add(selectedMp3);
				imagePaths.add(image);
				artists.add(artist);
				songs.add(song);
				return "opciones.xhtml";
			} else {
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String agregarLista() {

		Track track = new Track();
		track.setGenre(genre);
		track.setNameMusic(nameMusic);
		track.setNameArtist(nameArtist);
		track.setFileMP3(fileMP3);

		if (cancionesElegidas == null) {
			cancionesElegidas = new ArrayList<>();
		}
		cancionesElegidas.add(track);

		genre = null;
		nameMusic = null;
		nameArtist = null;
		fileMP3 = null;

		return null; // Opcional, dependiendo de cómo quieras manejar la navegación

	}

	public String agregarCancionesYLista() {
		agregarCanciones();
		agregarLista();
		return "opciones.xhtml";
	}

	public List<Track> listarTrack() {
		List<Track> lista = new ArrayList<>();
		try {
			lista = TestJSON.getJSONTrack();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;
	}

	@PostConstruct
	public void init() {
		cancionesPredefinidas = new ArrayList<>();

		Track cancion0 = new Track();
		cancion0.setNameMusic("Selecciona una opción...");
		cancion0.setNameArtist("Selecciona una opción...");
		cancion0.setFileMP3("Selecciona una opción....");
		cancionesPredefinidas.add(cancion0);
		
		Track cancion1 = new Track();
		cancion1.setGenre("Cristiana");
		cancion1.setNameMusic("Tu hijo soy");
		cancion1.setNameArtist("Barak");
		cancion1.setFileMP3("TuHijoSoy.mp3");
		cancionesPredefinidas.add(cancion1);

		Track cancion2 = new Track();
		cancion2.setGenre("Cristiana");
		cancion2.setNameMusic("Eternamente Amor");
		cancion2.setNameArtist("Su presencia");
		cancion2.setFileMP3("EternamenteAmor.mp3");
		cancionesPredefinidas.add(cancion2);

		Track cancion3 = new Track();
		cancion3.setGenre("Cristiana");
		cancion3.setNameMusic("Vivo Estas");
		cancion3.setNameArtist("Hilsong");
		cancion3.setFileMP3("VivoEstas.mp3");
		cancionesPredefinidas.add(cancion3);

		Track cancion4 = new Track();
		cancion4.setGenre("Cristiana");
		cancion4.setNameMusic("Fiesta");
		cancion4.setNameArtist("Un corazon");
		cancion4.setFileMP3("Fiesta.mp3");
		cancionesPredefinidas.add(cancion4);

		Track cancion5 = new Track();
		cancion5.setGenre("Cristiana");
		cancion5.setNameMusic("We are the Revolution");
		cancion5.setNameArtist("Nxtwave");
		cancion5.setFileMP3("watr.mp3");
		cancionesPredefinidas.add(cancion5);

		Track cancion6 = new Track();
		cancion6.setGenre("Cristiana");
		cancion6.setNameMusic("La Bateria");
		cancion6.setNameArtist("Su presencia");
		cancion6.setFileMP3("LaBateria.mp3");
		cancionesPredefinidas.add(cancion6);

		Track cancion7 = new Track();
		cancion7.setGenre("Salsa");
		cancion7.setNameMusic("Oiga, Mire, Vea");
		cancion7.setNameArtist("Guayacan Orquesta");
		cancion7.setFileMP3("oigaMireVea.mp3");
		cancionesPredefinidas.add(cancion7);

		Track cancion8 = new Track();
		cancion8.setGenre("Salsa");
		cancion8.setNameMusic("Periodico De Ayer");
		cancion8.setNameArtist("Hector Lavoe");
		cancion8.setFileMP3("PeriodicoDeAyer.mp3");
		cancionesPredefinidas.add(cancion8);

		Track cancion9 = new Track();
		cancion9.setGenre("Salsa");
		cancion9.setNameMusic("Idilio");
		cancion9.setNameArtist("Willie Colon");
		cancion9.setFileMP3("Idilio.mp3");
		cancionesPredefinidas.add(cancion9);

		Track cancion10 = new Track();
		cancion10.setGenre("Salsa");
		cancion10.setNameMusic("Ojos Chinos");
		cancion10.setNameArtist("El Gran Combo de Puerto Rico");
		cancion10.setFileMP3("ojosChinos.mp3");
		cancionesPredefinidas.add(cancion10);

		Track cancion11 = new Track();
		cancion11.setGenre("Rock");
		cancion11.setNameMusic("Another Brick in The Wall (Part 2)");
		cancion11.setNameArtist("Pink Floyd");
		cancion11.setFileMP3("AnotherBrickInTheWall.mp3");
		cancionesPredefinidas.add(cancion11);

		Track cancion12 = new Track();
		cancion12.setGenre("Rock");
		cancion12.setNameMusic("Hotel California");
		cancion12.setNameArtist("The Eagles");
		cancion12.setFileMP3("HotelCalifornia.mp3");
		cancionesPredefinidas.add(cancion12);

		Track cancion13 = new Track();
		cancion13.setGenre("Rock");
		cancion13.setNameMusic("Wake Me up When September Ends");
		cancion13.setNameArtist("Green Day");
		cancion13.setFileMP3("WakeMeupWhenSeptemberEnds.mp3");
		cancionesPredefinidas.add(cancion13);

		Track cancion14 = new Track();
		cancion14.setGenre("Rock");
		cancion14.setNameMusic("In the End");
		cancion14.setNameArtist("Linkin Park");
		cancion14.setFileMP3("IntheEnd.mp3");
		cancionesPredefinidas.add(cancion14);

		Track cancion15 = new Track();
		cancion15.setGenre("Electronica");
		cancion15.setNameMusic("Stereo Love");
		cancion15.setNameArtist("Edward Maya feat. Jigulina");
		cancion15.setFileMP3("StereoLove.mp3");
		cancionesPredefinidas.add(cancion15);

		Track cancion16 = new Track();
		cancion16.setGenre("Electronica");
		cancion16.setNameMusic("Give Me Everything");
		cancion16.setNameArtist("Pitbull");
		cancion16.setFileMP3("GiveMeEverything.mp3");
		cancionesPredefinidas.add(cancion16);

		Track cancion17 = new Track();
		cancion17.setGenre("Electronica");
		cancion17.setNameMusic("Animals");
		cancion17.setNameArtist("Martin Garrix");
		cancion17.setFileMP3("Animals.mp3");
		cancionesPredefinidas.add(cancion17);

		Track cancion18 = new Track();
		cancion18.setGenre("Electronica");
		cancion18.setNameMusic("Sexy And I Know It");
		cancion18.setNameArtist("LMFAO");
		cancion18.setFileMP3("SexyAndIKnowIt.mp3");
		cancionesPredefinidas.add(cancion18);

		Track cancion19 = new Track();
		cancion19.setGenre("Pop");
		cancion19.setNameMusic("Criminal");
		cancion19.setNameArtist("Britney Spears");
		cancion19.setFileMP3("Criminal.mp3");
		cancionesPredefinidas.add(cancion19);

		Track cancion20 = new Track();
		cancion20.setGenre("Pop");
		cancion20.setNameMusic("Baby");
		cancion20.setNameArtist("Justin Bieber");
		cancion20.setFileMP3("Baby.mp3");
		cancionesPredefinidas.add(cancion20);

		Track cancion21 = new Track();
		cancion21.setGenre("Pop");
		cancion21.setNameMusic("Unwritten");
		cancion21.setNameArtist("Natasha Bedingfield");
		cancion21.setFileMP3("Unwritten.mp3");
		cancionesPredefinidas.add(cancion21);

		Track cancion22 = new Track();
		cancion22.setGenre("Pop");
		cancion22.setNameMusic("Hung Up");
		cancion22.setNameArtist("Madonna");
		cancion22.setFileMP3("HungUp.mp3");
		cancionesPredefinidas.add(cancion22);

		Track cancion23 = new Track();
		cancion23.setGenre("Clasica");
		cancion23.setNameMusic("Swan Lake");
		cancion23.setNameArtist("Piotr llick Chaikovski");
		cancion23.setFileMP3("SwanLake.mp3");
		cancionesPredefinidas.add(cancion23);

		Track cancion24 = new Track();
		cancion24.setGenre("Clasica");
		cancion24.setNameMusic("Bella's Lullaby");
		cancion24.setNameArtist("Stan Whitmire");
		cancion24.setFileMP3("BellasLullaby.mp3");
		cancionesPredefinidas.add(cancion24);

		Track cancion25 = new Track();
		cancion25.setGenre("Clasica");
		cancion25.setNameMusic("Moonlight Sonata");
		cancion25.setNameArtist("Beethoven");
		cancion25.setFileMP3("MoonlightSonata.mp3");
		cancionesPredefinidas.add(cancion25);

		Track cancion26 = new Track();
		cancion26.setGenre("Clasica");
		cancion26.setNameMusic("Fur Elise");
		cancion26.setNameArtist("Beethover");
		cancion26.setFileMP3("FurElise.mp3");
		cancionesPredefinidas.add(cancion26);

		Track cancion27 = new Track();
		cancion27.setGenre("Ranchera");
		cancion27.setNameMusic("En tu pelo");
		cancion27.setNameArtist("Javier Solis");
		cancion27.setFileMP3("EnTuPelo.mp3");
		cancionesPredefinidas.add(cancion27);

		Track cancion28 = new Track();
		cancion28.setGenre("Ranchera");
		cancion28.setNameMusic("La Bikina");
		cancion28.setNameArtist("Luis Miguel");
		cancion28.setFileMP3("LaBikina.mp3");
		cancionesPredefinidas.add(cancion28);

		Track cancion29 = new Track();
		cancion29.setGenre("Ranchera");
		cancion29.setNameMusic("El Cigarrillo");
		cancion29.setNameArtist("Ana Gabriel");
		cancion29.setFileMP3("ElCigarrillo.mp3");
		cancionesPredefinidas.add(cancion29);

		Track cancion30 = new Track();
		cancion30.setGenre("Ranchera");
		cancion30.setNameMusic("De Carne y Hueso");
		cancion30.setNameArtist("Helenita Vargas");
		cancion30.setFileMP3("DeCarneYHueso.mp3");
		cancionesPredefinidas.add(cancion30);

		Track cancion31 = new Track();
		cancion31.setGenre("Ranchera");
		cancion31.setNameMusic("Asi Fue");
		cancion31.setNameArtist("Juan Gabriel");
		cancion31.setFileMP3("AsiFue.mp3");
		cancionesPredefinidas.add(cancion31);

	}

	public void actualizarDatos(AjaxBehaviorEvent e) {
		switch (nameMusic) {
		case "Tu hijo soy":
			setGenre("Cristiana");
			setNameArtist("Barak");
			setFileMP3("TuHijoSoy.mp3");
			break;

		case "Eternamente Amor":
			setGenre("Cristiana");
			setNameArtist("Su presencia");
			setFileMP3("EternamenteAmor.mp3");
			break;

		case "Vivo Estas":
			setGenre("Cristiana");
			setNameArtist("Hilsong");
			setFileMP3("VivoEstas.mp3");
			break;

		case "Fiesta":
			setGenre("Cristiana");
			setNameArtist("Un corazon");
			setFileMP3("Fiesta.mp3");
			break;

		case "We are the Revolution":
			setGenre("Cristiana");
			setNameArtist("Nxtwave");
			setFileMP3("watr.mp3");
			break;

		case "La Bateria":
			setGenre("Cristiana");
			setNameArtist("Su presencia");
			setFileMP3("LaBateria.mp3");
			break;

		case "Oiga, Mire, Vea":
			setGenre("Salsa");
			setNameArtist("Guayacan Orquesta");
			setFileMP3("oigaMireVea.mp3");
			break;

		case "Periodico De Ayer":
			setGenre("Salsa");
			setNameArtist("Hector Lavoe");
			setFileMP3("PeriodicoDeAyer.mp3");
			break;
		case "Idilio":
			setGenre("Salsa");
			setNameArtist("Willie Colon");
			setFileMP3("Idilio.mp3");
			break;
		case "Ojos Chinos":
			setGenre("Salsa");
			setNameArtist("El Gran Combo de Puerto Rico");
			setFileMP3("ojosChinos.mp3");
			break;
		case "Another Brick in The Wall (Part 2)":
			setGenre("Rock");
			setNameArtist("Pink Floyd");
			setFileMP3("AnotherBrickInTheWall.mp3");
			break;
		case "Hotel California":
			setGenre("Rock");
			setNameArtist("The Eagles");
			setFileMP3("HotelCalifornia.mp3");
			break;
		case "Wake Me up When September Ends":
			setGenre("Rock");
			setNameArtist("Green Day");
			setFileMP3("WakeMeupWhenSeptemberEnds.mp3");
			break;
		case "In the End":
			setGenre("Rock");
			setNameArtist("Linkin Park");
			setFileMP3("IntheEnd.mp3");
			break;
		case "Stereo Love":
			setGenre("Electronica");
			setNameArtist("Edward Maya feat. Jigulina");
			setFileMP3("StereoLove.mp3");
			break;
		case "Give Me Everything":
			setGenre("Electronica");
			setNameArtist("Pitbull");
			setFileMP3("GiveMeEverything.mp3");
			break;
		case "Animals":
			setGenre("Electronica");
			setNameArtist("Martin Garrix");
			setFileMP3("Animals.mp3");

			break;
		case "Sexy And I Know It":
			setGenre("Electronica");
			setNameArtist("LMFAO");
			setFileMP3("SexyAndIKnowIt.mp3");

			break;
		case "Criminal":
			setGenre("Pop");
			setNameArtist("Britney Spears");
			setFileMP3("Criminal.mp3");
			break;
		case "Baby":
			setGenre("Pop");
			setNameArtist("Justin Bieber");
			setFileMP3("Baby.mp3");

			break;
		case "Unwritten":
			setGenre("Pop");
			setNameArtist("Natasha Bedingfield");
			setFileMP3("Unwritten.mp3");

			break;
		case "Hung Up":
			setGenre("Pop");
			setNameArtist("Madonna");
			setFileMP3("HungUp.mp3");

			break;
		case "Swan Lake":
			setGenre("Clasica");
			setNameArtist("Piotr llick Chaikovski");
			setFileMP3("SwanLake.mp3");

			break;
		case "Bella's Lullaby":
			setGenre("Clasica");
			setNameArtist("Stan Whitmire");
			setFileMP3("BellasLullaby.mp3");

			break;
		case "Fur Elise":
			setGenre("Clasica");
			setNameArtist("Beethoven");
			setFileMP3("FurElise.mp3");

			break;
		case "Moonlight Sonata":
			setGenre("Clasica");
			setNameArtist("Beethoven");
			setFileMP3("MoonlightSonata.mp3");

			break;

		case "En tu pelo":
			setGenre("Ranchera");
			setNameArtist("Javier Solis");
			setFileMP3("EnTuPelo.mp3");

			break;
		case "La Bikina":
			setGenre("Ranchera");
			setNameArtist("Luis Miguel");
			setFileMP3("LaBikina.mp3");
			break;
		case "El Cigarrillo":
			setGenre("Ranchera");
			setNameArtist("Ana Gabriel");
			setFileMP3("ElCigarrillo.mp3");
			break;
		case "De Carne y Hueso":
			setGenre("Ranchera");
			setNameArtist("Helenita Vargas");
			setFileMP3("DeCarneYHueso.mp3");
			break;
		case "Asi Fue":
			setGenre("Ranchera");
			setNameArtist("Juan Gabriel");
			setFileMP3("AsiFue.mp3");
			break;
		}
	}
}