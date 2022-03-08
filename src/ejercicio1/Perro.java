package ejercicio1;

public class Perro extends Animal {
    
    public Perro() {
        super();
    }
    
        
    public Perro(String nombre, String alimento, String raza, int edad){
    super(nombre,alimento,raza,edad);
    }
     @Override
    public void alimentarse(){
        System.out.println(super.getNombre()+ " se aliemnta de "+ super.getAlimento());
    }
}
