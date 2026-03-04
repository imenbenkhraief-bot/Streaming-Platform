package StreamingPlatform;
import java.util.ArrayList;

public class Serie extends Media implements Notable{
	private ArrayList<Saison> saisons= new ArrayList<>();
	private ArrayList<Integer> notes= new ArrayList<>();
	public Serie (int id, String titre, String genre) {
		super(id, titre, genre);
	}
	public void ajouterSaison (Saison s) {
		saisons.add(s);
	}
	public ArrayList<Saison> getSaisons(){return saisons;}
	@Override
	public int getDureeMinutes() {
		int total= 0;
		for (Saison s: saisons) total +=s.getDureeMinutes();
		return total;
	}
	@Override
	public void noter(int etoiles) {
		notes.add(etoiles);
		System.out.println("Note "+etoiles+ " ajoutee a la serie: "+ titre);
	}
	@Override
	public double getNoteMoyenne() {
		if (notes.isEmpty()) return 0.0;
		int somme = 0;
		for (int n:notes) somme+= n;
		return (double) somme/notes.size();
	}
}
