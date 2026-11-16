import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

import java.io.FileWriter;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class SoftwareList extends javax.swing.JFrame {

        public SoftwareList() {
        initComponents();
        setLayout (null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCPU = new javax.swing.JTextField();
        txtRAMName = new javax.swing.JTextField();
        txtOSName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);


        addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
                }
            });

        jLabel1.setText("Product ID");

        jLabel2.setText("CPU Name");

        jLabel3.setText("OS Name");

        jLabel4.setText("RAM");

        txtCPU.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    txtCPUActionPerformed(evt);
                }
            });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnAddActionPerformed(evt);
                }
            });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnClearActionPerformed(evt);
                }
            });

        Table.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {

                }
            ));
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    TableMouseClicked(evt);
                }
            });
        jScrollPane2.setViewportView(Table);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnUpdateActionPerformed(evt);
                }
            });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnDeleteActionPerformed(evt);
                }
            });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtCPU)
                            .addComponent(txtRAMName)
                            .addComponent(txtOSName, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtCPU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRAMName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtOSName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCPUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
  
    }//GEN-LAST:event_txtFirstNameActionPerformed

    DefaultTableModel mod;
    String Id, CPU, RAMName, OSName, line;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mod = (DefaultTableModel)Table.getModel();
        mod.addColumn("Product ID");
        mod.addColumn("CPU Name");
        mod.addColumn("OS Name");
        mod.addColumn("RAM");

        try{
            BufferedReader bfw = new BufferedReader(new FileReader("data.txt"));
            while( (line = bfw.readLine() ) != null ) {
                mod.addRow( line.split(",") );
            }
            bfw.close();
        }
        catch(Exception ex){
        }

    }//GEN-LAST:event_formWindowOpened

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        this.Id = txtID.getText();
        this.CPU = txtCPU.getText();
        this.RAMName = txtRAMName.getText();
        this.OSName = txtOSName.getText();

        this.txtID.setText("");
        this.txtCPU.setText("");
        this.txtRAMName.setText("");
        this.txtOSName.setText("");

        String st[] = {Id, CPU, RAMName, OSName};
        mod.addRow(st);
        saveFile();
    }//GEN-LAST:event_btnAddActionPerformed

    private void saveFile(){
        try{
            File file = new File("data2.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i=0; i<Table.getRowCount(); i++){
                for(int j=0; j<Table.getColumnCount(); j++){
                    bw.write((String)Table.getModel().getValueAt(i,j)+",");
                }
                bw.write("\n");
            }
            bw.close();
            fw.close();
        }catch(Exception ex){

        }
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.txtID.setText("");
        this.txtCPU.setText("");
        this.txtRAMName.setText("");
        this.txtOSName.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        int index =Table.getSelectedRow();
        TableModel model = Table.getModel();
        Id = model.getValueAt(index, 0).toString();
        CPU = model.getValueAt(index, 1).toString();
        RAMName = model.getValueAt(index, 2).toString();
        OSName = model.getValueAt(index, 3).toString();

        txtID.setText(Id);
        txtCPU.setText(CPU);
        txtRAMName.setText(RAMName);
        txtOSName.setText(OSName);
    }//GEN-LAST:event_TableMouseClicked

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        mod = (DefaultTableModel) Table.getModel();

        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            mod.setValueAt(txtID.getText(),Table.getSelectedRow(), 0);
            mod.setValueAt(txtCPU.getText(), Table.getSelectedRow(), 1);
            mod.setValueAt(txtRAMName.getText(), Table.getSelectedRow(), 2);
            mod.setValueAt(txtOSName.getText(), Table.getSelectedRow(), 3);
        }
        saveFile();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        mod = (DefaultTableModel) Table.getModel();

        if(Table.getSelectedRow()==-1){
            if(Table.getRowCount()==0){
                JOptionPane.showMessageDialog(rootPane,"Table is Empty");
            }else{
                JOptionPane.showMessageDialog(rootPane, "You must select a record");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "Record is deleted!");
            mod.removeRow(Table.getSelectedRow());
            this.txtID.setText("");
            this.txtCPU.setText("");
            this.txtRAMName.setText("");
            this.txtOSName.setText("");
        }
        saveFile();
    }//GEN-LAST:event_btnDeleteActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCPU;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOSName;
    private javax.swing.JTextField txtRAMName;
    // End of variables declaration//GEN-END:variables
}
