import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*//EJ1 Crar un objeto Scanner para ler la entrada del usuario
        Scanner scanner = new Scanner (System.in);

        // Solicitar al usuario que ingrese un numero
        System.out.print("INgresa un numero: ");
        int numero = scanner.nextInt();

        // Determinar si el numero es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El numero es positivo. ");
        } else if (numero < 0) {
            System.out.println("El numero es negativo. ");
        } else {
            System.out.println("El numero es cero. ");
        }*/
/*//Ej2 Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario que ingrese un año
        System.out.print("Ingresa un año: ");
        int anio = scanner.nextInt();

        // Determinar si el año es bisiesto o no
        Boolean esBisiesto = false;

        if (anio % 4 == 0) {
            if (anio % 100 == 0 || anio % 400 == 0) {
                esBisiesto = true;
            }
        }
    // Mostrar el resultado en la consola
        if (esBisiesto) {
            System.out.println(anio + "es una año bisiesto.");
        }else {
            System.out.println(anio + " no es una año bisiesto. ");
        }*/
/*//Ej3 Crear un objeto Scanner para leer la entrada del usuario
        Scanner scan = new Scanner(System.in);
        // Solicitar al usuario que ingrese tres numeros
        System.out.print("Ingresa el primer numero: ");
        int num1 = scan.nextInt();

        System.out.print("Ingresa el primer numero: ");
        int num2 = scan.nextInt();

        System.out.print("Ingresa el primer numero: ");
        int num3 = scan.nextInt();

        //Determinar cual es el mayor de los tres numeros
        int mayor;

        if (num1>= num2 && num1>= num3) {
            mayor = num1;
        } else if (num2>= num1 && num2>= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // Mostrar el resultado en la consola
        System.out.println("El mayor de los tres numeros es: " + mayor);*/

/*//EJ4 Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitatar al usuario que un numero del 1 al 7
        System.out.print("Ingrese un numero del 1 al 7 para indicar un dia de la semana: ");
        int dia = scanner.nextInt();

        // Determinar el nombre del dia correspondiente
        String nombreDia;

        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;
                case 2:
                    nombreDia = "Martes";
                    break;
                    case 3:
                        nombreDia = "Miercoles";
                        break;
                        case 4:
                            nombreDia = "Jueves";
                            break;
                            case 5:
                                nombreDia = "Viernes";
                                break;
                                case 6:
                                    nombreDia = "Sabado";
                                    break;
                                    case 7:
                                        nombreDia = "Domingo";
                                        break;
                                        default:
                                            nombreDia = "Numero invalido. Debe ser entre 1 y 7.";
                                            break;

        }
        //EJ5 Mostrar el nombre del dia en la consola
        System.out.println("El nombre del dia es: " + nombreDia);*/

     /*  // Crar un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una letra
        System.out.print("Ingrese una letra: ");
        char letra = scanner.next().toLowerCase().charAt(0);

        //Determinar si la letra es vocal o consonante
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println(letra + " es una vocal");
        } else if (Character.isLetter(letra)) {
            System.out.println(letra + " es una consonante. ");
        } else {
            System.out.println(letra + " no es una letra valida");
        }*/

    }
}