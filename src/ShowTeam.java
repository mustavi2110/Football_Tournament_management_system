
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class ShowTeam extends javax.swing.JFrame {

    /**
     * Creates new form ShowTeam
     */
    public ShowTeam() {
        initComponents();
            Display();
              Display.setAutoCreateRowSorter(true);
    }

      public ArrayList<Teamin> userlist() {
                  Connection connection = null;
        ArrayList<Teamin> userList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
            String query1 = "SELECT *FROM Teams";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Teamin team;
            while (rs.next()) {
                team = new Teamin(rs.getInt("teamID"),rs.getString("TeamName"), rs.getString("HomeGround"),
                        rs.getInt("HomeWin"),
                        rs.getInt("HomeLoss"),  rs.getInt("AwayWin"),
                       rs.getInt("AwayLoss"), rs.getInt("TotalWin"), 
                        rs.getInt("TotalLose"));
                userList.add(team);   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return userList;
          
          
    }
   
    public void Display() {
        ArrayList<Teamin> list = userlist();
        DefaultTableModel model = (DefaultTableModel) Display.getModel();
        Object[] row = new Object[9];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getTeamID();
            row[1] = list.get(i).getTeamName();
            row[2] = list.get(i).getHomeGround();
            row[3] = list.get(i).getHomeWin();
            row[4] = list.get(i).getHomeLose();
            row[5] = list.get(i).getAwayWin();
            row[6] = list.get(i).getAwayLose();
            row[7] = list.get(i).getTotalwin();
            row[8] = list.get(i).getTotallose();
            
            model.addRow(row);

        }

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTable();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        teamid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        teamname = new javax.swing.JTextField();
        homeground = new javax.swing.JTextField();
        homewin = new javax.swing.JTextField();
        homelose = new javax.swing.JTextField();
        awaywin = new javax.swing.JTextField();
        awaylose = new javax.swing.JTextField();
        totalwin = new javax.swing.JTextField();
        totallose = new javax.swing.JTextField();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team ID", "Team Name", "HomeGround", "Home Win", "Home Loss", "Away Win", "Away Loss", "Total Win", "Total Loss"
            }
        ));
        jScrollPane1.setViewportView(Display);

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel1.setText("Team Id");

        teamid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                teamidKeyReleased(evt);
            }
        });

        jLabel2.setText("Team Name");

        jLabel3.setText("Home Ground");

        jLabel4.setText("Home Win");

        jLabel5.setText("Home Lose");

        jLabel6.setText("Away Win");

        jLabel7.setText("Away Lose");

        jLabel8.setText("Total Win");

        jLabel9.setText("Total Lose");

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addComponent(teamid, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(update)
                .addGap(70, 70, 70)
                .addComponent(jButton1)
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teamname)
                            .addComponent(homeground)
                            .addComponent(homewin)
                            .addComponent(homelose, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(awaywin)
                            .addComponent(awaylose)
                            .addComponent(totalwin)
                            .addComponent(totallose, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(refresh)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update)
                    .addComponent(jLabel1)
                    .addComponent(teamid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(teamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(awaywin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(homeground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(awaylose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(homewin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalwin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(homelose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totallose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(refresh)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teamidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_teamidKeyReleased
       Connection connection = null;
        ArrayList<Referee> userList = new ArrayList<>();
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection(  "jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
         String sql3="Select * from Teams where teamId =? ";
         PreparedStatement pst=connection.prepareStatement(sql3);
         pst.setString(1,teamid.getText());
         ResultSet rs=pst.executeQuery();
         if(rs.next())
         { String tname=rs.getString("teamName");
             teamname.setText(tname);
             String tground=rs.getString("homeGround");
             homeground.setText(tground);
             String hwin=rs.getString("homeWin");
             homewin.setText(hwin);    
              String hlose=rs.getString("homeLoss");
             homelose.setText(hlose); 
              String awin=rs.getString("awayWin");
             awaywin.setText(awin);
              String alose=rs.getString("awayLoss");
             awaylose.setText(alose); 
              String total=rs.getString("totalWin");
             totalwin.setText(total); 
              String lose=rs.getString("totalLose");
             totallose.setText(lose); 
             
             
         }
         
         }
         catch(Exception e)
         {
           JOptionPane.showMessageDialog(null,e);
           
         }
    }//GEN-LAST:event_teamidKeyReleased

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try{
       Connection connection = null;
            
                
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection("jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
               String  query="UPDATE Teams SET teamName=?,homeGround=?,homeWin=?,homeLoss=?,awayWin=?,awayLoss=?,totalWin=?,totalLose=?"
                       + " where teamId="+teamid.getText();
    PreparedStatement pst = connection.prepareStatement(query);
               pst.setString(1,teamname.getText());
                pst.setString(2,homeground.getText());
                 pst.setString(3,homewin.getText());
                  pst.setString(4,homelose.getText());
                   pst.setString(5,awaywin.getText());
                    pst.setString(6,awaylose.getText()); 
                     pst.setString(7,totalwin.getText());
                      pst.setString(8,totallose.getText());
                   pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Update successfully");
}      catch(Exception e)    
{
            JOptionPane.showMessageDialog(null,e);  
}
        
    }//GEN-LAST:event_updateActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
          this.setVisible(false);
        new ShowTeam().setVisible(true);
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new Teams().setVisible(true);
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
            java.util.logging.Logger.getLogger(ShowTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowTeam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Display;
    private javax.swing.JTextField awaylose;
    private javax.swing.JTextField awaywin;
    private javax.swing.JTextField homeground;
    private javax.swing.JTextField homelose;
    private javax.swing.JTextField homewin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh;
    private javax.swing.JTextField teamid;
    private javax.swing.JTextField teamname;
    private javax.swing.JTextField totallose;
    private javax.swing.JTextField totalwin;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
