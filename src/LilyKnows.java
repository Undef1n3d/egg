public class LilyKnows {
    public static final int side_length = 8;
    public static void main(String[] args) {
        arrowup();
        line();
        botdiamond();
        topdiamond();
        line();
        botdiamond();
        topdiamond();
        line();
        arrowup();
    }

    public static void arrowup() {
        int mor = side_length * 2 - 1;
        int x = 1;
        for (int i = 0; i < side_length * 2 - 1; i++) {
            for (int z = mor; z > 0; z--) {
                System.out.print(" ");
            }
            for (int l = 0; l < x; l++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int j = 0; j < x; j++) {
                System.out.print("\\");
            }
            System.out.println();
            x++;
            mor--;
        }
    }

    public static void line(){
        System.out.print("+");
        for (int i=0; i<side_length*2;i++) {
            System.out.print("*");
            System.out.print("=");
        }
        System.out.println("+");
    }

    public static void topdiamond(){
        int dot1=side_length;
        int stuf=0;
        int dot2=side_length*2-2;
        for (int l=0; l<side_length; l++) {
            System.out.print("|");
            for (int j = 0; j < stuf; j++) {
                System.out.print(".");
            }
            for (int i = dot1; i > 0; i--) {
                System.out.print("\\/");
            }
            for (int j = 0; j < stuf; j++) {
                System.out.print("..");
            }
            for (int i = dot1; i > 0; i--) {
                System.out.print("\\/");
            }
            for (int j = 0; j < stuf; j++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
            stuf++;
            dot1--;
            dot2 -= 2;
        }
    }
    public static void botdiamond(){
        int dot1=side_length-1;
        int stuf=1;
        int dot2=side_length*2-2;
        for (int l=0; l<side_length; l++){
            System.out.print("|");
            for (int i = dot1; i > 0; i--) {
                System.out.print(".");
            }
            for (int j =0; j<stuf; j++) {
                System.out.print("/\\");
            }
            for (int z=dot2; z>0; z--){
                System.out.print(".");
            }
            for (int j =0; j<stuf; j++) {
                System.out.print("/\\");
            }
            for (int i = dot1; i > 0; i--) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
            stuf++;
            dot1--;
            dot2-=2;
        }
    }
}
