public class Adoptante {
    int id;


    public void solicitarProceso(){
        Empleado empleado = new Empleado();
        //sc = Me pasa por favor el el id animal
        int sc = 1;
        empleado.crearProceso(this.id, sc);
    }

    public void verAnimales(){
        Animal animal = new Animal();
        animal.verAnimales();
    }
}
