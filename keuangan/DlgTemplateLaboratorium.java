/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DlgPenyakit.java
 *
 * Created on May 23, 2010, 12:57:16 AM
 */

package keuangan;

import fungsi.WarnaTable;
import fungsi.batasInput;
import fungsi.koneksiDB;
import fungsi.sekuel;
import fungsi.validasi;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author dosen
 */
public final class DlgTemplateLaboratorium extends javax.swing.JDialog {
    private final DefaultTableModel tabMode;
    private Connection koneksi=koneksiDB.condb();
    private sekuel Sequel=new sekuel();
    private validasi Valid=new validasi();
    private PreparedStatement ps;
    private ResultSet rs;
    /** Creates new form DlgPenyakit
     * @param parent
     * @param modal */
    public DlgTemplateLaboratorium(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(10,2);
        setSize(656,250);

        Object[] row={"Pemeriksaan","Satuan","N.Rujukan L.D.","N.Rujukan L.A.","N.Rujukan P.D.",
                      "N.Rujukan P.A.","J.S. Rmh Skt","Paket BHP","J.M. Perujuk","J.M. Dokter",
                      "J.M. Laborat","K.S.O.","Menejemen","Biaya Item","",""};
        tabMode=new DefaultTableModel(null,row){
             @Override public boolean isCellEditable(int rowIndex, int colIndex){
                boolean a = true;
                if (colIndex==13) {
                    a=false;
                }
                return a;
             }
             Class[] types = new Class[] {
                java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,java.lang.Object.class,
                java.lang.Object.class,java.lang.Object.class,java.lang.Double.class,java.lang.Double.class,
                java.lang.Double.class,java.lang.Double.class,java.lang.Double.class,java.lang.Double.class, 
                java.lang.Double.class,java.lang.Double.class,java.lang.Object.class,java.lang.Object.class
             };
             @Override
             public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
             }
        };
        tbKamar.setModel(tabMode);
        //tbPenyakit.setDefaultRenderer(Object.class, new WarnaTable(panelJudul.getBackground(),tbPenyakit.getBackground()));
        tbKamar.setPreferredScrollableViewportSize(new Dimension(500,500));
        tbKamar.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        for (int i = 0; i < 16; i++) {
            TableColumn column = tbKamar.getColumnModel().getColumn(i);
            if(i==0){
                column.setPreferredWidth(180);
            }else if((i==14)||(i==15)){
                column.setMinWidth(0);
                column.setMaxWidth(0);
            }else {
                column.setPreferredWidth(80);
            }
        }
        tbKamar.setDefaultRenderer(Object.class, new WarnaTable());
        KdPeriksa.setDocument(new batasInput((byte)100).getKata(KdPeriksa));        
        
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalFrame1 = new widget.InternalFrame();
        Scroll = new widget.ScrollPane();
        tbKamar = new widget.Table();
        panelisi3 = new widget.panelisi();
        label9 = new widget.Label();
        KdPeriksa = new widget.TextBox();
        NmPeriksa = new widget.TextBox();
        BtnTambah = new widget.Button();
        BtnSimpan = new widget.Button();
        BtnHapus = new widget.Button();
        jLabel10 = new widget.Label();
        BtnKeluar = new widget.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        internalFrame1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 245, 235)), "::[ Template Hasil Pemeriksaan Laboratorium ]::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(50,50,50))); // NOI18N
        internalFrame1.setName("internalFrame1"); // NOI18N
        internalFrame1.setLayout(new java.awt.BorderLayout(1, 1));

        Scroll.setName("Scroll"); // NOI18N
        Scroll.setOpaque(true);

        tbKamar.setName("tbKamar"); // NOI18N
        tbKamar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKamarMouseClicked(evt);
            }
        });
        tbKamar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbKamarKeyPressed(evt);
            }
        });
        Scroll.setViewportView(tbKamar);

        internalFrame1.add(Scroll, java.awt.BorderLayout.CENTER);

        panelisi3.setName("panelisi3"); // NOI18N
        panelisi3.setPreferredSize(new java.awt.Dimension(100, 43));
        panelisi3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 4, 9));

        label9.setText("Pemeriksaan :");
        label9.setName("label9"); // NOI18N
        label9.setPreferredSize(new java.awt.Dimension(82, 23));
        panelisi3.add(label9);

        KdPeriksa.setName("KdPeriksa"); // NOI18N
        KdPeriksa.setPreferredSize(new java.awt.Dimension(100, 23));
        panelisi3.add(KdPeriksa);

        NmPeriksa.setName("NmPeriksa"); // NOI18N
        NmPeriksa.setPreferredSize(new java.awt.Dimension(330, 23));
        panelisi3.add(NmPeriksa);

        BtnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/category.png"))); // NOI18N
        BtnTambah.setMnemonic('3');
        BtnTambah.setToolTipText("Alt+3");
        BtnTambah.setName("BtnTambah"); // NOI18N
        BtnTambah.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        panelisi3.add(BtnTambah);

        BtnSimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/save-16x16.png"))); // NOI18N
        BtnSimpan.setMnemonic('S');
        BtnSimpan.setToolTipText("Alt+S");
        BtnSimpan.setName("BtnSimpan"); // NOI18N
        BtnSimpan.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanActionPerformed(evt);
            }
        });
        panelisi3.add(BtnSimpan);

        BtnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/stop_f2.png"))); // NOI18N
        BtnHapus.setMnemonic('H');
        BtnHapus.setToolTipText("Alt+H");
        BtnHapus.setName("BtnHapus"); // NOI18N
        BtnHapus.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHapusActionPerformed(evt);
            }
        });
        panelisi3.add(BtnHapus);

        jLabel10.setName("jLabel10"); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 23));
        panelisi3.add(jLabel10);

        BtnKeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/exit.png"))); // NOI18N
        BtnKeluar.setMnemonic('4');
        BtnKeluar.setToolTipText("Alt+4");
        BtnKeluar.setName("BtnKeluar"); // NOI18N
        BtnKeluar.setPreferredSize(new java.awt.Dimension(28, 23));
        BtnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKeluarActionPerformed(evt);
            }
        });
        panelisi3.add(BtnKeluar);

        internalFrame1.add(panelisi3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(internalFrame1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BtnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_BtnKeluarActionPerformed

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        if(KdPeriksa.getText().equals("")||NmPeriksa.getText().equals("")){
            Valid.textKosong(KdPeriksa,"Pemeriksaan");
        }else{
            if(tbKamar.getSelectedRow()>-1){                
                tabMode.insertRow(tbKamar.getSelectedRow(),new Object[]{"","","","","","",0,0,0,0,0,0,0,0,""});
            }else{
                tabMode.addRow(new Object[]{"","","","","","",0,0,0,0,0,0,0,0,"",""});
                tbKamar.requestFocus();
            }
            urut();
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

private void BtnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanActionPerformed
    if(KdPeriksa.getText().equals("")||NmPeriksa.getText().equals("")){
        Valid.textKosong(KdPeriksa,"Pemeriksaan");
    }else{
        int reply = JOptionPane.showConfirmDialog(rootPane,"Eeiiiiiits, udah bener belum data yang mau disimpan..??","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION) {
             int row=tbKamar.getRowCount();
             if(row>-1){
                 for(int i=0;i<row;i++){  
                     //System.out.println(tbKamar.getValueAt(i,0).toString());
                    if(tbKamar.getValueAt(i,14).toString().equals("")){
                         Sequel.menyimpan("template_laboratorium","?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?","Id Hasil Periksa",17,new String[]{
                               KdPeriksa.getText(),"0",tbKamar.getValueAt(i,0).toString(),tbKamar.getValueAt(i,1).toString(),
                               tbKamar.getValueAt(i,2).toString(),tbKamar.getValueAt(i,3).toString(),tbKamar.getValueAt(i,4).toString(),
                               tbKamar.getValueAt(i,5).toString(),tbKamar.getValueAt(i,6).toString(),tbKamar.getValueAt(i,7).toString(),
                               tbKamar.getValueAt(i,8).toString(),tbKamar.getValueAt(i,9).toString(),tbKamar.getValueAt(i,10).toString(),
                               tbKamar.getValueAt(i,11).toString(),tbKamar.getValueAt(i,12).toString(),tbKamar.getValueAt(i,13).toString(),
                               tbKamar.getValueAt(i,15).toString()       
                         });
                    }else if(!tbKamar.getValueAt(i,14).toString().equals("")){
                         Sequel.mengedit("template_laboratorium","id_template=?","Pemeriksaan=?,satuan=?,nilai_rujukan_ld=?,nilai_rujukan_la=?,"+
                               "nilai_rujukan_pd=?,nilai_rujukan_pa=?,bagian_rs=?,bhp=?,bagian_perujuk=?,bagian_dokter=?,bagian_laborat=?,kso=?,menejemen=?,biaya_item=?,urut=?",16,new String[]{
                               tbKamar.getValueAt(i,0).toString(),tbKamar.getValueAt(i,1).toString(),tbKamar.getValueAt(i,2).toString(),tbKamar.getValueAt(i,3).toString(),
                               tbKamar.getValueAt(i,4).toString(),tbKamar.getValueAt(i,5).toString(),tbKamar.getValueAt(i,6).toString(),tbKamar.getValueAt(i,7).toString(),
                               tbKamar.getValueAt(i,8).toString(),tbKamar.getValueAt(i,9).toString(),tbKamar.getValueAt(i,10).toString(),tbKamar.getValueAt(i,11).toString(),
                               tbKamar.getValueAt(i,12).toString(),tbKamar.getValueAt(i,13).toString(),tbKamar.getValueAt(i,15).toString(),tbKamar.getValueAt(i,14).toString()
                         } );   
                    }
                 }
                 tampil();
             }             
        }
    }        
}//GEN-LAST:event_BtnSimpanActionPerformed

private void BtnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHapusActionPerformed
   try{
       Sequel.meghapus("template_laboratorium","id_template",tbKamar.getValueAt(tbKamar.getSelectedRow(),14).toString());
       tabMode.removeRow(tbKamar.getSelectedRow());
       urut();
   }catch(Exception ex){
       JOptionPane.showMessageDialog(null,"Pilih dulu data yang mau dihapus..!!");
   }
}//GEN-LAST:event_BtnHapusActionPerformed

    private void tbKamarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbKamarKeyPressed
        if(tbKamar.getRowCount()!=0){
            if((evt.getKeyCode()==KeyEvent.VK_RIGHT)||(evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
                try {
                    getData();
                } catch (java.lang.NullPointerException e) {
                }
            }            
        }
    }//GEN-LAST:event_tbKamarKeyPressed

    private void tbKamarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKamarMouseClicked
        if(tbKamar.getRowCount()!=0){
            try {
                getData();
            } catch (java.lang.NullPointerException e) {
            } 
        }
    }//GEN-LAST:event_tbKamarMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            DlgTemplateLaboratorium dialog = new DlgTemplateLaboratorium(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private widget.Button BtnHapus;
    private widget.Button BtnKeluar;
    private widget.Button BtnSimpan;
    private widget.Button BtnTambah;
    public widget.TextBox KdPeriksa;
    public widget.TextBox NmPeriksa;
    private widget.ScrollPane Scroll;
    private widget.InternalFrame internalFrame1;
    private widget.Label jLabel10;
    private widget.Label label9;
    private widget.panelisi panelisi3;
    private widget.Table tbKamar;
    // End of variables declaration//GEN-END:variables

    public void tampil() {
        Valid.tabelKosong(tabMode);
        try{            
            ps=koneksi.prepareStatement("select id_template, Pemeriksaan, satuan, nilai_rujukan_ld, nilai_rujukan_la, nilai_rujukan_pd,"+
                        "nilai_rujukan_pa,bagian_rs,bhp,bagian_perujuk,bagian_dokter,bagian_laborat,kso,menejemen,biaya_item,urut "+
                        "from template_laboratorium where kd_jenis_prw=? order by urut");
            try {
                ps.setString(1,KdPeriksa.getText());
                rs=ps.executeQuery();
                while(rs.next()){
                    tabMode.addRow(new Object[]{
                        rs.getString(2),rs.getString(3),rs.getString(4),
                        rs.getString(5),rs.getString(6),rs.getString(7),
                        rs.getDouble(8),rs.getDouble(9),rs.getDouble(10),
                        rs.getDouble(11),rs.getDouble(12),rs.getDouble(13),
                        rs.getDouble(14),rs.getDouble(15),rs.getString(1),""
                    });
                }
                urut();
            } catch (Exception e) {
                System.out.println(e);
            } finally{
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            }
        }catch(Exception e){
            System.out.println("Notifikasi : "+e);
        }
    }

    private void getData() {
        int row=tbKamar.getSelectedRow();
        if(row!= -1){
            if((!tbKamar.getValueAt(row,6).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,7).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,8).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,9).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,10).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,11).toString().equals(""))
                    &&(!tbKamar.getValueAt(row,12).toString().equals(""))){
               tbKamar.setValueAt(Valid.SetAngka(tbKamar.getValueAt(row,6).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,7).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,8).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,9).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,10).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,11).toString())+
                       Valid.SetAngka(tbKamar.getValueAt(row,12).toString()), row,13); 
            }
        }
    } 
    
    public JTextField getTextField(){
        return KdPeriksa;
    }

    public JButton getButton(){
        return BtnKeluar;
    }
    
    public void urut(){
        if(tbKamar.getRowCount()>-1){
            for(int i=0;i<tbKamar.getRowCount();i++){  
                  tbKamar.setValueAt(i, i,15);
            }
        }
    }
}
