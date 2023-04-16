package areavolumenes;

public class Paralelipedo extends figuras_geometricas{
   //atributos creo que no tiene
          
    //metodos
    public Paralelipedo(double base, double altura, double profundidad, double volumen, double perimetro, double area){
       super(base,altura,profundidad,volumen,perimetro,area);
       
    }

    //calcular volumen 
    @Override
    public double getVolumen(){
        double volumen = base*altura*profundidad;
        return volumen;
    }
    //calcular area
    @Override
    public double getArea(){
    double area = 2*base*altura+2*altura*profundidad+2*base*profundidad;
    return area;
    }
    //perimetro
    @Override
    public double getPerimetro(){
        double perimetro = 4*(base+altura+profundidad);
        return perimetro;
    }

  
}