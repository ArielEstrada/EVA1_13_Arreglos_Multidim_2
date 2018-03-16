

/**
 *
 * @author Ariel
 */
public class Principal {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] Matriz = new int[3][];
        System.out.println(Matriz);
        Matriz[0] = new int[2];
        System.out.println(Matriz[0]);
        System.out.println(Matriz[0][0]);
        Matriz[1] = new int[5];
        System.out.println(Matriz[1]);
        System.out.println(Matriz[1][3]);
        Matriz[2] = new int[10];
        System.out.println(Matriz[2]);
        System.out.println(Matriz[2][4]);
        for( int i=0; i<Matriz.length; i++){//columnas
            for (int j = 0; j < Matriz[i].length; j++) {//filas
                System.out.println(Matriz[i][j]);
            }
        }
    }
    
}
