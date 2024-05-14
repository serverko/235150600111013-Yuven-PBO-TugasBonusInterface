package BonusInterface.src;

class Dosen extends Civitas implements PesertaKelas, Pengajar {
    String nip;
    double gaji;

    void ikutPenelitian() {
        System.out.println("Ikut dalam penelitian");
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

    @Override
    public void mengajar(String matkul) {
        System.out.println("Mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println("Memberikan tugas kepada mahasiswa");
    }

    @Override
    public void menilaiTugas() {
        System.out.println("Menilai tugas mahasiswa");
    }
}