import java.util.HashMap;
import java.util.Map;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
// И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class third_task5 {
    public static void main(String[] args) {
        Map<Integer, Integer> chessboard = new HashMap<>();
        placeQueens(chessboard, 0);
        printChessboard(chessboard);
    }

    public static void printChessboard(Map<Integer, Integer> chessboard) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                int pos = i * 8 + j;
                if (chessboard.containsKey(pos))
                    System.out.print("x ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static boolean possiblePlace(Map<Integer, Integer> chessboard, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (chessboard.containsKey(i * 8 + col))               
                return false;
        }
        
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard.containsKey(i * 8 + j))
                return false;
        }

        for (int i = row, j = col; i >= 0 && j < 8; i--, j++) {
            if (chessboard.containsKey(i * 8 + j))
                return false;
        }
        return true;
    }

    public static boolean placeQueens(Map<Integer, Integer> chessboard, int row) {
        if (row == 8)
            return true;

        for (int i = 0; i < 8; i++) {
            if (possiblePlace(chessboard, row, i)) {
                chessboard.put(row * 8 + i, 1);
                if (placeQueens(chessboard, row + 1))
                    return true;
                chessboard.remove(row * 8 + i);
            }
        }
        return false;
    }
}
