package recursos;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Sonidos {
	private final Clip sonidoBomb;
	private final Clip sonidoExplocion;
	private final Clip sonidoIntro;
	private final Clip sonidoDisparo;
	private final Clip sonidoGameOver;
	private final Clip sonidoWin;

	public Sonidos() {
		sonidoBomb=cargarSonido("src/sounds/bomb.wav");
		sonidoExplocion = cargarSonido("src/sounds/Explosion3.wav");
		sonidoIntro = cargarSonido("src/sounds/intro2.wav");
		sonidoDisparo = cargarSonido("src/sounds/disparo.wav");
		sonidoGameOver = cargarSonido("src/sounds/fail.wav");
		sonidoWin = cargarSonido("src/sounds/win.wav");
	}

	private static Clip cargarSonido(final String ruta) {
		Clip clip = null;

		try {

			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(ruta).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clip;
	}

	public void reproducirSonido(Clip sonido) {
		sonido.stop();
		sonido.flush();
		sonido.setMicrosecondPosition(0);
		sonido.start();
	}

	public void reproducirIntro() {
		reproducirSonido(sonidoIntro);
	}
	
	public void reproducirBomba() {
		reproducirSonido(sonidoBomb);
	}

	public void reproducirExplo() {
		reproducirSonido(sonidoExplocion);
	}

	public void reproducirDiparo() {
		reproducirSonido(sonidoDisparo);
	}

	public void reproducirFail() {
		reproducirSonido(sonidoGameOver);
	}

	public void reproducirWin() {
		reproducirSonido(sonidoWin);
	}
}
