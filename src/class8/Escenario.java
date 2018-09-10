package class8;

import becker.robots.*;
import java.awt.Color;
/**
 * Escenario para la configuracion de un escenario
 * @author Juan Carrero
 * @since 10/09/2018
 * @version 1.0
 */
public class Escenario {
    private City ciudad;
    private Robot robot;
    private Thing thing;
    
    /**
     * Descripcion del constructor
     */
    
    public Escenario(){
        this.ciudad= new City();
        this.robot= new Robot(ciudad,1,1, Direction.EAST);
        this.robot.setLabel("ROBOT");
        
        for(int i=2; i<=6; i++){
            Thing thing = new Thing(this.ciudad, i, i-1);
            thing.getIcon().setColor(Color.GRAY);
            thing.getIcon().setLabel("T"+(i-1));
        }
        
        for(int i=1; i<=6; i++){
        Wall pared = new Wall(ciudad, 1, i, Direction.NORTH);
        }
        
        for(int i=1; i<=6; i++){
        Wall pared = new Wall(ciudad, i, 1, Direction.WEST);
        }
        
        for(int i=1; i<=6; i++){
        Wall pared = new Wall(ciudad, 6, i, Direction.SOUTH);
        }
        
        for(int i=1; i<=6; i++){
        Wall pared = new Wall(ciudad, i, 6, Direction.EAST);
        }
        
    }
    
    /**
     * Descripcion del metodo
     * @param pasos Descripcion del parametro
     * @return  Descripcion del retorno
     */
    public int ejecutar(int pasos){
        for(int i=0; i<pasos; i++){
            this.robot.move();
            System.out.println(this.robot.getAvenue());
            System.out.println(this.robot.getStreet());
            System.out.println(this.robot.getDirection());
        }
        return 1;
    }
    // Parase sobre el proyecto, run, generar javadoc
    // para generar ejecutable, clic derecho en proyecto, propiedades, run, seleccoinar main, luego otra vez clic derecho darle en Clean and build y buscar donde queda 
    // guardado y ejecuta el archivo java
    
    // en simbolo de sistema, se copia toda la dirreccion que se genera y se pega: java -jar "C:\Users\Estudiante.ED401\Documents\NetBeansProjects\Class8\dist\Class8.jar"
    
    //clases: parqueadero(buscar espacio), seccion(columna), sitio(fila, columna)
}
