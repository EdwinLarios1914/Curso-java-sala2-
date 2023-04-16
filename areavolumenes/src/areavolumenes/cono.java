package areavolumenes;

public class cono extends figuras_geometricas{
    //atributos
   
    //metodos
    public cono(double radio, double altura, double volumen, double perimetro, double area){
    super(radio,altura,volumen,area,perimetro);
    }
     //calcular volumen 
    @Override
    public double getVolumen(){
        double volumen = 1/3 * Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }
    //calcular area
    @Override
    public double getArea(){
    double area = Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio * Math.sqrt(Math.pow(radio, 2)+ Math.pow(altura, 2));
    return area;
    }
    //perimetro
    @Override
    public double getPerimetro(){
        double perimetro = Math.PI * radio * altura + Math.PI * radio * 2 ;
        return perimetro;
    }
}
