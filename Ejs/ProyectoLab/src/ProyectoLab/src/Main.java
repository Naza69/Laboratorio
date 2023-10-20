package ProyectoLab.src;

import java.util.Random;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
    }
}
class misc{
    public int randomnumber(){
        Random ran = new Random();
        int rannumber=ran.nextInt(1, 10);
        return rannumber;
    }
}
    class matrices {
            public int[][] multiplicarMatrices(int[][] matrizA, int[][] matrizB) {
                int filasA = matrizA.length;
                int columnasA = matrizA[0].length;
                int filasB = matrizB.length;
                int columnasB = matrizB[0].length;

                if (columnasA != filasB) {
                    return null;
                }

                int[][] resultado = new int[filasA][columnasB];

                for (int i = 0; i < filasA; i++) {
                    for (int j = 0; j < columnasB; j++) {
                        int sum = 0;
                        for (int k = 0; k < columnasA; k++) {
                            sum += matrizA[i][k] * matrizB[k][j];
                        }
                        resultado[i][j] = sum;
                    }
                }

                return resultado;
            }
        public boolean esMatrizOrtogonal(double[][] matriz) {
            if (matriz.length != matriz[0].length) {
                return false;
            }

            int n = matriz.length;
            double[][] transpuesta = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    transpuesta[i][j] = matriz[j][i];
                }
            }

            double[][] inversa = calcularMatrizInversa(matriz);
            return sonMatricesIguales(transpuesta, inversa);
        }
        public boolean sonMatricesIguales(double[][] matriz1, double[][] matriz2) {
            int filas = matriz1.length;
            int columnas = matriz1[0].length;
            if (filas != matriz2.length || columnas != matriz2[0].length) {
                return false;
            }

            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    if (matriz1[i][j] != matriz2[i][j]) {
                        return false;
                    }
                }
            }

            return true;
        }
        public int[] mininrows(int[][]mlocal){
            int[] minrowsarray;
            minrowsarray=new int[mlocal.length];
            int max=0, min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]>max){
                        max=mlocal[i][j];
                    }
                }
            }
            min=max;
            for(int i=0;i< mlocal.length;i++){
                for(int j=0;j<mlocal[i].length;j++){
                    if(mlocal[i][j]<min){
                        min=mlocal[i][j];
                    }
                }
                minrowsarray[i]=min;
                min=max;
            }
            return minrowsarray;
        }
        public double[][] calcularMatrizInversa(double[][] matriz) {
            if (matriz.length != 2 || matriz[0].length != 2 || matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0] == 0) {
                return null;
            }

            double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
            double[][] inversa = new double[2][2];

            inversa[0][0] = matriz[1][1] / determinante;
            inversa[0][1] = -matriz[0][1] / determinante;
            inversa[1][0] = -matriz[1][0] / determinante;
            inversa[1][1] = matriz[0][0] / determinante;

            return inversa;
        }
        Random ran = new Random();

        public int maxelem(int[][] mlocal) {
            int maxelem = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (mlocal[i][j] > maxelem) {
                        maxelem = mlocal[i][j];
                        ;
                    }
                }
            }
            return maxelem;
        }

        public int[][] turnninty(int[][] mlocal) {
            int rows = mlocal.length;
            int cols = mlocal[0].length;
            int[][] rotatedMatrix = new int[cols][rows];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    rotatedMatrix[j][rows - i - 1] = mlocal[i][j];
                }
            }
            return rotatedMatrix;
        }

        public int[][] invertrows(int[][] mlocal) {
            int[][] mlocalrowsinv;
            int rowslenght = mlocal.length - 1;
            mlocalrowsinv = new int[mlocal.length][mlocal[0].length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal[i].length; j++) {
                    mlocalrowsinv[i][j] = mlocal[rowslenght][j];
                }
                rowslenght -= 1;
            }
            return mlocalrowsinv;
        }

        public int sumdiagonalone(int[][] mlocal) {
            int sumfirstdiag = 0;
            for (int i = 0; i < mlocal.length; i++) {
                sumfirstdiag += mlocal[i][i];
            }
            return sumfirstdiag;
        }
        public int sumdiagonaltwo(int[][]mlocal){
            int sumsecondiag=0;
            for(int i=0;i< mlocal.length;i++){
                sumsecondiag+=mlocal[i][mlocal.length-1-i];
            }
            return sumsecondiag;
        }
        public int[][] idenmatrix(int [][] mlocal){
            for(int i=0;i< mlocal.length;i++){
                for(int j=0; j< mlocal.length;j++){
                    if((j==0 || j==mlocal[i].length-1) && i!=0 && i!= mlocal.length-1){
                        mlocal[i][j]=0;
                    }else if(i==0 && j==0){
                        mlocal[i][j]=1;
                    }else if(i==mlocal[i].length-1 && j==mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }else if(i!=0 && i!= mlocal.length-1 && j!=0 & j!=mlocal[i].length-1){
                        mlocal[i][j]=1;
                    }
                }
            }
            return mlocal;
        }
        public boolean isdiagonal(int [][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    if (i != j && mlocal[i][j] != 0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public int evens(int [][] mlocal){
            int evens=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                if(mlocal[i][j]%2==0){
                    evens+=1;
                }
                }
            }
            return evens;
        }
        public int valueinmatrix(int[][]mlocal, int number){
            int counter=0;
            for (int i = 0; i < mlocal.length; i++){
                for (int j = 0; j < mlocal.length; j++){
                    if(number==mlocal[i][j]){
                        counter+=1;
                    }
                }
            }
            return counter;
        }
        public int odds(int [][] mlocal){
            int odds=0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]%2!=0){
                        odds+=1;
                    }
                }
            }
            return odds;
        }
        public int sumrow(int[][]mlocal, int numrow){
            int rowsum=0;
            for(int i = numrow; i < numrow+1; i++){
                for(int j = 0; j < mlocal.length; j++){
                    rowsum+=mlocal[i][j];
                }
            }return rowsum;
        }
        public int cordiinmatrix(int [][] mlocal, int cord){
            int icord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        icord=i;
                    }
                }
            }return icord;
        }
        public int cordjinmatrix(int [][] mlocal, int cord){
            int jcord=0;
            for(int i = 0; i < mlocal.length; i++){
                for(int j = 0; j < mlocal.length; j++){
                    if(mlocal[i][j]==cord){
                        jcord=j;
                    }
                }
            }return jcord;
        }
        public int[][] sumarmatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1.length; j++) {
                    mres[i][j] = mlocal1[i][j] + mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] productomatrices(int[][] mlocal1, int[][] mlocal2) {
            int[][] mres;
            mres = new int[mlocal1.length][mlocal1.length];
            for (int i = 0; i < mlocal1.length; i++) {
                for (int j = 0; j < mlocal1[i].length; j++) {
                    mres[i][j] = mlocal1[i][j] * mlocal2[i][j];
                }
            }
            return mres;
        }

        public int[][] llenar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    matrizlocal[i][j] = ran.nextInt(1, 101);
                }
            }
            return matrizlocal;
        }

        public void mostrar(int[][] matrizlocal) {
            for (int i = 0; i < matrizlocal.length; i++) {
                for (int j = 0; j < matrizlocal[i].length; j++) {
                    System.out.printf("[" + matrizlocal[i][j] + "]");
                }
                System.out.println();
            }
        }
        public void mostrararrray(int[] arraylocal) {
            for (int i = 0; i < arraylocal.length; i++) {
                    System.out.printf("[" + arraylocal[i] + "]");
                }
                System.out.println();
            }
        public int[][] trans(int[][] mlocal) {
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    mlocal[i][j] = mlocal[j][i];
                }

            }
            return mlocal;
        }

        public void isiden(int[][] mlocalnorm, int[][] mlocaltrans) {
            if (mlocalnorm == mlocaltrans) {
                System.out.println("Son iguales");
            } else System.out.println("No son iguales");
        }

        public int[][] escproduct(int[][] mlocal, int number) {
            int[][] localres = new int[mlocal.length][mlocal.length];
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    localres[i][j] = mlocal[i][j] * number;
                }
            }
            return localres;
        }

        public int elemssum(int[][] mlocal) {
            int sum = 0;
            for (int i = 0; i < mlocal.length; i++) {
                for (int j = 0; j < mlocal.length; j++) {
                    sum += mlocal[i][j];
                }
            }
            return sum;
        }
    }
            class ShellSort {
                public static void sort(int[] array) {
                    int n = array.length;
                    int gap = n / 2;
                    while (gap > 0) {
                        for (int i = gap; i < n; i++) {
                            int temp = array[i];
                            int j = i;
                            while (j >= gap && array[j - gap] > temp) {
                                array[j] = array[j - gap];
                                j -= gap;
                            }
                            array[j] = temp;
                        }
                        gap /= 2;
                    }
                }
                class MergeSort {
                    public static void sort(int[] array) {
                        mergeSort(array, 0, array.length - 1);
                    }

                    private static void mergeSort(int[] array, int left, int right) {
                        if (left < right) {
                            int mid = left + (right - left) / 2;
                            mergeSort(array, left, mid);
                            mergeSort(array, mid + 1, right);
                            merge(array, left, mid, right);
                        }
                    }
                }

                private static void merge(int[] array, int left, int mid, int right) {
                    int leftLength = mid - left + 1;
                    int rightLength = right - mid;
                    int[] leftArray = new int[leftLength];
                    int[] rightArray = new int[rightLength];
                    for (int i = 0; i < leftLength; i++) {
                        leftArray[i] = array[left + i];
                    }
                    for (int j = 0; j < rightLength; j++) {
                        rightArray[j] = array[mid + 1 + j];
                    }
                    int i = 0, j = 0;
                    int k = left;
                    while (i < leftLength && j < rightLength) {
                        if (leftArray[i] <= rightArray[j]) {
                            array[k++] = leftArray[i++];
                        } else {
                            array[k++] = rightArray[j++];
                        }
                    }
                    while (i < leftLength) {
                        array[k++] = leftArray[i++];
                    }
                    while (j < rightLength) {
                        array[k++] = rightArray[j++];
                    }
                }
            }
            class DirIn {
                void array(int[] arraylocal) {
                    int aux, pbef, j;
                    for (int i = 1; i < arraylocal.length; i++) {
                        aux = arraylocal[i];
                        pbef = i - 1;
                        while (pbef >= 0 && aux < arraylocal[pbef]) {
                            arraylocal[pbef + 1] = arraylocal[pbef];
                            pbef--;
                        }
                        arraylocal[pbef + 1] = aux;
                    }
                }

                void arrayinv(int[] arraylocal) {
                    int aux, pbef, j;
                    for (int i = 1; i < arraylocal.length; i++) {
                        aux = arraylocal[i];
                        pbef = i - 1;
                        while (pbef >= 0 && aux > arraylocal[pbef]) {
                            arraylocal[pbef + 1] = arraylocal[pbef];
                            pbef--;
                        }
                        arraylocal[pbef + 1] = aux;
                    }
                }
            }
            class SelectSort {
                void array(int[] arraylocal) {
                    int n = arraylocal.length;

                    for (int i = 0; i < n - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < n; j++) {
                            if (arraylocal[j] < arraylocal[minIndex]) {
                                minIndex = j;
                            }
                        }
                        int temp = arraylocal[minIndex];
                        arraylocal[minIndex] = arraylocal[i];
                        arraylocal[i] = temp;
                    }
                }

                void arrayinv(int[] arraylocal) {
                    int n = arraylocal.length;

                    for (int i = 0; i < n - 1; i++) {
                        int minIndex = i;
                        for (int j = i + 1; j < n; j++) {
                            if (arraylocal[j] > arraylocal[minIndex]) {
                                minIndex = j;
                            }
                        }
                        int temp = arraylocal[minIndex];
                        arraylocal[minIndex] = arraylocal[i];
                        arraylocal[i] = temp;
                    }
                }
            }
            class BubbleSort {
                void array(int[] arraylocal) {
                    for (int i = 0; i < arraylocal.length - 1; ++i) {
                        for (int j = 0; j < arraylocal.length - 1 - i; ++j) {
                            if (arraylocal[j] > arraylocal[j + 1]) {
                                int tempor = arraylocal[j];
                                arraylocal[j] = arraylocal[j + 1];
                                arraylocal[j + 1] = tempor;
                            }
                        }
                    }
                }

                void arrayinv(int[] arraylocal) {
                    for (int i = 0; i < arraylocal.length - 1; ++i) {
                        for (int j = 0; j < arraylocal.length - 1 - i; ++j) {
                            if (arraylocal[j] < arraylocal[j + 1]) {
                                int tempor = arraylocal[j];
                                arraylocal[j] = arraylocal[j + 1];
                                arraylocal[j + 1] = tempor;
                            }
                        }
                    }
                }
            }
            class Iden implements Comparable<Iden> {

                private String name;
                private int age;

                public Iden(String name, int age) {
                    this.age = age;
                    this.name = name;
                }

                public int compareTo(Iden other) {
                    return Integer.compare(this.age, other.age);
                }

                public String toString() {
                    return "Nombre: " + name + ", Edad: " + age;
                }

                public String getName() {
                    return name;
                }
            }
            class NameComparator implements Comparator<Iden> {
                public int compare(Iden o1, Iden o2) {
                    return o1.getName().compareTo(o2.getName());
                }

            }
