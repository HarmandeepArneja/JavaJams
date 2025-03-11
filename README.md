# JavaJams
This Java project generates the intro melody of "Runaway" by Kanye West using the JM (Java Music) library. It demonstrates how to create and manipulate music notes, phrases, and parts, ultimately producing a MIDI score of the iconic intro.

# Runaway Intro Tune in Java

This Java project replicates the intro melody of the popular song "Runaway" by Kanye West. It uses the **JM (Java Music)** library to create a MIDI sequence representing the intro of the song. The project includes code that generates the notes, organizes them into phrases and parts, and then plays the tune back using MIDI.

## Features

- **MIDI Composition**: The intro melody of "Runaway" is generated using the `Note` and `Phrase` classes from the JM library.
- **Customizable Music**: The notes and rhythms can be easily modified to experiment with different melodies.
- **MIDI Playback**: Uses the `Play.midi()` method from the JM library to play the generated melody.

## Prerequisites

Before running the code, ensure that you have the following:

- Java Development Kit (JDK) installed on your system.
- JM Library (Java Music) in your project.

## How It Works

- **Notes**: The code creates a list of `Note` objects, each with a specific pitch and duration. The pitch corresponds to the notes in the "Runaway" intro, and the durations specify how long each note lasts.
- **Phrase**: The notes are added to a `Phrase`, which is a musical unit that contains a sequence of notes.
- **Part**: The `Phrase` is placed into a `Part`, which represents a musical instrument (in this case, the piano).
- **Score**: The `Part` is then added to a `Score`, which holds the entire composition.
- **Playback**: The final step is playing the composition using `Play.midi()`.

## How to Run

1. Clone this repository to your local machine.
2. Make sure you have the JM library included in your project dependencies.
3. Compile and run the `Runaway.java` file.
4. The intro melody of "Runaway" will be played through MIDI.

## Output

The output of running this code is the piano intro of "Runaway" by Kanye West, played back as a MIDI file.
