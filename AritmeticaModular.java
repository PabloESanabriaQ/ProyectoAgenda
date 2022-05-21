public class AritmeticaModular {
    //La aritmética modular genera valores dispersos calculando el resto 
    // de la división entre la clave x y el tamaño de la tabla m
    // h(x) = x modulo m
    static int dispersarClave(Double clave, int m){
        return (int) (clave % m);
    }

}
