import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {
        if (args.length != 1) {

            System.err.println("Only 1 number");

        }
        else {
            int number = Integer.parseInt(args[0]);

            printDeliteli(number);
        }
        
    }
    public static void printDeliteli(int number) { 
        int currentSize = 0;
        int sizeAtAll = 10;
        int[] deliteli = new int[sizeAtAll];

        for (int i = 1; i <= Math.floor(Math.pow(number, 0.5)); i++){

            if ( number % i == 0 ){
                if (currentSize == sizeAtAll){ // если можно добавить делитель а длина массива равна его максимальной вместимости то создаем новый массив в 2 раза больше 
                    int[] deliteliWithBiggerSize = Arrays.copyOf(deliteli, sizeAtAll * 2 );
                    deliteli = deliteliWithBiggerSize;
                    sizeAtAll = sizeAtAll * 2;
                }

                deliteli[currentSize] = i;
                currentSize +=1;

                if (i != number / i){
                    if (currentSize == sizeAtAll){
                        int[] deliteliWithBiggerSize = Arrays.copyOf(deliteli, sizeAtAll * 2 );
                        deliteli = deliteliWithBiggerSize;
                        sizeAtAll = sizeAtAll * 2;
                }
                    deliteli[currentSize] = (number / i);
                    currentSize += 1;
                    
                }

            }

        }
        Arrays.sort(deliteli);

        for (int i = 0 ; i <= sizeAtAll - 1 ; i++){
            if (deliteli[i] != 0){
                System.out.println(deliteli[i]);
            }
            else{
                continue;
            }
        }
    }
}
