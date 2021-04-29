import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {   
        mostrarMenu();
    }

 

    public static void mostrarMenu(){
        Scanner scan = new Scanner(System.in);
        int control = 0;
        while(control < 1) {
            System.out.println("Ingrese un numero");
            int numero = scan.nextInt();
            if (numero == 0){
                control = 1;
            }else if (numero == 1){
                if (Vehiculo.posAñadir < Vehiculo.tamaño){
                    System.out.println("Ingrese el Modelo de Vehiculo(Año)");
                    int modelo = scan.nextInt();
                    System.out.println("Ingrese la Marca del Vehiculo");
                    String marca = scan.next();
                    System.out.println("Ingrese el Valor Comercial del Vehiculo");
                    double valorComercial = scan.nextDouble();
                    System.out.println("Ingrese el Color del Vehiculo");
                    String color = scan.next(); //color = color.toLowerCase();
                    Vehiculo Nuevovehiculo = new Vehiculo(modelo, marca, valorComercial, color);           
                }else if(Vehiculo.posAñadir == Vehiculo.tamaño){          
                    System.out.println("Error base de datos llena");
                }
            }else if (numero == 2){
                System.out.println(Vehiculo.toStringVehiculos());
            }else if (numero == 3){         
                System.out.println("La cantidad de Vehiculos creados son: " + Vehiculo.cantidadVehiculos()); 
            }else if (numero == 4){
                System.out.println(Vehiculo.toStringVehiculosVerdes(Vehiculo.vehiculos));
            }else if (numero == 5){
                if (Sensor.posAñadir < Sensor.tamaño){
                    System.out.println("Ingrese el Tipo de Sensor");
                    String tipo = scan.next();
                    System.out.println("Ingrese el Valor del Sensor");
                    double valor = scan.nextDouble();
                    Sensor Nuevosensor = new Sensor(tipo, valor);                    
                }else if (Sensor.posAñadir == Sensor.tamaño){
                    System.out.println("Error base de datos llena");
                }
            }else if (numero == 6){
                System.out.println(Sensor.toStringSensores());
            }else if (numero == 7){
                System.out.println("La cantidad de Sensores creados son:" + Sensor.posAñadir);
            }else if (numero == 8){
                System.out.println(Sensor.toStringSensoresTemperatura(Sensor.sensores)); 
            }else if (numero == 666){
                System.out.println(Sensor.toStringSensoresTemperaturaOrdenados(Sensor.sensores));         
            }
        }
    }
}