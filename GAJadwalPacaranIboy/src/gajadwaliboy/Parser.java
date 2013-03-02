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
public class Parser {
    public Parser(){}
    public Iboy SiIboy = new Iboy();
    public Iboy.DataUmum DB= SiIboy.new DataUmum();
    Iboy.Kandidat IK;
    public String[] arrofstr = new String[9];
    public void ParserJadwalKandidat(){
        try{
            ArrayList<String> barisfile = new ArrayList<String>();
            FileInputStream infile = new FileInputStream("jadwalkandidat.txt");
            DataInputStream in = new DataInputStream(infile);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            int k = 0;
            while ((strLine = br.readLine()) != null) {
                arrofstr[k] = strLine;
                k++;

            }
            strLine = br.readLine();
            
            
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void ParserInfoUmum(){
        try{
            
           
            ArrayList<String> barisfile = new ArrayList<String>();
            FileInputStream infile = new FileInputStream("infoumum.txt");
            DataInputStream in = new DataInputStream(infile);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            String [] tokens;
            strLine = br.readLine();
            String[] result1 = strLine.split(" ");
            DB.modaluang = Integer.parseInt(result1[0]);
            DB.tambahanuangperhari = Integer.parseInt(result1[1]);
            DB.waktudalamminggu = Integer.parseInt(result1[2]);
            DB.energi = Integer.parseInt(result1[3]);
            strLine = br.readLine();
            DB.jumlahkandidat = Integer.parseInt(strLine);
            
            for(int jumkandidat = 1; jumkandidat<=DB.jumlahkandidat;jumkandidat++){
                if(strLine!=null){
                    strLine = br.readLine();
                    
                    String[] result2 = strLine.split(" ");
                    
                    IK = SiIboy.new Kandidat();
                    
                    IK.nomorkandidat = jumkandidat;
                    IK.enlightmentperjam = Integer.parseInt(result2[0]);
                    IK.energiperjam = Integer.parseInt(result2[1]);
                    IK.maksimaljamperhari = Integer.parseInt(result2[2]);
                    IK.barang = result2[3];

                    IK.JadwalKandidat = arrofstr[jumkandidat-1];

                    DB.ListKandidatIboy.add(IK);
                

                }
                
            }
           
            strLine = br.readLine();
            DB.jenisbarang = Integer.parseInt(strLine);
            for(int jumbarang = 0; jumbarang<DB.jenisbarang;jumbarang++){
                strLine = br.readLine();
                String[] result3 = strLine.split(" ");
                Iboy.Barang IB = SiIboy.new Barang();
                IB.kode = result3[0].toCharArray()[0];
                IB.hargabarang = Integer.parseInt(result3[1]);
                IB.restockperhari = Integer.parseInt(result3[2]);
                DB.ListBarangIboy.add(IB);
            }
            
            
            
            
            
            
            
            
            
            
        }catch(Exception e){
        e.printStackTrace();
        }
    }
    
}
