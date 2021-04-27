public class Sensor{
private String tipo;
private double valor;
public static int tamaño = 8;
public static int posAñadir = 0;
public static Sensor[] sensores = new Sensor[8];

 public Sensor(){
Sensor.sensores[Sensor.posAñadir] = this;
Sensor.posAñadir = Sensor.posAñadir + 1;
}

 public Sensor(String t, double v){
this.tipo = t;
this.valor = v;
Sensor.sensores[Sensor.posAñadir] = this;
Sensor.posAñadir = Sensor.posAñadir + 1;
}

 public String getTipo(){
return this.tipo;
}
public void setTipo(String t){
this.tipo = t;
}

 public double getValor(){
return this.valor;
}
public void setValor(double v){
this.valor = v;
}

 public String toString(){
return "Tipo:" + this.getTipo() + "/ Valor:" + this.getValor();
}

 public static String toStringSensores(){
String DatosSensores = "";
for(int i=0; i<Sensor.posAñadir; i++){
if(i == 0){
DatosSensores = DatosSensores + ("Sensores:\n" + Sensor.sensores[i].toString());
}else{
DatosSensores = DatosSensores + ("\n" + Sensor.sensores[i].toString());
}
}
return DatosSensores;
}

 public int CantidadSensores(){
return posAñadir;
}

 public static String toStringSensoresTemperatura(Sensor[] Arr){
String DatosSensores = "";
for(int i=0; i<Sensor.posAñadir; i++){
if(Arr[i].tipo.equals("temperatura")){
if(i == 0){
DatosSensores = DatosSensores + ("Sensores:\n" + Sensor.sensores[i].toString());
}else{
DatosSensores = DatosSensores + ("\n" + Sensor.sensores[i].toString());
}
}
}
return DatosSensores;
}

 public static String toStringSensoresTemperaturaOrdenados(Sensor[] Arr){
Sensor[] NuevoArreglo = new Sensor[tamaño];
for(int i=0; i < Sensor.posAñadir; i++){
if(Arr[i].tipo.equals("temperatura")){
NuevoArreglo[i] = Arr[i];
}else{
continue;
}
}
int n = NuevoArreglo.length;
String DatosSensores = "";
if(n == 0){
double temp;
for(int j=1; j<Sensor.posAñadir; j++){
for(int k=0; k< Sensor.posAñadir-j; k++){
if(NuevoArreglo[k].valor > NuevoArreglo[k+1].valor){
temp = NuevoArreglo[k].valor;
NuevoArreglo[k].valor = NuevoArreglo[k+1].valor;
NuevoArreglo[k+1].valor = temp;
}
}
}
for(int i=0; i < Sensor.posAñadir; i++){
if (i==0){
DatosSensores = DatosSensores + "Sensores Temperatura Ordenados:\n" + (NuevoArreglo[i]);
}else{
DatosSensores = DatosSensores + ("\n" + NuevoArreglo[i]);
}
}
}else{
DatosSensores = DatosSensores + "No hay sensores tipo temperatura";
}
return DatosSensores;
}
}