/*
 *Ejemplo tomado de página:
*http://chuwiki.chuidiang.org/index.php?title=Lectura_y_Escritura_de_Ficheros_en_Java
*/
import java.io.*;
import java.util.ArrayList;
 
class Calculadora {
    private static Stack<String> operaciones;
    private static ArrayList<Integer> resultados;
    private static Stack<Integer> datos;
    
   public static void main(String [] arg) {
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;
      operaciones= new StackVector<String>();
      datos= new StackVector<Integer>();
      resultados=new ArrayList<Integer>();
 
      //Comienza código tomado de internet
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("C:\\Users\\Ed. Chamo\\Desktop\\Trabajos GitHub\\HDT2-Estructura-de-datos\\datos.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
 
         // Lectura del fichero
         String linea;
         int ind=0;
         while((linea=br.readLine())!=null){
            operaciones.push(linea);
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      //termina codigo tomado dd internet
      
      while(!operaciones.empty()){
          operarLinea();
      }
      System.out.println("=====================================");
      imprimir();
      System.out.println("=====================================");
   }
   
   private static void operarLinea(){
       String dato=operaciones.pop();
       System.out.println(dato);
       char[] chars=dato.toCharArray();
       for(int i=0; i<chars.length; i++){
           if(chars[i]==' '){
               
           }else{
               if(chars[i]== '+' || chars[i]== '-' || chars[i]== '*' || chars[i]== '/'){
               int op2=datos.pop();
               //System.out.println(op2);
               int op1=datos.pop();
               //System.out.println(op1);
               datos.push(verificarOperacion(op1, op2, chars[i]));
               }else{
                   int datascii=(int)chars[i];
                   int dat =Character.getNumericValue(datascii);
                   datos.push(dat);
               }
           }
       }
       resultados.add(datos.pop());
       
   }
   
   private static int verificarOperacion(int op1, int op2, char car){
       int resultado=0;
       if(car=='+'){
           resultado=op1+op2;
       }
       if(car=='-'){
           resultado=op1-op2;
       }
       if(car=='*'){
           resultado=op1*op2;
       }
       if(car=='/'){
           resultado=(int)op1/op2;
       }
       return resultado;
   }
   
   private static void imprimir(){
       for(int i=0; i<resultados.size(); i++){
           System.out.println("Resultado:\n"+resultados.get(i));
       }
   }
}