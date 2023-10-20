package ProyectoLab.src;
public class Tpclases {
    public static void main(String args[]) {

    }
    class kajnds{

    }
}
    class Perro{
        private String nombre;
        private String raza;
        private int edad;
        public Perro(String nombre, String raza, int edad){
            this.nombre=nombre;
            this.raza=raza;
            this.edad=edad;
        }
        public void ladrar(){
            System.out.println("Guau! guau!");
        }
    }
    class Pelicula{
    private String titulo;
    private String director;
    private int duracion;
    public Pelicula(String titulo, String director, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.duracion=duracion;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDirector(){
        return director;
    }
    public int getDuracion(){
        return duracion;
    }
    public void getAllInfo(){
        System.out.println("Titulo de la pelicula: "+(getTitulo()));
        System.out.println("Director de la pelicula: "+(getDirector()));
        System.out.println("Duracion en minutos: "+(getDuracion()));
    }
    }
    class Libro{
    private String titulo;
    private String autor;
    private int anodepublicacion;
    public Libro(String titulo, String autor, int anodepublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anodepublicacion=anodepublicacion;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getAnodepublicacion(){
        return anodepublicacion;
        }
    public void getAllInfo(){
        System.out.println("Titulo: "+(getTitulo()));
        System.out.println("Autor/es: "+(getAutor()));
        System.out.println("Año de publicacion: "+(getAnodepublicacion()));
    }
    }
    class CuentaBancaria{
    private double saldo;
    private long nrodecuenta;
    public CuentaBancaria(double saldo, long nrodecuenta){
        this.saldo=saldo;
        this.nrodecuenta=nrodecuenta;
    }
    public void setSaldo(double nuevomovimiento){
        this.saldo=nuevomovimiento;
    }
    public void deposito(double ingreso){
        setSaldo(saldo+ingreso);
    }
    public void retiro(double salida){
        setSaldo(saldo-salida);
    }
    }
    class Rectangulo{
    private float ancho;
    private float alto;
    public Rectangulo(float ancho, float alto){
        this.ancho=ancho;
        this.alto=alto;
    }
    public float getAncho(){
        return ancho;
    }
    public float getAlto(){
        return alto;
    }
    public float area(){
        float area=getAncho()*getAlto();
        return area;
    }
    public float perimetro(){
        float perimetro=(getAncho()*2)+(getAlto()*2);
        return perimetro;
    }
    }
    class Coche{
    private String marca;
    private String modelo;
    private int anodefabricacion;
    public Coche(String marca, String modelo, int anodefabricacion){
        this.marca=marca;
        this.modelo=modelo;
        this.anodefabricacion=anodefabricacion;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnodefabricacion(){
        return anodefabricacion;
    }
    public void accelerar(){
        System.out.println("Acelerando "+(getMarca())+" modelo "+(getModelo())+" del "+(getAnodefabricacion()));
    }
    public void frenar(){
        System.out.println("Frenando "+(getMarca())+" modelo "+(getModelo())+" del "+(getAnodefabricacion()));
    }
    }
    class Estudiante{
    private String nombre;
    private int edad;
    private int id;
    public Estudiante(String nombre, int edad, int id){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
    }
    }
    class Circulo{
    private double rad;
    public Circulo(double rad){
        this.rad=rad;
    }
    public double getRad(){
        return rad;
    }
    public void setRad(double nuevoRad){
        this.rad=nuevoRad;
    }
    public double area(double rad){
        double area=Math.PI*Math.pow(rad, 2);
        return area;
    }
    public double circun(double rad){
        double circun=Math.PI*(rad*2);
        return circun;
    }
    }

