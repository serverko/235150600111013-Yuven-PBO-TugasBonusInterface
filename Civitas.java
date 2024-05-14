package BonusInterface.src;

abstract class Civitas {
    String nama;
    int umur;
    boolean jenisKelamin;

    abstract void MakanDiKantin(String kantin);
    abstract void MainGameCorner();
    void naikLift() {
        System.out.println("Naik lift");
    }
}
