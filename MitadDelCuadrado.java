public class MitadDelCuadrado {
    //Esta técnica de obtener direcciones dispersas consiste en calcular el cuadrado
    // de la clave x y extraer del resultado los dígitos que se encuentran 
    // en ciertas posiciones. 
    //El número de dígitos a extraer depende del rango de dispersión que se quiera obtener
    //Así, si el rango es de 0 ... 999 se extraen tres dígitos.
    // SIEMPRE LOS QUE ESTÁN EN LAS MISMAS POSICIONES.

    static int dispersarClave(Double clave){
        String n;
        int claveFinal;
        //Elevo la clave al cuadrado, luego la redondeo para eliminar decimales.
        clave*= clave;
        Math.round(clave);
        //La paso a string para poder manipularla.
        n = clave.toString();
        //Uso substring para seleccionar los dígitos que quiero utilizar
        //(3 dígitos) y luego lo parseo a int para obtener mi clave final.
        claveFinal = Integer.parseInt(n.substring(4, 7));
        return claveFinal;
    }
}
