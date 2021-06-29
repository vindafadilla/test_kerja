package FlightSimulator;
/*
 * Struktur class pada program flight simulator yang ada menggunakan extend class 
 * dimana artinya class tersebut diturunkan dari class lainnya.
 * Extend class biasanya digunakan untuk inheritance atau is-a relationship
 * dimana fungsionalitas pada parent class diturunkan pada sub class
 * Sementara, hubungan class pada flight simulator seharusnya adalah has-a relationship
 * dengan memanggil class tersebut sebagai objek dan memperlakukannya sebagai data member dari class tersebut 
 * */

class Aircraft {
	Wing wing = new Wing();
}
