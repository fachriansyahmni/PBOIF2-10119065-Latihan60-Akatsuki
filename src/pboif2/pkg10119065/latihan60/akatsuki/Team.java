package pboif2.pkg10119065.latihan60.akatsuki;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program akatsuki
 */
public class Team extends Akatsuki{
    private String target,nama1, nama2;

    public Team(String target, String nama1, String nama2) {
        this.target = target;
        this.nama1 = nama1;
        this.nama2 = nama2;
    }
    
    @Override
    public void tampilDetails()
    {
        System.out.println("Nama 1      : "+nama1);
        System.out.println("Nama 2      : "+nama2);
        System.out.println("Target      : "+target);
    }
}
