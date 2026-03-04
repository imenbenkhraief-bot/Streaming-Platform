package StreamingPlatform;

public class BandeAnnonce extends Media implements Lecturable{
	private int duree;
	public BandeAnnonce (int id, String titre, String genre, int duree) {
		super(id, titre, genre);
		this.duree=duree;
	}
	@Override
	public int getDureeMinutes() {return duree;}
	@Override
	public void lire() {
		System.out.println("Lecture de la bande annonce: "+titre);
	}
}
