public class Фигуры {
	static double площадьКвадрата(double сторона) {
		return сторона * сторона;
	}

	static double площадьПрямоугольника(double длина, double ширина) {
		return длина * ширина;
	}

	public static void main(String[] args) {
		double max = 0;
		double[] стороныКвадратов = { 5, 8, 3, 10, 6 };
		for (double сторона : стороныКвадратов) {
			double пл = площадьКвадрата(сторона);
			if (пл > max)
				max = пл;
		}
		double[][] прямоугольники = { { 4, 6 }, { 7, 3 }, { 9, 2 }, { 5, 5 } };
		for (double[] пр : прямоугольники) {
			double пл = площадьПрямоугольника(пр[0], пр[1]);
			if (пл > max)
				max = пл;
		}
		System.out.println("Самая большая площадь: " + max);
	}
}
