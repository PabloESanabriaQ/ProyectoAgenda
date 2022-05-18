public class HashDispersion {
    //Utilizaremos Aritmética Modular
    //n es el tamaño de la cantidad de claves a dispersar
    //m es el tamaño de la tabla de dispersión
    //El factor de carga es de 0.8. El tamaño de mis datos es de 1000, entonces si m/n = 0.8 => m = n / 0.8 

    static boolean esPrimo(int m){
        //Vamos a comprobar si un número m es primo.
        //Primero lo dividimos por 2, 3, 5.
        //Si eso no se cumple utilizamos la raíz de M (descartando el decimal)
        //es divisible por los números primos anteriores a su raíz, de ser así NO será primo
        //de lo contrario, es primo.
        int raizDeM = (int) Math.sqrt(m);
        if(m % 5 == 0 || m % 3 == 0 || m % 2 == 0){
            return false;
        }
        for(int i = 2; i < raizDeM; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int calcularTamanioTabla(long n){
        Double factorDeCarga = 0.8;
        Double m = n / factorDeCarga;
        int mEntero = (int) Math.round(m);
        while (!esPrimo(mEntero)){
            mEntero++;
        }
        return mEntero;
    }

    static int dispersarClave(long clave, int m){
        return Math.toIntExact(clave % m);
    }
    
    
}
