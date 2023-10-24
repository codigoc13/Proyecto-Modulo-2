public class Proceso {
    int id;
    String hora;
    String fecha;
    String status;
    int idEmpleado;
    int idCliente;
    int idAnimal;

    public void create(int idEmpleado, int  idAdoptante, int idAnimal){
        int getLastCell = 3;
        this.id = getLastCell + 1;
        //Setear datos, por defecto estado pendiente, fecha hora vacias
        //GuardarExcel
    }
    public void verProcesos(){
        //retorna todos los procesos
    }
    public void update(int idProceso){
        //Estado = denegado, aprobado
        //Fecha hora
    }
}
