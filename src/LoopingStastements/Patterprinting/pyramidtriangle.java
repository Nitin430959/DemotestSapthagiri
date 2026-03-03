package LoopingStastements.Patterprinting;

public class pyramidtriangle {
    public static void main(String[] args) {
        //upper part
        for (int i = 1; i < 8; i++) {
            for (int star = 1; star <=8-i; star++) {
                System.out.print("   ");
            }
            for (int space =1; space <=(2*i); space++){
                System.out.print(" * ");
            }
            for(int star =1; star<=8-i; star++)
            System.out.println();
        }
        //lower part
        for (int i =1; i <= 5; i++) {
        for (int space = 1; space <=(5-i); space++) {
        System.out.print("   ");
        }
        for (int star =1; star <=(2*i-1); star++){
        System.out.print(" * ");
        }
        System.out.println();
        }
        for (int i =1; i <= 5; i++) {
            for (int space = 1; space <=(5-i); space++) {
                System.out.print("   ");
            }
            for (int star =1; star <=(2*i); star++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}


