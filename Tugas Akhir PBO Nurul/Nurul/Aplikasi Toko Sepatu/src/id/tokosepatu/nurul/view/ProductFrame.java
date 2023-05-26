/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tokosepatu.nurul.view;

import id.tokosepatu.nurul.controller.CategoryController;
import id.tokosepatu.nurul.controller.ProductController;
import id.tokosepatu.nurul.database.DatabaseMySQL;
import id.tokosepatu.nurul.model.Category;
import id.tokosepatu.nurul.model.CrudState;
import static id.tokosepatu.nurul.model.CrudState.UPDATE;
import id.tokosepatu.nurul.model.Product;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AryaDharmaadi
 */
public class ProductFrame extends javax.swing.JFrame implements Observer{

    private ProductController productController = new ProductController();
    private CategoryController categoryController = new CategoryController();
    DefaultTableModel tableModel;

    /**
     * Creates new form NewProductFrame
     */
    public ProductFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        productController.addObserver(this);
        setCategory(categoryController.getAllData());
        setProductTable(productController.getAllProduct());
        updateBtn.setEnabled(false);
        deleteBtn.setEnabled(false);

        if (!DatabaseMySQL.isConnect()){
            System.exit(0);
        }
        id_txtfield.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name_txtfield = new javax.swing.JTextField();
        price_txtfield = new javax.swing.JTextField();
        category_combobox = new javax.swing.JComboBox();
        save_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        stock_txtfield1 = new javax.swing.JTextField();
        id_txtfield = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        ukuran = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

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

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("TOKO SEPATU NURUL");

        jLabel2.setText("Merek Sepatu");

        jLabel3.setText("Harga");

        jLabel4.setText("Stok");

        jLabel5.setText("Kategori");

        price_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_txtfieldActionPerformed(evt);
            }
        });

        category_combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        save_button.setText("Simpan");
        save_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_buttonActionPerformed(evt);
            }
        });

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        product_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                product_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(product_table);

        updateBtn.setBackground(new java.awt.Color(255, 102, 0));
        updateBtn.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.setAutoscrolls(true);
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel10.setText("ID");

        stock_txtfield1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stock_txtfield1ActionPerformed(evt);
            }
        });

        id_txtfield.setToolTipText("");
        id_txtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtfieldActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(51, 0, 0));
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("Ukuran");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(price_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(ukuran, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(33, 33, 33)
                                        .addComponent(stock_txtfield1)))))
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(377, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(save_button)
                .addGap(28, 28, 28)
                .addComponent(deleteBtn)
                .addGap(38, 38, 38)
                .addComponent(updateBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(name_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(ukuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(price_txtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(stock_txtfield1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(category_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save_button)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(208, 208, 208))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_buttonActionPerformed
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        int size = Integer.parseInt(ukuran.getText());
        
        Product p = new Product(0, name, price, stock, category, size);        
        productController.manipulate(p,CrudState.INSERT);
    }//GEN-LAST:event_save_buttonActionPerformed

    private void product_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_product_tableMouseClicked
        // TODO add your handling code here:
        
       tblKeForm();
    }//GEN-LAST:event_product_tableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(id_txtfield.getText());
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        int size = Integer.parseInt(ukuran.getText());
        
        Product p = new Product(id, name, price, stock, category, size);        
        productController.manipulate(p,CrudState.UPDATE);
        resetForm();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void id_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtfieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int id = Integer.parseInt(id_txtfield.getText());
        String name = name_txtfield.getText();
        float price = Float.valueOf(price_txtfield.getText());
        int stock = Integer.parseInt(stock_txtfield1.getText());
        Category category = (Category) category_combobox.getSelectedItem();
        int size = Integer.parseInt(ukuran.getText());
        
        Product p = new Product(id, name, price, stock, category, size);        
        productController.manipulate(p,CrudState.DELETE);
        resetForm();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void price_txtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_txtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_price_txtfieldActionPerformed

    private void stock_txtfield1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stock_txtfield1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stock_txtfield1ActionPerformed

    @Override
    public void update(Observable o, Object arg) {
        if (o==productController){
            if (arg==null){
                JOptionPane.showMessageDialog(this, "Produk gagal diperbaharui karena kegagalan koneksi ke database");
            }else{            
                Product p = (Product) arg;
                if (productController.getCrudState() == CrudState.INSERT){
                    JOptionPane.showMessageDialog(this, p.getName()+" berhasil ditambahkan");
                }
                setProductTable(productController.getAllProduct());
                resetForm(); 
            }            
        }
    }
    
    

    
    
    
    
    private void resetForm(){
        id_txtfield.setText(null);
        name_txtfield.setText(null);
        price_txtfield.setText(null);
        stock_txtfield1.setText(null);
        updateBtn.setEnabled(false);
        save_button.setEnabled(true);
        deleteBtn.setEnabled(false);
        ukuran.setText(null);

    }

    private void setProductTable(List<Product> listProduct) {
        if (listProduct==null){
            JOptionPane.showMessageDialog(this, "Data produk gagal diambil dari database","DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            tableModel = new DefaultTableModel();
            tableModel.setColumnIdentifiers(
                new String[] {
                    "ID",
                    "Nama Produk",
                    "Harga",
                    "Stok",
                    "Kategori",
                    "Ukuran"
                }
            );

            for (Product p : listProduct) {
                Object[] o = new Object[6];
                o[0] = p.getId();
                o[1] = p.getName();
                o[2] = p.getPrice();
                o[3] = p.getStock();
                o[4] = p.getCategory().getName();
                o[5] = p.getUkuran();
                tableModel.addRow(o);
            }
            
            product_table.setAutoResizeMode( javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS );
            product_table.setModel(tableModel);
            product_table.getColumnModel().getColumn(0).setMinWidth(5);
            product_table.getColumnModel().getColumn(1).setMinWidth(95);
            product_table.getColumnModel().getColumn(2).setMaxWidth(95);
            product_table.getColumnModel().getColumn(3).setMaxWidth(50);

        }
    }
    
    void tblKeForm(){
        id_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),0)+"");
        name_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),1)+"");
        price_txtfield.setText(tableModel.getValueAt(product_table.getSelectedRow(),2)+"");
        stock_txtfield1.setText(tableModel.getValueAt(product_table.getSelectedRow(),3)+"");
        updateBtn.setEnabled(true);
        save_button.setEnabled(false);
        deleteBtn.setEnabled(true);
        ukuran.setText(tableModel.getValueAt(product_table.getSelectedRow(),5)+"");

                                                                                                        
    }
    
    
        
    private void setCategory(List<Category> categories){    
        if (categories==null){
            JOptionPane.showMessageDialog(this, "Data kategori gagal diambil dari database","DATABASE FAILED",JOptionPane.ERROR_MESSAGE);
        }else{
            category_combobox.setModel(new DefaultComboBoxModel(categories.toArray()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox category_combobox;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField id_txtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name_txtfield;
    private javax.swing.JTextField price_txtfield;
    private javax.swing.JTable product_table;
    private javax.swing.JButton save_button;
    private javax.swing.JTextField stock_txtfield1;
    private javax.swing.JTextField ukuran;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

}
