import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raj
 */
public class SALES extends javax.swing.JFrame {

    /**
     * Creates new form SALES
     */
    public SALES() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    class shortcuts
    { void empty()
    {JOptionPane.showMessageDialog(null,"PLEASE ENTER THE DETAILS.");}
    void clear()
    {jTextField1.setText("0");jTextField2.setText("0");jTextField3.setText("0");
    jTextField4.setText("0");jTextField5.setText("");jTextField7.setText("");
     buttonGroup1.clearSelection();buttonGroup2.clearSelection();}
}
    shortcuts s1=new shortcuts();

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("T.K. SALES-SALES");
        setMaximumSize(new java.awt.Dimension(790, 480));
        setPreferredSize(new java.awt.Dimension(790, 520));
        getContentPane().setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("DATE");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(298, 20, 50, 20);

        jTextField7.setToolTipText("ENTER DATE IN YYYY-MM-DD FORMAT");
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(383, 12, 90, 22);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BILL NO.", "DATE", "BRAND", "COLOUR", "SIZE", "BUYER", "SALES TYPE", "QUANTITY", "RATE", "DISCOUNT", "PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 336, 711, 90);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("S. BILL NO.");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9);
        jLabel9.setBounds(34, 18, 70, 14);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton7.setText("RESET TABLE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(546, 295, 107, 23);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(110, 12, 60, 22);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton6.setText("CREDIT");
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(470, 100, 70, 23);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(442, 207, 70, 23);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setText("BACK TO MENU");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(608, 433, 113, 35);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 279, 662, 10);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("ADD SALE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(11, 295, 90, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("TOTAL COST Rs. ");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 211, 100, 14);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("SEARCH SALES");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(117, 295, 120, 23);

        jTextField4.setEditable(false);
        jTextField4.setText("0");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(298, 208, 55, 23);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("DISPLAY ALL SALES");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(254, 295, 140, 23);

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BUYER1", "BUYER2", "BUYER3" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(330, 60, 80, 20);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("DELETE SALES");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(418, 295, 110, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("PRODUCT DETAILS:");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(49, 40, 110, 14);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRAND1", "BRAND2", "BRAND3" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(44, 60, 80, 20);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COLOR1", "COLOR2", "COLOR3" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(138, 60, 80, 20);

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SIZE1", "SIZE2", "SIZE3" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(232, 60, 70, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("QUANTITY");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 172, 57, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("RATE");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 211, 30, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("DISC %");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 248, 60, 14);

        jTextField2.setText("0");
        getContentPane().add(jTextField2);
        jTextField2.setBounds(87, 208, 46, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton5.setText("CASH");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(470, 80, 70, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("TYPE OF SALE");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(470, 60, 80, 14);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ADD NEW:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(566, 48, 54, 14);

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setText("BRAND");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(566, 90, 63, 23);

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setText("COLOR");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(566, 113, 63, 23);

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setText("SIZE");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(566, 139, 60, 23);

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton4.setText("BUYER");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(566, 64, 61, 23);

        jTextField1.setText("0");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(90, 170, 40, 20);

        jTextField3.setText("0");
        getContentPane().add(jTextField3);
        jTextField3.setBounds(90, 250, 40, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("CALCULATE TOTAL COST");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(170, 250, 190, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PicsArt_12-28-05.48.18.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 800, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        int rows=model.getRowCount();
        if (rows>0)
        { for (int i=1;i<=rows;i++)
            model.removeRow(0);}        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        s1.clear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();  
        new MENU().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String B,D,a,b,c,d,e,q,r,dis,p; 
        D=jTextField7.getText();
        B=jTextField5.getText();
        q=jTextField1.getText();
        r=jTextField2.getText();
        dis=jTextField3.getText();
        p=jTextField4.getText();
        a=(String) jComboBox1.getSelectedItem();
        b=(String) jComboBox2.getSelectedItem();
        c=(String) jComboBox3.getSelectedItem();
        d=(String) jComboBox4.getSelectedItem();
        if (jRadioButton5.isSelected()) e="cash"; else e="credit";
if (B.isEmpty()) s1.empty();
else if (D.isEmpty()) s1.empty();
else if (B.isEmpty()) s1.empty();
else if (q.isEmpty()) s1.empty();
else if (r.isEmpty()) s1.empty();
else if (dis.isEmpty()) s1.empty();
else {

        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/shivanshjain_xiib","root","abc123");
            Statement stmt=(Statement) con.createStatement();
            String query="INSERT INTO SALES VALUES (trim('"+B+"'),trim('"+D+"'),trim('"+a+"'),trim('"+b+"'),trim('"+c+"'),trim('"+d+"'),trim('"+e+"'),trim('"+q+"'),trim('"+r+"'),trim('"+dis+"'),trim('"+p+"'));";
            stmt.executeUpdate(query);
            con.close();
            JOptionPane.showMessageDialog(this,"SALE ADDED.");
            s1.clear();}
        catch (Exception z)
        {JOptionPane.showMessageDialog(null,z.getMessage());}}
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String B,D,a,b,c,d,e,q,r,dis,p,y,z,query;

        D=jTextField7.getText();
        B=jTextField5.getText();
        a=(String) jComboBox1.getSelectedItem();
        b=(String) jComboBox2.getSelectedItem();
        d=(String) jComboBox4.getSelectedItem();

        y=JOptionPane.showInputDialog(this,"search on the basis of billno,date,brand or buyer?"+'\n'+"(make sure you have entered the detail you want to search against and then search, else press CANCEL.)");
        if ("date".equals(y))         z=D;
        else if ("billno".equals(y)) z=B;
        else if ("brand".equals(y)) z=a;
        else                  z=d;

        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/shivanshjain_xiib","root","abc123");
            Statement stmt=(Statement) con.createStatement();
            query="SELECT * FROM SALES where "+y+"='"+z+"';";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {   B=rs.getString("billno");
                D=rs.getString("date");
                a=rs.getString("brand");
                b=rs.getString("colour");
                c=rs.getString("size");
                d=rs.getString("buyer");
                e=rs.getString("purchasetype");
                q=rs.getString("quantity");
                r=rs.getString("rate");
                dis=rs.getString("discount");
                p=rs.getString("price");

                model.addRow(new Object[]{B,D,a,b,c,d,e,q,r,dis,p});}
            con.close();}
        catch (Exception o)
        {JOptionPane.showMessageDialog(null,o.getMessage());}
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String B,D,a,b,c,d,e,q,r,dis,p,query;
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/shivanshjain_xiib","root","abc123");
            Statement stmt=(Statement) con.createStatement();
            query="SELECT * FROM SALES;";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                B=rs.getString("billno");
                D=rs.getString("date");
                a=rs.getString("brand");
                b=rs.getString("colour");
                c=rs.getString("size");
                d=rs.getString("buyer");
                e=rs.getString("purchasetype");
                q=rs.getString("quantity");
                r=rs.getString("rate");
                dis=rs.getString("discount");
                p=rs.getString("price");

                model.addRow(new Object[]{B,D,a,b,c,d,e,q,r,dis,p});}
            con.close();}
        catch (Exception o)
        {JOptionPane.showMessageDialog(null,o.getMessage());}
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String B;
        B=jTextField5.getText();
       if (B.isEmpty()) JOptionPane.showMessageDialog(this,"enter the bill no of the sale");
else { try{
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/shivanshjain_xiib","root","abc123");
            Statement stmt=(Statement) con.createStatement();
            String query="delete from SALES where billno=trim('"+B+"')";
            stmt.executeUpdate(query);
            con.close();
        JOptionPane.showMessageDialog(this,"SALE WITH BILL NO. "+B+" HAS BEEN DELETED.");}
        catch (Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}}
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        String a;
        a=JOptionPane.showInputDialog(this,"ENTER BRAND:");
        jComboBox1.addItem(a);        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        String a;
        a=JOptionPane.showInputDialog(this,"ENTER COLOUR:");
        jComboBox2.addItem(a);        
        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        String a;
        a=JOptionPane.showInputDialog(this,"ENTER SIZE:");
        jComboBox3.addItem(a);        
        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        String a;
        a=JOptionPane.showInputDialog(this,"ENTER BUYER NAME:");
        jComboBox4.addItem(a);        
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
double q,r,d,p;
        q=Double.parseDouble(jTextField3.getText());
        r=Double.parseDouble(jTextField2.getText());
        d=Double.parseDouble(jTextField1.getText());
        p=(q*r)-((d/100)*(q*r));
        jTextField4.setText(Double.toString(p));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SALES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SALES().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
