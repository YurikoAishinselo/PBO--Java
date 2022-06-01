package loopshape;

public class LoopShape {
    
    static void createRectangle(int width, int height){
        //Draw a Rectangle
        for(int a=0;a<width;a++){
            System.out.print("*");
        }
        System.out.println("");   
        for(int b=2;b<height;b++){
                System.out.print("*");
                for(int c=2;c<width;c++){
                    System.out.print(" ");
                }
                System.out.println("*");
        }    
        for(int a=0; a<width;a++){
            System.out.print("*");
        }
        System.out.println("");
        
    }
    
    static void createTriangle(int leg){
        //Draw an Isosceles Right Triangle
         int a = 1;
           System.out.println("*");
           do{System.out.print("*");
           a++;
               for(int b=1;b<a;b++){
                   if (a>=2 && a<leg){
                       System.out.print(" ");
                   }
                   else if(a==leg){
                       System.out.print("*");
                   }
               }
               System.out.println("*");
               
           }    
           while(a<leg);
        
    }
}
