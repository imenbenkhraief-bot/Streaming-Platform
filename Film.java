package StreamingPlatform;
import java.util.ArrayList;

public class Film extends Media implements Lecturable, Notable, Telechargeable{
	private int duree;
	private ArrayList<Integer> notes= new ArrayList<>();
	public Film(int id, String titre, String genre, int duree) {
		super(id, titre, genre);
		this.duree= duree;
	}
	@Override
	public int getDureeMinutes() {return duree;}
	@Override
	public void lire() {
		System.out.println("Lecture du film: "+titre);
	}
	@Override
	public void noter(int etoiles) {
		notes.add(etoiles);
		System.out.println("Note "+ etoiles+ " ajoutee au film: "+titre);
	}
	@Override
	public double getNoteMoyenne() {
		if (notes.isEmpty()) return 0.0;
		int somme= 0;
		for (int n: notes) somme+= n;
		return (double) somme/notes.size();
	}
	public void telecharger() {
		System.out.println("Telechargement du film: "+titre);
	}
}
