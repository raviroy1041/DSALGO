package array;

public class FloodFill {

    static int M = 8;
    static int N = 8;

    public static void main(String[] args) {
        int screen[][] = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };
        int x = 4, y = 4, newC = 3;
        floodFill(screen, x, y, newC);

        System.out.println("Updated screen after call to floodFill: ");
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(screen[i][j] + " ");
            System.out.println();
        }
    }

    private static void floodFill(int[][] screen, int x, int y, int newC) {

        if(screen[x][y]==newC)
            return;
            floodFillUtil(screen,x,y,screen[x][y],newC);

    }
    private static void floodFillUtil(int[][] screen, int x, int y, int prevC, int newC) {


        if(x<0 || y<0 || x>=M || y>=N)
            return;
        if(screen[x][y]!=prevC)
            return;

        screen[x][y]=newC;
        floodFillUtil(screen,x+1,y,prevC,newC);
        floodFillUtil(screen,x,y+1,prevC,newC);
        floodFillUtil(screen,x-1,y,prevC,newC);
        floodFillUtil(screen,x,y-1,prevC,newC);

    }
}



