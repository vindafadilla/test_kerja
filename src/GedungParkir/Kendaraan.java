package GedungParkir;

import java.util.ArrayList;

public abstract class Kendaraan {
	protected ArrayList<GedungParkir> gedungParkir = new ArrayList<GedungParkir>();
	protected String platNomor;
	protected int lot;
	protected JenisKendaraan jenis;

	public int getLotParkir()
	{
		return lot;
	}
	public JenisKendaraan getJenis()
	{
		return jenis;
	}
	
	//Menambahkan kendaraan ke lot di gedung parkir
	public void gedungParkir(GedungParkir parkir)
	{
		gedungParkir.add(parkir);
	}
	
	//Menghapus kendaraan dari lot parkir
	public void clearLotParkir() { }
	
	//Untuk mengecek lot parkir sesuai dengan kendaraan
	public abstract boolean cekLotParkir(GedungParkir lotParkir);

}
