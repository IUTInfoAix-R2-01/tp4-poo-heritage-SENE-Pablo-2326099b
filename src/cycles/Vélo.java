package cycles;

import java.util.Random;

public class Vélo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double diamRoue;
	private Random genAlea = new Random();
	private double braquet;
	
	
	public Vélo(double braquet ,double diamRoue) {
		this.diamRoue = diamRoue;
		this.braquet = braquet;
	}
	
	public Vélo(double braquet) {
		this.braquet = braquet;
	}
	
	public Vélo() {
		
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getPuissance(double FrequenceCoupDePedale) {
		return FrequenceCoupDePedale * braquet * diamRoue 
		* genAlea.nextDouble();
	}

	@Override
	public String toString() {
		return "Vélo [diamRoue=" + diamRoue + ", braquet=" + braquet + "]";
	}
	
	public static void main (String args[]) {
		Vélo v1 = new Vélo();
        Vélo v2 = new Vélo(15);
        Vélo v3 = new Vélo(15, 4);

        System.out.println("Mon premier vélo : " + v1);
        System.out.println("Mon deuxième vélo : " + v2);
        System.out.println("Mon troisième vélo : " + v3);

        System.out.println("Puissance du troisième vélo : " + v3.getPuissance(15));
        
        v1.setDiamRoue(5.5);
        System.out.println("Diamètre de roue du premier vélo : " + v1.getDiamRoue());

        System.out.println("Puissance du premier vélo : " + v1.getPuissance(10));
	}
}
