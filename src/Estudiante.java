public class Estudiante {
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
