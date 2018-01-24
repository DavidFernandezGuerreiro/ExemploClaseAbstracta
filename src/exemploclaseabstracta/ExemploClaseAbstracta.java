
package exemploclaseabstracta;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploClaseAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Poligonos po=new Poligonos(); <- POLIGONONOS É ABSTRACTO NON SE PODE INSTANCIAR
        Rectangulo re=new Rectangulo(4F,5F);
        Triangulo tri=new Triangulo(4F,5F);
        re.acharArea();
        Poligonos obxr=new Rectangulo(3F,4F); // Creando un Rectaangulo de tipo poligono
    }
    
}
