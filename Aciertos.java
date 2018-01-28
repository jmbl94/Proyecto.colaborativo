import java.util.Scanner;
/**
 * @version 22/01/2018
 * @author Jose Manuel Box Lillo
 */
public class Aciertos {

    public static void main(String[] args) {
    	/**
         * Inicializamos 'n' y 'cont' a 0 y asignamos a 'x' un valor aleatorio.
         */
    	
    	int n = 0,cont = 0;
        int x = (int) (500 *Math.random());
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        /**
         * Comprobamos si el valor introducido es mayor o menor al generado aleatoriamente
         * y se repite mientras no acertemos el valor generado.
         * Si es menor nos nuestra "casi cerca..." y si es mayor nos indica "te pasaste amigo"
         */
        do {
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;
        } while (n != x);
        /**
         * Si acertamos el valor nos indica por pantalla que hemos acertado
         * y el número de intentos que hemos realizado
         */
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}
