package StreamingPlatform;

public abstract class Media {
	//attributs protegés  
	protected int id;
	protected String titre;
	protected String genre;
	//constructeurs
	public Media(int id, String titre, String genre) {
		this.id = id;
		this.genre = genre;
		this.titre = titre;}
	//methodes
	public int getId() {return id;}
	public String getTitre() {return titre;}
	public String getGenre() {return genre;}
	public abstract int getDureeMinutes();
	public String getDescription() {
		return "[" + titre + " | Genre: " + genre + " |Duree: "+ getDureeMinutes() + "min ]";
	}
	public void lire() {
		// TODO Auto-generated method stub
		
	}
	public void telecharger() {
		// TODO Auto-generated method stub
		
	}
}
