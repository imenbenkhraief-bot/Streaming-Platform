package StreamingPlatform;
import java.util.ArrayList;

public class Saison extends Media implements Notable{
	private int numero;
	private ArrayList<Episode> episodes= new ArrayList<>();
	private ArrayList<Integer> notes= new ArrayList<>();
	public Saison (int numero) {
		super(numero, "Saison "+ numero, "");
		this.numero= numero;
	}
	public void ajouterEpisode (Episode e) {
		episodes.add(e);
	}
	public ArrayList<Episode> getEpisodes(){
		return episodes;
	}
	public int getNumero() { return numero;}
	@Override
	public int getDureeMinutes() {
		int total= 0;
		for (Episode e: episodes) total+= e.getDureeMinutes();
		return total;
	}
	@Override
	public void noter (int etoiles) {
		notes.add(etoiles);
		System.out.println("Note "+etoiles+ " ajoutee a la saison "+ numero);
	}
	@Override
	public double getNoteMoyenne() {
		if (notes.isEmpty()) return 0.0;
		int somme= 0;
		for (int n: notes) somme+= n;
		return (double) somme/notes.size();
	}
	@Override
	public String getDescription() {
		return "Saison "+ numero+ " | "+ episodes.size()+ " episodes | Duree: "+ getDureeMinutes()+ "min";
	}
}
