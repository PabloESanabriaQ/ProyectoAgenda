public class Plegamiento {
    //La técnica de plegamiento consiste en partir la clave x en varias partes.
    //La combinación de las mismas de un método conveniente (a menudo sumándolas)
    // da como resultado la dirección del registro.
    // h(x) = x1 + x2 + x3 + ... + xn
    static int dispersarClave(Double clave, int m){
        String n;
        int primeraParte, segundaParte, claveFinal;
        //Paso la clave a string para poder partirla en 2.
        n = clave.toString();
        //Uso substring para seleccionar los dígitos que quiero utilizar
        //(2 números de 3 dígitos) y luego lo parseo a int para sumarlos.
        primeraParte = Integer.parseInt(n.substring(3, n.length()));
        segundaParte = Integer.parseInt(n.substring(0, 3));
        claveFinal = primeraParte + segundaParte;
        //Una vez obtenida la clave final, si supera a m (el tamaño de mi tabla)
        //lo resto para que entre en el valor indicado.
        while (claveFinal > m){
            claveFinal-=m;
        }
        return claveFinal;
    }
}
