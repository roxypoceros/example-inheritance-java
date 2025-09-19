/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceProject;

/**
 *
 * @author rox_g
 */
public class Cat extends Animal {
        Cat(String type, String kind) {
        super(type, kind);
        }
        
        // 14. Agregar el método que le falta a Cat, meow. Ir a InheritanceProject
        public String meow() {
        return "El gato está maullando. Miau, Miau!";
    }
    
    
}
