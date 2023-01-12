public class EncapPersona {
    public static void main(String[]args){
    Persona persona = new Persona();
    persona.setEdad(25);
    System.out.println("Tu edad es " + persona.getEdad());

    persona.setNombre("José");
    System.out.println("Tu nombre es " + persona.getNombre());

    persona.setTelefono(7988709);
    System.out.println("Tu telefono es" + persona.getTelefono());

    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}