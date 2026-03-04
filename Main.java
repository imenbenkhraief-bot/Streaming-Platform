package StreamingPlatform;

public class Main {

	public static void main(String[] args) {
        Episode ep1 = new Episode(1, "Pilot",     "Drama", 55);
        Episode ep2 = new Episode(2, "Episode 2", "Drama", 48);
        Episode ep3 = new Episode(3, "Finale",    "Drama", 62);

        Saison saison1 = new Saison(1);
        saison1.ajouterEpisode(ep1);
        saison1.ajouterEpisode(ep2);
        saison1.ajouterEpisode(ep3);

        Serie serie = new Serie(10, "Game of Java", "Fantasy");
        serie.ajouterSaison(saison1);
        
        Film film = new Film(20, "Titanic", "Romance", 195);
        BandeAnnonce ba = new BandeAnnonce(30, "Trailer Titanic", "Romance", 2);
        
        PlateFormStreaming plateforme = new PlateFormStreaming();
        plateforme.ajouterMedia(serie);
        plateforme.ajouterMedia(film);
        plateforme.ajouterMedia(ba);
        
        plateforme.afficherCatalogue();
        plateforme.lireTousLesLecturables();
        
        film.noter(5);
        film.noter(4);
        saison1.noter(3);
        saison1.noter(5);
        
        System.out.println("\n========== MOYENNES ==========");
        System.out.println("Moyenne Film: " + film.getNoteMoyenne());
        System.out.println("Moyenne Saison1: " + saison1.getNoteMoyenne());
        System.out.println("=================================\n");
        
        plateforme.telechargerToutTelechargeable();
	}

}
