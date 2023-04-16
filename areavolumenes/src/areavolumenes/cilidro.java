package areavolumenes;

public class cilidro extends figuras_geometricas{
    //atributos
    
    //metodos
    public cilidro(double radio, double altura, double volumen, double perimetro, double area){
    super(radio,altura,volumen,perimetro,area);
    }
//calcular volumen 
    @Override
    public double getVolumen(){
        double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return volumen;
    }
    //calcular area
    @Override
    public double getArea(){
    double area = 2 * Math.PI * Math.pow(radio, 2) + 2 * Math.PI * radio*altura;
    return area;
    }
    //perimetro
    @Override
    public double getPerimetro(){
        double perimetro = 2 * radio + altura;
        return perimetro;
    }    
}
