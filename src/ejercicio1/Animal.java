package ejercicio1;

public class Animal {
///////////////////////////////Atributos///////////////////////////////////////
    private String nombre;

    private String alimento;

    private String raza;

    private int edad;
    
/////////////////////////////Constructores////////////////////////////////////
    public Animal() {
    }

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
//////////////////////////Getters and Setters////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
////////////////////////////////////Metodos///////////////////////////////////
     public void alimentarse(){
       System.out.println("nada");
    }

}
