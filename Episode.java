package StreamingPlatform;
import java.util.ArrayList;

public class Episode extends Media implements Lecturable, Notable{
	//attribut
	public int duree;
	//methodes
	private ArrayList<Integer> notes= new ArrayList<>();
	public Episode (int id, String titre, String genre, int duree) {
		super(id, titre, genre);
		this.duree = duree;
	}
	@Override
	public int getDureeMinutes() {
		return duree;
	}
	@Override
	public void lire() {
		System.out.println("Lecture de l'episode: "+ titre);
	}
	@Override
	public void noter(int etoiles) {
		notes.add(etoiles);
		System.out.println("Note " + etoiles+ "ajouter l'episode "+ titre);
	}
	@Override
	public double getNoteMoyenne() {
		if (notes.isEmpty()) return 0.0;
		int somme= 0;
		for (int n: notes) somme+=n;
		return (double) somme/ notes.size();
		}
}
