package demoConcesionarioCarroUq.model;

public class Camion extends Carro{

	private double capacidadCarga;
	private boolean tieneFrenosAire;
	private String tipoCamion;

	public Camion(String codigo, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, String cilindraje, int numPasajeros, int numPuertas, boolean tieneAireAcondicionado,
			boolean tieneCamReversa, int numBolsasAire, boolean tieneABS, TransmisionVehiculo transmisionVehiculo,
			TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable, boolean esHibridoLigero,
			double capacidadCarga, boolean tieneFrenosAire, String tipoCamion) {
		super(codigo, marca, condicionVehiculo, modelo, cambios, velocidadMax, cilindraje, numPasajeros, numPuertas,
				tieneAireAcondicionado, tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo, tipoVehiculo,
				minAutinomia, minCarga, esEnchufable, esHibridoLigero);
		this.capacidadCarga = capacidadCarga;
		this.tieneFrenosAire = tieneFrenosAire;
		this.tipoCamion = tipoCamion;
	}

	public Camion() {

	}

	public double getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	public boolean isTieneFrenosAire() {
		return tieneFrenosAire;
	}

	public void setTieneFrenosAire(boolean tieneFrenosAire) {
		this.tieneFrenosAire = tieneFrenosAire;
	}

	public String getTipoCamion() {
		return tipoCamion;
	}

	public void setTipoCamion(String tipoCamion) {
		this.tipoCamion = tipoCamion;
	}

//-----------------------------------------------------------------------------------------------------------------------

}
