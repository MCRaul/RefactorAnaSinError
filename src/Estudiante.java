
public class Estudiante {
    /**
     * La clase estudiante donde se encuentra el objeto estudiante
     */
    /**
     * @author Jose Raúl Martínez Vera
     * @version 07/06/2018
     */
    static class Estudiant {
        String nombre;
        String apellidos;
        String DNI;
        int edad;
        //He cogido los atributos del del objeto y he generado un constructor utilizando el refactor
        public Estudiant(String nombre, String apellidos, String DNI, int edad) {
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.DNI = DNI;
            this.edad = edad;
        }
    }
}
