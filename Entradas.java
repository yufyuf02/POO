public class Entradas {

    public int local1 = 20;
    public int local5 = 20;
    public int local10 = 20;
    public double precio1 = 100;
    public double precio5 = 500;
    public double precio10 = 1000;

    public int opcionA;
    public int opcionB;
    public int opcionC;
    public String localSel = "";
    public String localSelA = "";
    public String localSelB = "";
    public String localSelC = "";

    // VALIDA LOS PRECIOS
    
    public Entradas () {
        this.opcionA = (int)(Math.random() * 3) + 1;
        if (opcionA == 1){
            localSelA = "Localidad 1";
            localSel = "Localidad 1";
        } else if (opcionA == 2) {
            localSelA = "Localidad 5";
            localSel = "Localidad 5";
        } else if (opcionA == 3) {
            localSelA = "Localidad 10";
            localSel = "Localidad 10";
        }
        this.opcionB = (int)(Math.random() * 2) + 1;
        if (opcionB == 1){
            localSelB = "Localidad 1";
            localSel = "Localidad 1";
        } else if (opcionB == 2) {
            localSelB = "Localidad 5";
            localSel = "Localidad 5";
        }
        this.opcionC = (int)(Math.random() * 1) + 1;
        if (opcionC == 1){
            localSelC = "Localidad 1";
            localSel = "Localidad 1";
        }
    }
}