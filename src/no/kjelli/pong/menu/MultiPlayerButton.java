package no.kjelli.pong.menu;

import org.newdawn.slick.Color;

import no.kjelli.generic.input.AbstractButton;
import no.kjelli.pong.Pong;

public class MultiPlayerButton extends AbstractButton {
	public final static float WIDTH = Logo.WIDTH, HEIGHT = 50;
	private static final int COOLDOWN_MAX = 10;
	private Pong game;
	private int cooldown = COOLDOWN_MAX;

	public MultiPlayerButton(float x, float y, Pong game) {
		super(x, y, WIDTH, HEIGHT, "FLERSPILLER", new Color(Color.darkGray),
				new Color(Color.black), new Color(Color.gray));
		this.game = game;
	}

	@Override
	protected void released(int mouseButton) {
		game.initMultiPlayer();
		destroy();
	}

	@Override
	protected void clicked(int mouseButton) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		if (cooldown > 0)
			cooldown--;
	}

}
