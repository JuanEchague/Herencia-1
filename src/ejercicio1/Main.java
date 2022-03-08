
package ejercicio1;

/**
 *
 * @author dark_
 */
public class Main {

   
    public static void main(String[] args) {
       Animal perro=new Perro("Negro","carne","Doberman",8);
        perro.alimentarse();
        Perro perro1=new Perro("Boby","carne","Terrier",3);
        perro1.alimentarse();
        Gato gato=new Gato("Pelusa","ratas","Angora",4);
        gato.alimentarse();
        Animal caballo=new Caballo("Rosinante","heno","Mustang",20);
        caballo.alimentarse();
    }
    
}
