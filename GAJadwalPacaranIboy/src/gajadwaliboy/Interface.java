/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gajadwaliboy;
import java.awt.Color;
import java.util.ArrayList;
/**
 *
 * @author KEVIN
 */
public class Interface extends javax.swing.JFrame {

    public void Generate(){
        
        String s[] = new String[10];
        Color c[] = new Color[10];
        String s1[] = new String[20];        
        int i;
        
        ArrayList<String> PG = g.PopulasiGetter() ;
        jTextArea1.setText(PG.get(0));
        jTextArea2.setText(PG.get(1));
        jTextArea3.setText(PG.get(2));
        jTextArea4.setText(PG.get(3));
        jTextArea5.setText(PG.get(4));
        jTextArea6.setText(PG.get(5));
        jTextArea7.setText(PG.get(6));
        jTextArea8.setText(PG.get(7));
        jTextArea9.setText(PG.get(8));
        jTextArea10.setText(PG.get(9));
        
        ArrayList<String> PM = g.MatingGetter();
        jTextArea11.setText(PM.get(0));
        jTextArea12.setText(PM.get(1));
        jTextArea13.setText(PM.get(2));
        jTextArea14.setText(PM.get(3));
        jTextArea15.setText(PM.get(4));
        jTextArea16.setText(PM.get(5));
        jTextArea17.setText(PM.get(6));
        jTextArea18.setText(PM.get(7));
        jTextArea19.setText(PM.get(8));
        jTextArea20.setText(PM.get(9));
        
        s[0] = jTextArea1.getText();
        s[1] = jTextArea2.getText();
        s[2] = jTextArea3.getText();
        s[3] = jTextArea4.getText();
        s[4] = jTextArea5.getText();
        s[5] = jTextArea6.getText();
        s[6] = jTextArea7.getText();
        s[7] = jTextArea8.getText();
        s[8] = jTextArea9.getText();
        s[9] = jTextArea10.getText();
        
        c[0] = jTextArea1.getBackground();
        c[1] = jTextArea2.getBackground();
        c[2] = jTextArea3.getBackground();
        c[3] = jTextArea4.getBackground();
        c[4] = jTextArea5.getBackground();
        c[5] = jTextArea6.getBackground();
        c[6] = jTextArea7.getBackground();
        c[7] = jTextArea8.getBackground();
        c[8] = jTextArea9.getBackground();
        c[9] = jTextArea10.getBackground();
           
        for ( i = 0; i < 10; i++){
            if (jTextArea11.getText().equalsIgnoreCase(s[i])){
                jTextArea11.setBackground(c[i]);
            }
            if (jTextArea12.getText().equalsIgnoreCase(s[i])){
                jTextArea12.setBackground(c[i]);
            }
            if (jTextArea13.getText().equalsIgnoreCase(s[i])){
                jTextArea13.setBackground(c[i]);
            }
            if (jTextArea14.getText().equalsIgnoreCase(s[i])){
                jTextArea14.setBackground(c[i]);
            }
            if (jTextArea15.getText().equalsIgnoreCase(s[i])){
                jTextArea15.setBackground(c[i]);
            }
            if (jTextArea16.getText().equalsIgnoreCase(s[i])){
                jTextArea16.setBackground(c[i]);
            }
            if (jTextArea17.getText().equalsIgnoreCase(s[i])){
                jTextArea17.setBackground(c[i]);
            }
            if (jTextArea18.getText().equalsIgnoreCase(s[i])){
                jTextArea18.setBackground(c[i]);
            }
            if (jTextArea19.getText().equalsIgnoreCase(s[i])){
                jTextArea19.setBackground(c[i]);
            }
            if (jTextArea20.getText().equalsIgnoreCase(s[i])){
                jTextArea20.setBackground(c[i]);
            }
        }
        
        int[] cp = g.CrossGetter();
        
        s[0] = jTextArea11.getText();
        s[1] = jTextArea12.getText();
        s[2] = jTextArea13.getText();
        s[3] = jTextArea14.getText();
        s[4] = jTextArea15.getText();
        s[5] = jTextArea16.getText();
        s[6] = jTextArea17.getText();
        s[7] = jTextArea18.getText();
        s[8] = jTextArea19.getText();
        s[9] = jTextArea20.getText();
        
        s1[0] = s[0].substring(0,cp[0]);
        s1[1] = s[0].substring(cp[0]);
        s1[2] = s[1].substring(0,cp[0]);
        s1[3] = s[1].substring(cp[0]);
        s1[4] = s[2].substring(0,cp[1]);
        s1[5] = s[2].substring(cp[1]);
        s1[6] = s[3].substring(0,cp[1]);
        s1[7] = s[3].substring(cp[1]);
        s1[8] = s[4].substring(0,cp[2]);
        s1[9] = s[4].substring(cp[2]);
        s1[10] = s[5].substring(0,cp[2]);
        s1[11] = s[5].substring(cp[2]);
        s1[12] = s[6].substring(0,cp[3]);
        s1[13] = s[6].substring(cp[3]);
        s1[14] = s[7].substring(0,cp[3]);
        s1[15] = s[7].substring(cp[3]);
        s1[16] = s[8].substring(0,cp[4]);
        s1[17] = s[8].substring(cp[4]);
        s1[18] = s[9].substring(0,cp[4]);
        s1[19] = s[9].substring(cp[4]);
        
        jTextArea41.setText(s1[0]);
        jTextArea51.setText(s1[1]);
        jTextArea42.setText(s1[2]);
        jTextArea52.setText(s1[3]);
        jTextArea43.setText(s1[4]);
        jTextArea53.setText(s1[5]);
        jTextArea44.setText(s1[6]);
        jTextArea54.setText(s1[7]);
        jTextArea45.setText(s1[8]);
        jTextArea55.setText(s1[9]);
        jTextArea46.setText(s1[10]);
        jTextArea56.setText(s1[11]);
        jTextArea47.setText(s1[12]);
        jTextArea57.setText(s1[13]);
        jTextArea48.setText(s1[14]);
        jTextArea58.setText(s1[15]);
        jTextArea49.setText(s1[16]);
        jTextArea59.setText(s1[17]);
        jTextArea50.setText(s1[18]);
        jTextArea60.setText(s1[19]);
   
        s[0] = g.poolCrossover.get(0);
        s[1] = g.poolCrossover.get(1);
        s[2] = g.poolCrossover.get(2);
        s[3] = g.poolCrossover.get(3);
        s[4] = g.poolCrossover.get(4);
        s[5] = g.poolCrossover.get(5);
        s[6] = g.poolCrossover.get(6);
        s[7] = g.poolCrossover.get(7);
        s[8] = g.poolCrossover.get(8);
        s[9] = g.poolCrossover.get(9);
        
        jTextArea21.setText(s[0]);
        jTextArea22.setText(s[1]);
        jTextArea23.setText(s[2]);
        jTextArea24.setText(s[3]);
        jTextArea25.setText(s[4]);
        jTextArea26.setText(s[5]);
        jTextArea27.setText(s[6]);
        jTextArea28.setText(s[7]);
        jTextArea29.setText(s[8]);
        jTextArea30.setText(s[9]);
        
        int[] mp = g.MutationGetter();
        ArrayList<String> Mutate = g.poolMutation;
        
        for (i = 0; i < 10; i++){
            
            s[i] = Mutate.get(i);
            s1[i] = s[i].substring(0,mp[i]) + "==" + s[i].charAt(mp[i]) + "==" + s[i].substring(mp[i]+1);
        }
        
        jTextArea31.setText(s1[0]);
        jTextArea32.setText(s1[1]);
        jTextArea33.setText(s1[2]);
        jTextArea34.setText(s1[3]);
        jTextArea35.setText(s1[4]);
        jTextArea36.setText(s1[5]);
        jTextArea37.setText(s1[6]);
        jTextArea38.setText(s1[7]);
        jTextArea39.setText(s1[8]);
        jTextArea40.setText(s1[9]);    
        
        enlightenment1.setText(Integer.toString(g.FitnessFunction(jTextArea31.getText())));
        enlightenment2.setText(Integer.toString(g.FitnessFunction(jTextArea32.getText())));
        enlightenment3.setText(Integer.toString(g.FitnessFunction(jTextArea33.getText())));
        enlightenment4.setText(Integer.toString(g.FitnessFunction(jTextArea34.getText())));
        enlightenment5.setText(Integer.toString(g.FitnessFunction(jTextArea35.getText())));
        enlightenment6.setText(Integer.toString(g.FitnessFunction(jTextArea36.getText())));
        enlightenment7.setText(Integer.toString(g.FitnessFunction(jTextArea37.getText())));
        enlightenment8.setText(Integer.toString(g.FitnessFunction(jTextArea38.getText())));
        enlightenment9.setText(Integer.toString(g.FitnessFunction(jTextArea39.getText())));
        enlightenment10.setText(Integer.toString(g.FitnessFunction(jTextArea40.getText())));
    }
    
    
    
    public Interface() {
        initComponents();
        
        g.Initialization();
        
        g.nextGeneration();
        
        Generate();
        
       
        
    }
    
    public GeneticScheduler g = new GeneticScheduler();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane11 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea20 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane42 = new javax.swing.JScrollPane();
        jTextArea41 = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        jTextArea42 = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        jTextArea43 = new javax.swing.JTextArea();
        jScrollPane45 = new javax.swing.JScrollPane();
        jTextArea44 = new javax.swing.JTextArea();
        jScrollPane46 = new javax.swing.JScrollPane();
        jTextArea50 = new javax.swing.JTextArea();
        jScrollPane47 = new javax.swing.JScrollPane();
        jTextArea49 = new javax.swing.JTextArea();
        jScrollPane48 = new javax.swing.JScrollPane();
        jTextArea48 = new javax.swing.JTextArea();
        jScrollPane49 = new javax.swing.JScrollPane();
        jTextArea47 = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        jTextArea46 = new javax.swing.JTextArea();
        jScrollPane51 = new javax.swing.JScrollPane();
        jTextArea45 = new javax.swing.JTextArea();
        jScrollPane52 = new javax.swing.JScrollPane();
        jTextArea51 = new javax.swing.JTextArea();
        jScrollPane53 = new javax.swing.JScrollPane();
        jTextArea52 = new javax.swing.JTextArea();
        jScrollPane54 = new javax.swing.JScrollPane();
        jTextArea53 = new javax.swing.JTextArea();
        jScrollPane55 = new javax.swing.JScrollPane();
        jTextArea54 = new javax.swing.JTextArea();
        jScrollPane56 = new javax.swing.JScrollPane();
        jTextArea60 = new javax.swing.JTextArea();
        jScrollPane57 = new javax.swing.JScrollPane();
        jTextArea59 = new javax.swing.JTextArea();
        jScrollPane58 = new javax.swing.JScrollPane();
        jTextArea58 = new javax.swing.JTextArea();
        jScrollPane59 = new javax.swing.JScrollPane();
        jTextArea57 = new javax.swing.JTextArea();
        jScrollPane60 = new javax.swing.JScrollPane();
        jTextArea56 = new javax.swing.JTextArea();
        jScrollPane61 = new javax.swing.JScrollPane();
        jTextArea55 = new javax.swing.JTextArea();
        jScrollPane22 = new javax.swing.JScrollPane();
        jTextArea21 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        jTextArea22 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        jTextArea23 = new javax.swing.JTextArea();
        jScrollPane25 = new javax.swing.JScrollPane();
        jTextArea24 = new javax.swing.JTextArea();
        jScrollPane26 = new javax.swing.JScrollPane();
        jTextArea25 = new javax.swing.JTextArea();
        jScrollPane27 = new javax.swing.JScrollPane();
        jTextArea26 = new javax.swing.JTextArea();
        jScrollPane28 = new javax.swing.JScrollPane();
        jTextArea27 = new javax.swing.JTextArea();
        jScrollPane29 = new javax.swing.JScrollPane();
        jTextArea28 = new javax.swing.JTextArea();
        jScrollPane30 = new javax.swing.JScrollPane();
        jTextArea29 = new javax.swing.JTextArea();
        jScrollPane31 = new javax.swing.JScrollPane();
        jTextArea30 = new javax.swing.JTextArea();
        jScrollPane32 = new javax.swing.JScrollPane();
        jTextArea31 = new javax.swing.JTextArea();
        jScrollPane33 = new javax.swing.JScrollPane();
        jTextArea32 = new javax.swing.JTextArea();
        jScrollPane34 = new javax.swing.JScrollPane();
        jTextArea33 = new javax.swing.JTextArea();
        jScrollPane35 = new javax.swing.JScrollPane();
        jTextArea34 = new javax.swing.JTextArea();
        jScrollPane36 = new javax.swing.JScrollPane();
        jTextArea35 = new javax.swing.JTextArea();
        jScrollPane37 = new javax.swing.JScrollPane();
        jTextArea36 = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        jTextArea37 = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        jTextArea38 = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        jTextArea39 = new javax.swing.JTextArea();
        jScrollPane41 = new javax.swing.JScrollPane();
        jTextArea40 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        population = new javax.swing.JLabel();
        selection = new javax.swing.JLabel();
        crossover1 = new javax.swing.JLabel();
        crossover2 = new javax.swing.JLabel();
        crossoverResult = new javax.swing.JLabel();
        mutationResult = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        jScrollPane62 = new javax.swing.JScrollPane();
        result = new javax.swing.JTextArea();
        enlightenment1 = new javax.swing.JLabel();
        enlightenment2 = new javax.swing.JLabel();
        enlightenment3 = new javax.swing.JLabel();
        enlightenment4 = new javax.swing.JLabel();
        enlightenment5 = new javax.swing.JLabel();
        enlightenment6 = new javax.swing.JLabel();
        enlightenment7 = new javax.swing.JLabel();
        enlightenment8 = new javax.swing.JLabel();
        enlightenment9 = new javax.swing.JLabel();
        enlightenment10 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(100, 200, 105));
        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setAutoscrolls(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(255, 200, 200));
        jTextArea2.setColumns(20);
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(200, 255, 200));
        jTextArea3.setColumns(20);
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(255, 255, 200));
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(new java.awt.Color(255, 100, 255));
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setWrapStyleWord(true);
        jScrollPane5.setViewportView(jTextArea5);

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setLineWrap(true);
        jTextArea10.setRows(5);
        jTextArea10.setWrapStyleWord(true);
        jScrollPane10.setViewportView(jTextArea10);

        jTextArea9.setEditable(false);
        jTextArea9.setBackground(new java.awt.Color(255, 255, 0));
        jTextArea9.setColumns(20);
        jTextArea9.setLineWrap(true);
        jTextArea9.setRows(5);
        jTextArea9.setWrapStyleWord(true);
        jScrollPane9.setViewportView(jTextArea9);

        jTextArea8.setEditable(false);
        jTextArea8.setBackground(new java.awt.Color(200, 200, 55));
        jTextArea8.setColumns(20);
        jTextArea8.setLineWrap(true);
        jTextArea8.setRows(5);
        jTextArea8.setWrapStyleWord(true);
        jTextArea8.setAutoscrolls(false);
        jScrollPane8.setViewportView(jTextArea8);

        jTextArea7.setEditable(false);
        jTextArea7.setBackground(new java.awt.Color(100, 200, 255));
        jTextArea7.setColumns(20);
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(5);
        jTextArea7.setWrapStyleWord(true);
        jScrollPane7.setViewportView(jTextArea7);

        jTextArea6.setEditable(false);
        jTextArea6.setBackground(new java.awt.Color(255, 200, 100));
        jTextArea6.setColumns(20);
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(5);
        jTextArea6.setWrapStyleWord(true);
        jScrollPane6.setViewportView(jTextArea6);

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setLineWrap(true);
        jTextArea11.setRows(5);
        jTextArea11.setWrapStyleWord(true);
        jScrollPane12.setViewportView(jTextArea11);

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setLineWrap(true);
        jTextArea12.setRows(5);
        jTextArea12.setWrapStyleWord(true);
        jScrollPane13.setViewportView(jTextArea12);

        jTextArea13.setEditable(false);
        jTextArea13.setColumns(20);
        jTextArea13.setLineWrap(true);
        jTextArea13.setRows(5);
        jTextArea13.setWrapStyleWord(true);
        jScrollPane14.setViewportView(jTextArea13);

        jTextArea14.setEditable(false);
        jTextArea14.setColumns(20);
        jTextArea14.setLineWrap(true);
        jTextArea14.setRows(5);
        jTextArea14.setWrapStyleWord(true);
        jScrollPane15.setViewportView(jTextArea14);

        jTextArea15.setEditable(false);
        jTextArea15.setColumns(20);
        jTextArea15.setLineWrap(true);
        jTextArea15.setRows(5);
        jTextArea15.setWrapStyleWord(true);
        jScrollPane16.setViewportView(jTextArea15);

        jTextArea20.setEditable(false);
        jTextArea20.setColumns(20);
        jTextArea20.setLineWrap(true);
        jTextArea20.setRows(5);
        jTextArea20.setWrapStyleWord(true);
        jScrollPane17.setViewportView(jTextArea20);

        jTextArea16.setEditable(false);
        jTextArea16.setColumns(20);
        jTextArea16.setLineWrap(true);
        jTextArea16.setRows(5);
        jTextArea16.setWrapStyleWord(true);
        jScrollPane21.setViewportView(jTextArea16);

        jTextArea18.setEditable(false);
        jTextArea18.setColumns(20);
        jTextArea18.setLineWrap(true);
        jTextArea18.setRows(5);
        jTextArea18.setWrapStyleWord(true);
        jScrollPane19.setViewportView(jTextArea18);

        jTextArea19.setEditable(false);
        jTextArea19.setColumns(20);
        jTextArea19.setLineWrap(true);
        jTextArea19.setRows(5);
        jTextArea19.setWrapStyleWord(true);
        jScrollPane18.setViewportView(jTextArea19);

        jTextArea17.setEditable(false);
        jTextArea17.setColumns(20);
        jTextArea17.setLineWrap(true);
        jTextArea17.setRows(5);
        jTextArea17.setWrapStyleWord(true);
        jScrollPane20.setViewportView(jTextArea17);

        jTextArea41.setEditable(false);
        jTextArea41.setColumns(20);
        jTextArea41.setLineWrap(true);
        jTextArea41.setRows(5);
        jTextArea41.setWrapStyleWord(true);
        jScrollPane42.setViewportView(jTextArea41);

        jTextArea42.setEditable(false);
        jTextArea42.setColumns(20);
        jTextArea42.setLineWrap(true);
        jTextArea42.setRows(5);
        jTextArea42.setWrapStyleWord(true);
        jScrollPane43.setViewportView(jTextArea42);

        jTextArea43.setEditable(false);
        jTextArea43.setColumns(20);
        jTextArea43.setLineWrap(true);
        jTextArea43.setRows(5);
        jTextArea43.setWrapStyleWord(true);
        jScrollPane44.setViewportView(jTextArea43);

        jTextArea44.setEditable(false);
        jTextArea44.setColumns(20);
        jTextArea44.setLineWrap(true);
        jTextArea44.setRows(5);
        jTextArea44.setWrapStyleWord(true);
        jScrollPane45.setViewportView(jTextArea44);

        jTextArea50.setEditable(false);
        jTextArea50.setColumns(20);
        jTextArea50.setLineWrap(true);
        jTextArea50.setRows(5);
        jTextArea50.setWrapStyleWord(true);
        jScrollPane46.setViewportView(jTextArea50);

        jTextArea49.setEditable(false);
        jTextArea49.setColumns(20);
        jTextArea49.setLineWrap(true);
        jTextArea49.setRows(5);
        jTextArea49.setWrapStyleWord(true);
        jScrollPane47.setViewportView(jTextArea49);

        jTextArea48.setEditable(false);
        jTextArea48.setColumns(20);
        jTextArea48.setLineWrap(true);
        jTextArea48.setRows(5);
        jTextArea48.setWrapStyleWord(true);
        jScrollPane48.setViewportView(jTextArea48);

        jTextArea47.setEditable(false);
        jTextArea47.setColumns(20);
        jTextArea47.setLineWrap(true);
        jTextArea47.setRows(5);
        jTextArea47.setWrapStyleWord(true);
        jScrollPane49.setViewportView(jTextArea47);

        jTextArea46.setEditable(false);
        jTextArea46.setColumns(20);
        jTextArea46.setLineWrap(true);
        jTextArea46.setRows(5);
        jTextArea46.setWrapStyleWord(true);
        jScrollPane50.setViewportView(jTextArea46);

        jTextArea45.setEditable(false);
        jTextArea45.setColumns(20);
        jTextArea45.setLineWrap(true);
        jTextArea45.setRows(5);
        jTextArea45.setWrapStyleWord(true);
        jScrollPane51.setViewportView(jTextArea45);

        jTextArea51.setEditable(false);
        jTextArea51.setColumns(20);
        jTextArea51.setLineWrap(true);
        jTextArea51.setRows(5);
        jTextArea51.setWrapStyleWord(true);
        jScrollPane52.setViewportView(jTextArea51);

        jTextArea52.setEditable(false);
        jTextArea52.setColumns(20);
        jTextArea52.setLineWrap(true);
        jTextArea52.setRows(5);
        jTextArea52.setWrapStyleWord(true);
        jScrollPane53.setViewportView(jTextArea52);

        jTextArea53.setEditable(false);
        jTextArea53.setColumns(20);
        jTextArea53.setLineWrap(true);
        jTextArea53.setRows(5);
        jTextArea53.setWrapStyleWord(true);
        jScrollPane54.setViewportView(jTextArea53);

        jTextArea54.setEditable(false);
        jTextArea54.setColumns(20);
        jTextArea54.setLineWrap(true);
        jTextArea54.setRows(5);
        jTextArea54.setWrapStyleWord(true);
        jScrollPane55.setViewportView(jTextArea54);

        jTextArea60.setEditable(false);
        jTextArea60.setColumns(20);
        jTextArea60.setLineWrap(true);
        jTextArea60.setRows(5);
        jTextArea60.setWrapStyleWord(true);
        jScrollPane56.setViewportView(jTextArea60);

        jTextArea59.setEditable(false);
        jTextArea59.setColumns(20);
        jTextArea59.setLineWrap(true);
        jTextArea59.setRows(5);
        jTextArea59.setWrapStyleWord(true);
        jScrollPane57.setViewportView(jTextArea59);

        jTextArea58.setEditable(false);
        jTextArea58.setColumns(20);
        jTextArea58.setLineWrap(true);
        jTextArea58.setRows(5);
        jTextArea58.setWrapStyleWord(true);
        jScrollPane58.setViewportView(jTextArea58);

        jTextArea57.setEditable(false);
        jTextArea57.setColumns(20);
        jTextArea57.setLineWrap(true);
        jTextArea57.setRows(5);
        jTextArea57.setWrapStyleWord(true);
        jScrollPane59.setViewportView(jTextArea57);

        jTextArea56.setEditable(false);
        jTextArea56.setColumns(20);
        jTextArea56.setLineWrap(true);
        jTextArea56.setRows(5);
        jTextArea56.setWrapStyleWord(true);
        jScrollPane60.setViewportView(jTextArea56);

        jTextArea55.setEditable(false);
        jTextArea55.setColumns(20);
        jTextArea55.setLineWrap(true);
        jTextArea55.setRows(5);
        jTextArea55.setWrapStyleWord(true);
        jScrollPane61.setViewportView(jTextArea55);

        jTextArea21.setEditable(false);
        jTextArea21.setColumns(20);
        jTextArea21.setLineWrap(true);
        jTextArea21.setRows(5);
        jTextArea21.setWrapStyleWord(true);
        jScrollPane22.setViewportView(jTextArea21);

        jTextArea22.setEditable(false);
        jTextArea22.setColumns(20);
        jTextArea22.setLineWrap(true);
        jTextArea22.setRows(5);
        jTextArea22.setWrapStyleWord(true);
        jScrollPane23.setViewportView(jTextArea22);

        jTextArea23.setEditable(false);
        jTextArea23.setColumns(20);
        jTextArea23.setLineWrap(true);
        jTextArea23.setRows(5);
        jTextArea23.setWrapStyleWord(true);
        jScrollPane24.setViewportView(jTextArea23);

        jTextArea24.setEditable(false);
        jTextArea24.setColumns(20);
        jTextArea24.setLineWrap(true);
        jTextArea24.setRows(5);
        jTextArea24.setWrapStyleWord(true);
        jScrollPane25.setViewportView(jTextArea24);

        jTextArea25.setEditable(false);
        jTextArea25.setColumns(20);
        jTextArea25.setLineWrap(true);
        jTextArea25.setRows(5);
        jTextArea25.setWrapStyleWord(true);
        jScrollPane26.setViewportView(jTextArea25);

        jTextArea26.setEditable(false);
        jTextArea26.setColumns(20);
        jTextArea26.setLineWrap(true);
        jTextArea26.setRows(5);
        jTextArea26.setWrapStyleWord(true);
        jScrollPane27.setViewportView(jTextArea26);

        jTextArea27.setEditable(false);
        jTextArea27.setColumns(20);
        jTextArea27.setLineWrap(true);
        jTextArea27.setRows(5);
        jTextArea27.setWrapStyleWord(true);
        jScrollPane28.setViewportView(jTextArea27);

        jTextArea28.setEditable(false);
        jTextArea28.setColumns(20);
        jTextArea28.setLineWrap(true);
        jTextArea28.setRows(5);
        jTextArea28.setWrapStyleWord(true);
        jScrollPane29.setViewportView(jTextArea28);

        jTextArea29.setEditable(false);
        jTextArea29.setColumns(20);
        jTextArea29.setLineWrap(true);
        jTextArea29.setRows(5);
        jTextArea29.setWrapStyleWord(true);
        jScrollPane30.setViewportView(jTextArea29);

        jTextArea30.setEditable(false);
        jTextArea30.setColumns(20);
        jTextArea30.setLineWrap(true);
        jTextArea30.setRows(5);
        jTextArea30.setWrapStyleWord(true);
        jScrollPane31.setViewportView(jTextArea30);

        jTextArea31.setEditable(false);
        jTextArea31.setColumns(20);
        jTextArea31.setLineWrap(true);
        jTextArea31.setRows(5);
        jTextArea31.setWrapStyleWord(true);
        jScrollPane32.setViewportView(jTextArea31);

        jTextArea32.setEditable(false);
        jTextArea32.setColumns(20);
        jTextArea32.setLineWrap(true);
        jTextArea32.setRows(5);
        jTextArea32.setWrapStyleWord(true);
        jScrollPane33.setViewportView(jTextArea32);

        jTextArea33.setEditable(false);
        jTextArea33.setColumns(20);
        jTextArea33.setLineWrap(true);
        jTextArea33.setRows(5);
        jTextArea33.setWrapStyleWord(true);
        jScrollPane34.setViewportView(jTextArea33);

        jTextArea34.setEditable(false);
        jTextArea34.setColumns(20);
        jTextArea34.setLineWrap(true);
        jTextArea34.setRows(5);
        jTextArea34.setWrapStyleWord(true);
        jScrollPane35.setViewportView(jTextArea34);

        jTextArea35.setEditable(false);
        jTextArea35.setColumns(20);
        jTextArea35.setLineWrap(true);
        jTextArea35.setRows(5);
        jTextArea35.setWrapStyleWord(true);
        jScrollPane36.setViewportView(jTextArea35);

        jTextArea36.setEditable(false);
        jTextArea36.setColumns(20);
        jTextArea36.setLineWrap(true);
        jTextArea36.setRows(5);
        jTextArea36.setWrapStyleWord(true);
        jScrollPane37.setViewportView(jTextArea36);

        jTextArea37.setEditable(false);
        jTextArea37.setColumns(20);
        jTextArea37.setLineWrap(true);
        jTextArea37.setRows(5);
        jTextArea37.setWrapStyleWord(true);
        jScrollPane38.setViewportView(jTextArea37);

        jTextArea38.setEditable(false);
        jTextArea38.setColumns(20);
        jTextArea38.setLineWrap(true);
        jTextArea38.setRows(5);
        jTextArea38.setWrapStyleWord(true);
        jScrollPane39.setViewportView(jTextArea38);

        jTextArea39.setEditable(false);
        jTextArea39.setColumns(20);
        jTextArea39.setLineWrap(true);
        jTextArea39.setRows(5);
        jTextArea39.setWrapStyleWord(true);
        jScrollPane40.setViewportView(jTextArea39);

        jTextArea40.setEditable(false);
        jTextArea40.setColumns(20);
        jTextArea40.setLineWrap(true);
        jTextArea40.setRows(5);
        jTextArea40.setWrapStyleWord(true);
        jScrollPane41.setViewportView(jTextArea40);

        jButton1.setText("NEXT STEP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SKIP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        population.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        population.setText("Populasi");

        selection.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        selection.setText("Hasil Seleksi");

        crossover1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crossover1.setText("Crossover Segmen 1");

        crossover2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crossover2.setText("Crossover Segmen 2");

        crossoverResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        crossoverResult.setText("Hasil Crossover");

        mutationResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mutationResult.setText("Hasil Mutasi");

        resultLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resultLabel.setText("Result");

        result.setColumns(20);
        result.setRows(5);
        jScrollPane62.setViewportView(result);

        enlightenment1.setText("Enlightenment");

        enlightenment2.setText("Enlightenment");

        enlightenment3.setText("Enlightenment");

        enlightenment4.setText("Enlightenment");

        enlightenment5.setText("Enlightenment");

        enlightenment6.setText("Enlightenment");

        enlightenment7.setText("Enlightenment");

        enlightenment8.setText("Enlightenment");

        enlightenment9.setText("Enlightenment");

        enlightenment10.setText("Enlightenment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(jScrollPane2)
                                .addComponent(jScrollPane3)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane6)
                                    .addComponent(jScrollPane8)
                                    .addComponent(jScrollPane7)
                                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(jScrollPane14)
                                .addComponent(jScrollPane12)
                                .addComponent(jScrollPane21)
                                .addComponent(jScrollPane20)
                                .addComponent(jScrollPane19)
                                .addComponent(jScrollPane18)
                                .addComponent(jScrollPane17)
                                .addComponent(jScrollPane16)
                                .addComponent(jScrollPane13))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane45, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jScrollPane44)
                                    .addComponent(jScrollPane42)
                                    .addComponent(jScrollPane50)
                                    .addComponent(jScrollPane49)
                                    .addComponent(jScrollPane48)
                                    .addComponent(jScrollPane47)
                                    .addComponent(jScrollPane46)
                                    .addComponent(jScrollPane51)
                                    .addComponent(jScrollPane43))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane55, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(jScrollPane54)
                                    .addComponent(jScrollPane52)
                                    .addComponent(jScrollPane60)
                                    .addComponent(jScrollPane59)
                                    .addComponent(jScrollPane58)
                                    .addComponent(jScrollPane57)
                                    .addComponent(jScrollPane56)
                                    .addComponent(jScrollPane61)
                                    .addComponent(jScrollPane53))
                                .addGap(141, 141, 141)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(158, 158, 158)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(enlightenment7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(enlightenment5))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(enlightenment4))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(67, 67, 67)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(enlightenment3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(enlightenment2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(enlightenment1, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(enlightenment8, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(enlightenment6, javax.swing.GroupLayout.Alignment.TRAILING))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(enlightenment9)
                                            .addComponent(enlightenment10)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(population)
                        .addGap(252, 252, 252)
                        .addComponent(selection)
                        .addGap(153, 153, 153)
                        .addComponent(crossover1)
                        .addGap(102, 102, 102)
                        .addComponent(crossover2)
                        .addGap(197, 197, 197)
                        .addComponent(crossoverResult)
                        .addGap(304, 304, 304)
                        .addComponent(mutationResult))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(844, 844, 844)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultLabel)
                            .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crossover2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(crossoverResult, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(crossover1)
                        .addComponent(mutationResult)
                        .addComponent(selection)
                        .addComponent(population)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(enlightenment1)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(enlightenment2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(enlightenment3)
                                .addGap(47, 47, 47)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(enlightenment4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(enlightenment5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(enlightenment6)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(enlightenment7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(enlightenment8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(enlightenment9)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(enlightenment10)))))
                .addComponent(resultLabel)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton1.getAccessibleContext().setAccessibleDescription("");

        jScrollPane11.setViewportView(jPanel1);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("Genetic Algorithm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(554, 554, 554)
                .addComponent(title)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        g.nextGeneration();
        
        Generate();
        
        if (g.currentGeneration() >= g.maxGeneration()) {
            result.setText(g.getBest());
            GUIJadwal ga = new GUIJadwal(g.getBest(),g.parser.DB);
            ga.setVisible(true);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        g.LoopGeneration();
        
        Generate();
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        
        result.setText(g.getBest());
        GUIJadwal ga = new GUIJadwal(g.getBest(),g.parser.DB);
        ga.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel crossover1;
    private javax.swing.JLabel crossover2;
    private javax.swing.JLabel crossoverResult;
    private javax.swing.JLabel enlightenment1;
    private javax.swing.JLabel enlightenment10;
    private javax.swing.JLabel enlightenment2;
    private javax.swing.JLabel enlightenment3;
    private javax.swing.JLabel enlightenment4;
    private javax.swing.JLabel enlightenment5;
    private javax.swing.JLabel enlightenment6;
    private javax.swing.JLabel enlightenment7;
    private javax.swing.JLabel enlightenment8;
    private javax.swing.JLabel enlightenment9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane51;
    private javax.swing.JScrollPane jScrollPane52;
    private javax.swing.JScrollPane jScrollPane53;
    private javax.swing.JScrollPane jScrollPane54;
    private javax.swing.JScrollPane jScrollPane55;
    private javax.swing.JScrollPane jScrollPane56;
    private javax.swing.JScrollPane jScrollPane57;
    private javax.swing.JScrollPane jScrollPane58;
    private javax.swing.JScrollPane jScrollPane59;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane60;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea20;
    private javax.swing.JTextArea jTextArea21;
    private javax.swing.JTextArea jTextArea22;
    private javax.swing.JTextArea jTextArea23;
    private javax.swing.JTextArea jTextArea24;
    private javax.swing.JTextArea jTextArea25;
    private javax.swing.JTextArea jTextArea26;
    private javax.swing.JTextArea jTextArea27;
    private javax.swing.JTextArea jTextArea28;
    private javax.swing.JTextArea jTextArea29;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea30;
    private javax.swing.JTextArea jTextArea31;
    private javax.swing.JTextArea jTextArea32;
    private javax.swing.JTextArea jTextArea33;
    private javax.swing.JTextArea jTextArea34;
    private javax.swing.JTextArea jTextArea35;
    private javax.swing.JTextArea jTextArea36;
    private javax.swing.JTextArea jTextArea37;
    private javax.swing.JTextArea jTextArea38;
    private javax.swing.JTextArea jTextArea39;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea40;
    private javax.swing.JTextArea jTextArea41;
    private javax.swing.JTextArea jTextArea42;
    private javax.swing.JTextArea jTextArea43;
    private javax.swing.JTextArea jTextArea44;
    private javax.swing.JTextArea jTextArea45;
    private javax.swing.JTextArea jTextArea46;
    private javax.swing.JTextArea jTextArea47;
    private javax.swing.JTextArea jTextArea48;
    private javax.swing.JTextArea jTextArea49;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea50;
    private javax.swing.JTextArea jTextArea51;
    private javax.swing.JTextArea jTextArea52;
    private javax.swing.JTextArea jTextArea53;
    private javax.swing.JTextArea jTextArea54;
    private javax.swing.JTextArea jTextArea55;
    private javax.swing.JTextArea jTextArea56;
    private javax.swing.JTextArea jTextArea57;
    private javax.swing.JTextArea jTextArea58;
    private javax.swing.JTextArea jTextArea59;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea60;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JLabel mutationResult;
    private javax.swing.JLabel population;
    private javax.swing.JTextArea result;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel selection;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
