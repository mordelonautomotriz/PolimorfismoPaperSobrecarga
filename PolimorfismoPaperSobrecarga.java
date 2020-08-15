/*

 */
package polimorfismopapersobrecarga;
class angulos{
    //los angulos de convergencia suelen ser de gran importancia en la maniobravilidad
    //del automovil puesto que llevan principios fundamentales de la geometria
    //de los trenes de rodaje, con esto tambien afecta la angulo de las camaras.
    int DeterminarConvergencia(int angulo1, int angulo2, int angulo3){
        //anngulo1: punto de inicio
        //angulo2: centro de rotacion
        //angulo3: trazado de curva
        return angulo1 + angulo2 + angulo3;
    }
    double determinarConvergencia(double angulo1, double angulo2, double angulo3){
        return angulo1 + angulo2 + angulo3;
    }
    
    
    int DeducirDivergencia(int angulo1, int angulo2){
        //angulo1:angulo de salida o kingPin
        //angulo2:angulo de caida
        return angulo1 + angulo2;
    }
    double deducirDivergencia(double angulo1, double angulo2){
        return angulo1 + angulo2;
    } 
}

/**
 * @author Hector Ortiz
 */
public class PolimorfismoPaperSobrecarga {

    public static void main(String[] args) {
       angulos objeto1 = new angulos();
       angulos objeto2 = new angulos();
       angulos objeto3 = new angulos();
       angulos objeto4 = new angulos();
       
       System.out.println("\t\tUniversidad de las Fuerzas Armadas Espe - Sede Latacunga");
    System.out.println("Materia: Programacion");
    System.out.println("NRC: 7450");
    System.out.println("Docente: Ing. Luis Guerra");
    System.out.println("Nombre: Ortiz Hector\n");
    
       int Resultado1;
        objeto1.DeterminarConvergencia(0, 3, 1);
        Resultado1 = objeto1.DeterminarConvergencia(0, 3, 1);
        System.out.println("Angulo Convergente : " + Resultado1);
        
        double Resultado2;
        objeto2.determinarConvergencia(0.0, 4.5, 1.9);
        Resultado2 = objeto2.determinarConvergencia(0.0, 4.5, 2.9);
        System.out.println("Angulo Convergente: " + Resultado2);
        
        int Resultado3;
        objeto3.DeducirDivergencia(2, 3);
        Resultado3 = objeto3.DeducirDivergencia(2, 3);
        System.out.println("Angulo Divergente: " + Resultado3);
        
        double Resultado4;
        objeto4.deducirDivergencia(2.5, 3.8);
        Resultado4 = objeto4.deducirDivergencia(2.5, 3.8);
        System.out.println("Angulo Divergente: " + Resultado4);
    }
    
}
