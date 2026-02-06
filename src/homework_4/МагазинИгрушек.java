
public class МагазинИгрушек {
	long округлить(double цена) { 
		return Math.round(цена); 
	}
	public static void main(String[] args) {
        double[] цены = {45.6, 19.9, 99.4, 8.2, 150.7,33.1, 67.8, 12.5, 200.0, 55.3};
        double суммаЦен = 0.0;
        for(double цена : цены) {
        	long целая = округлить(цена);
        	System.out.println("Игрушка: " + цена + " → " + целая);
        	суммаЦен += цена;
        }
        double средняя = суммаЦен / 10;
        System.out.println("Средняя ≈ " + Math.round(средняя));
	}
}
