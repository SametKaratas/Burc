import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int day;
        String ay = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Dogum ayiniz :");
        ay = input.nextLine();

        System.out.print("Dogum gununuz :");
        day = input.nextInt();

        if(ay.equals("mart")){
            if(day >= 21){
                System.out.println("Koc burcu");
            }
        }else if(ay.equals("nisan")){
            if(day <= 20){
                System.out.println("Koc burcu");
            }
        }if(ay.equals("nisan")){
            if(day >= 21){
                System.out.println("Boga burcu");
            }
        }else if(ay.equals("mayis")){
            if(day <= 21){
                System.out.println("Boga burcu");
            }
        }if(ay.equals("mayis")){
            if(day >= 22){
                System.out.println("Ikizler burcu");
            }
        }else if(ay.equals("haziran")){
            if(day <= 22){
                System.out.println("Ikizler burcu");
            }
        }if(ay.equals("haziran")){
            if(day >= 23){
                System.out.println("Yengec burcu");
            }
        }else if(ay.equals("temmuz")){
            if(day <= 22){
                System.out.println("Yengec burcu");
            }
        }if(ay.equals("temmuz")){
            if(day >= 23){
                System.out.println("Aslan burcu");
            }
        }else if(ay.equals("agustos")){
            if(day <= 22){
                System.out.println("Aslan burcu");
            }
        }if(ay.equals("agustos")){
            if(day >= 23){
                System.out.println("Basak burcu");
            }
        }else if(ay.equals("eylul")){
            if(day <= 22){
                System.out.println("Basak burcu");
            }
        }if(ay.equals("eylul")){
            if(day >= 23){
                System.out.println("Terazi burcu");
            }
        }else if(ay.equals("ekim")){
            if(day <= 22){
                System.out.println("Terazi burcu");
            }
        }if(ay.equals("ekim")){
            if(day >= 23){
                System.out.println("Akrep burcu");
            }
        }else if(ay.equals("kasim")){
            if(day <= 21){
                System.out.println("Akrep  burcu");
            }
        }if(ay.equals("kasim")){
            if(day >= 22){
                System.out.println("Yay burcu");
            }
        }else if(ay.equals("aralik")){
            if(day <= 21){
                System.out.println("Yay burcu");
            }
        }if(ay.equals("aralik")){
            if(day >= 22){
                System.out.println("Oglak burcu");
            }
        }else if(ay.equals("ocak")){
            if(day <= 21){
                System.out.println("Oglak burcu");
            }   
        }if(ay.equals("ocak")){
            if(day >= 22){
                System.out.println("Kova burcu");
            }
        }else if(ay.equals("subat")){
            if(day <= 19){
                System.out.println("Kova burcu");
            }
        }if(ay.equals("subat")){
            if(day >= 20){
                System.out.println("Balik burcu");
            }
        }else if(ay.equals("mart")){
            if(day <= 20){
                System.out.println("Balik burcu");
            }
        }
    }
}
