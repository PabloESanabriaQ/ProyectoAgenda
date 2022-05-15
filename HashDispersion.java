public class HashDispersion {
    //Utilizaremos Aritmética Modular
    //n es el tamaño de la cantidad de claves a dispersar
    //m es el tamaño de la tabla de dispersión
    //El factor de carga es de 0.8. El tamaño de mis datos es de 1000, entonces si m/n = 0.8 => m = n / 0.8 
    static final int n = 1000, m = 1259;

    static int sad(long id){
        return Math.toIntExact(id % m);
    }
    
    
}
