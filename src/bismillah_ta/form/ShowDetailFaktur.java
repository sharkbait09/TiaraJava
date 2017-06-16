/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bismillah_ta.form;
import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import koneksi.koneksi;
import module.TablePesan;
import module.DataFaktur;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Tiara Ridha
 */
public class ShowDetailFaktur extends javax.swing.JFrame {

    /**
     * Creates new form ShowDataFaktur
     */
    
    int selectedItem;
    
    public ShowDetailFaktur() {
        initComponents();
        setLocationRelativeTo(null);
        selectData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("SURAT PEMESANAN");

        jLabel3.setText("DATA PEMESANAN");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("text");

        jButton2.setText("Cancel");

        jLabel4.setText("SP-16061702");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton2)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel4)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jLabel2.setText(TablePesan.getNoSP());
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        bismillah_ta.form.BuatFaktur yo = new bismillah_ta.form.BuatFaktur();
        yo.setVisible(true);
        this.setVisible(false);
          ///int x = table.getSelectedRow();
//           DefaultTableModel model = (DefaultTableModel)table.getModel();
//        int row = table.getSelectedRow();
//
//        if(row>=0) {
//            table.setRowSelectionAllowed(false);
//            table.setBackground(Color.lightGray);
//        }
         //removeSelectedRows(table);
//          if (table.getSelectedRow() != -1) {
//            // remove selected row from the model
//            table.setRowSelectionAllowed(false);
//            table.setBackground(Color.lightGray);
//          }
//          else{
//               table.setRowSelectionAllowed(false);
//              table.setBackground(Color.lightGray);
//          }
         //getTableCellRendererComponent(table, table, true, true, x, x);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
       int x = table.getSelectedRow();
        if (x != -1)
        {
            DataFaktur.kdBuku = table.getValueAt(x, 0).toString();
            DataFaktur.judul = table.getValueAt(x, 1).toString();
            DataFaktur.jumlah = table.getValueAt(x, 2).toString();
            DataFaktur.hrg_satuan = table.getValueAt(x, 3).toString();
        }
    }//GEN-LAST:event_tableMouseClicked

    private DefaultTableCellRenderer DEFAULT_RENDERER =  new DefaultTableCellRenderer();
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if(isSelected){
                    c.setBackground(Color.lightGray);
                }else{
                if (row%2 == 0){
                    c.setBackground(Color.WHITE);

                }
                else {
                    c.setBackground(Color.red);
                }     }

       //Add below code here
                return c;
            }

    
    public void removeSelectedRows(JTable table){
     DefaultTableModel model = (DefaultTableModel) this.table.getModel();
     int[] rows = table.getSelectedRows();
     
        for(int i=0;i<rows.length;i++){
//          model.removeRow(rows[i]-i);
           //table.changeSelection(i, i, true, rootPaneCheckingEnabled);
          table.setRowSelectionAllowed(false);
          table.setSelectionBackground(Color.lightGray);
   }
}
    public void ItemData(int x){
         if (x != -1)
        {
            table.setRowSelectionAllowed(false);
             table.setBackground(Color.lightGray);
        } 
         else{
             table.setRowSelectionAllowed(true);
             table.setBackground(Color.white);
         }
     }
    
    
    
    public void selectData(){
        //String a = jTextField1.getText();
        String b = TablePesan.getNoSP();
        try {
            Connection con = koneksi.GetConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select kode_buku,judul,jmlh,hrg_satuan from detail_sp inner join buku on kode_buku = kd_buku "
                    + "inner join harga on kd_buku=id_buku where kode_sp='"+b+"'");
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException sqlEx) {
            System.out.println(sqlEx.getMessage());
        }
    }
    
    public void deleteItemData(int x){
       table.remove(x);
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowDetailFaktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowDetailFaktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowDetailFaktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowDetailFaktur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowDetailFaktur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
