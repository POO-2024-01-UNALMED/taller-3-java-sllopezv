package taller3.televisores;

public class TV {
	private int canal;
	private int precio;
	private int volumen;
	private boolean estado;
	private Marca marca;
	private Control control;
	private static int numTV;
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.volumen = 1;
		this.precio = 500;
		
		TV.numTV++;
	}
	
	// Getters	
	public int getCanal() {
		return canal;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public Marca getMarca() {
        return marca;
    }
	
	public boolean getEstado() {
		return estado;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	// Setters
	public void setCanal(int canal) {
		if (this.estado) {
			if (canal >= 1 && canal <= 120) {
				this.canal = canal;
			}
		}
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public void setVolumen(int volumen) {
		if (this.estado) {
			if (volumen >= 0 && volumen <= 7) {
				this.volumen = volumen;
			}
		}
	}
	
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}
	
	// Métodos estado
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	// Métodos canal
	public void canalUp() {
		if (this.estado) {
			if (this.canal < 120) {
				this.canal++;
			}
		}
	}
	
	public void canalDown() {
		if (this.estado) {
			if (this.canal > 1) {
				this.canal--;
			}
		}
	}
	
	// Métodos volumen
	public void volumenUp() {
		if (this.estado) {
			if (this.volumen < 7) {
				this.volumen++;
			}
		}
	}
	
	public void volumenDown() {
		if (this.estado) {
			if (this.volumen > 0) {
				this.volumen--;
			}
		}
	}

}
