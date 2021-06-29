package GedungParkir;

public class Mobil extends Kendaraan {
	public Mobil()
    {
        lot = 3;
        jenis = JenisKendaraan.Motor;
    }
    public boolean cekLotParkir(GedungParkir spot) 
    { 
    	return true;
    }
}
