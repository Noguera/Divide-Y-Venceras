public class Prueba_Divide_Venceras {
    public static void main(String[] args){
        int [] vector = {1,2,3,4,5,6};
        int buscado= 3;
        int fI=0;
        int fF= vector.length-1;
        Divide_Venceras prueba = new Divide_Venceras();
        System.out.print(prueba.contieneValor(vector,buscado,fI,fF));
    }
}
