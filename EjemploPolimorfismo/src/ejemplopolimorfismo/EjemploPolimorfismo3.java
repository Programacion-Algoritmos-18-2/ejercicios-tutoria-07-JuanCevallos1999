
package ejemplopolimorfismo;

import java.util.ArrayList;

public class EjemploPolimorfismo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<PersonaEquipo> integrantes = new ArrayList<PersonaEquipo>();
        
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Volante Derecho");
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia");
        
        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        // ENTRENAMIENTO
        System.out.println("\nEntrenamiento: Todos los integrantes tienen su función en un entrenamiento (Especialización)");
       // for (int i = 0; i>integrantes.size(); i++) {
         //   System.out.println(integrantes.get(i).getNombre() + " " + integrantes.get(i).getApellidos() + " -> ");
           // integrantes.get(i).entrenamiento();
        //}
        for (PersonaEquipo integrante : integrantes) {
           // System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
            integrante.entrenamiento();
        }

        

    }

}
