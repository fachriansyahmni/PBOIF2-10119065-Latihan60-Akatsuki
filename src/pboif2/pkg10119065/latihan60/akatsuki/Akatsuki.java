package pboif2.pkg10119065.latihan60.akatsuki;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program akatsuki
 */
public class Akatsuki {
    protected String nama, asalDesa;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsalDesa() {
        return asalDesa;
    }

    public void setAsalDesa(String asalDesa) {
        this.asalDesa = asalDesa;
    }
    
    public void tampilDetails(){
        System.out.println("Nama      : "+nama);
        System.out.println("Asal Desa : "+asalDesa);
    }
}
