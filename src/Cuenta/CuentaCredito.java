package Cuenta;

public class CuentaCredito extends Cuenta {
	
	private double credito;
	private static final double CREDITODEFECTO = 100;
	private static final double CREDITOMAX=300;
	
	
	public CuentaCredito(String numCuenta) {
		super(numCuenta);
		this.credito = CREDITODEFECTO;
	}
	
	public CuentaCredito(String numCuenta, double credito) {
		super(numCuenta);
		this.credito= credito;
		
	}
	
	public CuentaCredito(String numCuenta, double saldo, double credito) throws Exception  {
		super(numCuenta, saldo);
		this.credito= credito;
		
	}
	
	public CuentaCredito(double saldo, String numCuenta) throws Exception  {
		super(numCuenta, saldo);
		this.credito= CREDITODEFECTO;
		
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
	@Override
	public void reintegro(double cant) throws Exception {
		
		if (cant <=  super.getSaldo() + this.credito && cant > 0) {
			super.setSaldo(super.getSaldo()-cant);
		}else {
			throw new Exception (msg2);
		}
		
	}
	
	@Override
	public String toString() {
		double creditoDisponible ;
		if (super.getSaldo()> 0) {
			creditoDisponible = credito;
		}else
			creditoDisponible = credito + super.getSaldo();
		
		return super.toString() +  " credito diponible: " + creditoDisponible;
	}
	
	
	
	
	
	
	
}
