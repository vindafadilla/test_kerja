package GedungParkir;

public class Motor extends Kendaraan{
	public Motor()
    {
        lot = 1;
        jenis = JenisKendaraan.Motor;
    }
    public boolean cekLotParkir(GedungParkir spot) 
    { 
    	return true;
    }
}
