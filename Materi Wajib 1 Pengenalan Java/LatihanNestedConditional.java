public class LatihanNestedConditional {
    
    public static void main(String[] args){
        int sks = 145;
        String status ="Tidak cuti";

        if (sks < 144  ){
            if (status.equals("Tidak cuti")){
                System.out.println("Kamu memiliki total SKS : "+sks);
                System.out.println("Status kuliah : "+status);
                System.out.println("Kamu di DO");
            }
            else{
                if(sks < 120){
                    System.out.println("Kamu memiliki total SKS : "+sks);
                    System.out.println("Status kuliah : "+status);
                    System.out.println("Kamu di DO");
                }
                else{
                    System.out.println("Kamu memiliki total SKS : "+sks);
                    System.out.println("Status kuliah : "+status);
                    System.out.println("Kamu tidak di DO");
                }

            }
            
        }
        else{
            System.out.println("Kamu tidak di DO");
        }
    }
}
