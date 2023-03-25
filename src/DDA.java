import java.util.Scanner;


public class DDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println( "Enter the value of x0: " );
        float x0 = sc.nextFloat();
        System.out.println( "Enter the value of y0: " );
        float y0 = sc.nextFloat();
        System.out.println( "Enter the value of x1: " );
        float x1 = sc.nextFloat();
        System.out.println( "Enter the value of y1: " );
        float y1 = sc.nextFloat();

        float deltaX = x1 - x0;
        float deltaY = y1 - y0;
        float step = Math.max( Math.abs( deltaX ), Math.abs( deltaY ) );

        float xIncrement = deltaX / step;
        float yIncrement = deltaY / step;

        float x = x0;
        float y = y0;
        int[] xArray = new int[Math.round( step + 1 )];
        int[] yArray = new int[Math.round( step + 1 )];

        System.out.println( "Pixel Coordinates" );
        System.out.println( "-------------------" );
        for (int i = 0; i <= step; i++) {
            xArray[i] = Math.round( x );
            yArray[i] = Math.round( y );
            System.out.println( Math.round( x ) + ", " + Math.round( y ) );
            x += xIncrement;
            y += yIncrement;
        }


        int[][] draw = new int[(int) y1 + 2][(int) x1 + 2];
        for (int i = 0; i < draw.length; i++) {
            for (int j = 0; j < draw[i].length; j++) {
                draw[i][j] = 0;
            }
        }

        for (int i = 0; i < step + 1; i++) {
            draw[Math.round( yArray[i] )][Math.round( xArray[i] )] = 1;
        }

        for (int i = 0; i < draw.length; i++) {
            for (int j = 0; j < draw[i].length; j++) {
                System.out.print( draw[i][j] + " " );
            }
            System.out.println( "\t|\t" + i );
        }
        int xLength = draw.length;
        for (int i = 0; i < xLength * 2; i++) {
            System.out.print( "_" );
        }
        System.out.println();
        for (int i = 0; i <= xLength; i++) {
            System.out.print( i + " " );
        }
    }
}







