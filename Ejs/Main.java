import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int [][] matriz, tranmatriz;
            int dim1, dim2;
            System.out.println("Ingrese el valor de la primer dimension de la matriz");
            dim1= sc.nextInt();
            System.out.println("Ingrese el valor de la segunda dimension de la matriz");
            dim2= sc.nextInt();
            matriz= new int[dim1][dim2];
            tranmatriz=new int[dim2][dim1];
            for(int i=0; i<dim1;i++){
                for(int j=0; j<dim2;j++){
                    System.out.println("Posicion "+i+":"+j);
                    matriz[i][j]= sc.nextInt();
                }
            }
            for(int i=0; i<dim2;i++){
                for(int j=0;j<dim1;j++){
                    tranmatriz[j][i]=matriz[i][j];
                }
            }
            System.out.println("Matriz transpuesta:");
            for (int i = 0; i < dim2; i++) {
                for (int j = 0; j < dim1; j++) {
                    System.out.print(tranmatriz[i][j] + " ");
                }
                System.out.println();
   }
        }
}
class metodo {
    int[][] crearmatriz(int rowslocal, int columnslocal) {
        int[][] arraylocal;
        arraylocal= new int[rowslocal][columnslocal];
        return arraylocal;
    }
}
class input{
    int recibir(int numberlocal){
        try (Scanner scl = new Scanner(System.in)) {
            int numberreturn= scl.nextInt();
            return numberreturn;
        }
    }
}
class llenarmatriz{
    int[][] fill(int[][] matrizlocal){
        try (Scanner scll = new Scanner(System.in)) {
            for(int i=0;i<matrizlocal.length;i++){
                for(int j=0;j< matrizlocal.length;j++){
                    System.out.println("Ingrese el valor del elemento "+i+":"+j+" de la matriz ingresada");
                    matrizlocal[i][j]= scll.nextInt();
                }
            }
        }
        return matrizlocal;
    }
}
class mostrar{
    void imprimirmatriz(int[][] matrizl){
        for(int i=0;i<matrizl.length;i++){
            for(int j=0;j<matrizl.length;j++){
                System.out.println("Posicion "+i+":"+j+" de la matriz ingresada");
            }
        }
    }
}
class summatrix{
    int[][] sum(int[][] matrizlocalone, int[][] matrizlocaltwo){
        int[][] matrizres;
        matrizres= new int[matrizlocalone.length][matrizlocalone.length];
        for(int i=0;i<matrizlocalone.length;i++){
            for(int j=0;j<matrizlocalone.length;j++){
                matrizres[i][j]=matrizlocalone[i][j]+matrizlocaltwo[i][j];
                System.out.println("Suma de la posicion "+i+":"+j+"["+matrizres[i][j]+"]");
            }
        }
        return matrizres;
    }
}}



