import java.util.Scanner;

public class theotherddas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X1: ");
        float x1 = sc.nextFloat();
        System.out.println("Enter the value of Y1: ");
        float y1 = sc.nextFloat();
        System.out.println("Enter the value of X2: ");
        float x2 = sc.nextFloat();
        System.out.println("Enter the value of Y2: ");
        float y2 = sc.nextFloat();

        float dx = x2 - x1;
        float dy = y2 - y1;

        float m = dy / dx;

        float[] xArray = new float[(int) dx + 1];
        float[] yArray = new float[(int) dx + 1];
        xArray[0] = x1;
        yArray[0] = y1;

        for (int i = 1; i <= dx; i++) {
            xArray[i] = xArray[i - 1] + 1;
            yArray[i] = yArray[i - 1] + m;
        }

        System.out.println("X\t\tY");
        for (int i = 0; i <= dx; i++) {
            System.out.println(Math.round(xArray[i]) + "\t\t" +Math.round(yArray[i]));
        }

        int[][] draw = new int [(int)y2+2][(int)x2+2];
        for(int i=0; i < draw.length; i++){
            for(int j=0; j < draw[i].length; j++){
                draw[i][j]=0;
            }
        }

        for (int i = 0; i < xArray.length; i++) {
            draw[Math.round(yArray[i])][Math.round(xArray[i])] = 1;
        }

        for (int i = 0; i < draw.length; i++) {
            for (int j = 0; j < draw[i].length; j++) {
                System.out.print(draw[i][j] + " ");
            }
            System.out.println("\t\t"+i);
        }
        /*int[][] draw = new int[3][4];

// Set values for the array
        draw[0][0] = 1;
        draw[0][1] = 2;
        draw[0][2] = 3;
        draw[0][3] = 4;

        draw[1][0] = 5;
        draw[1][1] = 6;
        draw[1][2] = 7;
        draw[1][3] = 8;

        draw[2][0] = 9;
        draw[2][1] = 10;
        draw[2][2] = 11;
        draw[2][3] = 12;
        for (int i = 0; i < draw.length; i++) {
            System.out.println("");
            for (int j = 0; j < draw[i].length; j++) {
                System.out.print(draw[i][j] + " ");
            }
        }*/
    }
}

