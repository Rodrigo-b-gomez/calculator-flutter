import java.util.Scanner;

public class RodCalJava {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);
        float[] nums=new float[2];
        float result=0;
        boolean error=true;
        int op=0;
        do{
            System.out.println("Seleccione una opcion:");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");
            op=leer.nextInt();

            switch(op){

                case 1:
                    op=1;
                    System.out.println("");
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=leer.nextFloat();
                    }
                    result=nums[0] + nums[1];
                    error=false;
                    break;

                case 2:
                    op=2;
                    System.out.println("");
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=leer.nextFloat();
                    }
                    result=(nums[0]) - (nums[1]);
                    error=false;
                    break;

                case 3:
                    op=3;
                    System.out.println("");
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=leer.nextFloat();
                    }
                    result=(nums[0]) * (nums[1]);
                    error=false;
                    break;

                case 4:
                    op=4;
                    System.out.println("");
                    for (int i = 0; i < 2; i++) {
                        System.out.print("Numero "+(i+1)+": ");
                        nums[i]=leer.nextFloat();
                    }
                    if(nums[1]!=0){
                        result=(nums[0])/(nums[1]);
                        error=false;
                    }
                    else{
                        error=true;
                    }
                    break;

                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("");
                    if(error==false){
                        System.out.println("Resultado de la operacion: "+result);
                    }
                    else if(error==true){
                        System.out.println("ERROR: No se puede realizar la operacion.");
                    }
                    break;
            }
        }while(op!=5);
    }
}

