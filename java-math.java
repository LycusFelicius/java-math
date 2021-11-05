
class main {
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Pilihan : ");
        System.out.println("        1. Luas Persegi Panjang");
        System.out.println("        2. Luas Lingkaran");
        System.out.println("==============================");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = in.nextInt();
        System.out.println("==============================");
		switch (pilihan) {
            case 1:
                System.out.println("Luas Persegi Panjang");
                System.out.print("Masukkan Panjang : ");
                float panjang = in.nextFloat();
                System.out.print("Masukkan Lebar : ");
                float lebar = in.nextFloat();
                float luas = panjang * lebar;
                System.out.print("Hasil Luas Persegi Panjang Adalah : " + luas);
                break;
        
            case 2:
                double a = 3.141592653589793238;
                float pi = (float)a;
                System.out.println("Luas Lingkaran");
                System.out.print("Masukkan Jari-jari : ");
                float jari = in.nextFloat();
                double b = Math.pow(jari, 2);
                float jari_kuadrat = (float)b;
                float luas_lingkaran = pi * jari_kuadrat;
                System.out.print("Hasil Luas Lingkaran : " + luas_lingkaran);
                break;
        }
		in.close();
	}
}
