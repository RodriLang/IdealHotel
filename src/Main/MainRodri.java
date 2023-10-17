package Main;

import AccesoADatos.HabitacionData;
import AccesoADatos.HuespedData;
import AccesoADatos.ReservaData;
import TipoHabitacion.TipoHabitacion;
import entidades.Habitacion;
import entidades.Reserva;
import java.time.LocalDate;
import java.time.Month;

public class MainRodri {

    public static void main(String[] args) {
//        TipoHabitacion tipo = new TipoHabitacion();
//        tipo.setIdTipoHabitacion(2);
        HabitacionData habData = new HabitacionData();
//        int id = 0;
//
//            for (int i = 1; i < 9; i++) {
//                for (int j = 0; j < 5; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_SIMPLE, i, 1000, false, true));
//                }
//                for (int j = 0; j < 3; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_SIMPLE_QUEEN, i, 1000, false, true));
//                }
//                for (int j = 0; j < 3; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_DOBLE_TWIN, i, 1000, false, true));
//                }
//                for (int j = 0; j < 3; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_DOBLE_MAT, i, 1000, false, true));
//                }
//                for (int j = 0; j < 4; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_TRIPLE_MAT, i, 1000, false, true));
//                }
//                for (int j = 0; j < 4; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.ESTANDAR_TRIPLE_TWIN, i, 1000, false, true));
//                }
//                for (int j = 0; j < 3; j++) {
//                    id++;
//                    habData.guardarHabitacion(new Habitacion(id,entidades.TipoHabitacion.SUITE_DE_LUJO, i, 1000, false, true));
//                }
//            
//
//        }

//        //habData.guardarHabitacion(habitacion1);
//        System.out.println(habData.buscarHabitacion(2));
        HuespedData huesData = new HuespedData();

        Reserva reserva = new Reserva(huesData.buscarHuespedId(2), habData.buscarHabitacion(3), 4, LocalDate.of(2023, Month.OCTOBER, 6), LocalDate.of(2023, Month.OCTOBER, 10));
        ReservaData resData = new ReservaData(huesData, habData);
        resData.guardarReserva(reserva);

        System.out.println(habData.listarHabitacionesPorPiso(1));
    }

}
