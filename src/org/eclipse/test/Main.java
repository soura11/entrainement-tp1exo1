package org.eclipse.test;

import org.eclipse.modele.Point;
import org.eclipse.modele.TroisPoints;

public class Main {

	public static void main(String[] args) {
		Point point1 = new Point(2,0);
		Point point2 = new Point(6, 0);
		Point point3 = new Point(8,0);
		System.out.println(point1);
		System.out.println(point1.calculerDistance(point2));
		System.out.println(Point.distance(point1, point2));
		System.out.println(Point.distance(point2, point3));
		System.out.println(point1.calculerMilieu(point3));
		TroisPoints troisPoints = new TroisPoints(point1, point2, point3);
		System.out.println(troisPoints.sontAlignes());
		System.out.println(troisPoints.estIsocele());
		
		

	}

}
