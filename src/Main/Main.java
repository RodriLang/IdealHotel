package Main;

import AccesoADatos.HuespedData;
import entidades.Huesped;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
        //Huesped hp = new Huesped("Joel", 36774181, "Sargento Cabral 1450", "joelbrondo@gmail.com", "351718647", true);
        HuespedData hd = new HuespedData();
        //hd.agregarHuesped(hp);
        ////////////////////////////////////////
        //hd.modificarHuesped(new Huesped(1, "Joel", 36774181, "Sargento Cabral 1450", "joelbrondo@gmail.com", "3517186479", true));
        //hd.agregarHuesped(new Huesped("Melisa", 8645133, "Sargento cabral 1450", "melisadruppy@hotmail.com", "351456781", true));
        //hd.modificarHuesped(new Huesped(2, "Melisa", 8645133, "Sargento cabral 1450", "melisadruppy@hotmail.com", "351456781", true));
        //Huesped hs = hd.buscarHuespedDni(36774181);
        //System.out.println("Nombre: " + hs.getNombre());
        //Huesped hs2 = hd.buscarHuespedId(2);
        //System.out.println("Nombre: "+hs2.getNombre());
        List<Huesped> huespedes = hd.listarHuespedes();
        for (Object hue : huespedes){
            System.out.println(hue);
        }
        
        List<Huesped> huespedesAlojados = hd.listarHuespedesAlojados();
        for (Object hue : huespedesAlojados) {
            System.out.println(hue);
        }
        
    }

}
