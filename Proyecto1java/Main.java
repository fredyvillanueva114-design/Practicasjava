/*
EJERCICIO: CLASE CUENTA BANCARIA

Crear un archivo llamado: CuentaBancaria.java

Crear una clase llamada CuentaBancaria.

La clase debe tener los siguientes atributos PRIVADOS:

   
numeroCuenta (String)
titular (String)
saldo (double)
tipoCuenta (String)
activa (boolean)
banco (String)

Crear los GETTERS y SETTERS para todos los atributos.

Crear los siguientes métodos:

   
depositar(double monto)
   Este método debe aumentar el saldo.

   
retirar(double monto)
   Este método debe restar dinero del saldo.
   Solo debe permitir retirar si el saldo es suficiente.

   if 
   
mostrarSaldo()
   Debe imprimir el saldo actual.

   
desactivarCuenta()
   Cambia el estado de la cuenta a inactiva.

   
activarCuenta()
   Cambia el estado de la cuenta a activa.

Crear otro archivo llamado Main.java.

En el método main hacer lo siguiente:

   
Crear un objeto de tipo CuentaBancaria.
Usar los setters para asignar valores a los atributos.
Depositar dinero.
Retirar dinero.
Mostrar el saldo.
Mostrar los datos de la cuenta usando getters.

*/
package Proyecto1java;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("A3B4", "jOSE", 20, "corriente", "BCP");

        c1.depositar(34);
        c1.retirar(32);
        c1.retirar(50);
    }
}
