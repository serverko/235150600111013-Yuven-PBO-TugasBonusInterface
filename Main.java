package BonusInterface.src;

public class Main {
    public static void main(String[] args) {
        // buat instance
        Resepsionis resepsionis = new Resepsionis();
        resepsionis.nama = "Budi";
        resepsionis.umur = 25;
        resepsionis.jenisKelamin = true;
        resepsionis.idResepsionis = 1234;
        resepsionis.jabatan = "Resepsionis";
        resepsionis.gaji = 5000000;

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Ani";
        mahasiswa.umur = 20;
        mahasiswa.jenisKelamin = false;
        mahasiswa.nim = "123456789";
        mahasiswa.ipk = 3.75;
        mahasiswa.golUKT = 2;

        Asprak asprak = new Asprak();
        asprak.nama = "Ciko";
        asprak.umur = 22;
        asprak.jenisKelamin = true;
        asprak.nim = "987654321";
        asprak.ipk = 3.85;
        asprak.golUKT = 1;

        Dosen dosen = new Dosen();
        dosen.nama = "Prof. Widodo";
        dosen.umur = 40;
        dosen.jenisKelamin = true;
        dosen.nip = "54321";
        dosen.gaji = 1000000;

        // Membuat instance upcasting
        Civitas civitasResepsionis = new Resepsionis();
        Civitas civitasMahasiswa = new Mahasiswa();
        Civitas civitasAsprak = new Asprak();
        Civitas civitasDosen = new Dosen();

        // Output
        System.out.println("Informasi Resepsionis:");
        System.out.println("Nama: " + resepsionis.nama);
        System.out.println("Umur: " + resepsionis.umur);
        System.out.println("ID Resepsionis: " + resepsionis.idResepsionis);
        System.out.println("Jabatan: " + resepsionis.jabatan);
        System.out.println("Gaji: " + resepsionis.gaji);

        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.nama);
        System.out.println("Umur: " + mahasiswa.umur);
        System.out.println("NIM: " + mahasiswa.nim);
        System.out.println("IPK: " + mahasiswa.ipk);
        System.out.println("Golongan UKT: " + mahasiswa.golUKT);

        System.out.println("\nInformasi Asprak:");
        System.out.println("Nama: " + asprak.nama);
        System.out.println("Umur: " + asprak.umur);
        System.out.println("NIM: " + asprak.nim);
        System.out.println("IPK: " + asprak.ipk);
        System.out.println("Golongan UKT: " + asprak.golUKT);

        System.out.println("\nInformasi Dosen:");
        System.out.println("Nama: " + dosen.nama);
        System.out.println("Umur: " + dosen.umur);
        System.out.println("NIP: " + dosen.nip);
        System.out.println("Gaji: " + dosen.gaji);
    }
}
