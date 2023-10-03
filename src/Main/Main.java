package Main;

import AccesoADatos.HuespedData;
import entidades.Huesped;

public class Main {

    public static void main(String[] args) {
        
        Huesped hp = new Huesped("Joel", 36774181, "Sargento Cabral 1450", "joelbrondo@gmail.com", "351718647");
        
        HuespedData hd = new HuespedData();
        hd.guardarHuesped(hp);
        
        
      
    }

}
