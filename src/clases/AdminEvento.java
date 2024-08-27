package clases;
/**
 *
 * Universidad Fidélitas - Facultad de Ingeniería
 * SC-303 Programación Cliente/Servidor Concurrente 
 * II Cuatrimestre, 2024
 * Proyecto Final - Grupo #3
 *
 *  305450804 - Julian Alfonso Hidalgo Chinchilla
 *  XXXXXXXXX - Freiser Yoseman Herrera Muñoz
 *  XXXXXXXXX - Rogelio Josué Vargas Fernández
 *
 */
public class AdminEvento{
    private boolean eventoPrivado;
    private static int idEvento = 0;

    public boolean getEventoPrivado(){
        return this.eventoPrivado;
    }

    public int getIdEvento(){
        return idEvento;
    }

    public void setEventoPrivado(boolean evento){
        this.eventoPrivado = evento;
    }
}
