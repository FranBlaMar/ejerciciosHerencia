package Cuenta;

public class Cuenta {
	
	private double saldo;
	private String numCuenta;
	final static String msg1 = "Imposible cantidad negativa";
	final static String msg2 = "Saldo insuficiente";
	
	
	public Cuenta () {
		
	}
	
	public Cuenta(String numCuenta,double saldo) throws Exception {
		super();
		if (saldo <0) { throw new Exception (msg1);}
		this.saldo = saldo;
		this.numCuenta = numCuenta;
	}
	
	public Cuenta(String numCuenta) {
		super();
		this.saldo = 0;
		this.numCuenta = numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCuenta() {
		return numCuenta;
	}
	
	public void ingreso(double cant) throws Exception{
		if (cant < 0 ) { throw new Exception (msg1);}
		
		this.saldo += cant;
		
	}
	
	public void reintegro(double cant) throws Exception {
		if (cant <= this.saldo && cant >0) {
			this.saldo-=cant;
		}else {
			throw new Exception (msg2);
		}	
	}

	@Override
	public String toString() {
		return "Cuenta: " + numCuenta + ", saldo: " + saldo ;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numCuenta == null) ? 0 : numCuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		if (numCuenta == null) {
			if (other.numCuenta != null)
				return false;
		} else if (!numCuenta.equals(other.numCuenta))
			return false;
		return true;
	}
	
	
	
	
	
	
	

}
