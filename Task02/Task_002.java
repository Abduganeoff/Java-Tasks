public class Task_002 {
    public static void main(String[] args) {
        int a = 23;
        int r = 121;
        int g = 255;
        int b = 130;
        int color;
        //packing color variables into one
        color = (a << 24) + (r << 16) + (g << 8) + (b);
        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
        System.out.println("color = " + color);
        a = 0;
        r = 0;
        g = 0;
        b = 0;

        // unpacking colors back to its variables
        a = color >> 24;
        r = ((color << 8) >> 24);
        b = (((color << 8) >> 24) + 9);
        g = (((color >> 8)&255));
        
        System.out.println("a, r, g, b = " + a +
                ", " + r + ", " + g + ", " + b);
    }
}
