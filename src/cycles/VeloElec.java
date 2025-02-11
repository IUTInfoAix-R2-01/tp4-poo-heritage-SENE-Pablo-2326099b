package cycles;

public class VeloElec extends Vélo {
	
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec(double diamRoue, double coupleMoteur) {
		super(diamRoue);
		this.facteurPuissanceMoteur = coupleMoteur;
	}
	
	public VeloElec() {
		super();
	}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}

	@Override
	public String toString() {
		return "VeloElec [DEFAUT_FACTEUR_PUISSANCE_MOTEUR=" + DEFAUT_FACTEUR_PUISSANCE_MOTEUR
				+ ", facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	@Override
	public double getPuissance(double FrequanceCoupsDePedale) {
		return super.getPuissance(FrequanceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main (String args[]) {
		VeloElec v1 = new VeloElec();
		VeloElec v2 = new VeloElec(4, 5);
		VeloElec v3 = new VeloElec(3, 9, 6);
		
			
		v2.setFacteurPuissanceMoteur(4);
		System.out.println("Le vélo v2 à un facteur de puissance de " + v2.getFacteurPuissanceMoteur());
		System.out.println("Le vélo v3 à une puissance de : "+ v3.getPuissance(50));
		System.out.println("Le vélo v3 à un diamétre de roue de : " + v3.getDiamRoue());
		}
	}

