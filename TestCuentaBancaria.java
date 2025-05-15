package ED4;
class TestCuentaBancaria
{
	public static void main(String args[])
	{
		CuentaBancaria cuenta = new CuentaBancaria("1234521","Director Banco",100.0, 2.5);
		CuentaBancaria cuenta2=new CuentaBancaria("11111111", "Valentin", "1000.0", "5.0");
		System.out.println("Saldo = " + cuenta.getSaldo());
		cuenta.reintegro(50);
		cuenta.ingreso(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
	}
}
