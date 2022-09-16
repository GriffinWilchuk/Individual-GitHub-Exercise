

class SimpleProgram {
    public static void main(String[] args) {

    //simple tests
    int c = subtract(8, 2);
    if(c == 6){
        System.out.println("Two positives subtract correctly"); //tests for two postives correctness
    }
    int a = -3;
    int b = 7;
    c = subtract(a, b);
    if(c == -10){
        System.out.println("a negative and a positive subtract correctly"); //tests for a negative and positive correctness
    }
    a = -5;
    b = -9;
    c = subtract(a, b);
    if(c == 4){
        System.out.println("Two neagtives subtract correctly"); // tests for two negatives correctness
    }
        
    }

    public static int subtract(int a, int b){

        return a - b;

        //adding a comment to show commit and push.
        

}
}
