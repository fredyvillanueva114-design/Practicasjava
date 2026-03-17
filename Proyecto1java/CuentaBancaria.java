package Proyecto1java;

public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private Double saldo;
    private String tipoCuenta;
    private boolean activa;
    private String banco;

    
    public CuentaBancaria(String numeroCuenta,String titular,double saldo,String tipoCuenta,String banco){
        this.numeroCuenta=numeroCuenta;
        this.titular=titular;
        this.saldo=saldo;
        this.tipoCuenta=tipoCuenta;
        this.activa=true;
        this.banco=banco;
    }
    // puro gets
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public Boolean getActiva(){
        return activa;
    }



    public void depositar(double monto){
        if (monto >= 0 ) {
            this.saldo+=monto;
            System.out.println("Nuevo Saldo: "+saldo);
        }
        else{
            throw new IllegalArgumentException("El monto de deposito no puede ser negativo "); // 
        }
    }
    public void retirar(double monto){
        double verificacion=this.saldo-monto;
        if ( verificacion >= 0  ){
            this.saldo-=monto;
            System.out.println("El nuevo saldo seria: "+saldo+" .El monto retirado fue: "+monto);
        } else {
            throw new IllegalArgumentException("Tu saldo no es suficiente: "); // 
        }
    }
    public void desactivarCuenta(){
        this.activa=false;
    }
    public void activarCuenta(){
        this.activa=true;
    }
}
