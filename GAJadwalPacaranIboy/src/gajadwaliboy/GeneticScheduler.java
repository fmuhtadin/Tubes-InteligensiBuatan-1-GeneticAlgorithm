/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gajadwaliboy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 *
 * @author Compaq
 */
public class GeneticScheduler {
    public Parser parser;
    public Iboy iboy;
    public ArrayList<String> poolPopulasi;
    public ArrayList<String> poolMating;
    public ArrayList<String> poolCrossover;
    public ArrayList<String> poolMutation;
    private int[] RCrossPoints;
    private int[] RMPoints;
    private String bestChoice = "";
    private int bestScore = 0;
    private int maxGeneration = 4000;
    private int numPopulation = 10;
    private int currentGen = 0;
    private String possibleBarang = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String possibleKandidat = "123456789";
    
    public GeneticScheduler() {
        iboy = new Iboy();
        parser = new Parser();
        parser.ParserJadwalKandidat();
        parser.ParserInfoUmum();
        // begin of my edit
        poolPopulasi = new ArrayList<String>();
        poolMating = new ArrayList<String>();
        poolCrossover = new ArrayList<String>();
        poolMutation = new ArrayList<String>();
        // end of my edit
    }
    
    public int[] CrossGetter(){
        return (RCrossPoints);    
    }
    
    public int[] MutationGetter(){
        return (RMPoints);
    }
    
    public ArrayList<String> MatingGetter(){
        return (poolMating);
    }
    
    public ArrayList<String> PopulasiGetter(){
        return (poolPopulasi);
    }
    
    public class StatusEksekusi {
        public TreeMap<Character,Integer> stokbarangtersimpan;
        public TreeMap<Character,Integer> stokbarangtoko;
        public TreeMap<Integer,Integer> lamakandidat;
        public int receivedenlightenment;
        public int energisisa;
        public int uangsisa;
        
        public StatusEksekusi() {
            stokbarangtersimpan = new TreeMap<Character,Integer>();
            stokbarangtoko = new TreeMap<Character,Integer>();
            lamakandidat = new TreeMap<Integer,Integer>();
        }
     }
    
    public void Initialization() {
        for (int i = 0; i<numPopulation; i++) {
            String temp = "";
            for (int j = 0; j<parser.DB.waktudalamminggu*70 ;j++) {
                char c1 = possibleBarang.charAt(new Random().nextInt(parser.DB.jenisbarang));
                char c2 = possibleKandidat.charAt(new Random().nextInt(parser.DB.jumlahkandidat));
                char c;
                if (new Random().nextFloat()>0.5) {
                    c = c1;
                } else {
                    c = c2;
                }
                temp += c;
            }
            poolPopulasi.add(temp);
        }
    }
    
    private void clear() {
        if (!poolMutation.isEmpty()) {
            poolPopulasi.clear();
            poolPopulasi.addAll(poolMutation);
            poolMating.clear();
            poolCrossover.clear();
            poolMutation.clear();
        }
    }
    
    public void Selection() {
    
        TreeMap<String,Integer> candidates = new TreeMap<String,Integer>();
        int totalFitness = 0;
        for(String jadwal : poolPopulasi) {
            int fitness = FitnessFunction(jadwal);
            candidates.put(jadwal, fitness);
            totalFitness += fitness;
        }
        for(String jadwal : poolPopulasi) {
            if ((float) candidates.get(jadwal) / (float) totalFitness >= 0.08) {
                poolMating.add(jadwal);
            }
        }
        int maxClone = poolMating.size();
        while (poolMating.size() < 10) {
            String text = new String(poolMating.get(new Random().nextInt(maxClone)));
            poolMating.add(text);
        }
    }
    
    public void Crossover() {
      
        int[] crossPoints = new int[5];
        
        for (int i = 0; i<poolMating.size()/2; i++) {
            String m1 = poolMating.get(2*i);
            String f1 = poolMating.get(2*i+1);
            int crossPoint = new Random().nextInt(m1.length());
            crossPoints[i] = crossPoint;
            String m2 = m1.substring(0, crossPoint) + f1.substring(crossPoint);
            String f2 = f1.substring(0, crossPoint) + m1.substring(crossPoint);
            poolCrossover.add(m2);
            poolCrossover.add(f2);
        }
        
        RCrossPoints = crossPoints;
    }
    
    public void Mutation() { 
        int[] mutatePoints = new int[10];
        int ctr = 0;
        
        for (String jadwal : poolCrossover) {
            int mutatePoint = new Random().nextInt(jadwal.length());
            mutatePoints[ctr] = mutatePoint;
            ctr++;
            char c1 = possibleBarang.charAt(new Random().nextInt(parser.DB.jenisbarang));
            char c2 = possibleKandidat.charAt(new Random().nextInt(parser.DB.jumlahkandidat));
            char c;
            if (new Random().nextFloat()>0.5) {
                c = c1;
            } else {
                c = c2;
            }
            String mutant = jadwal.substring(0, mutatePoint) + c;
            if (mutatePoint != jadwal.length() - 1) {
                mutant = mutant.concat(jadwal.substring(mutatePoint + 1));
            }
            poolMutation.add(mutant);
        }
        
        RMPoints = mutatePoints;
    }
    
    public String validate (String jadwal) {
        GeneticScheduler.StatusEksekusi se = new GeneticScheduler.StatusEksekusi();
        se.energisisa = parser.DB.energi;
        se.receivedenlightenment = 0;
        se.uangsisa = parser.DB.modaluang;
        int counter = 0;
        for (Iboy.Barang ib : parser.DB.ListBarangIboy) {
            se.stokbarangtoko.put(ib.kode, ib.restockperhari);
        }
        char[] jadwalEq = jadwal.toCharArray();
        for (char c : jadwal.toCharArray()) {
            counter++;
            if ((c <= 'Z') && (c>='A')) {
                Iboy.Barang dataBrg = parser.DB.findBarang(c);
                if (dataBrg != null) {
                    if (se.uangsisa >= dataBrg.hargabarang) {
                        if (se.stokbarangtoko.get(c) > 0) {
                            se.stokbarangtoko.put(c, se.stokbarangtoko.get(c) - 1);
                            se.uangsisa -= dataBrg.hargabarang;
                            if (se.stokbarangtersimpan.containsKey(c)) {
                                se.stokbarangtersimpan.put(c, se.stokbarangtersimpan.get(c) + 1);
                            } else {
                                se.stokbarangtersimpan.put(c, 1);
                            }
                        } else {
                            jadwalEq[counter-1] = '0';
                        }
                    } else {
                        jadwalEq[counter-1] = '0';
                    }
                }
            } else if ((c <= '9') && (c > '0')) {
                Iboy.Kandidat ik = parser.DB.findKandidat((int) c - 48);
                if (ik != null) {
                    char[] daftarBrg = ik.barang.toCharArray();
                    boolean requirementMet = true, pernah = se.lamakandidat.containsKey(ik.nomorkandidat);
                    if (pernah) {
                        requirementMet = (se.lamakandidat.get(ik.nomorkandidat) < ik.maksimaljamperhari);
                    }
                    requirementMet = requirementMet && (se.energisisa >= ik.energiperjam);
                    requirementMet = requirementMet && (ik.JadwalKandidat.charAt((counter - 1)%70) == '1');
                    if (requirementMet) {
                        for (char cc : daftarBrg) {
                            if (cc != '-') {
                                requirementMet = requirementMet && (se.stokbarangtersimpan.containsKey(cc));
                            }
                        }
                        if (requirementMet) {
                            for (char cc : daftarBrg) {
                                if (cc != '-') {
                                    se.stokbarangtersimpan.put(cc, se.stokbarangtersimpan.get(cc) - 1);
                                    if (se.stokbarangtersimpan.get(cc) <= 0) {
                                        int remove = se.stokbarangtersimpan.remove(cc);
                                    }
                                }
                            }
                            if (pernah) {
                                se.lamakandidat.put(ik.nomorkandidat, se.lamakandidat.get(ik.nomorkandidat) + 1);
                            } else {
                                se.lamakandidat.put(ik.nomorkandidat, 1);
                            }
                            se.energisisa -= ik.energiperjam;
                            se.receivedenlightenment += ik.enlightmentperjam;
                        } else {
                            jadwalEq[counter-1] = '0';
                        }
                    } else {
                        jadwalEq[counter-1] = '0';
                    }
                }
            }
            if ((counter % 10) == 0) {
                se.lamakandidat.clear();
                se.energisisa = parser.DB.energi;
                for (Iboy.Barang ib : parser.DB.ListBarangIboy) {
                    se.stokbarangtoko.put(ib.kode, ib.restockperhari);
                }
                se.uangsisa += parser.DB.tambahanuangperhari;
            }
        }
        return String.valueOf(jadwalEq);
    }
    

    public void updateBest() {
        for (String iter:poolPopulasi) {
            int score = FitnessFunction(iter);
            if (score > bestScore) {
                bestScore = score;
                bestChoice = iter;
            }
        }
    }
   
    
    public String getBest() {
        clear();
        updateBest();
        return validate(bestChoice);
    }
    
    public void LoopGeneration() {
        for (int i = currentGen; i<maxGeneration; i++) {
            clear();
            updateBest();
            Selection();
            Crossover();
            Mutation();
        }
        currentGen = maxGeneration;
    }
    
    public void nextGeneration() {
        if (currentGen < maxGeneration) {
            clear();
            updateBest();
            Selection();
            Crossover();
            Mutation();
            currentGen++;
        }
    }
    
    public int currentGeneration() {
        return currentGen;
    }
    
    public int maxGeneration() {
        return maxGeneration;
    }
    
    public int FitnessFunction(String jadwal) {
        GeneticScheduler.StatusEksekusi se = new GeneticScheduler.StatusEksekusi();
        se.energisisa = parser.DB.energi;
        se.receivedenlightenment = 0;
        se.uangsisa = parser.DB.modaluang;
        int counter = 0;
        for (Iboy.Barang ib : parser.DB.ListBarangIboy) {
            se.stokbarangtoko.put(ib.kode, ib.restockperhari);
        }
        for (char c : jadwal.toCharArray()) {
            counter++;
            if ((c <= 'Z') && (c>='A')) {
                Iboy.Barang dataBrg = parser.DB.findBarang(c);
                if (dataBrg != null) {
                    if (se.uangsisa >= dataBrg.hargabarang) {
                        if (se.stokbarangtoko.get(c) > 0) {
                            se.stokbarangtoko.put(c, se.stokbarangtoko.get(c) - 1);
                            se.uangsisa -= dataBrg.hargabarang;
                            if (se.stokbarangtersimpan.containsKey(c)) {
                                se.stokbarangtersimpan.put(c, se.stokbarangtersimpan.get(c) + 1);
                            } else {
                                se.stokbarangtersimpan.put(c, 1);
                            }
                        }
                    }
                }
            } else if ((c <= '9') && (c > '0')) {
                Iboy.Kandidat ik = parser.DB.findKandidat((int) c - 48);
                if (ik != null) {
                    char[] daftarBrg = ik.barang.toCharArray();
                    boolean requirementMet = true, pernah = se.lamakandidat.containsKey(ik.nomorkandidat);
                    if (pernah) {
                        requirementMet = (se.lamakandidat.get(ik.nomorkandidat) < ik.maksimaljamperhari);
                    }
                    requirementMet = requirementMet && (se.energisisa >= ik.energiperjam);
                    requirementMet = requirementMet && (ik.JadwalKandidat.charAt((counter - 1)%70) == '1');
                    if (requirementMet) {
                        for (char cc : daftarBrg) {
                            if (cc != '-') {
                                requirementMet = requirementMet && (se.stokbarangtersimpan.containsKey(cc));
                            }
                        }
                        if (requirementMet) {
                            for (char cc : daftarBrg) {
                                if (cc != '-') {
                                    se.stokbarangtersimpan.put(cc, se.stokbarangtersimpan.get(cc) - 1);
                                    if (se.stokbarangtersimpan.get(cc) <= 0) {
                                        int remove = se.stokbarangtersimpan.remove(cc);
                                    }
                                }
                            }
                            if (pernah) {
                                se.lamakandidat.put(ik.nomorkandidat, se.lamakandidat.get(ik.nomorkandidat) + 1);
                            } else {
                                se.lamakandidat.put(ik.nomorkandidat, 1);
                            }
                            se.energisisa -= ik.energiperjam;
                            se.receivedenlightenment += ik.enlightmentperjam;
                        }
                    }
                }
            }
            if ((counter % 10) == 0) {
                se.lamakandidat.clear();
                se.energisisa = parser.DB.energi;
                for (Iboy.Barang ib : parser.DB.ListBarangIboy) {
                    se.stokbarangtoko.put(ib.kode, ib.restockperhari);
                }
                se.uangsisa += parser.DB.tambahanuangperhari;
            }
        }
        return se.receivedenlightenment;
    }
}
