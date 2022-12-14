
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?INTRODUCCION?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
//Hello world
class cursoJava {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }}

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?TIPOS DE
    // DATOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------DECLARACION DE VARIABLES---------------------//
    // Int
    int version; // int se usa para enteros
    version=9;

    // ----------------TIPOS DE DATOS---------------------//

    // Int: sirve para enteros
    int posicion = 10;

    // Float: numeros decimales
    float decimal = 5.9f;// siempre lleva una f al final

    // Char: letras o caracteres unicos
    char letra = "a";
    char letra2 = 97;// codigo para "a"

    // Boolean:
    boolean valor = true;

    // ----------------TIPOS DE DATOS EN JAVA---------------------//

    /*
     * Tipos de datos en Java
     * 
     * En Java existen ocho tipos de datos, también conocidos como tipos primitivos
     * : byte, short, int, long, char, float, double y boolean. A partir de estos
     * tipos de datos nosotros podemos clasificarlos en cuatro grupos:
     * Enteros
     * 
     * Este grupo incluye byte, short, int y long. Estos tipos de datos nos permiten
     * trabajar con números enteros ya sean positivos o negativos.
     * Nombre bytes Rango
     * long 8 –9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
     * int 4 –2,147,483,648 a 2,147,483,647
     * short 2 –32,768 to 32,767
     * byte 1 –128 to 127
     * 
     * En la mayoria de los casos usaremos el tipo de dato int para números
     * positivos.
     * 
     * Ejemplos
     * 
     * byte diasMes = 31; //Aproximadamente
     * short diasLustro = (12 * 31) * 5;
     * int velocidadLuz = 299792458;
     * long añoLuz = velocidadLuz * 365;
     * 
     * Flotantes/Decimales
     * 
     * Este grupo incluye float y double. Estos tipos de datos nos permiten trabajar
     * con números los cuales posean punto decimal ya sean positivos o negativos.
     * Nombre bytes Rango Apróximado
     * double 8 4.9e–324 to 1.8e+308
     * float 4 1.4e–045 to 3.4e+038
     * 
     * Ejemplos
     * 
     * float pi = 3.1415926535f;
     * double e = 2.718281828459045235360;
     * 
     * Caracteres
     * 
     * En el grupo de caracteres únicamente encontraremos el tipo de dato char. Este
     * tipo de datos nos permitirá trabajar con caracteres.
     * 
     * Ejemplos
     * 
     * char letraA = 'a';
     * char letraANumerico = 61;
     * 
     * Caracteres estándares
     * Boleanos
     * 
     * Al igual que el grupo de caracteres, en el grupo de booleanos únicamente
     * encontraremos un tipo de dato, el boolean. Este tipo de datos nos permitirá
     * trabajar con valores lógicos, verdadero o falso.
     * 
     * Ejemplos
     * 
     * boolean verdadero = true;
     * boolean falso = false;
     */

    // ----------------PALABRAS REVERVADAS EN JAVA---------------------//

    /*
     * Palabras reservadas Java
     * 
     * Las palabras reservadas, como su nombre lo indican, son palabras las cuales
     * el lenguaje de programación ya ha reservado para realizar ciertas tareas. En
     * Java actualmente existen 50 palabras reservadas.
     * 
     * abstract continue for new switch
     * assert default goto package synchronized
     * boolean do if private this
     * break double implements protected throw
     * byte else import public thows
     * case enum instanceof return transient
     * catch extends int short try
     * char final interface static void
     * class finally long strictfp volatile
     * const float native super while
     * 
     * Algo importante a tener en cuenta es que las palabras reservadas no pueden
     * ser utilizadas como nombres de variables, clases o métodos.
     * 
     * Aunque const y goto son palabras reservadas, estas no son utilizadas en la
     * actualidad.
     * 
     * En adición a este listados podemos agregar true, false y null.
     */

    // ----------------METODOS PRINT Y PRINTLN---------------------//

    // Println: el mensaje se imprime en consola con un salto de linea
    System.out.println("Hola mundo");System.out.println("Me llamo ignacio");

    // Salida=>
    // Hola mundo
    // Me llamo ignacio

    // Print: imprime todo en la misma linea

    System.out.println("Hola mundo");System.out.println("Me llamo ignacio");

    // Salida =>
    // Hola mundoMe llamo ignacio

    // SECUENCIAS DE ESCAPE: sirven para formatear las cadenas de texto que
    // printeamos
    /*
     * \n:salto de linea
     * \t:tabulador
     * \\:diagonal inversa
     * \":comillas
     * \':comillas simples
     */

    // ----------------DECLARACION DE MULTIPLES VARIABLES---------------------//

    int var1 = 1, var2 = 2, var3 = 3;// se puede siempre y cuando sean todas del mismo tipo
    float pi = 3.14f, e = 0.1010f;

    // ----------------CONSTANTES---------------------//
    // Usamos la palabra reservada final para reservar y nombrar una constante
    final float gravity;gravity=9.58f;

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?OPERADORES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------OPERADORES ARITMETICOS---------------------//

    // Suma,resta,multiplicacion y division

    // ----------------OPERADORES RELACIONALES---------------------//

    // >
    // <
    // >=
    // <=
    // ==
    // . !=

    // ----------------OPERADORES LOGICOS---------------------//
    // and, or y not
    // And
    boolean result = 5 >= 5 && true && 10 > 9;

    // Or

    result=false||false||false||true;

    // Not

    System.out.println(!false);

    // ----------------OPERADOR TERNARIO---------------------//
    // IFTTT: if this, then this

    String mensaje = 10 > 9 ? "Es mayor" : "Es menor"; // ---> si la expresion da true me devuelve el primer mensaje,
                                                       // sino
                                                       // el 2do

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?STRINGS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------CADENAS EN JAVA---------------------//
    // String es una clase

    // Formas para declarar
    String mensaje1 = "Hola soy un string";

String mensaje2=new String("hola soy string")

    // ----------------METODOS PARA STRINGS---------------------//

    // Length
    int cantidad = mensaje1.length();

    // Contains
    boolean contiene = mensaje.contains("hola");// veo si mensaje contiene un "hola"

    // StartsWith
    boolean empiezaCon = mensaje.startsWith("Hola");

    // EndsWith
    boolean terminaCon = mensaje.endsWith("mundo");

    // Concat
    String nuevoString1 = mensaje.concat("estamos en curso de java");

    // ----------------METODOS DE FORMATO---------------------//

    // toUpperCase()-->pasar a mayusucla
    // toLowerCase()-->pasar a minuscula
    // trim()-->remueve los espacios

    // Format
    String=mensaje;
    float valor = 10.87213f;

    mensaje=String.format("El total de %d articulos es %.2f %s",3,valor,"Ars");// primero pasamos el formato y luego los
                                                                               // parametros

    System.out.printf(formato,valores);

    // %d--->enteros
    // %f--->decimales.Con un punto y numero indico decimales que quiero
    // &s-->strings

    // ----------------COMPARAR CADENAS---------------------//
    // Equals
    String cadena1 = "Hola";
    String cadena2 = "hola";

    boolean resultado6 = cadena1.toLowerCase().equals(cadena2.toLowerCase());// aca las paso a minuscula para ver si son
                                                                             // iguales

    // EqualsIgnoreCase

    resultado6=cadena1.equalsIgnoreCase(cadeena2);
    // ignora si esta en mayuscula o minuscula

    // ----------------CONCATENAR CADENAS---------------------//
    String curso = "java";
    String nombre = "ignacio";

    String mensaje89 = "Bienvenido" + nombre + "al curso de" + curso;

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?CICLOS Y
    // CONDICIONALES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------CONDICIONALES---------------------//

    String colorLuz = "Verde";

    if(colorLuz.equals("verde"))
    {
        System.out.println("puede pasar");
    }else if(colorLuz="Amarillo")
    {
        System.out.println("Circule con precaucion");
    }else
    {
        System.out.println("Alto total");
    }

    // ----------------CONDICIONES ANIDADAS---------------------//

    int promedio = 9;

    if(promedio>=7)
    {
        if (promedio == 10) {
            System.out.println("Excelente");
        } else {
            System.out.println("Muy bien");
        }
    }else
    {
        System.out.println("Desaprobado");

    }

    // ----------------SCOPE---------------------//
    // El scope es el alcance que tiene un elemento dentro de un programa, cade vez
    // que creamos un nuevo bloque {} estamos creando un nuevo scope

    // ----------------SWITCH---------------------//

String colorDeLuz="Rosa"

    switch(colorDeLuz)
    {
    case "Verde":
        System.out.println("Siga");
        break;

    case "Amarillo":
        System.out.println("Circule con cuidado");
        break;

    case "Rojo":
        System.out.println("Alto");
        break;

    default:
        System.out.println("Ese color no es valido");
}

    // ----------------CICLO WHILE---------------------//
    // Con while ->1. Se evalua 2.Se ejecuta el bloque
    int contador = 1;

    while(contador<11)
    {
        system.ou.println("hola mundo");
        contador++;
    }

    // ----------------DO WHILE---------------------//
    // Ejecuta hasta que una condicion deje de cumplirse

    // Do while ->1.Se ejecuta el bloque 2.Se evalua

    do
    {
        System.out.println(contador);
        contador++;
    }while(contador<10);

    // ----------------CICLO FOR---------------------//

    // for (inicializacion; condicion; Iteracion){}

    for(
    int numero = 9, x = 1;x<11;system.out.println(numero*x),x++)
    {

    }

    // Mejorar legibilidad
    for(
    int numero = 9, x = 1;x<11;){
    int resultado=numero*x
    String mensaje=numero + "*" + x + "=" +resultado; 
    system.out.println(mensaje);
    x++;
}

    // For con un if

    for(
    int numero = 1;numero<101;numero++){
    if(numero % 2 == 0){
        System.out.println(numero)
    }
}

    // ----------------BREAK Y CONTINUE---------------------//

    // Break en un ciclo for corta el ciclo que lo contiene, no todo
    // Continue nos permite que el ciclo salte a la siguiente iteracion

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?ARRAYS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------ARRAYS---------------------//

    // Como declarar
    String nombres[]; // primero inicializo
    nombres=new String[3]; // despues hago un new y el tipo de dato junto con la cantidad de elementos del
                           // array

    nombres[0]="Elemento 1"; // los declaro en cada indice
    nombres[1]="Elemento 2";nombres[2]="Elemento 3";

    // DEFINIR ARRAY

    String nombres[] = { "Elemento 1", "Elemento 2", "Elemento 3" };

    // ----------------RECORRER ARRAYS---------------------//

    int calificaciones[] = { 10, 9, 8, 7, 5, 6, 6, 6, 8, 10, 9 };
    int suma = 0;

    for(
    int i = 0;i<calificaciones.length;i++)
    {
        suma += calificaciones[i];
    }

    float promedio = suma / califiaciones.length;

    // ----------------FOR EACH---------------------//

    for(
    int valorPorIndice:calificaciones)
    { // declaro una variable del mismo tipo que el array y sigue el elemento a iterar
        suma += valorPorIndice;
    }

    // ----------------INSERTAR REGISTROS---------------------//
    int valores[] = new int[10];for(
    int i = 0;i<valores.length;i++)
    {
        valores[i] = i;
    }

    // ----------------ARREGLOS BIDIMENSIONALES---------------------//

    int matriz[][] = new int[4][3]; // declaro la matriz y defino de cuantas filas y columnas la quiero

    matriz[0][0]=1;matriz[0][1]=2;matriz[0][2]=3;

    matriz[1][0]=1;matriz[1][1]=2;matriz[1][2]=3;

    matriz[2][0]=1;matriz[2][1]=2;matriz[2][2]=3;

    matriz[3][0]=1;matriz[3][1]=2;matriz[3][2]=3;

    // ----------------RECORRER MATRICES---------------------//

    for(
    int posX = 0;posX<matriz.length;posX++)
    {

        for (int poxY = 0; posY < matriz[posX].length; posY++) {
            matriz[posX][posY] = posY + 1;
        }
    }

    // Mismo resultado pero con FOREACH

    for(
    int[] fila:matriz)
    {
        for (int celda : fila) {
            System.out.println(celda);
        }
    }

    // ----------------ARRAYS MULTIDIMENSIONALES---------------------//
    // Multiples arrays de multiples dimensiones en uno solo

    int calificaciones[][] = new int[5][];// le asigno el numero de filas pero no el de columnas

    calificaciones[0]=new int[1]; // 1
    calificaciones[1]=new int[2]; // 2
    calificaciones[2]=new int[2]; // 3
    calificaciones[3]=new int[1]; // 4
    calificaciones[4]=new int[3]; // 5

    calificaciones[0][0]=8;

    calificaciones[1][0]=5;calificaciones[1][1]=7;

    calificaciones[2][0]=10;calificaciones[2][1]=9;

    calificaciones[3][0]=3;

    calificaciones[4][0]=8;calificaciones[4][1]=6;calificaciones[4][2]=1;

    for(
    int[] califiacionesPorALumno:calificaciones){
    for(int calificacion : califiacionesPorALumno){
        System.out.print(calificacion + "")
    }
}

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?CLASES Y
    // OBJETOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // ----------------PROGRAMACION ORIENTADA A OBJETOS---------------------//

    // Primero para crear una clase, creo un archivo nuevo class
    Package main;

    public class Perro {
        String nombre;
        String raza;
        int edad;
    }

    // Nueva instancia del objeto perro

    Perro lassie = new Perro();

    lassie.nombre="lassie";lassie.raza="collie";lassie.edad=4;

    system.out.println(lassie.nombre);system.out.println(lassie.raza);system.out.println(lassie.edad);

    // ----------------METODOS---------------------//

    Package main;

    public class Perro {
        String nombre;
        String raza;
        int edad;

        // Metodos
        void comer() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta comiendo");
        }

        void dormir() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta durmiendo");
        }

        void ladrar() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta ladrando");
        }
    }

    // Para llamarlos en la funcion solo debemos hacer

    lassie.comer();lassie.dormir();lassie.ladrar();

    // ----------------PARAMETROS---------------------//
    Package main;

    public class Perro {
        String nombre;
        String raza;
        int edad;

        void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro) {
            nombre = nombrePerro;
            raza = razaPerro;
            edad = edadPerro;
        }

        void comer() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta comiendo");
        }

        void dormir() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta durmiendo");
        }

        void ladrar() { // void hace referencia a que el metodo no retorna ningun valor
            system.out.println("El perro esta ladrando");
        }
    }

    // Quedaria la funcion de la siguiente forma

    Perro lassie = new Perro();

    lassie.establecerAtributos("lassie","collie",4);

    system.out.println(lassie.nombre);system.out.println(lassie.raza);system.out.println(lassie.edad);

    lassie.comer();lassie.dormir();lassie.ladrar();

    // ----------------THIS---------------------//

    void establecerAtributos(String nombre, String raza, int edad) {
        this.nombre = nombre; // accedo a los atributos del objeto con this
        this.raza = raza;
        this.edad = edad;
    }

    // ----------------RETORNAR VALORES---------------------//
package main;

    public class Triangulo {
        float base;
        float altura;

    float area(){       //como me devuelve un dato dejo de usar void y uso el tipo de dato a declarar
        float area=(this.base * this.altura)/2;
        return area //uso return
    }
    }

    // Nueva instancia de la clase triangulo

    Triangulo triangulo = new Triangulo();Triangulo.base=10;Triangulo.altura=20;

    float resultado = triangulo.area();

    // ----------------MODIFICADORES DE ACCESO---------------------//
    // Los modificadores de acceso restringen o hacen publico el uso de ciertos
    // elementos entre clases y archivos de un mismo paquete

    // Modificadores;
    // 1.Default
    // 2.Public
    // 3.Private
    // 4.Protected

    public class Usuario {
        public String userName; // al tener un public cualquier otra clase puede usarlo o importarlo
        private String password; // al tener un private solo se puede usar en la clase usuario
    }

    // ----------------GETTERS Y SETTERS---------------------//
    // Getters
    public String getPassword() {
        return this.password; // con el metodo getter podremos acceder a algo privado pero sin acceder
                              // directamente
    }

    // Setter
    public void setPassWord(String password) {
        this.password = password;
    }
    // con este metodo podria usar el setPassword en otra clase aunque sea privado

    // ----------------CONSTRUCTOR---------------------//

    public class Main {
        Usuario codi = new Usuario("codi", "pass");
    }

    // Constructor
    public class Usuario {
        public Usuario(String username, String password) {
            this.username = username;
            this.password = password;
        }
    }

    // ----------------SOBRECARGA DE METODOS---------------------//
    // Es la posibilidad que tiene un lenguaje de definir dos o mas metodos con el
    // mismo nombre en la misma clase

public class Calculadora{
    //Enteros
    public int suma(int valor1, int valor2){
        return valor1+valor;
    }
    //Flotantes
    public float suma(float valor1, float valor2){
        return valor1+valor;
    }
    //Double
    public int double(double valor1, double valor2){
        return valor1+valor;
    }
}

    // En java podemos tener metodos con el mismo nombre pero nunca con mismo nombre
    // y mismo tipo de dato

    // ----------------MULTIPLES PARAMETROS---------------------//
    // Para no usar muchos metodos en una sola clase y dificultar el codigo podemos
    // pasar multiples parametros a un solo metodo
    // Clase calculadora
    public class Calculadora {
    public int suma(int...numeros){//al poner los tres puntos indico que va a tener n parametros
        int suma = 0;
        System.out.println(numeros.length);

        for(int numero : numeros)
        suma +=numero;
        return suma
    }
    }

    // Clase donde inicializo nueva instancia de la clase calculadora
public class main{
    Calculadora calculadora=new Calculadora();
    float resultado=calculadora.suma(12,4,5,6,7);
    System.out.println("el resultado de la suma es:" + resultado);
}

    // ----------------STATIC---------------------//
    // Static me permite que una variable que pertenece a un objeto pase a ser de
    // nivel clase, pudiendo usarla en otra clase sin tener que instanciar un nuevo
    // objeto, solo usandola como cualquier otra cosa

    public class Circulo {
        public static final float pi = 3.14f; // elemento que pasa a ser de clase
        public float radio = 0f; // elemento de instancia
    }

    // al poner la palabra static se puede usar un metodo sin necesidad de nueva
    // instancia.

    // ----------------CLASES ANIDADAS---------------------//

    public class Usuario { // clase principal
        String usuario = "cody";

        public void establecerRol() { // metodo que instancia nuevo Administrado y usa el metodo trabajar
            Administrado admin = new Administrado();
            admin.trabajar();
        }

        public class Administrado { // clase Administrado con metodo trabajar
        public void trabajar(){
            System.out.println("Administrador")
        }
        }
    }

    // ----------------HERENCIA---------------------//

    public class Gato extends Mascota { // para poder usar los atributos de una clase padre debemos poner un extends en
                                        // la clase hija

    }

    // ----------------SOBRE ESCRITURA DE METODOS---------------------//
    // Es tomar un metodo de una clase padre y hacer que la clase hija lo implemente
    // de otra forma

    // ------------------SUPER-------------------//
    // Super nos permite sobre escribir un metodo conservando las funcionalidades de
    // la clase padre

public void dormir(){
    super.dormir();     //uso super y el metodo que quiero conservar de la clase padre
    System.out.println("El perro duerme")
}

    // ----------------CLASES ABSTRACTAS---------------------//
    // Una clase abstracta es una clase que define el cuerpo, o sea define que hacer
    // pero no como

    // Son clases que establecen ciertos metodos sin mucho detalle para que luego
    // las clases hijas se encarguen de los detalles

    // Forma para declarar clase abstracta
    public abstract class figura(){
        private int nuemroLados;

        public figura() {
            this.nuemroLados = 0;
        }

        public abstract floa area(); // metodo abstracto
    }

    // Para usar la clase abstracta usamos extends como en cualquier clase heredada

    // Clase hija

    public class Triangulo extends figura {
        public float area() {

        }
    }

    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?INTERFACES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

    // Las interfaces son como clases, pero que nos permmiten que un mismo elemento
    // herede de varias interfaces, cosa que no se puede realizar con clases

    // primero creamos nueva interface como clase abstracta
    public interface Canino {
    public abstract void aullar()
    }

    public class PastorAleman implements Canino {
    public void aullar(){
        system.out.println("LAdrar")
    }
    }

    // ----------------MULTIPLES INTERFACES---------------------//

    public class PastorAleman implements Canino, Mascota { // usa las interfaces cnaino y mascota
        public void Aullar() {
        }
    }

    // ----------------HERENCIA DE INTERFACES---------------------//
    public interface InterfaceA extends InterfaceB {
    }

    // ----------------METODO DEFAULT---------------------//
    public interface InterfaceB {
        public abstract void mostrarMensaje();

        public default void saluda() {
            system.out.println("Hola desde interface");
        }
}

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?APIS DE
// JAVA!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

// Paquete: nos permitira agrupar clases

// ----------------IMPORT---------------------//
// Para importar desde otro paquete una clase

// Al principio del documento
import nombre.delpaquete.aimportar.nombreDeLaClaseImportada;
// si quiero importar todo cambio el nombre de clase por un asterisco

// ----------------JAVA LANG---------------------//
// Los elementos del paquete java lang no hacen falta ser importados

// ----------------PROTECTED---------------------//
// El metodo protected hace que un metodo solo pueda ser usado en el mismo
// paquete

public class Java{
    protected String getTitulo(){

    }
}

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?ENTRADA DE
// DATOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
// ----------------CLASE SCANNER---------------------//

import java.util.Scanner; // primero importo scanner

public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    //inicializo nueva instancia de la clase scanner
        System.out.println("Cual es tu nombre?");   

        String nombre = sc.nextLine();      //uso next in line para preguntar al usuario por consola

        System.out.println("hola" + nombre);    //imprimo el resultado en la variable nombre
    }
}


// ----------------OBTENER TIPOS DE DATOS---------------------//
//Como nextLine devuelve string hay formas de transformar los datos

//Formas para obtener datos enteros
int edad=Integer.parseInt(sc.nextLine());
int edad=sc.nextInt();

//Formas para obtener float
float altura=sc.nextFloat();

//Formas para obtener boolean
boolean valor=sc.nextBoolean();

// ----------------METODO NEXTLINE---------------------//
//NextLine captura el salto de linea, es como hacer un salto de linea

//CON EL METODO SC.CLOSE() DEJAMOS DE SCANNEAR EN CONSOLA EVITANDO ASI USO DE RECURSOS


// ----------------CLASE JOPTIONPANE---------------------//

import javax.swing.JOptionPane; // importo la clase

public class main {
    public static void main(String[] args) {
        // Ingreso de datos
        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre?"); // utilizo la clase
        int edad = integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad?"));

        // Salida de datos

        String mensaje = "hola" + nombre + "con una edad de" + edad;

        JOptionPane.showMessageDialog(null, mensaje); // para sacar datos

    }
}

// ????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!HACER PUSH A
// GITHUB!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!???
