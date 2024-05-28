public class Empleado {
    private String name; 
    
    public boolean hacerTarea(Tarea task) {
        System.out.println(name + " está haciendo la tarea: " + task.getName()); 
        return true;
    }
    public Empleado (String name) {
        this.name = name; 
    }
}
