package BackTracking;

public class NQueen {
    public static void main(String []args){
        int board[][] = { { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 },
                { 0, 0, 0, 0 } };
        int len=board[0].length;
    //    System.out.println("length"+len);

        if(solve(board,0,len))
            printboard(board,len);
        else
            System.out.println("Not possible");
    }

    private static void printboard(int[][] board,int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }

    }

    private static boolean solve(int[][] board, int row,int len) {

        if(row>=len){
            return true;
        }
        for(int col=0;col<len;col++){
            if(isSafe(board,row,col)){
                board[row][col]=1;
                if(solve(board,row+1,len))
                 return true;
                 board[row][col]=0;

            }
        }
        return false;

    }

    private static boolean isSafe(int[][] board, int row, int col) {

        int i,j;
        for(i=0;i<col;i++){
            if(board[row][i]==1)
                return false;
        }
        for(i=0;i<row;i++){
            if(board[i][col]==1)
                return false;
        }

        for(i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1)
                return false;
        }
        for(i=row,j=col;i>=0 && j<board.length;i--,j++){
            if(board[i][j]==1)
                return false;
        }
        return true;
    }
}
