/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zisal.algorithm.siwalga.core;

import com.zisal.algorithm.siwalga.view.InputDataView;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Fauzi
 */
public class Data2 {

    public Data2() {
    }
    
    ArrayList makul = new ArrayList();
    ArrayList dosen = new ArrayList();
    ArrayList ruang = new ArrayList();
    
    public String [] tempMakul = new String[20];
    public String [] tempDosen = new String[20];
    public String []  tempRuang = new String[20];
    
    public Integer intMakul, intDosen, intRuang, intKromosom;

    public ArrayList getMakul() {
        return makul;
    }

    public ArrayList getDosen() {
        return dosen;
    }

    public ArrayList getRuang() {
        return ruang;
    }

    public String[] getTempMakul() {
        return tempMakul;
    }

    public String[] getTempDosen() {
        return tempDosen;
    }

    public String[] getTempRuang() {
        return tempRuang;
    }

    public Integer getIntMakul() {
        return intMakul;
    }

    public Integer getIntDosen() {
        return intDosen;
    }

    public Integer getIntRuang() {
        return intRuang;
    }

    public Integer getIntKromosom() {
        return intKromosom;
    }


    
    //input data mata kuliah
    public void setMakul(ArrayList makulData){
        this.makul = makulData;
    }
    
    public void initMakul(){
        ArrayList initLokalMakul = new ArrayList();
        for(int a = 0; a<intMakul; a++){
            String makulLokal = JOptionPane.showInputDialog(null, "Masukkan data Mata Kuliah ke "+(a+1), "Input Data Mata Kuliah", JOptionPane.QUESTION_MESSAGE);
            initLokalMakul.add(makulLokal);
            tempMakul[a] = makulLokal;            
        }
        for(int a=0; a<(20 - intMakul); a++){
            initLokalMakul.add(null);
        }
        setMakul(initLokalMakul);
    }    
    
    public String getLabelMakul(){
        String makulLokal = "";
        for(int a=0;a<intMakul; a++){
            makulLokal+=tempMakul[a]+", ";
        }
        return makulLokal;
    }    
    public void insertDataMakul(InputDataView view){
        intMakul = Integer.parseInt(view.getTxtmakul().getText());
        initMakul();        
    }

    //input data dosen
    public void initDosen(){
        ArrayList initDosen = new ArrayList();
        for(int a = 0; a<intDosen; a++){
            String dosenLokal = JOptionPane.showInputDialog(null, "Masukkan data Dosen ke "+(a+1), "Input Data Dosen", JOptionPane.QUESTION_MESSAGE);
            initDosen.add(dosenLokal);
            tempDosen[a] = dosenLokal;
        }
        for(int a=0; a<(20 - intDosen); a++){
            initDosen.add(null);
        }
        setDosen(initDosen);
    }    
    
    public void setDosen(ArrayList dosenData){
        this.dosen = dosenData;
    }
    
    public String getLabelDosen(){
        String dosenLokal = "";
        for(int a=0;a<intDosen; a++){
            dosenLokal += tempDosen[a]+" ,";
        }
        return dosenLokal;
    }        

    public void insertDataDosen(InputDataView view){
        intDosen = Integer.parseInt(view.getTxtdosen().getText());
        initDosen();
    }
    
    //insert Data Ruang
    public void initRuang(){
        ArrayList initRuang = new ArrayList();
        for(int a = 0; a < intRuang; a++){
            String ruangLokal = JOptionPane.showInputDialog(null, "Masukkan data Ruang ke "+(a+1), "Input Data Ruang", JOptionPane.QUESTION_MESSAGE);
            initRuang.add(ruangLokal);
            tempRuang[a] = ruangLokal;            
        }
        for(int a=0; a<(20 - intRuang); a++){
            initRuang.add(null);
        }        
        setRuang(initRuang);
    }        
    public void setRuang(ArrayList ruang){
        this.ruang = ruang;
    }    
    
    public String getLabelRuang(){
        String ruangLokal = "";
        for(int a=0;a<intRuang; a++){
            ruangLokal += tempRuang[a]+" ,";
        }
        return  ruangLokal;
    }            
    
    public void insertDataRuang(InputDataView view){
        intRuang = Integer.parseInt(view.getTxtruang().getText());
        initRuang();         
    }
    
    //set Data Kromosom    
    public String getLabelKromosom(){
        return String.valueOf(intKromosom);
    }
    
    public void insertDataKromosom(InputDataView view){
        intKromosom = Integer.parseInt(view.getTxtkromosom().getText());
        JOptionPane.showMessageDialog(null, "Jumlah Kromosom = "+intKromosom);            
    }
    
    Kromosom [] kromosom;
    public void buatKromosom(){        
         kromosom= new Kromosom[intKromosom];
        for(int a=0; a<intKromosom; a++){
            kromosom[a] = new Kromosom(makul, dosen, ruang);
            reInitData();
        }
    }    
    
    public void tampilKromosomAwal(){
        for(int a=0; a<intKromosom; a++){            
        }
    }
    
    public void reInitMakul(){
        ArrayList initLokalMakul = new ArrayList();
        for(int a = 0; a<intMakul; a++){
            initLokalMakul.add(tempMakul[a]);
        }
        for(int a=0; a<(20 - intMakul); a++){
            initLokalMakul.add(null);
        }        
        setMakul(initLokalMakul);        
    }
    public void reInitDosen(){
        ArrayList initLokalDosen = new ArrayList();
        for(int a = 0; a<intDosen; a++){
            initLokalDosen.add(tempDosen[a]);
        }
        for(int a=0; a<(20 - intDosen); a++){
            initLokalDosen.add(null);
        }
        setDosen(initLokalDosen);        
    }    
    public void reInitRuang(){
        ArrayList initLokalRuang = new ArrayList();
        for(int a = 0; a<intRuang; a++){
            initLokalRuang.add(tempRuang[a]);
        }
        for(int a=0; a<(20 - intRuang); a++){
            initLokalRuang.add(null);
        }
        setRuang(initLokalRuang);        
    }        
    
    
    public void reInitData(){
        reInitMakul();
        reInitDosen();
        reInitRuang();
    }            
    
    int looperForm = 0;
    public void createFormTabel(JFrame namaFrame, JTable namaTabel){
        looperForm++;
        namaFrame = new JFrame();
        namaFrame.setLocationRelativeTo(null);
        namaFrame.setTitle("Kromosom"+looperForm);
        namaFrame.setVisible(true);
        namaFrame.setSize(600,150);
        namaFrame.setLayout(new java.awt.BorderLayout());        
        namaFrame.getContentPane().add(new JScrollPane(namaTabel),java.awt.BorderLayout.CENTER);        
    }    

    //buat tabel
    
    String [] namaKolom={"Jam || Hari","Senin", "Selasa", "Rabu", "Kamis", "Jumat"};      
    JTable [] Jtables;
    JFrame [] jFrame;
    
    public void buatTabel(){
        Jtables = new JTable[intKromosom];
        jFrame = new JFrame[intKromosom];
        for(int a=0; a<intKromosom; a++){
            Jtables[a]=new JTable(new tabelModelKromosom(kromosom[a].getKromosom(), namaKolom));
            jFrame[a] = new JFrame();
            createFormTabel(jFrame[a], Jtables[a]);
        }
    }        
    
    
    public double getFitness(int valueA, int valueB, int valueC){
        return 1.0/(valueA+valueB+valueC);
    }
    
    public double getProbabilitas(double value, double totalFitness){
        return value/totalFitness;
    }
    
    public double getProbabilitasKumulatif(double predecessor, double sucessor){
        return predecessor+sucessor;
    }
    
    double [] dataRouletteWheel;
    
    public double getRandom(){
        Random r = new Random();        
        return r.nextDouble();
    }
    
    public void setDataRouletteWheel(int selektor){
        dataRouletteWheel = new double[selektor];
        for(int a=0; a<dataRouletteWheel.length; a++){
            dataRouletteWheel[a] = getRandom();
        }
    }
    
    public void sortingRouletteWheel(){
        for(int a=0; a<dataRouletteWheel.length; a++){
            for(int b=0; b<dataRouletteWheel.length; b++){
                if(dataRouletteWheel[a]<dataRouletteWheel[b]){
                    double temp = dataRouletteWheel[a];
                    dataRouletteWheel[a] = dataRouletteWheel[b];
                    dataRouletteWheel[b] = temp;
                    
                    //seleksi probkum
                    double tempProbkum = probKum[a];
                    probKum[a] = probKum[b];
                    probKum[b] = tempProbkum;
                    
                    //perubahan data
                    Kromosom tempKromosom = kromosom[a];
                    kromosom[a] = kromosom[b];
                    kromosom[b] = tempKromosom;
                }
            }
        }
    }    
    
    double [] probKum;
    double [] fitness;
    double [] probabilitas;

    double crossOverProbability = 0.25;
    double [] dataCrossOverProbability;
    
    public void setRandomCrossOverProbability(){
        Random r=new Random();
        dataCrossOverProbability = new double[intKromosom];        
        for(int a=0; a<intKromosom; a++){
            dataCrossOverProbability[a] = r.nextDouble();
        }
    }
    
    public boolean cekKeberadaan(String data){
        //jika true maka data ditemukan || sudah ada
        //jika false maka data tidak ditemukan || belum ada        
        String olah = data.substring(0, 2);
        boolean hasil = true;
        int col = matrixHasil[0].length;
        for(int a=0; a<matrixHasil.length; a++){
            for(int b=0; b<col; b++){
                String dataMatrixHasil = matrixHasil[a][b].substring(0, 2);
                if(dataMatrixHasil.equals(olah)){
                    hasil = true;
                }
                else{
                    hasil = false;
                }
            }
        }
        return hasil;
    }
    
        String [][] matrixHasil;
    public Kromosom doCrossOver(Kromosom kromosomA, Kromosom kromosomB){
        Kromosom hasil = new Kromosom(makul, dosen, ruang);
        KromosomToArray kta1 = new KromosomToArray();
        KromosomToArray kta2 = new KromosomToArray();
        kta1.convert(kromosomA.getKromosom());
        kta2.convert(kromosomB.getKromosom());
        String [][] dataKTA1 = kta1.getArray();
        String [][] dataKTA2 = kta2.getArray();
        int col = dataKTA1[0].length;
        matrixHasil = new String[dataKTA1.length][col]; 
        //System.out.println("Height = "+dataKTA1.length);
        //System.out.println("Width = "+col);
        
        for(int a=0; a<dataKTA1.length; a++){
            for(int b=0; b<col; b++){
                String getDataKTA1 = dataKTA1[a][b];
                String getDataKTA2 = dataKTA2[a][b];
                
                if((getDataKTA1.equals("-")) && (!getDataKTA2.equals("-")) && (cekKeberadaan(getDataKTA2) == false)){
                    matrixHasil[a][b] = getDataKTA2;
                }else if((!getDataKTA1.equals("-")) && (getDataKTA2.equals("-")) && (cekKeberadaan(getDataKTA1)) == false){
                    matrixHasil[a][b] = getDataKTA1;
                }else{
                    matrixHasil[a][b] = "-";
                }
            }
        }             
        
        System.out.println("data kromosom baru");
        for(int a=0; a<matrixHasil.length; a++){
            for(int b=0; b<matrixHasil[0].length; b++){
                System.out.println(matrixHasil[a][b]);
            }
            System.out.println();
        }
        
        
        hasil = new Kromosom(matrixHasil);
        return hasil;
    }
        
    public void crossOver(){
        setRandomCrossOverProbability();
        System.out.println("Data Crossover probability");
        for(int a=0; a<dataCrossOverProbability.length; a++){
            System.out.println(dataCrossOverProbability[a]);
        }
                
        for(int a=0; a<intKromosom; a++){
            if(dataCrossOverProbability[a]<crossOverProbability){
                if(a>=(intKromosom-1)){//a==(intKromosom-1)
                    kromosom[a] = doCrossOver(kromosom[a], kromosom[0]);
                }else{
                    kromosom[a] = doCrossOver(kromosom[a], kromosom[a+1]);                    
                }                
            }
        }
    }

    private double probabilitasMutasi = 0.2;
    
    public int getPosisi(){        
        int hasil = 0;
        //Random r=new Random();
        Double pengasah;
            int data = 0 + (int)(Math.random() * ((60 - 0) + 1));// (0 to 60)
            String temp = String.valueOf(data);
            Double looper = Double.valueOf(temp);
            pengasah = Math.random();//(Math.random() * ((0.2 - 0)));// (5 to 10)
            Double penyebut = (looper/panjangTotalGen);
            if(pengasah<penyebut){
              hasil = data;
            }else{
              hasil = 0;
          }        
        return hasil;
    }
    
    int panjangTotalGen = 0;
    
    public Boolean cekPosisi(int angka){
        Boolean hasil = false;
        for(int a=0; a<posisi.length; a++){
            if(posisi[a] == angka){
                hasil = true;//data sudah ada
            }else{
                hasil = false;//data belum ada
            }
        }
        return hasil;
    }
    
    int [] posisi;
    private void mutasi() {
        panjangTotalGen = 20 * intKromosom;
        System.out.println("panjang total gen = "+panjangTotalGen);
        int jumlahGenMutasi = (int) (probabilitasMutasi * panjangTotalGen);
        System.out.println("Jumlah gen mutasi = "+jumlahGenMutasi);
        
        posisi = new int[jumlahGenMutasi];
        
        for(int a=0; a<posisi.length; a++){
            int dataPosisi = getPosisi();
            if(cekPosisi(dataPosisi)==false){
                posisi[a] = dataPosisi;
            }else{
                while(cekPosisi(dataPosisi)==true){
                    dataPosisi = getPosisi();   
                }
                posisi[a] = dataPosisi;
            }
                
        }
        
        for(int a=0; a<posisi.length; a++){
            System.out.println("posisi Mutasi = "+posisi[a]);
        }
        
        Kromosom temp = kromosom[0];
        KromosomToArray kta=new KromosomToArray();
        kta.convert(temp.getKromosom());
        int Height = kta.getArray().length;
        int Width = kta.getArray()[0].length;
        
        KromosomToArray [] ktas = new KromosomToArray[intKromosom];
        KromosomToArray array = new KromosomToArray();
        int looper = 0; 
        int looperKromosom = 0;
        for(int a=0; a<jumlahGenMutasi; a++){
            for(int b=0; b<intKromosom; b++){
                array.convert(kromosom[b].getKromosom());
                for(int c=0; c<Height; c++){
                    for(int d=0; d<Width; d++){
                        looper+=1;                        
                        if(looper==posisi[a]){
                            /*System.out.println("Tukar data dalam mutasi");
                            System.out.println("Looper = "+looper);
                            System.out.println("Posisi = "+posisi[a]);*/
                            String temporary=array.getArray()[c][d];
                            if(d>=(Width-1)){
                                /*System.out.println("dalam d = width");
                                System.out.println("c = "+c);
                                System.out.println("d = "+d);*/
                                array.getArray()[c][d] = array.getArray()[c][0];
                                array.getArray()[c][0] = temporary;                                
                            }else{
                                /*System.out.println("luar d = width");
                                System.out.println("c = "+c);
                                System.out.println("d = "+d);*/
                                array.getArray()[c][d] = array.getArray()[c][d+1];
                                array.getArray()[c][d+1] = temporary;                                
                            }
                            
                        }
                    }
                }
            }                        
            //System.out.println("looper total setelah int= "+looper);
            looper = 0;
        }
        looper = 0;
        //System.out.println("looper total = "+looper);
    }    
    
    public void optimasi(){
        String optimasiInfo = "";
        KromosomToArray kromosomToArray=new KromosomToArray();                        
        probabilitas = new double[intKromosom];
        probKum = new double[intKromosom];
        fitness = new double[intKromosom];                
        
        double totalFitness = 0;
        for(int a=0; a<intKromosom; a++){
            kromosomToArray.convert(kromosom[a].getKromosom());
            int makul = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
            int interval = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
            int ruang = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());                    
            fitness[a] = getFitness(makul, interval, ruang);
            totalFitness+=fitness[a];
        }
                
        for(int a=0; a<intKromosom; a++){
            probabilitas[a] = getProbabilitas(fitness[a], totalFitness);
            if(a==0){
                probKum[a] = getProbabilitasKumulatif(0, probabilitas[a]);    
            }else if(a>0){
                probKum[a] = getProbabilitas(probabilitas[a-1], probabilitas[a]);
            }
            
        }
        
     System.out.println("Kromosom Awal");
     optimasiInfo+="Kromosom Awal\n";
        for(int a=0; a<intKromosom; a++){            
            System.out.println("Kromosom ke "+a);            
            optimasiInfo+="Kromosom ke "+a+"\n";
            int col = kromosom[a].getKromosom()[0].length;
            for(int b=0; b<kromosom[a].getKromosom().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(kromosom[a].getKromosom()[b][c]);
                    optimasiInfo+=kromosom[a].getKromosom()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        }
        
        
        setDataRouletteWheel(intKromosom);        
        sortingRouletteWheel();//sekaligus seleksi data kromosom (ganti posisi)
        
        crossOver();
                
        
        System.out.println("Kromosom Setelah Proses Cross Over");
        optimasiInfo+="Kromosom Setelah Proses Cross Over\n";
        for(int a=0; a<intKromosom; a++){
            kromosomToArray.convert(kromosom[a].getKromosom());
            System.out.println("Kromosom ke "+a);
            optimasiInfo+="Kromosom ke "+a+"\n";
            int col = kromosomToArray.getArray()[0].length;
            for(int b=0; b<kromosomToArray.getArray().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(kromosomToArray.getArray()[b][c]);
                    optimasiInfo+=kromosomToArray.getArray()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        } 
        System.out.println("======================");        
        System.out.println("Memasuki Proses Mutasi");
        System.out.println("======================");
        optimasiInfo+="======================\nMemasuki Proses Mutasi\n======================\n";
        mutasi();
        
        System.out.println("Setelah Proses Mutasi");
        optimasiInfo+="Setelah Proses Mutasi\n";
        for(int a=0; a<intKromosom; a++){
            kromosomToArray.convert(kromosom[a].getKromosom());
            System.out.println("Kromosom ke "+a);
            optimasiInfo+="Kromosom ke "+a+"\n";
            int col = kromosomToArray.getArray()[0].length;
            for(int b=0; b<kromosomToArray.getArray().length; b++){
                for(int c=0; c<col; c++){
                    System.out.print(kromosomToArray.getArray()[b][c]);
                    optimasiInfo+=kromosomToArray.getArray()[b][c];
                }
                System.out.println();
                optimasiInfo+="\n";
            }            
        }
        OptimasiInfo info = new OptimasiInfo();                
        info.setData(optimasiInfo);
        info.setVisible(true);
    }
    
    public void traceData(){
        
        String tracer="";
        System.out.println("\n==================================");
        System.out.println("Trace Data");
        System.out.println("==================================\n");
        tracer+="\n==================================\nTrace Data\n==================================\n";
                
        for(int a=0; a<intKromosom; a++){
            System.out.println("Fitness Kromosom ke "+a+" = "+fitness[a]);
            tracer+="Fitness Kromosom ke "+a+" = "+fitness[a]+"\n";
        }        
        for(int a=0; a<intKromosom; a++){
            System.out.println("Probabilitas Kromosom ke "+a+" ="+probabilitas[a]);
            tracer+="Probabilitas Kromosom ke "+a+" ="+probabilitas[a]+"\n";
        }

        for(int a=0; a<intKromosom; a++){
            System.out.println("probabilitas Kumulatif Kromosom ke "+a+" = "+probKum[a]);
            tracer+="probabilitas Kumulatif Kromosom ke "+a+" = "+probKum[a]+"\n";
        }
        //tampil roulette wheel
        System.out.println("Data roulette Wheel");
        for(int a=0; a<intKromosom; a++){
            System.out.println("Random ke"+a+" = "+dataRouletteWheel[a]);
            tracer+="Random ke"+a+" = "+dataRouletteWheel[a]+"\n";
        }
        JOptionPane.showMessageDialog(null, tracer,"Tracing Program",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
