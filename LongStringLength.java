import java.util.Arrays;

public class LongStringLength {
    static int[] columnMax(String [][] a){

        int rows = a.length;
        int columns = a[0].length;

        int [] n = new int[columns];
        for(int i=0;i<columns;i++){
            int max_t = 0;
            for(int j=0;j<rows;j++){
                if(a[j][i].length() > max_t){
                    max_t = a[j][i].length();
                }
            }
            n[i] = max_t;
        }


        return n;
    }

    public static void main(String[] args) {
        String[][] a =     {{"help", "ok", "city lights"},
        {"elvisLives", "hello", "punch-out"},
        {"hurrah", "humptydumpty", "123"}};
        int[] res = columnMax(a);
        for(int i=0;i< res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
