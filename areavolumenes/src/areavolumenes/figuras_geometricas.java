//Clase principal 
package areavolumenes;

public class figuras_geometricas {
    //atributos 
    protected double radio;
    protected double base;
    protected double altura;
    protected double profundidad;
protected double volumen;
protected double perimetro;
protected double area;
 
// metodo constuctor de paralelipedo 

    public figuras_geometricas(double base, double altura, double profundidad, double volumen, double perimetro, double area) {
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
       this.volumen = volumen;
       this.perimetro = perimetro;
    }

  
// constructor para cilindro y cono 
    
    public figuras_geometricas(double radio, double altura, double volumen, double perimetro, double area) {
        this.radio = radio;
        this.altura = altura;
        this.volumen = volumen;
        this.perimetro = perimetro;
        this.area = area;
    }

   //constructor del esfera
    public figuras_geometricas(double radio, double volumen, double perimetro, double area) {
        this.radio = radio;
        this.volumen = volumen;
        this.perimetro = perimetro;
        this.area = area;
       
    }


    public double getRadio() {
        return radio;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public double getVolumen() {
        return volumen;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    

    
    }

    