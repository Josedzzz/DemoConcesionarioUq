package demoConcesionarioCarroUq.model;

public class Sedan extends Carro{

	private double capacidadMaletero;
	private boolean tieneVelocidadCrucero;
	private boolean tieneSensorColision;
	private boolean tieneSensorCruzado;
	private boolean tieneAsistenteCarril;

	public Sedan(String codigo, String precio, String marca, CondicionVehiculo condicionVehiculo, String modelo, int cambios,
			int velocidadMax, TipoVehiculo tipoVehiculo, int minAutinomia, int minCarga, boolean esEnchufable,
			boolean esHibridoLigero, String cilindraje, int numPasajeros, int numPuertas,
			boolean tieneAireAcondicionado, boolean tieneCamReversa, int numBolsasAire, boolean tieneABS,
			TransmisionVehiculo transmisionVehiculo, double capacidadMaletero, boolean tieneVelocidadCrucero,
			boolean tieneSensorColision, boolean tieneSensorCruzado, boolean tieneAsistenteCarril) {
		super(codigo, precio, marca, condicionVehiculo, modelo, cambios, velocidadMax, tipoVehiculo, minAutinomia, minCarga,
				esEnchufable, esHibridoLigero, cilindraje, numPasajeros, numPuertas, tieneAireAcondicionado,
				tieneCamReversa, numBolsasAire, tieneABS, transmisionVehiculo);
		this.capacidadMaletero = capacidadMaletero;
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
		this.tieneSensorColision = tieneSensorColision;
		this.tieneSensorCruzado = tieneSensorCruzado;
		this.tieneAsistenteCarril = tieneAsistenteCarril;
	}

	public Sedan() {

	}

	public double getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(double capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

	public boolean isTieneVelocidadCrucero() {
		return tieneVelocidadCrucero;
	}

	public void setTieneVelocidadCrucero(boolean tieneVelocidadCrucero) {
		this.tieneVelocidadCrucero = tieneVelocidadCrucero;
	}

	public boolean isTieneSensorColision() {
		return tieneSensorColision;
	}

	public void setTieneSensorColision(boolean tieneSensorColision) {
		this.tieneSensorColision = tieneSensorColision;
	}

	public boolean isTieneSensorCruzado() {
		return tieneSensorCruzado;
	}

	public void setTieneSensorCruzado(boolean tieneSensorCruzado) {
		this.tieneSensorCruzado = tieneSensorCruzado;
	}

	public boolean isTieneAsistenteCarril() {
		return tieneAsistenteCarril;
	}

	public void setTieneAsistenteCarril(boolean tieneAsistenteCarril) {
		this.tieneAsistenteCarril = tieneAsistenteCarril;
	}

//-----------------------------------------------------------------------------------------------------------------------

}
