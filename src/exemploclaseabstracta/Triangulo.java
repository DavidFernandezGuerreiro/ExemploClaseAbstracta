
package exemploclaseabstracta;

/**
 *
 * @author dfernandezguerreiro
 */
public class Triangulo extends Poligonos{

    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public void acharArea() {
        System.out.println("Area triangulo = "+super.getBase()*super.getAltura()/2);
    }
    
}
