/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printalphabets;

/**
 *
 * @author user2
 */
public class PrintAlphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j;
        for(i=1;i<=5;i++){
            
            for(j=1;j<=5;j++){
                
                if (i == 1 && j==4)        //1st row 4th column     
                  System.out.print("a");
                if (i == 2 && j == 2)      //2nd row 2nd column
                  System.out.print("a");
                if (i == 2 && j == 3)      //2nd row 3rd column
                 System.out.print("b");
                if ( i == 2 && j == 4)     //2nd row 4th column
                 System.out.print("a");
                if (i == 3 && j == 1)      //3rd row 1st column
                 System.out.print("a");
                if (i == 3 && j == 2)      //3rd row 2nd column
                 System.out.print("b");
                if (i == 3 && j == 3)      //3rd row 3rd column
                 System.out.print("c");
                 if (i == 3 && j == 4)    //3rd row 4th column
                 System.out.print("b");
                if ( i == 3 && j == 5)    //3rd row 5th column
                 System.out.print("a");
                 if (i == 4 && j == 2)    //4th row 2nd column
                  System.out.print("a");
                if (i == 4 && j == 3)     //4th row 3rd column
                 System.out.print("b");
                if ( i == 4 && j == 4)    //4th row 4th column
                 System.out.print("a");
                if (i == 5 && j ==4)       //5th row 4th column     
                  System.out.print("a");
      //all the remaining rows and columns which i and j's are not specified will be filled with spaces
                else
                  System.out.print(""); 
                     
            }System.out.println();
        }
    }
    
}
