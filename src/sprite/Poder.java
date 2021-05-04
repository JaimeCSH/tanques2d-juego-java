package sprite;

public class Poder extends Sprite {

	// El tipos de poder
	private final int VIDA_EXTRA=1;
	private final int BOMBA_DESTRUCTORA=2;

	// El tipo de poder, ej 1 para ganar una vida extra;
	private int tipo;

	public Poder(int x, int y, int tipo) {
		super(x, y);
		this.tipo = tipo;
		initPoder();
	}

	private void initPoder() {
		if (tipo == VIDA_EXTRA) {
			loadImage("src/img/TankVida.png");
		} else if (tipo == BOMBA_DESTRUCTORA) {
			loadImage("src/img/bomba.png");
		}
		getImageDimensions();
	}

	public int getTipo() {
		return tipo;
	}

}
