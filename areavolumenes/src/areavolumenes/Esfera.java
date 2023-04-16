package areavolumenes;

public class Esfera extends figuras_geometricas {
   //atributos
    
    //metodos
    public Esfera(double radio, double volumen, double perimetro, double area){
    super(radio,volumen,perimetro,area);
    }
      //calcular volumen 
    @Override
    public double getVolumen(){
        double volumen = 4/3 * Math.PI * Math.pow(radio, 3) ;
        return volumen;
    }
    //calcular area
    @Override
    public double getArea(){
    double area = 4 * Math.PI * Math.pow(radio, 2);
    return area;
    }
    //perimetro
    @Override
    public double getPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
