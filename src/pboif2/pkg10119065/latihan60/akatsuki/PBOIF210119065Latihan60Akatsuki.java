package pboif2.pkg10119065.latihan60.akatsuki;
/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program akatsuki
 */
public class PBOIF210119065Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Team team1 = new Team("Kurama", "Itachi", "Kisame");
        team1.tampilDetails();
        
        System.out.println("");
        Team team2 = new Team("Shukaku", "Sasori", "Deidara");
        team2.tampilDetails();
    }
    
}
