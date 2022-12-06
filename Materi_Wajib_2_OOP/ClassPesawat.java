package Materi_Wajib_2_OOP;

public class ClassPesawat {
    int KapasitasPenumpang = 10;
    int TahunProduksi = 2015;
    int JumlahPenerbangan = 4;
    String NamaMaskapai = "Alif";
    String DataMasihLayarPakai = "Layak";

    public void UpdatePenerbangan(){
        JumlahPenerbangan++;
    }

    public boolean CekKapasitasPenumpang(){
        if(JumlahPenerbangan < 50){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean BatasPenerbangan(){
        if(JumlahPenerbangan < 5 || TahunProduksi > 2014){
            System.out.println("Data Masih Layak Pakai");
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        ClassPesawat pesawat = new ClassPesawat();
    
        System.out.println("Kapasitas Penumpang : "+pesawat.KapasitasPenumpang);
        System.out.println("Tahun Diproduksi    : "+pesawat.TahunProduksi);
        System.out.println("Jumlah Penerbangan  : "+pesawat.JumlahPenerbangan);
        pesawat.UpdatePenerbangan();
        System.out.println("Jumlah Penerbangan  : "+pesawat.JumlahPenerbangan);
        System.out.println("Nama Maskapai       : "+pesawat.NamaMaskapai);

        System.out.println("Batas Penerbangan    : "+pesawat.BatasPenerbangan());
    }
}