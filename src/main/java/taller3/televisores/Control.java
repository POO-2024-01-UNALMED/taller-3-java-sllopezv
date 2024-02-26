package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tv) {
		setTv(tv);
		tv.setControl(this);
	}
	
	// Getters
	public TV getTv() {
		return tv;
	}
	
	// Setters
	public void setTv(TV tv) {
		this.tv = tv;
	}
	
	// Métodos relacionados al tv: turnOn, turnOff, canalUp, canalDown, volumenUp, volumenDown, setCanal y setVolumen.
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
	}
}
