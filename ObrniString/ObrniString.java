import java.util.Scanner;

class ObrniString{
    public static void main(String[] args){
        var s = new Scanner(System.in);
        
        System.out.print("Input some sentence: ");
        char[] sentence = s.nextLine().toCharArray();
        
        System.out.println("Reversed string: ");
        for(int i = sentence.length - 1; i >= 0; i--)
            System.out.print(sentence[i]);
    }
}
