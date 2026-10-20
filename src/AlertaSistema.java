

public class AlertaSistema{
    private int identificador;
    private String descripcion;
    private int proridad;
    private static int contador = 0;

    //Setters


    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setProridad(int proridad) {
        if (proridad>=1 && proridad<=5) {
            this.proridad = proridad;
        }
    }

    public void setDescripcion(String descripcion) {
        if(descripcion != null && !descripcion.isBlank()){
            this.descripcion = descripcion;
        }
    }

    //Getters

    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getProridad() {
        return proridad;
    }

    public static int getContador() {
        return contador;
    }


    //Constructor

    public AlertaSistema(int identificador, String descripcion) {
        setIdentificador(identificador);
        setDescripcion(descripcion);

        contador ++;
    }

    public void mostrarInfo(){
        System.out.println("ID: " +getIdentificador()+ "\nDescripcion: " +getDescripcion()+ "\nPrioridad: " +getProridad());
    }

    public void aumentarPrioridad(int proridad){
        if (proridad<=5) {
            setProridad(proridad);
        }
    }

    public void esUrgente(){
        if (proridad>=4 && proridad<=5){
            System.out.println("Urgente");
        }else{
            System.out.println("No urgente");
        }
    }
}
