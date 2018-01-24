
package exemploclaseabstracta;

/**
 *
 * @author dfernandezguerreiro
 */
public abstract class Poligonos {
    private float base;
    private float altura;

    public Poligonos(float base, float altura) {
        this.base=base;
        this.altura=altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    public abstract void acharArea();
}
