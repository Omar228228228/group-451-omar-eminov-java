package homework_14_1;

public class Color {
    private final int r, g, b;
    
    private Color(int r, int g, int b) {
        this.r = r; this.g = g; this.b = b;
    }
    
    public static Color fromRGB(int r, int g, int b) {
        return new Color(r, g, b);
    }
    
    public static Color fromHex(String hex) {
        return new Color(0, 0, 0);
    }
    
    public String toHex() {
        return String.format("#%02X%02X%02X", r, g, b);
    }
}
