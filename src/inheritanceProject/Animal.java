/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceProject;

/**
 *
 * @author rox_g
 */
public class Animal {
    // 1. Atributos definidos en el diagrama a la Clase Animal.
    private String type = "";
    private String kind = "";
    
    // 2.  Constructor de la clase para inicializar los atributos
    Animal (String type, String kind){
        this.type = type;
        this.kind = kind;
    }
    
    // 3. Escribir los métodos definidos en el diagrama de Clase.
    public String eat() {
    // 4. Devolvemos una cadena usando la palabra reservada return.
        return "El " + this.type + " está comiendo.";
    }
    
    // 5. Crear el metodo sleep devolviendo una cadena.
        public String sleep() {
        return "El " + this.type + " está durmiendo, zzzzZZZZZ!";
    }
    
}
