public class mainApp {
    public static void main(String[] args) {
        // Karyawan
        Karyawan karyawan = new Karyawan("Ali", "Praya");
        Karyawan karyawan1 = new Karyawan("Ana", "Praya", "123456");

        //Status Pendidikan
        StatusPendidikan A = new StatusPendidikan("UGM", "S2");;
        StatusPendidikan B = new StatusPendidikan("UI", "S1");

        //Jabatan
        Jabatan jabatan = new Jabatan("Manajer", "Mengatur Karyawan");
        Jabatan jabatan1 = new Jabatan("Staff", "membuat laporan");

        //Penggajian
        int a = Penggajian.gaji(10000000, 500000, 100000);
        int b = Penggajian.gaji(1500000, 400000, 50000);

        System.out.println("************************************");
        System.out.println("========== Data Karyawan ===========");
        System.out.println("************************************");
        System.out.println(" ");
        System.out.println("Data Karyawan 1 yaitu = Nama : "+ karyawan.nama +", Alamat : "+ karyawan.alamat);
        System.out.println("Lulusan : "+A.lulusan+", Pendidikan Akhir : "+A.pendAkhir);
        System.out.println("Jabatan Ali Adalah "+ jabatan.posisi+" dan Bertugas "+ jabatan.tugas);
        System.out.println("Total Gaji : "+a);
        System.out.println(" ");
        System.out.println("Data Karyawan 2 yaitu = Nama : "+ karyawan1.nama + ", Alamat : "+ karyawan1.alamat+", No.Tlp : "+karyawan1.tlp);
        System.out.println("Lulusan : "+B.lulusan+", Pendidikan Akhir : "+B.pendAkhir);
        System.out.println("Jabatan Ana Adalah "+ jabatan1.posisi+" dan Bertugas "+ jabatan1.tugas);
        System.out.println("Total Gaji : "+b);


    }

}
