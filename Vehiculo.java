public class Vehiculo {
    public static Vehiculo[] vehiculos = new Vehiculo[10];    
    public static int tamaño = 10;
    public static int posAñadir = 0;    
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;    

 

    public Vehiculo(){
        Vehiculo.vehiculos[Vehiculo.posAñadir] = this;
        Vehiculo.posAñadir = Vehiculo.posAñadir + 1;
    }

 

    public Vehiculo(int mo, String ma,double va){
        this(mo,ma,va,"verde");
    }

 

    public Vehiculo(int mo, String ma,double va,String co){
        this.modelo = mo;
        this.marca = ma;
        this.valorComercial = va;
        this.color = co;
        Vehiculo.vehiculos[Vehiculo.posAñadir] = this;
        Vehiculo.posAñadir = Vehiculo.posAñadir + 1;
    }

 

    public int getModelo(){
        return this.modelo;
    }
    public void setModelo(int mo){
        this.modelo = mo;
    }

 

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String ma){
        this.marca = ma;
    }

 

    public double getValorComercial(){
        return this.valorComercial;
    }
    public void setValorComercial(double va){
        this.valorComercial= va;
    }

 

    public String getColor(){
        return this.color;
    }
    public void setColor(String co){
        this.color = co;
    }

 

    public String toString(){
        return "Modelo:" + this.getModelo() + " / Marca:" +
        this.getMarca() + " / Valor Comercial:" + 
        this.getValorComercial() + " / Color:" + this.getColor();
    }

 

    public static String toStringVehiculos(){
        String DatosVehiculos = "";
        for(int i=0; i< Vehiculo.posAñadir; i++){
            if(i == 0){
                DatosVehiculos = DatosVehiculos + ("Vehiculos:\n"  + Vehiculo.vehiculos[i].toString());
            }else{
                DatosVehiculos = DatosVehiculos + ("\n" + Vehiculo.vehiculos[i].toString());
            }
        } 
        return DatosVehiculos; 
    }

 

    public static int cantidadVehiculos(){
        return posAñadir;
    } 

 

    public static String toStringVehiculosVerdes(Vehiculo[] Vehi){
        String Datos = "";       
        for(int i=0; i< Vehiculo.posAñadir; i++){
            if(Vehi[i].color.equals("verde")){
                if(i == 0){
                    Datos = Datos + ("Vehiculos Verdes:\n" + Vehiculo.vehiculos[i].toString());
                }else{
                    Datos = Datos + ("\n" + Vehiculo.vehiculos[i].toString());
                }
            }            
        }   
        if (Datos.equals("")){
            return "No hay vehiculos de color verde";
        }else{
            return Datos;
        }
    }
}