
public class Ticket {

//    int num;                        // Por default lo puso private
    public int num;
    public int numA;
    public int numB;
//    public String estado = ("APROBADO");
    public String estado = ("NO VERIFICADO");
    
    // CREACIÓN DE NÚMERO DE TICKET Y NÚMEROS "A" Y "B" DE VERIFICACIÓN
    
    public Ticket () {
        this.num = (int)(Math.random() * 15000) + 1;
        this.numA = (int)(Math.random() * 15000) + 1;
        this.numB = (int)(Math.random() * 15000) + 1;

        // VERIFICA QUE "numA" SEA MENOS A "numB"

        while (numA > numB) {       // "while" tiene que estar dentro de un método
        this.numA = (int)(Math.random() * 15000) + 1;
        this.numB = (int)(Math.random() * 15000) + 1;
    }

        // ESTABLECE EL ESTADO DEL TICKET
        if (numB >= num & num >= numA) {
            estado = ("APROBADO");
        } else {
            estado = ("DENEGADO");
        }
    }
}

//    public int getNum() {           // Este getter para hacer eL "num" private a public
//        return this.num;
//    }