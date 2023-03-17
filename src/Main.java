public class Main {

   static int [][] dondur(int [][] eski,int length1,int length2){

        int [][] yeni =new int[length2][length1];

       for (int i = 0; i < yeni.length; i++) {
           for (int j = 0; j < yeni[i].length; j++) {
                yeni[i][j]=eski[j][i];
               System.out.print(yeni[i][j]);


    }
           System.out.println();}

       return yeni;
   }

    public static void main(String[] args) {


       int [][] dizi = {{3,2,1,1},{4,3,2,5},{7,2,9,8}};
        int [][] transpoze = dondur(dizi,dizi.length,dizi[0].length);

    }

}