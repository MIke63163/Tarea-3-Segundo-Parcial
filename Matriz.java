
public class Matriz{
    private int matriz[][];
    private int n;
    public Matriz(int n){
        this.n = n;
        matriz = new int[n][n];
    }
    public void llenarCaracol(){
        int k;
        int i;
        int j;
        int lim;
        k   = 0;
        j   = 0;
        lim = 0;
        for(i = 1; i <= n*n;){
            switch(1){
            case 1:
                   while(k < n - lim){
                         matriz[k][j] = i;
                         k++;
                         i++;
                   
                   } 
                    k--;
                    j++;
            case 2:
                   while(j < n - lim){
                         matriz[k][j] = i;
                         j++;
                         i++;
                   }
                    j--;
                    k--;
            case 3:
                   while(k > lim -1){
                          matriz[k][j] = i;
                          k--;
                          i++;
            
                   }
                    k++;
                    j--;
                    lim++;
            case 4:
                   while(j > lim -1){
                          matriz[k][j] = i;
                          j--;
                          i++;
            
                   }
                    j++;
                    k++;
            }
        }
    }
    public String mostrar(){
        String res;
        res = "";
        int j;
        int k;
        j = 0;
        k = 0;
        while(j < n && k < n){
              res += "" + matriz[j][k] + "\t";
              j++;
              if(j == n ){
                 res += "\n";
                 k++;
                 j = 0;
              }
        }
        return res;
    }
    public void diagonal(int numero){
        int j;
        int k;
        j = 0;
        k = 0;
        while(j < n){
              matriz[j][k] = numero;
              j++;
              k++;
        }
        j = 0;
        k = n - 1;
        while(j < n){
              matriz[j][k] = numero;
              j++;
              k--;
        }
    }
}
