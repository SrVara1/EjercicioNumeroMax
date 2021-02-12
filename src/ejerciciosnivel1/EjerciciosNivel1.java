/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1;

import java.util.Arrays;

/**
 *
 * @author Propietario
 */
public class EjerciciosNivel1 {

    //declaro un array de un  integer para hacer pruebas
    int[] listaNumeros = {3, 31, 200, 20, 5, 99};

    public int maximo(int[] lista) {
        int auxiliar = lista[0]; //el maximo va a sser el primer elemento del array
        for (int i = 0; i < lista.length; i++) {

            if (auxiliar < lista[i]) {
                auxiliar = lista[i];
            }

        }
        return auxiliar;
    }
    
    /**
     * 
     * método para quitar los espacios en blanco a un string
     * 
     */
    
    public String quitaEspaciosEnBlanco (String cadena){
        // Acaso hubo buhos aca
        // Acasobuhosaca
        String auxiliar = "";
        for (int i=0; i< cadena.length(); i++){ 
            if (cadena.charAt(i) != ' '  && cadena.charAt(i) != ','){
                auxiliar = auxiliar + cadena .charAt(i);
            }
          
        }
        return auxiliar;
    }
    
    
    /**
     * 
     * @param cadena el string limpiar
     * return el string sin acentos
     * @return 
     */
    public String quitaAcentoss(String cadena){
        //pájaro
        //psjaro
        //cadena=cadena.toLowerCase();
        cadena=cadena.replace('á', 'a');
        cadena=cadena.replace('é', 'e');
        cadena=cadena.replace('í', 'i');
        cadena=cadena.replace('ó', 'o');
        cadena=cadena.replace('ú', 'u');
        cadena=cadena.replace('ü', 'u');
        
        cadena=cadena.replace('Á', 'A');
        cadena=cadena.replace('É', 'E');
        cadena=cadena.replace('Í', 'I');
        cadena=cadena.replace('Ó', 'O');
        cadena=cadena.replace('Ú', 'U');
        cadena=cadena.replace('Ü', 'u');
        
        return cadena;
      
    }
    
    public String quitaAcentosV2 (String cadena){
        String auxiliar = "";
        for(int i=0;i<cadena.length(); i++ ){
            if(cadena.charAt(i)=='á') { auxiliar = auxiliar + 'a';}
            else if (cadena.charAt(i)=='é') { auxiliar = auxiliar + 'e';}
            else if (cadena.charAt(i)=='í') { auxiliar = auxiliar + 'i';}
            else if (cadena.charAt(i)=='ó') { auxiliar = auxiliar + 'o';}
            else if (cadena.charAt(i)=='ú') { auxiliar = auxiliar + 'u';}
            else if (cadena.charAt(i)=='ü') { auxiliar = auxiliar + 'u';}
              
            else if (cadena.charAt(i)=='Á') { auxiliar = auxiliar + 'A';}
            else if (cadena.charAt(i)=='É') { auxiliar = auxiliar + 'E';}
            else if (cadena.charAt(i)=='Í') { auxiliar = auxiliar + 'I';}
            else if (cadena.charAt(i)=='Ó') { auxiliar = auxiliar + 'O';}
            else if (cadena.charAt(i)=='Ú') { auxiliar = auxiliar + 'U';}
            else if (cadena.charAt(i)=='Ü') { auxiliar = auxiliar + 'U';}
                    else{
                    auxiliar=auxiliar + cadena.charAt(i);
                    }
              
              
        }
                
        return auxiliar;
    }
            
    
    public boolean palindromo (String frase ){
       //este programa verdadero si la frase tiene los mismo caractres de izq a derec y de der a izq*
       
       // Acaso hubo buhos aca
       // Acasobuhosaca
        
        frase = quitaAcentoss(frase);
       //1º: quitar los espacios en blanco de la cadena
       String auxiliar2 = quitaEspaciosEnBlanco (frase);
       
       //2º: pasamos a minusculas toda la frase
       auxiliar2 = auxiliar2.toLowerCase();
       
       //3º: voy a usar el metodo de los indices
       int indiceIzquierdo = 0;
       int indiceDerecho = auxiliar2.length()-1;
      
       
       
       while (auxiliar2.charAt(indiceIzquierdo)== auxiliar2.charAt(indiceDerecho)&& indiceIzquierdo <= indiceDerecho){
           indiceIzquierdo++;
           indiceDerecho--;
          
       }
       if(indiceIzquierdo < indiceDerecho){// se ha salido antes de llegar al medio, luego no puede ser palindromo
           return false;// no son palindromos
       }
       else{
            return true; // si que es palindromo porque los indices se han cruzado
       }
        
    }
    
    
    public boolean esIsograma (String palabra){
        //este metodo devuelve true si la palabra no tiene un letra repetida
        //y false si se repite alguna
        //MURCIELAGO
        palabra = palabra.toUpperCase();
        palabra = quitaAcentoss(palabra);
        
       for (int i=0; i< palabra.length(); i++){ //i=0
            for(int j=i+1; j< palabra.length(); j++){ //la j va a ser "u" la primera vez
                if(palabra.charAt(i) == palabra.charAt(j)){ //si son iguales
                    return false;
                }
            }
                
            }
        
        //si ha recorrido los dos bucles si salir en el return false,
        //es porque la palabra no tiene letras repetidas
        return true;
        
    }
    
    
    
    /**
     * 
     * este metodo recibe un string formado por variaspalabras
     * ej: "Alta Velocidad Española"
     * y devuelve un array de strings por ejemplo
     * ("Alta", "velocidad","espñola")
     * Esto solo es para una Prcatica
     */
    public String[] divideFrase (String frase){
        frase = frase + ""; //añade un espacio en blanco al final, para que funciones el for con todas las palabras
        String auxiliar = "";
        //1º averiguo cuantos espacios en blanco tien la frase
        int numeroEspaciosEnBlanco = 0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == ' '){
                numeroEspaciosEnBlanco++;
            }
                
        }
      
        String[]dividido = new String [numeroEspaciosEnBlanco];
        int contadorPalabra = 0;
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i) == ' '){
                dividido[contadorPalabra] = auxiliar;
                auxiliar = "";
                contadorPalabra++;
            }
            else{
                auxiliar = auxiliar + frase.charAt(i);
            }
        }
      
        return dividido; //alta velocidad española
    }
    
    
    /**
     * recibe una frase y devuleve su acronimo
     * la primera letra de cada palabra que forma la frase
     * @param frase
     * @return 
     */
    public String acronimo (String frase){
        frase = frase.toUpperCase();
       // String [] palabras = divideFrase(frase);
        String [] palabras = frase.split(" ");
        String auxiliar = "";
        for(int i=0; i<palabras.length; i++){
            if( palabras[i].length() > 0){//para evitar el problema de la palabras vacias
                if(!(palabras[i].equals("Y") || palabras[i].equals("E") || palabras[i].equals("DE") || palabras[i].equals("LA") || palabras[i].equals("LAS"))){ //si no ea ninguna de esa palabras
                     auxiliar = auxiliar + palabras[i].charAt(0); // auxiliar va a ser la primera letra de la palabra
            }
            }
       
        }
  
        return auxiliar;
    }
           
     /**
      * Recibe dos strings y devuelve true si todas las letras del primero estás
      * en el segundo (sin repetirse), amotr y roma
      * @param palabra1
      * @param palabra2
      * @return 
      */
    public boolean esAnagrama (String palabra1, String palabra2){
        
        palabra1 = quitaEspaciosEnBlanco(palabra1);//chequeamos espacios en blanco
        palabra2 = quitaEspaciosEnBlanco(palabra2);//chequeamos espacios en blanco
        
        palabra1 = quitaAcentosV2(palabra1);//chequeamos acentos
        palabra2 = quitaAcentosV2(palabra2);//chequeamos acentos
        
        palabra1 = palabra1.toLowerCase();//para que todas las letras sean minusculas
        palabra2 = palabra2.toLowerCase();//para que todas las letras sean minusculas
         
        if(palabra1.length() !=palabra2.length()){ //si no tienen la misma longitud
            return false;
        }
        if(palabra1.length() == 0){ 
            return false;//no tiene caracteres
        }
        //amor roma
        for(int i=0; i<palabra1.length(); i++){
            if(palabra2.contains(""+palabra1.charAt(i)) ){ //el "", se pone porque a parte de que contains busca un string, podemos concatenarlo con el charAt
                palabra2 = palabra2.replaceFirst(""+palabra1.charAt(i),"-"); //con este metodo si hay una letra repetida solo la remplazaremos solo una vez con el guion, en la palabra2
            }
            else{
                return false;
            }
            
        }
        
        return true;
        
    }
    
    /**
     * 
     * @param diasIniciales son  los dias con xx que hya que poner al inicio
     */
    
    public void calendario (int diasIniciales){
        diasIniciales = Math.abs(diasIniciales % 7); //sacar el resto de los dias inicilaes y el math es por si es negativo el numero que pasamos

        //declaramos contador para saber que dia de la semanaestoy iprimiendo
        int contador = 0;
        //1º imprimir xx iniciales
        for(int i=0; i <diasIniciales; i++){
            System.out.print("XX ");
            contador ++;
            
        }
        //2º imprimir los numeros del 1 al 31
        for(int i=1; i<=31; i++){
            if (i>0 && i<10){
                System.out.print("0" + i + " "); 
                
            }
            else{
                System.out.print(i + " ");
            }
      
            contador++;
            if(contador % 7 ==0){
              System.out.print("");
            }
              
        }
        //3º dibujar las XX finales
        while (contador % 7 !=0){
            System.out.print("XX ");
            contador++;
        }
    }
    
    


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel1 ejercicio = new EjerciciosNivel1();
        System.out.println ("palindromo: " + ejercicio.palindromo("Acaso hubo buhos aca"));
        System.out.println ("palindromo: " + ejercicio.palindromo("esto no es"));
        System.out.println("el maximo es:" +ejercicio.maximo(ejercicio.listaNumeros));
      
        
        
        
        System.out.println("la palabra murcielago " + ejercicio.esIsograma("murcielago"));
        System.out.println("la palabra careta " + ejercicio.esIsograma("careta"));
        
        
        
       System.out.println( Arrays.toString(ejercicio.divideFrase("Alta Velocidad Española")));
       ejercicio.acronimo("Alta Velocidad Española");
       
       
       ejercicio.calendario(3);
       System.out.println(); System.out.println();
       ejercicio.calendario(4);
       System.out.println(); System.out.println();
       ejercicio.calendario(5567);
       
        }
       
        
    }


