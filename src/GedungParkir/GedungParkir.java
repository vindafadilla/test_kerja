package GedungParkir;

import java.util.logging.Level;

public class GedungParkir {
	private Kendaraan kendaraan;
    private JenisKendaraan jenisKendaraan;
    private int row;
    private int nomorLot;
    private Level level;
  
    public GedungParkir(Level lvl, int r, int n, JenisKendaraan jk)
    {
    	//
    }
  
    public boolean isAvailable()
    {
        return kendaraan == null;
    }
  
    // Mengecek lot kendaraan apakah cukup
    public boolean cekLotKendaraan(Kendaraan kendaraan) { 
    	return true;
    }
  
    // Memarkir kendaraan di lot ini
    public boolean park(Kendaraan k) {
    	return true;
    }
  
    public int getRow()
    {
        return row;
    }
    public int getNomorLot()
    {
        return nomorLot;
    }
  
    //Mengeluarkan kendaraan dari lot parkir
    public void removeKendaraan() {
    	//
    }

}
