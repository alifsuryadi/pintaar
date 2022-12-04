public class LatihanNestedConditional {
    
    public static void main(String[] args){
        int sks = 121;
        boolean pernahcuti = true;

        if (pernahcuti){
            if (sks < 120 ){
                System.out.println("Kamu di DO");
            }
            else{
                System.out.println("Kamu tidak jadi DO");
            }
            
        }
        else{
            if(sks < 144){
                System.out.println("Kamu di DO");
            }
            else{
                System.out.println("Kamu tidak jadi di DO");
            }
        }
    }
}
