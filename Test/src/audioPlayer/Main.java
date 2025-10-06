package audioPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {

	public static void main(String[] args) {
		// Audio player. 
		// How to play AUDIO WITH JAVA (.wav, .au, aiff)
		
		String filePath ="src\\Watershed Moment Melodic Background Music Ferco.wav";
		
		File file = new File(filePath);
		
		try(Scanner scanner = new Scanner(System.in); //try with resources when a resource has auto close
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {
			
			
			Clip clip = AudioSystem.getClip();
			clip.open(audioStream);
			
			//System.out.println("No problems detected");
			
			//clip.start();
			
			String response = "";
			
			while(!response.equals("Q")) {
				
				System.out.println("P = PLAY");
				System.out.println("S = STOP");
				System.out.println("R = RESET");
				System.out.println("Q = QUIT");
				
				System.out.print("Enter your choice: ");
				
				response = scanner.next().toUpperCase();
				
				switch(response) {
					case "P" -> clip.start();
					case "S" -> clip.stop();
					case "R" -> clip.setMicrosecondPosition(0);
					case "Q" -> clip.close();
					default -> System.out.println("INVALID CHOICE");
				}
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Audio File not found");	
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Audio File is not Supported");
		} catch (LineUnavailableException e) {
			System.out.println("Unable to access audio resource");
		}catch(IOException e){
			System.out.println("Something went wrong");
		}
		
		finally {
			System.out.println("BYE");
		}

	}

}
