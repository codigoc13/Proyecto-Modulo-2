public class Empleado {
    int id;

    //CRUD

    public void crearProceso(int idAdoptante, int idAnimal){
        Proceso proceso = new Proceso();
        proceso.create(this.id, idAdoptante, idAnimal);
    }
    public void actualizarProceso(){
        Proceso proceso = new Proceso();
        int sc = 5;
        proceso.update(sc);
    }
    public void verProcesos(){
        Proceso proceso = new Proceso();
        proceso.verProcesos();
    }
}
