// public class Main{
//     public static void main(String[] args){
//         for(int i = 5; i >= 0; i--){

//             for(int j = 5; j >= i; j--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//=============================================================

// public class Main{
//     public static void main(String[] args){
//         for(int i = 1; i <= 5; i++){

//             for(int j = 5; j >= i; j--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }
//     }
// }

//====================================================================

// public class Main{
//     public static void main(String[] args){
//         for(int i = 1; i <= 5; i++){

//             for(int j = 5; j >= i; j--){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }

//         for(int i = 2; i <= 5; i++){
               
//             for(int j = 1; j <= i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 5; j >= i; j--){
//                 System.out.print(" *");
//             }
//             System.out.println();
//         }


//     }
// }
//====================================================================

public class Main{
    public static void main(String[] args){
       for(int i = 1; i <= 6; i++){
        for(int j = 1; j < i; j++){

            if((i == 4 & j == 2) ||i == 5  ){
                System.out.print(" ");
            } else {

          System.out.print("*");

            }
           
           
        }
        System.out.println();
       }
    }
}