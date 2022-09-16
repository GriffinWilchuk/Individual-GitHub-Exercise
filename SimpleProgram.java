

class SimpleProgram {
    public static void main(String[] args) {
    
//simple tests for multiply feature
int c = multiply(8, 2);
if(c == 16){
    System.out.println("Two positives multiply correctly"); //tests for two postives correctness
}
int a = -3;
int b = 7;
c = multiply(a, b);
if(c == -21){
    System.out.println("a negative and a positive multiply correctly"); //tests for a negative and positive correctness
}
a = -5;
b = -9;
c = multiply(a, b);
if(c == 45){
    System.out.println("Two neagtives multiply correctly"); // tests for two negatives correctness
}

        
    }

    public static int multiply(int a, int b){ //function call is now multiply()

        return a * b;  //function now multiplies a and b instead of adding
    }

        

}

