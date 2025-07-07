# TicTacToe – Java Projekt
# GitHub Repository
https://github.com/SimonaEmilovaSeverelova/TicTacToe

# Projektbeschreibung
Digitale Umsetzung des Spiels Tic-Tac-Toe im Rahmen der Software-Lifecycle-Übung.

# Umgesetzte User Stories
- US1: Spieler können ihre Marker setzen
- US2: Das Spielfeld wird angezeigt
- US3: Unit-Tests für Board
- US4: Spielstart und Gewinnlogik (start(), hasWinner())

# Vorgehensweise bei einer User Story (Beispiel US3 - Board-Tests)
1. User Story im Kanban-Board auf "In Progress" gesetzt
2. Feature-Branch `feature/US3-board-test` erstellt
3. Tests für `Board.java` entwickelt
4. Code gepusht & Commit erstellt:  
   _"Unit-Tests für Board-Klasse implementiert (US3)"_
5. Pull Request gestellt, geprüft & gemerged
6. User Story auf "Done" gesetzt


# GitHub-Prozess

# Feature Branches
- `feature/US1-player-move`
- `feature/US2-board`
- `feature/US3-fake-pr`
- `feature/US4-game-logic`


# Pull Requests
Jede User Story wurde per Pull Request in `main` gemerged (siehe (https://github.com/SimonaEmilovaSeverelova/TicTacToe/pulls?q=is%3Apr+)).

# Tests
# Einheitstests für die `Board`-Klasse:
- `place()`: Position setzen  
- `clear()`: Spiel zurücksetzen  
- `isFull()`: Board voll prüfen
  
  
- Positiv- & Negativfälle vorhanden (siehe `BoardTest.java`)

# Projekt ausführen
```bash
# Startpunkt ist Main.java
# Projekt ist ein Maven-Projekt
mvn compile
mvn exec:java -Dexec.mainClass="org.example.Main"



