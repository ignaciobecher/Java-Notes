//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?INTRODUCCION?!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//
//Hello world
class cursoJava {
    public static void main(String[] args) {
        System.out.println("hola mundo");
    }
}

// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?TIPOS DE DATOS!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//

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
float pi=3.14f,e=0.1010f;

// ----------------CONSTANTES---------------------//
//Usamos la palabra reservada final para reservar y nombrar una constante
final float gravity;
gravity=9.58f;


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?OPERADORES!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!//


// ----------------OPERADORES ARITMETICOS---------------------//

//Suma,resta,multiplicacion y division

//hacer push