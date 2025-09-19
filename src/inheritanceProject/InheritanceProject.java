/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceProject;

/**
 *
 * @author rox_g
 */
public class InheritanceProject {
    // 9. Crear el método main
    //stvm(tab)
    public static void main(String[] args) {
        
        // 10. Crear las instancias de las clases Dog y Cat
        // Pasar los valores al constructor
        //Perro
        Dog dog = new Dog("perro", "mamífero");
        // 11. Imprimir el resultado en la consola con println y llamar al método
        // sout(tab)
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
        
        // 15. Imprimir el resultado del nuevo método agregado a Dog con println
        System.out.println(dog.bark());

        
        // 12. Agregar interlinea con sout(tab) dejando paréntesis vacío. Ir a Dog
        System.out.println();
        //Gato
        Cat cat = new Cat("gato", "mamífero");
        System.out.println(cat.eat());
        System.out.println(cat.sleep());
        
        // 15. Imprimir el resultado del nuevo método agregado a Cat con println
        System.out.println(cat.meow());
    }
}
