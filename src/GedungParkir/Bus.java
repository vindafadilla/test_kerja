package GedungParkir;

public class Bus extends Kendaraan{
	public Bus()
    {
        lot = 3;
        jenis = JenisKendaraan.Motor;
    }
    public boolean cekLotParkir(GedungParkir spot) 
    { 
    	return true;
    }
}
