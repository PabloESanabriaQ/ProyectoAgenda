public class MitadDelCuadrado {
    //Esta técnica de obtener direcciones dispersas consiste en calcular el cuadrado
    // de la clave x y extraer del resultado los dígitos que se encuentran 
    // en ciertas posiciones. 
    //El número de dígitos a extraer depende del rango de dispersión que se quiera obtener
    //Así, si el rango es de 0 ... 999 se extraen tres dígitos.
    // SIEMPRE LOS QUE ESTÁN EN LAS MISMAS POSICIONES.

    static int dispersarClave(Double clave, int m){
        String n;
        int claveFinal, cantidadDigitos;
        //Elevo la clave al cuadrado, luego la redondeo para eliminar decimales.
        cantidadDigitos = Integer.toString(m).length();
        clave*= clave;
        Math.round(clave);
        //La paso a string para poder manipularla.
        n = clave.toString();
        //Uso substring para seleccionar los dígitos que quiero utilizar
        //(cantidad digitos dictados por la longitud de m) 
        //y luego lo parseo a int para obtener mi clave final.
        claveFinal = Integer.parseInt(n.substring(4, cantidadDigitos));
        if(claveFinal > m){
            claveFinal-=m;
        }
        return claveFinal;
    }
}
