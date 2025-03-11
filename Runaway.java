import java.util.ArrayList;
import jm.JMC;
import jm.music.data.Note;
import jm.music.data.Part;
import jm.music.data.Phrase;
import jm.music.data.Score;
import jm.util.Play;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to store the notes
        ArrayList<Note> notes = new ArrayList<Note>();
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.DS4, 1.5));
        notes.add(new Note(JMC.E6, 1.3));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.E6, 1.5));
        notes.add(new Note(JMC.CS5, 1.5));
        notes.add(new Note(JMC.CS6, 1.5));
        notes.add(new Note(JMC.CS6, 1.5));
        notes.add(new Note(JMC.CS6, 1.5));
        // Create a Score object to store the notes
        Score score = new Score("Intro of Runaway by Kanye West");
        // Create a Part object to store the phrases
        Part part = new Part("My Part!", JMC.PIANO);
        // Create a Phrase object to store the notes
        Phrase phrase = new Phrase();
        // Add the notes from the ArrayList to the phrase
        for (Note note : notes) {
            phrase.add(note);
        }
        // Add the phrase to the part
        part.addPhrase(phrase);
        // Add the part to the score
        score.addPart(part);
        // Play the score
        Play.midi(score);
    }
}
