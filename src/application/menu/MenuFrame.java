/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package application.menu;

import application.base.BaseFrame;
import application.dokter.DokterInternalFrame;
import application.laporan.LaporanInternalFrame;
import application.obat.ObatInternalFrame;
import application.pasien.PasienInternalFrame;
import application.pemeriksaan.PemeriksaanInternalFrame;
import application.tindakan.TindakanInternalFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

/**
 *
 */
public class MenuFrame extends BaseFrame implements MenuView{
    
    private MenuPresenter presenter;
    private static MenuFrame instance = null;
    
    /**
     * Creates new form MenuFrame
     */
    private MenuFrame() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.pack();
        
        setPositionCenter();
        
        addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e)
            {
                presenter.keluar();
            }
        });
        
        presenter = new MenuPresenter(this);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        navigasiBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemHome = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuPengelolaan = new javax.swing.JMenu();
        pengelolaanPasien = new javax.swing.JMenuItem();
        pengelolaanDokter = new javax.swing.JMenuItem();
        pengelolaanObat = new javax.swing.JMenuItem();
        pengelolaanPemeriksaan = new javax.swing.JMenuItem();
        pengelolaanTindakan = new javax.swing.JMenuItem();
        menuLaporan = new javax.swing.JMenu();
        menuItemLaporanDataPemeriksaan = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 679, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 437, Short.MAX_VALUE)
        );

        menuFile.setText("File");

        menuItemHome.setText("Home");
        menuFile.add(menuItemHome);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        navigasiBar.add(menuFile);

        menuPengelolaan.setText("Pengelolaan");

        pengelolaanPasien.setText("Pasien");
        pengelolaanPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengelolaanPasienActionPerformed(evt);
            }
        });
        menuPengelolaan.add(pengelolaanPasien);

        pengelolaanDokter.setText("Dokter");
        pengelolaanDokter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengelolaanDokterActionPerformed(evt);
            }
        });
        menuPengelolaan.add(pengelolaanDokter);

        pengelolaanObat.setText("Obat");
        pengelolaanObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengelolaanObatActionPerformed(evt);
            }
        });
        menuPengelolaan.add(pengelolaanObat);

        pengelolaanPemeriksaan.setText("Pemeriksaan");
        pengelolaanPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengelolaanPemeriksaanActionPerformed(evt);
            }
        });
        menuPengelolaan.add(pengelolaanPemeriksaan);

        pengelolaanTindakan.setText("Tindakan");
        pengelolaanTindakan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengelolaanTindakanActionPerformed(evt);
            }
        });
        menuPengelolaan.add(pengelolaanTindakan);

        navigasiBar.add(menuPengelolaan);

        menuLaporan.setText("Laporan");

        menuItemLaporanDataPemeriksaan.setText("Laporan Data Pemeriksaan");
        menuItemLaporanDataPemeriksaan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemLaporanDataPemeriksaanActionPerformed(evt);
            }
        });
        menuLaporan.add(menuItemLaporanDataPemeriksaan);

        navigasiBar.add(menuLaporan);

        setJMenuBar(navigasiBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        presenter.keluar();
    }//GEN-LAST:event_menuItemExitActionPerformed
    
    private void pengelolaanPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengelolaanPasienActionPerformed
        setWaitCursor();
        PasienInternalFrame pasienInternalFramee = PasienInternalFrame.getInstance();
        
        desktopPane.add(pasienInternalFramee);
        pasienInternalFramee.setVisible(true);
        
        setDefaultCursor();
    }//GEN-LAST:event_pengelolaanPasienActionPerformed
    
    private void pengelolaanDokterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengelolaanDokterActionPerformed
        // TODO add your handling code here:
        setWaitCursor();
        DokterInternalFrame dokterInternalFramee = DokterInternalFrame.getInstance();
        
        desktopPane.add(dokterInternalFramee);
        dokterInternalFramee.setVisible(true);
        setDefaultCursor();
    }//GEN-LAST:event_pengelolaanDokterActionPerformed
    
    private void pengelolaanObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengelolaanObatActionPerformed
        // TODO add your handling code here:
        ObatInternalFrame obatInternalFramee = ObatInternalFrame.getInstance();
        
        desktopPane.add(obatInternalFramee);
        obatInternalFramee.setVisible(true);
    }//GEN-LAST:event_pengelolaanObatActionPerformed
    
    private void pengelolaanPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengelolaanPemeriksaanActionPerformed
        // TODO add your handling code here:
        setWaitCursor();
        PemeriksaanInternalFrame pemeriksaanInternalFramee = PemeriksaanInternalFrame.getInstance();
        
        desktopPane.add(pemeriksaanInternalFramee);
        pemeriksaanInternalFramee.setVisible(true);
        setDefaultCursor();
    }//GEN-LAST:event_pengelolaanPemeriksaanActionPerformed
    
    private void pengelolaanTindakanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengelolaanTindakanActionPerformed
        // TODO add your handling code here:
        setWaitCursor();
        TindakanInternalFrame tindakanInternalFramee = TindakanInternalFrame.getInstance();
        
        desktopPane.add(tindakanInternalFramee);
        tindakanInternalFramee.setVisible(true);
        setDefaultCursor();
    }//GEN-LAST:event_pengelolaanTindakanActionPerformed
    
    private void menuItemLaporanDataPemeriksaanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemLaporanDataPemeriksaanActionPerformed
        // TODO add your handling code here:
        LaporanInternalFrame laporanInternalFrame = new LaporanInternalFrame();
        
        desktopPane.add(laporanInternalFrame);
        laporanInternalFrame.setVisible(true);
    }//GEN-LAST:event_menuItemLaporanDataPemeriksaanActionPerformed
    
    
    public void removeOneDesktopPane(JInternalFrame frame){
        desktopPane.remove(frame);
        desktopPane.repaint();
    }
    
    @Override
    protected String setWindowTitle() {
        return "Manajemen Puskesmas";
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemHome;
    private javax.swing.JMenuItem menuItemLaporanDataPemeriksaan;
    private javax.swing.JMenu menuLaporan;
    private javax.swing.JMenu menuPengelolaan;
    private javax.swing.JMenuBar navigasiBar;
    private javax.swing.JMenuItem pengelolaanDokter;
    private javax.swing.JMenuItem pengelolaanObat;
    private javax.swing.JMenuItem pengelolaanPasien;
    private javax.swing.JMenuItem pengelolaanPemeriksaan;
    private javax.swing.JMenuItem pengelolaanTindakan;
    // End of variables declaration//GEN-END:variables
    
    public static MenuFrame getInstance() {
        if (instance == null) {
            instance = new MenuFrame();
        }
        
        return instance;
    }
    
    public javax.swing.JDesktopPane getDesktopPane(){
        return desktopPane;
    }
    
    @Override
    public int menuExit() {
        return JOptionPane.showOptionDialog(rootPane,
                "Apakah anda yakin ingin keluar?",
                "Keluar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
    }
    
}