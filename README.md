# Streaming Platform – Java OOP Project

This project models a media streaming service where users can browse a catalogue of content, play media, rate it, and download films. It includes three types of media — **Films**, **Series** (with seasons and episodes), and **Trailers** — all managed through a central `PlateFormStreaming` catalogue.

---

## Project Structure

```
src/StreamingPlatform/
├── Media.java               # Abstract base class for all media
├── Film.java                # A movie: playable, ratable, downloadable
├── Serie.java               # A TV series made up of seasons
├── Saison.java              # A season containing episodes
├── Episode.java             # A single episode: playable & ratable
├── BandeAnnonce.java        # A trailer: playable only
├── PlateFormStreaming.java   # The platform catalogue & operations
├── Lecturable.java          # Interface: lire() — play media
├── Notable.java             # Interface: noter() — rate media
├── Telechargeable.java      # Interface: telecharger() — download media
└── Main.java                # Entry point with demo usage
```

---

## Key OOP Concepts Used

- **Abstract class** – `Media` defines the shared structure for all content types
- **Interfaces** – `Lecturable`, `Notable`, and `Telechargeable` define optional capabilities
- **Inheritance** – `Film`, `Serie`, `Episode`, `BandeAnnonce` all extend `Media`
- **Polymorphism** – The platform iterates over `Media` objects and applies behavior based on interface implementation

---

## How to Run

1. Clone the repository
2. Open in **Eclipse IDE** (or any Java IDE)
3. Run `Main.java`

Or compile and run manually:

```bash
javac src/StreamingPlatform/*.java -d bin/
java -cp bin StreamingPlatform.Main
```

---

## Sample Output

```
========== CATALOGUE ==========
[Game of Java | Genre: Fantasy | Duree: 165min]
Saison 1 | 3 episodes | Duree: 165min
[Titanic | Genre: Romance | Duree: 195min]
[Trailer Titanic | Genre: Romance | Duree: 2min]
==========================

========== LECTURE ==========
Lecture de l'episode: Pilot
Lecture de l'episode: Episode 2
Lecture de l'episode: Finale
Lecture du film: Titanic
Lecture de la bande annonce: Trailer Titanic
================================

========== MOYENNES ==========
Moyenne Film: 4.5
Moyenne Saison1: 4.0
=================================
```

---

## Tech Stack

- **Language:** Java
- **IDE:** Eclipse
- **Paradigm:** Object-Oriented Programming (OOP)

---

## Author

**Imen Ben Khraief**  
University Lab Project
