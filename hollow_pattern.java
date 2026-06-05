public class hollow_pattern {
    public static void hollow_Rectangle(int tot_row, int tot_column){
        for(int i = 1; i<=tot_row ; i++){
            for(int j =1; j<=tot_column; j++){
                if(i == 1 || i == tot_row || j == 1 || j == tot_column){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
    hollow_Rectangle(4 , 5);
}
}
