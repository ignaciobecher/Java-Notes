import java.text.BreakIterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

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

// ????!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!HACER PUSH A
// GITHUB!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!???
