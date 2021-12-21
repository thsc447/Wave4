package POO_I.classI.integrationII;

public class Ex01 {
    public static void main(String[] args) {
        Integer[] vector = {52, 10, 85, 1324, 01, 13, 62, 30, 12,  127};

        System.out.println("In order: ");
        for (Integer number : vector) {
            System.out.println(number);
        }

        System.out.println("Reverse: ");
        for(int i = vector.length-1; i >= 0; --i){
            System.out.println(vector[i]);
        }


    }
}
