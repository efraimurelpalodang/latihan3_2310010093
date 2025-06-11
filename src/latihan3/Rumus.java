package latihan3;

// nama : Efraim urel palodang
// npm  : 2310010093
// Kelas : 4D

public class Rumus {
    int sisi, panjang, lebar, hasil;
    
    public Rumus() {
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public int hitungLuasPersegi(int sisi) {
        this.sisi = sisi;
        this.hasil = sisi * sisi;
        return this.hasil;
    }
    
    public int hitungLuasPersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.hasil = panjang * lebar;
        return this.hasil;
    }
    
    public int getHasil() {
        return hasil;
    }
}
