
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ShowUser extends javax.swing.JFrame {

    public ShowUser() {
        initComponents();
        Display();
        Display.setAutoCreateRowSorter(true);
    }

    public ArrayList<Players> userlist() {
        Connection connection = null;
        ArrayList<Players> userList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
            String query1 = "SELECT *FROM Players";
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query1);
            Players player;
            while (rs.next()) {

                player = new Players(rs.getInt("playerID"), rs.getInt("Age"), rs.getString("Name"),
                        rs.getString("country"),
                        Float.parseFloat(rs.getString("height")), rs.getString("position"),
                        rs.getInt("TotalGoal"), rs.getFloat("hoursPlayed"),
                        rs.getInt("yellowcards"), rs.getInt("redCards"),
                        rs.getFloat("ratings"), rs.getString("teamname"));
                userList.add(player);
                System.out.println(player.getPlayerName());
                System.out.println(player.getRating());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return userList;

    }

    public void Display() {
        ArrayList<Players> list = userlist();
        DefaultTableModel model = (DefaultTableModel) Display.getModel();
        Object[] row = new Object[12];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getPlayerID();
            row[1] = list.get(i).getAge();
            row[2] = list.get(i).getPlayerName();
            row[3] = list.get(i).getCountry();
            row[4] = list.get(i).getHeight();
            row[5] = list.get(i).getPosition();
            row[6] = list.get(i).getGoalScored();
            row[7] = list.get(i).getHoursPlayed();
            row[8] = list.get(i).getYellowCard();
            row[9] = list.get(i).getRedCard();
            row[10] = list.get(i).getRating();
            row[11] = list.get(i).getTeamName();

            model.addRow(row);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Display = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Pid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        page = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        pcountry = new javax.swing.JTextField();
        pheight = new javax.swing.JTextField();
        pposition = new javax.swing.JTextField();
        ptotalgoal = new javax.swing.JTextField();
        phoursplayed = new javax.swing.JTextField();
        pyellowcards = new javax.swing.JTextField();
        predcards = new javax.swing.JTextField();
        pratings = new javax.swing.JTextField();
        pteamname = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Display.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PlayerID", "Age", "Name", "Country", "Height", "Position", "TotalGoal", "HoursPlayed", "YellowCards", "RedCards", "Ratings", "TeamName"
            }
        ));
        jScrollPane1.setViewportView(Display);

        jLabel1.setText("PlayerID");

        Pid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PidKeyReleased(evt);
            }
        });

        jLabel3.setText("Age");

        jLabel4.setText("Name");

        jLabel5.setText("Country");

        jLabel6.setText("Height");

        jLabel7.setText("Position");

        jLabel8.setText("TotalGoal");

        jLabel9.setText("HoursPlayed");

        jLabel10.setText("YellowCards");

        jLabel11.setText("RedCards");

        jLabel12.setText("Ratings");

        jLabel14.setText("TeamName");

        ptotalgoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptotalgoalActionPerformed(evt);
            }
        });

        pteamname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pteamnameActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7))
                                        .addGap(8, 8, 8)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pheight, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ptotalgoal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pposition, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoursplayed)
                                    .addComponent(pyellowcards)
                                    .addComponent(predcards)
                                    .addComponent(pratings)
                                    .addComponent(pteamname, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(jLabel1)
                                .addGap(40, 40, 40)
                                .addComponent(Pid, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108)
                                .addComponent(delete)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(Update)
                .addGap(82, 82, 82)
                .addComponent(refresh)
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(delete))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update)
                    .addComponent(refresh)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(page, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoursplayed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pyellowcards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(pcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(predcards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(pheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pratings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pposition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pteamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(ptotalgoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PidKeyReleased
        // TODO add your handling code here:
        Connection connection = null;
        ArrayList<Players> userList = new ArrayList<>();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection("jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
            String sql1 = "Select * from Players where PlayerId =? ";
            PreparedStatement pst = connection.prepareStatement(sql1);
            pst.setString(1, Pid.getText());

            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String setage = rs.getString("Age");
                page.setText(setage);
                String Name = rs.getString("Name");
                pname.setText(Name);
                String country = rs.getString("Country");
                pcountry.setText(country);
                String height = rs.getString("Height");
                pheight.setText(height);
                String position = rs.getString("Position");
                pposition.setText(position);
                String goal = rs.getString("TotalGoal");
                ptotalgoal.setText(goal);
                String hours = rs.getString("HoursPlayed");
                phoursplayed.setText(hours);
                String yellow = rs.getString("YellowCards");
                pyellowcards.setText(yellow);
                String red = rs.getString("RedCards");
                predcards.setText(red);
                String ratings = rs.getString("Ratings");
                pratings.setText(ratings);
                String team = rs.getString("TeamName");
                pteamname.setText(team);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_PidKeyReleased

    private void ptotalgoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptotalgoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptotalgoalActionPerformed

    private void pteamnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pteamnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pteamnameActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        try {
            Connection connection = null;

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection("jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
            String query = "UPDATE Players SET Position=?,TotalGoal=?,HoursPlayed=?,YellowCards=?,RedCards=?,TeamName=?"
                    + " where Playerid=" + Pid.getText();
            PreparedStatement pst = connection.prepareStatement(query);
            pst.setString(1, page.getText());
            pst.setString(2, pname.getText());
            pst.setString(3, pheight.getText());
            pst.setString(4, pposition.getText());
            pst.setString(5, ptotalgoal.getText());
            pst.setString(6, phoursplayed.getText());
            pst.setString(7, pyellowcards.getText());
            pst.setString(8, predcards.getText());
            pst.setString(9, pteamname.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try {

            Connection connection = null;
            PreparedStatement pst;

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection("jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");
            String sql = "DELETE FROM Players WHERE  PlayerId=" + Pid.getText();
            pst = connection.prepareStatement(sql);

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "delete successful");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        Display();
// TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ShowUser().setVisible(true);
    }//GEN-LAST:event_refreshActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new FootballTournament().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ShowUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Display;
    private javax.swing.JTextField Pid;
    private javax.swing.JButton Update;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pcountry;
    private javax.swing.JTextField pheight;
    private javax.swing.JTextField phoursplayed;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pposition;
    private javax.swing.JTextField pratings;
    private javax.swing.JTextField predcards;
    private javax.swing.JTextField pteamname;
    private javax.swing.JTextField ptotalgoal;
    private javax.swing.JTextField pyellowcards;
    private javax.swing.JButton refresh;
    // End of variables declaration//GEN-END:variables
}
