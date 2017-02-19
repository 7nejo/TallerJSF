
package controller;

import entity.Persona;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

@Named(value = "personaController")
@ViewScoped
public class PersonaController {
   
    public PersonaController() {        
    }
    
    public String aniosDeAfiliacion(Persona p){
        
        return "Años en EPS o Regimen subcidiado";
    }
    
    public String aniosDeLaPersona(Persona p){
        
        return "Años viivido si esta muerto || 0(cero) si esta vivo - no ha muerto";
    }
    
    public String verificarMultiafiliacionPension(Persona p){
        
        return "Si esta multifiliada y si tiene pension";
    }
    
}
