package BonusInterface.src;

class Mahasiswa extends Civitas implements PesertaKelas {
    String nim;
    double ipk;
    int golUKT;

    void ngerjainTugas() {
        System.out.println("Mengerjakan tugas");
    }

    void pasrah() {
        System.out.println("Pasrah dengan takdir");
    }

    void mengikutiOrganisasi(String nama) {
        System.out.println("Mengikuti organisasi " + nama);
    }

    void presentasi() {
        System.out.println("Melakukan presentasi");
    }

    @Override
    void MakanDiKantin(String kantin) {
        System.out.println("Makan di kantin " + kantin);
    }

    @Override
    void MainGameCorner() {
        System.out.println("Bermain di game corner");
    }

    @Override
    public void masukKelas() {
        System.out.println("Masuk ke dalam kelas");
    }
}