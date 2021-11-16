public record Point(int x, int y){

	public Point(int x, int y){/*Constructeur*/
		this.x = x;
		this.y = y;
	}
	public double distance(Point p){ 
		/*distance entre deux points : Math.sqrt((x2-x1)**2 - (y2-y1)**2)*/
		return Math.sqrt((p.x - x) * (p.x - x) + (p.y - y) * (p.y - y));
	}

	public static void main(String[] args){
		System.out.println("Et voici un record !");
		/*variables à utiliser pour récupérer les argumenst de la ligne de commande*/
		int x, y; 
		x = Integer.parseInt(args[0]); 
		y = Integer.parseInt(args[1]);
		System.out.println("Le premier argument est : " + x + ", et le deuxième argument est : " + y);
		/*Créer une instance du record Point*/
		var point = new Point(x, y);
		var point1 = new Point(3, 4);
		double dis;
		dis = point.distance(point1);
		System.out.println("La distance entre les deux points est : " + dis);
	}
}

/*
======================
REPONSES AUX QUESTIONS
======================
-Une méthode statique est une méthode qui n'agit pas sur des variables d'instance 
mais uniquement sur des variables de classe. Elle appartient à la classe, pas à un objet
-Lorsqu'un argument n'est pas un nombre, on obtient une erreur
*/