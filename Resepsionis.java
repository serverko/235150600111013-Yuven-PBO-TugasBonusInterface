package BonusInterface.src;

class Resepsionis extends Civitas {
    int idResepsionis;
    String jabatan;
    double gaji;

    void melayani() {
        System.out.println("Melayani tamu");
    }

    void melapor() {
        System.out.println("Melapor ke pimpinan");
    }

    @Override
    void MakanDiKantin(String kantin) {
        System.out.println("Makan di kantin " + kantin);
    }

    @Override
    void MainGameCorner() {
        System.out.println("Bermain di game corner");
    }
}