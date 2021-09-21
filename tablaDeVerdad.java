/**
 *
 * @author David Leal
 */
public class tablasDeVerdad {

    private static void tabla_verdad(int punto) {
        boolean[] valoresBooleanos = {true, false};
        int contador = 0;
        for (boolean valorX : valoresBooleanos) {
            for (boolean valorY : valoresBooleanos) {
                for (boolean valorZ : valoresBooleanos) {
                    contador++;
                    System.out.println("Caso #" + contador);
                    System.out.printf("x = {%b}, y= {%b}, r = {%b}", valorX, valorY, valorZ);
                    switch (punto) {
                        case 1:
                            System.out.printf("\n({%b} || {%b}) || {%b}\n", valorX, valorY, valorZ);
                            System.out.println((valorX || valorY) || valorZ);
                            ;
                            break;
                        case 2:
                            System.out.printf("\n({%b} || {%b}) && {%b}\n", valorX, valorY, valorZ);
                            System.out.println((valorX || valorY) && valorZ);
                            ;
                            break;
                        case 3:
                            System.out.printf("\n({%b} && {%b}) || {%b}\n", valorX, valorY, valorZ);
                            System.out.println((valorX || valorY) || valorZ);
                            ;
                            break;
                        case 4:
                            System.out.printf("\n({%b} && {%b}) && {%b}\n", valorX, valorY, valorZ);
                            System.out.println((valorX || valorY) || valorZ);
                            ;
                            break;
                        default:
                            break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("---------------PUNTO 1");
        tabla_verdad(1);
        System.out.println("---------------PUNTO 2");
        tabla_verdad(2);
        System.out.println("---------------PUNTO 3");
        tabla_verdad(3);
        System.out.println("---------------PUNTO 4");
        tabla_verdad(4);
    }

}
