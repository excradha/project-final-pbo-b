package application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class MainSceneController implements Initializable {
	
	@FXML
	private ImageView backgroundMedia;
	
	@FXML
	private MediaView mediaView;
	
	@FXML
	private Button playButton, pauseButton, resetButton;
	
	private File file;
	private Media media;
	private MediaPlayer mediaPlayer;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		file = new File("Eminem - Stan (Lyrics) ft. Dido.mp4");
		media = new Media(file.toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);
		
	}
	
	@FXML
	public void playMedia() {
		
		mediaPlayer.play();
		
	}

	@FXML
	public void pauseMedia() {
		
		mediaPlayer.pause();
		
	}

	@FXML
	public void resetMedia() {
		
		if(mediaPlayer.getStatus() != MediaPlayer.Status.READY) {
			mediaPlayer.seek(Duration.seconds(0.0));
			
		}
		
	}
}
