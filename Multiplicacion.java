
 public class Multiplicacion {
    //La dispersión de una clave utilizando el método de la multiplicación genera direcciones en tres pasos. 
    //Primero, multiplica la clave x por una constante real, R , comprendida entre 0 y 1 (0. < R <1.0). 
    //En segundo lugar, determina la parte decimal, d , del número obtenido en la multiplicación, R*x. 
    //Y, por último, multiplica el tamaño de la tabla, m , por d y al truncarse el resultado se obtiene 
    //un número entero en el rango 0 ... m-1 que será la dirección dispersa.

    static int dispersarClave(Double clave, int m){
        int claveSinDecimales;
        Double R = 0.6180334;
        clave*= R;
        claveSinDecimales = (int) (Math.round(clave));
        clave-= claveSinDecimales;
        clave*= m;
        claveSinDecimales = (int) (Math.round(clave));
        
        return claveSinDecimales;
    }
}
