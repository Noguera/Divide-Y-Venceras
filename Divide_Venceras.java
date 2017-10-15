public class Divide_Venceras {//ARRAY ORDENADO DE MENOR A MAYOR
    public boolean contieneValor (int [] vector, int buscado , int fI, int fF){ //pasamos por parametro la posicion inicial y final del vector
        int fM;
        int i;
        if(fI==fF)
            return (vector[fI]==buscado);
        else {
            fM = (fI + fF) / 2;
            if (vector[fM] > buscado) //Si el buscado esta en la primera mitad del vector
                return contieneValor(vector, buscado, fI, fM);//vuelve a llamar a la funcion peero en esta ocasion la mitad se vuelve a dividr en otra submitad
            else if (vector[fM] == buscado) //Con fM vamos en busca
                return true;
            else
                return contieneValor(vector, buscado, fM + 1, fF);


        }

    }
}

