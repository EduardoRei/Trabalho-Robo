import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        robo robo = new robo();
        System.out.println("O robo possui "+robo.getBateria()+"% de bateria");
        while(robo.getBateria() > 10){
        
            System.out.println("Deseja andar?(y/n)");
            char d = sc.next().charAt(0);
            if (d == 'y'){
                System.out.print("Deseja andar pra frente?(y/n)");
                d = sc.next().charAt(0);
                if (d == 'y'){
                    System.out.print("Insira a distancia que deseja andar: ");
                    double mfrente = sc.nextDouble();
                    robo.andarPraFrente(mfrente);
                }
                else{
                    System.out.print("Insira a distancia que deseja andar: ");
                    double mtras = sc.nextDouble();
                    robo.andarPraTras(mtras);

                }
            }
            System.out.println("Deseja girar?(y/n)");
            d = sc.next().charAt(0);
            if (d == 'y'){
                System.out.print("Quantos graus deseja girar?");
                double graus = sc.nextDouble();
                robo.girarRobo(graus);
            }
            System.out.println("Deseja fazer uma captura de tela?(y/n)");
            d = sc.next().charAt(0);
            if (d == 'y'){
                System.out.println("Imagem capturada");
                int foto = 1;
                robo.tirarFoto(foto);         
            }
            System.out.println("O robo tem " + robo.getBateria()+"% de bateria");
            if(robo.getBateria() > 10){
                System.out.println("Deseja continuar?(y/n)");
                d = sc.next().charAt(0);
                if (d == 'n'){
                    break;
                }
            }
            
        }
        System.out.println();
        System.out.println("Robo recarregando ...");
        System.out.println();
        System.out.println(robo.toString());
        sc.close();
    }
}