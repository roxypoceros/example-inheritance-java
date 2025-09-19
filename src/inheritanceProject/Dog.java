/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceProject;

/**
 *
 * @author rox_g
 */
    // 6. Extender Dog de la clase base Animal
public class Dog extends Animal{
    // 7. Agregar el constructor en esta clase
    // super se usa al extender la clase o no se puede usar.
    Dog(String type, String kind) {
        super(type, kind);
    }
    // 8. Repetir el punto 7 en clase cat
    
    // 13. Agregar el método que le falta a Dog, bark. Ir a Cat
    public String bark() {
        return "El perro está ladrando. Guau, guau!";
    }
    
    }
}
