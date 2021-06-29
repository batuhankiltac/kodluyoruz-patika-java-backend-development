import java.util.*;

public class MineSweeper {

    Scanner input = new Scanner(System.in);

    public void run() {
        System.out.print("Satır sayısını giriniz: ");
        int row = input.nextInt();

        System.out.print("Sütun sayısını giriniz: ");
        int column = input.nextInt();

        int mineNumber = (row * column) / 4;
        createTable(row, column, mineNumber);
    }

    public void createTable(int row, int column, int mineNumber) {
        String[][] matrix = new String[row][column];
        int[] arr;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = "-";
            }
        }
        for (int i = 0; i < mineNumber; i++) {
            do {
                arr = mine(row, column);

            }
            while (matrix[arr[0]][arr[1]].equals("*"));
            matrix[arr[0]][arr[1]] = "*";
        }
        System.out.println("Mayınların Konumu");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
        line();
        play(matrix, row, column);
    }

    public int[] mine(int row, int column) {
        Random randomLocation = new Random();
        int[] mineLocation = {randomLocation.nextInt(row), randomLocation.nextInt(column)};
        return mineLocation;
    }

    public void line() {
        System.out.println("==========================");
    }

    public void play(String[][] matrix, int row, int column) {
        System.out.println("Mayın Tarlası Oyununa Hoş Geldiniz!");
        String[][] hMatrix = new String[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                hMatrix[i][j] = "-";
            }
        }
        boolean status = true;
        int count = 0;
        int r = 0;
        int c = 0;
        int info = 0;
        
        do {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    System.out.print(hMatrix[i][j] + " ");
                }
                System.out.print("\n");
            }
            do {
                System.out.print("Satır giriniz: ");
                r = input.nextInt();

                System.out.print("Sütun giriniz: ");
                c = input.nextInt();

                if (r >= row || c >= column) {
                    System.out.println("Satır veya sütun sayısından büyük sayı girmeyiniz. Lütfen tekrar deneyin.");
                }
            }
            while (r >= row || c >= column);

            if (matrix[r][c].equals("*")) {
                System.out.println("Game Over!!");
                status = false;
            }
            else {
                info = 0;
                if (r - 1 >= 0) {
                    if (matrix[r - 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c - 1 >= 0) {
                    if (matrix[r - 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c - 1 >= 0) {
                    if (matrix[r][c - 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < column) {
                    if (matrix[r][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (c + 1 < column && r + 1 < row) {
                    if (matrix[r + 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < row) {
                    if (matrix[r + 1][c].equals("*")) {
                        info++;
                    }
                }
                if (r - 1 >= 0 && c + 1 < column) {
                    if (matrix[r - 1][c + 1].equals("*")) {
                        info++;
                    }
                }
                if (r + 1 < row && c - 1 >= 0) {
                    if (matrix[r + 1][c - 1].equals("*")) {
                        info++;
                    }
                }
                hMatrix[r][c] = String.valueOf(info);
                count++;
            }
            line();
        }
        while (status && count < (row * column) - ((row * column) / 4));
        
        if (status) {
            System.out.println("Oyunu Kazandınız!");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (hMatrix[i][j].equals("-")) {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(hMatrix[i][j] + " ");
                    }
                }
                System.out.print("\n");
            }
        }
    }
}
