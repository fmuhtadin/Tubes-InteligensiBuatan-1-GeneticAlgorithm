/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gajadwaliboy;

/**
 *
 * @author Gabrielle
 */
import java.util.*;
import java.io.*;
public class Iboy {
      public Iboy(){}
    
    public class DataUmum{
        public int modaluang;
        public int tambahanuangperhari;
        public int waktudalamminggu;
        public int energi;
        public int jumlahkandidat;
        public int jenisbarang;
        public ArrayList<Iboy.Barang> ListBarangIboy = new ArrayList<Iboy.Barang>();
        public ArrayList<Iboy.Kandidat> ListKandidatIboy = new ArrayList<Iboy.Kandidat>();
        
        public Iboy.Barang findBarang(char code) {
            Iboy.Barang result = null;
            for (Iboy.Barang iter : ListBarangIboy) {
                if (iter.kode == code) {
                    result = iter;
                    break;
                }
            }
            return result;
        }
        
        public Iboy.Kandidat findKandidat(int code) {
            Iboy.Kandidat result = null;
            for (Iboy.Kandidat iter : ListKandidatIboy) {
                if (iter.nomorkandidat == code) {
                    result = iter;
                    break;
                }
            }
            return result;
        }
    }
    public class Barang{
        public char kode;
        public int hargabarang;
        public int restockperhari;
    }
    
    public class Kandidat{
        public int nomorkandidat;
        public int enlightmentperjam;
        public int energiperjam;
        public int maksimaljamperhari;
        public String barang;
        public String JadwalKandidat;
        
 

    }
    
}
