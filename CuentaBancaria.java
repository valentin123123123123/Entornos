package ED4;
class CuentaBancaria
{
	//Propiedades
	private String numCuenta;
	private String nomTitular;
	private double saldo;
	private double TipoIntereses;
		
	//Metodos
	//Cambios del punto 11
	public CuentaBancaria(String numCuenta,String nomTitular,double saldo, double tipoIntereses){
		this.numCuenta = numCuenta;
		this.nomTitular = nomTitular;
		ingreso(saldo);
		this.TipoIntereses=tipoIntereses;
			}
	
	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	
	//Metodos Set
	public void setNumCuenta(String numCuenta)
	{
		this.numCuenta = numCuenta;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void setNomTitular(String nomTitular)
	{
		this.nomTitular = nomTitular;
	}
	
	///////////////////////////////////////////////////////////////////////////
	//Cambios del punto 11
	public void setTipoIntereses(double tipo){
		this.TipoIntereses=tipo;
	}
		
	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	
	//Metodos Get
	public String getNumCuenta()
	{
		return numCuenta;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public String getNomTitular()
	{
		return nomTitular;
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public double getSaldo()
	{
		return saldo;
	}
	
	////////////////////////////////////////////////////////////////////////////
	//Cambios del punto 11
	public double getTipoIntereses(){
		return TipoIntereses;
	}	
	////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////
	
	public void ingreso(double cantidad)
	{
		if(cantidad > 0)
			saldo = saldo + cantidad;
			
			else
				System.out.println("ERROR. La Cantidad debe ser >= 0");
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public void reintegro(double cantidad)
	{
		if(cantidad > 0)
		{
			if(cantidad > saldo)
				System.out.println("Saldo Insuficiente");
				
				else
					saldo = saldo - cantidad;
		}
		else
			System.out.println("ERROR. La Cantidad debe ser >= 0");
			
	}
}
