package StreamingPlatform;
import java.util.ArrayList;

public class PlateFormStreaming {
	private ArrayList<Media> catalogue= new ArrayList<>();
	public void ajouterMedia(Media m) {
		catalogue.add(m);
	}
	public void afficherCatalogue() {
		System.out.println("\n========== CATALOGUE ==========");
		for (Media m: catalogue) {
			System.out.println(m.getDescription());
			if (m instanceof Serie) {
				Serie s= (Serie) m;
				for (Saison saison: s.getSaisons()) {
					System.out.println(saison.getDescription());
				}
			}
		}
		System.out.println("==========================\n");
	}
	public void lireTousLesLecturables() {
        System.out.println("\n========== LECTURE ==========");
        for (Media m: catalogue) {
            if (m instanceof Lecturable) {
                ((Lecturable) m).lire();
            } else if (m instanceof Serie) {
                Serie serie= (Serie) m;
                for (Saison saison: serie.getSaisons()) {
                    for (Episode ep: saison.getEpisodes()) {
                        ep.lire();
                    }
                }
            }
        }
        System.out.println("================================\n");
    }
	public void noterToutNotable(int note) {
		for (Media m: catalogue) {
			if (m instanceof Notable) {
				((Notable)m).noter(note);
			}
		}
	}
	public void telechargerToutTelechargeable() {
		for (Media m: catalogue) {
			if (m instanceof Telechargeable) {
				((Telechargeable)m).telecharger();
			}
		}
	}
}
