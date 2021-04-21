package main.java.ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Asistencia asistencia1 = new Asistencia("Natalia", Estado.PRESENTE);
        AsistenciaDAO.guardarAsistencia(asistencia1);

        for(Asistencia asistencia : AsistenciaDAO.getPresentes())
            System.out.println(asistencia);


        Asistencia asistencia = AsistenciaDAO.getAsistenciaPorId(2);
        System.out.println(asistencia);


    }
}
