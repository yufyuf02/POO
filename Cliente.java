public class Cliente {

    private String nombre;
    private String email;
    private int boletos;
    private double presupuesto;

    public Cliente (String nombre, String email, int boletos, double presupuesto) {
        this.nombre = nombre;
        this.email = email;
        this.boletos = boletos;
        this.presupuesto = presupuesto;
    }
        public String getNombre() {
        return nombre;
    }
        public String getEmail() {
        return email;
    }
        public int getBoletos() {
        return boletos;
    }
        public double getPresupuesto() {
        return presupuesto;
    }
}
