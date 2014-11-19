package pl.shockah.hs.anim;

public abstract class Anim {
	public boolean update(AnimQueue queue) { return true; }
	public void finished(AnimQueue queue) {}
}