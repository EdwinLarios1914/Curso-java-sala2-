package areavolumenes;
import java.util.Scanner;

public class Areavolumenes {
//Programa que da volumenes, áreas y perimetros de una figura elejida
    public static void main(String[] args) {
        //variables
        figuras_geometricas f;
       
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Bienvenido, elije el numero de la figura: de la que deseas saber su área, perimetro y volumen \n 1.esfera\n 2.Cilindro \n 3.Cono\n 4.paralepipedo");
      String figura = sc.nextLine();
       
        switch (figura.toLowerCase()){
            
            case "paralepipedo":
                
                System.out.println("ingresar base");
                double base = sc.nextDouble();
                
                System.out.println("ingresar la altura");
                double altura = sc.nextDouble();
                
                System.out.println("ingresar profundidad");
                double profundidad = sc.nextDouble();
                
                
             break;
           
            case "esfera":
               
                System.out.println("ingresar radio");
                double radio =sc.nextDouble();
                
                
                
                System.out.println("El perimetro es "+f.perimetro+"el area es "+f.getArea());
                break;
                
                
                //cilindro
            case "cilindro":
                System.out.println("ingresar radio");
                
            
                System.out.println("El perimetro es "+f.perimetro);
                    
            case "cono":
                System.out.println("ingresar altura");
                double altura = sc.nextdouble();
                
                
            
                System.out.println("El perimetro es "+ perimetro );
           
                
            }
            
    }
             
               
                
        
        
    
    }
