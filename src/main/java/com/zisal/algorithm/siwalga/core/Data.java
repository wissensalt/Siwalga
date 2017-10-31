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
public class Data {

    public Data() {
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
    
    Kromosom satu, dua, tiga, empat, lima, enam, tujuh, delapan, sembilan, sepuluh, sebelas, duabelas, tigabelas, empatbelas, limabelas;
    
    public void buatKromosom(){        
        switch(intKromosom){
            case 1 :    satu = new Kromosom(makul, dosen, ruang);break;                
            case 2 :    dua = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        tiga = new Kromosom(makul, dosen, ruang);
                        break;
            case 3 :    empat = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        lima= new Kromosom(makul, dosen, ruang);
                        reInitData();
                        enam = new Kromosom(makul, dosen, ruang);
                        break;
            case 4 :    tujuh = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        delapan= new Kromosom(makul, dosen, ruang);
                        reInitData();
                        sembilan = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        sepuluh = new Kromosom(makul, dosen, ruang);
                        break;    
            case 5 :    sebelas = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        duabelas= new Kromosom(makul, dosen, ruang);
                        reInitData();
                        tigabelas = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        empatbelas = new Kromosom(makul, dosen, ruang);
                        reInitData();
                        limabelas = new Kromosom(makul, dosen, ruang);
                        break;
            default: System.out.println("jumlah kromosom tidak tersedia");
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
    
    //buat tabel
    
    String [] namaKolom={"Jam || Hari","Senin", "Selasa", "Rabu", "Kamis", "Jumat"};      
    JTable jtsatu, jtdua, jttiga, jtempat, jtlima, jtenam, jttujuh, jtdelapan, jtsembilan, jtsepuluh, jtsebelas, jtduabelas, jttigabelas, jtempatbelas, jtlimebelas;
    JFrame jfsatu, jfdua, jftiga, jfempat, jflima, jfenam, jftujuh, jfdelapan, jfsembilan, jfsepuluh, jfsebelas, jfduabelas, jftigabelas, jfempatbelas, jflimabelas;    
    
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

    public void buatTabel(){
        switch(intKromosom){
            case 1: jtsatu=new JTable(new tabelModelKromosom(satu.getKromosom(), namaKolom));
                    jfsatu = new JFrame();
                    createFormTabel(jfsatu, jtsatu);break;
            case 2: jtdua=new JTable(new tabelModelKromosom(dua.getKromosom(), namaKolom));
                    jfdua = new JFrame();
                    createFormTabel(jfdua, jtdua);                
                    jttiga=new JTable(new tabelModelKromosom(tiga.getKromosom(), namaKolom));
                    jftiga = new JFrame();
                    createFormTabel(jftiga, jttiga);break;
            case 3: jtempat=new JTable(new tabelModelKromosom(empat.getKromosom(), namaKolom));
                    jfempat = new JFrame();
                    createFormTabel(jfempat, jtempat);
                    jtlima=new JTable(new tabelModelKromosom(lima.getKromosom(), namaKolom));
                    jflima = new JFrame();
                    createFormTabel(jflima, jtlima);
                    jtenam=new JTable(new tabelModelKromosom(enam.getKromosom(), namaKolom));
                    jfenam = new JFrame();
                    createFormTabel(jfenam, jtlima);break;
            case 4: jttujuh=new JTable(new tabelModelKromosom(tujuh.getKromosom(), namaKolom));
                    jftujuh = new JFrame();
                    createFormTabel(jftujuh, jttujuh);
                    jtdelapan=new JTable(new tabelModelKromosom(delapan.getKromosom(), namaKolom));
                    jfdelapan = new JFrame();
                    createFormTabel(jfdelapan, jtdelapan);
                    jtsembilan=new JTable(new tabelModelKromosom(sembilan.getKromosom(), namaKolom));
                    jfsembilan = new JFrame();
                    createFormTabel(jfsembilan, jtsembilan);
                    jtsepuluh=new JTable(new tabelModelKromosom(sepuluh.getKromosom(), namaKolom));
                    jfsepuluh = new JFrame();
                    createFormTabel(jfsepuluh, jtsepuluh);break;
            case 5: jtsebelas=new JTable(new tabelModelKromosom(sebelas.getKromosom(), namaKolom));
                    jfsebelas = new JFrame();
                    createFormTabel(jfsebelas, jtsebelas);
                    jtduabelas=new JTable(new tabelModelKromosom(duabelas.getKromosom(), namaKolom));
                    jfduabelas = new JFrame();
                    createFormTabel(jfduabelas, jtduabelas);
                    jttigabelas=new JTable(new tabelModelKromosom(tigabelas.getKromosom(), namaKolom));
                    jftigabelas = new JFrame();
                    createFormTabel(jftigabelas, jttigabelas);
                    jtempatbelas=new JTable(new tabelModelKromosom(empatbelas.getKromosom(), namaKolom));
                    jfempatbelas = new JFrame();
                    createFormTabel(jfempatbelas, jtempatbelas);
                    jtlimebelas=new JTable(new tabelModelKromosom(limabelas.getKromosom(), namaKolom));
                    jflimabelas = new JFrame();
                    createFormTabel(jflimabelas, jtlimebelas);break;                
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
    
    public void sortingRouletteWheel(String[][] data){
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
                    //String tempData = data[a]
                }
            }
        }
    }
    
    public void setPopulasiBaru(){
        
    }
    
    double [] probKum;
    
    public void optimasi(){
        KromosomToArray kromosomToArray=new KromosomToArray();                
        
        probKum = new double[intKromosom];
        switch(intKromosom){
            case 1:
                    //kromosom satu
                    kromosomToArray.convert(satu.getKromosom());
                    int makulSatu = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalSatu = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangSatu = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    
                    double fitnessSatu = getFitness(makulSatu, intervalSatu, ruangSatu);
                    double probabilitasSatu = getProbabilitas(fitnessSatu, fitnessSatu);
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasSatu);                    
                    break;
            case 2:
                    //kromosom dua
                    kromosomToArray.convert(dua.getKromosom());
                    int makulDua = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalDua = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangDua = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessDua = getFitness(makulDua, intervalDua, ruangDua);                    
                    //kromosom tiga
                    kromosomToArray.convert(tiga.getKromosom());
                    int makulTiga = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalTiga = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangTiga = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessTiga = getFitness(makulTiga, intervalTiga, ruangTiga);                                        
                    
                    double totalFitnessDua = fitnessDua + fitnessTiga;
                    double probabilitasDua1 = getProbabilitas(fitnessDua, totalFitnessDua);
                    double probabilitasDua2 = getProbabilitas(fitnessTiga, totalFitnessDua);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasDua1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasDua2);                    
                    break;
            case 3:
                    //kromosom empat
                    kromosomToArray.convert(empat.getKromosom());
                    int makulEmpat = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalEmpat = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangEmpat = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessEmpat = getFitness(makulEmpat, intervalEmpat, ruangEmpat);
                    //kromosom lima
                    kromosomToArray.convert(lima.getKromosom());
                    int makulLima = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalLima = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangLima = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessLima = getFitness(makulLima, intervalLima, ruangLima);                    
                    //kromosom enam
                    kromosomToArray.convert(enam.getKromosom());
                    int makulEnam = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalEnam = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangEnam = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessEnam = getFitness(makulEnam, intervalEnam, ruangEnam);            
                    
                    double totalFitnessTiga = fitnessEmpat + fitnessLima + fitnessEnam;
                    double probabilitasTiga1 = getProbabilitas(fitnessEmpat, totalFitnessTiga);
                    double probabilitasTiga2 = getProbabilitas(fitnessLima, totalFitnessTiga);                    
                    double probabilitasTiga3 = getProbabilitas(fitnessEnam, totalFitnessTiga);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasTiga1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasTiga2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasTiga3);
                    break;                
            case 4:
                    //kromosom tujuh
                    kromosomToArray.convert(tujuh.getKromosom());
                    int makulTujuh = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalTujuh = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangTujuh = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessTujuh = getFitness(makulTujuh, intervalTujuh, ruangTujuh);
                    //kromosom delapan
                    kromosomToArray.convert(delapan.getKromosom());
                    int makuldelapan = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervaldelapan = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangdelapan = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessdelapan = getFitness(makuldelapan, intervaldelapan, ruangdelapan);                    
                    //kromosom sembilan
                    kromosomToArray.convert(sembilan.getKromosom());
                    int makulsembilan = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalsembilan = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangsembilan = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnesssembilan = getFitness(makulsembilan, intervalsembilan, ruangsembilan);            
                    //kromosom Sepuluh
                    kromosomToArray.convert(sepuluh.getKromosom());
                    int makulSepuluh = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalSepuluh = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangSepuluh = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessSepuluh = getFitness(makulSepuluh, intervalSepuluh, ruangSepuluh);                    
                    
                    double totalFitnessEmpat = fitnessTujuh + fitnessdelapan + fitnesssembilan + fitnessSepuluh;
                    double probabilitasEmpat1 = getProbabilitas(fitnessTujuh, totalFitnessEmpat);
                    double probabilitasEmpat2 = getProbabilitas(fitnessdelapan, totalFitnessEmpat);                    
                    double probabilitasEmpat3 = getProbabilitas(fitnesssembilan, totalFitnessEmpat);                    
                    double probabilitasEmpat4 = getProbabilitas(fitnessSepuluh, totalFitnessEmpat);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasEmpat1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasEmpat2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasEmpat3);                    
                    probKum[3] = getProbabilitasKumulatif(probKum[2], probabilitasEmpat4);                    
                    break;
            case 5:
                    //kromosom sebelas
                    kromosomToArray.convert(sebelas.getKromosom());
                    int makulSebelas = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalSebelas = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangSebelas = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessSebelas = getFitness(makulSebelas, intervalSebelas, ruangSebelas);                    
                    //kromosom duaBelas
                    kromosomToArray.convert(duabelas.getKromosom());
                    int makulDuabelas = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalDuabelas = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangDuabelas = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessDuabelas = getFitness(makulDuabelas, intervalDuabelas, ruangDuabelas);                                       
                    //kromosom tigaBelas
                    kromosomToArray.convert(tigabelas.getKromosom());
                    int makulTigabelas = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalTigabelas = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangTigabelas = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessTigabelas = getFitness(makulTigabelas, intervalTigabelas, ruangTigabelas);
                    //kromosom empat belas
                    kromosomToArray.convert(empatbelas.getKromosom());
                    int makulEmpatbelas = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalEmpatbelas = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangEmpatbelas = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessEmpatbelas = getFitness(makulEmpatbelas, intervalEmpatbelas, ruangEmpatbelas);                    
                    //kromosom lima belas                    
                    kromosomToArray.convert(limabelas.getKromosom());
                    int makulLimabelas = kromosomToArray.getValueGenDosen(kromosomToArray.getArray());
                    int intervalLimabelas = kromosomToArray.getValueGenInterval(kromosomToArray.getArray());
                    int ruangLimabelas = kromosomToArray.getValueGenRuangan(kromosomToArray.getArray());
                    double fitnessLimabelas = getFitness(makulLimabelas, intervalLimabelas, ruangLimabelas);                                        

                    double totalFitnessLima = fitnessSebelas + fitnessDuabelas + fitnessTigabelas + fitnessEmpatbelas + fitnessLimabelas;
                    double probabilitasLima1 = getProbabilitas(fitnessSebelas, totalFitnessLima);
                    double probabilitasLima2 = getProbabilitas(fitnessDuabelas, totalFitnessLima);                    
                    double probabilitasLima3 = getProbabilitas(fitnessTigabelas, totalFitnessLima);                    
                    double probabilitasLima4 = getProbabilitas(fitnessEmpatbelas, totalFitnessLima);
                    double probabilitasLima5 = getProbabilitas(fitnessLimabelas, totalFitnessLima);
                    
                    probKum[0] = getProbabilitasKumulatif(0, probabilitasLima1);
                    probKum[1] = getProbabilitasKumulatif(probKum[0], probabilitasLima2);
                    probKum[2] = getProbabilitasKumulatif(probKum[1], probabilitasLima3);                    
                    probKum[3] = getProbabilitasKumulatif(probKum[2], probabilitasLima4);
                    probKum[4] = getProbabilitasKumulatif(probKum[3], probabilitasLima5);
                    setDataRouletteWheel(5);
                    sortingRouletteWheel(kromosomToArray.getArray());//sekaligus seleksi
                    
                    for(int a=0; a<5; a++){
                        System.out.println(dataRouletteWheel[a]);
                    }
                    System.out.println("\nprobkum");
                    for(int a=0; a<5; a++){
                        System.out.println(probKum[a]);
                    }                    
                    setPopulasiBaru();
                    break;                
            default: System.out.println("Jumlah kromosom tidak bisa diproses");
        }
        
        /*System.out.println("data kromosom satu  = ");
        for(int a=0; a<4; a++){
            for(int b=0; b<6; b++){
                System.out.print(satu.getKromosom()[a][b]);
            }
        }*/
        
        //konversi ke data kromosom tanpa jam (kolom paling kiri)
        //kromosomToArray.convert();
        /*(System.out.println("hasil tampil array");
        for(int a=0; a<4; a++){
            for(int b=0; b<5; b++){
                System.out.print(x.getArray()[a][b]+" ");
            }
            System.out.println();
        }
        
        System.out.println("\ntampil value gen");
        System.out.println("gen dosen = "+x.getValueGenDosen(x.getArray())+"\n");
        System.out.println("gen interval = "+x.getValueGenInterval(x.getArray())+"\n");
        System.out.println("gen ruangan = "+x.getValueGenRuangan(x.getArray())+"\n");*/
    }    


}
