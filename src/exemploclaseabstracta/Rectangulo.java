
package exemploclaseabstracta;

/**
 *
 * @author dfernandezguerreiro
 */
public class Rectangulo extends Poligonos{

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }
    

    @Override
    public void acharArea() {
        System.out.println("Area rectangulo = "+super.getBase()*super.getAltura());
        //System.out.println("Area rectangulo = "+this.getBase()*r.getAltura); -> Otra manera: con this. o creando un objeto Rectangulo llamado r.
    }
    
}
