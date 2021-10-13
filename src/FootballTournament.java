
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class FootballTournament extends javax.swing.JFrame {

    Connection connection = null;

    public FootballTournament() {
        initComponents();
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager
                    .getConnection(
                            "jdbc:sqlserver://localhost:1433;databaseName=FootballTournamentManagement;selectMethod=cursor", "sa", "123456");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        country = new javax.swing.JLabel();
        height = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        totalgoal = new javax.swing.JLabel();
        hoursplayed = new javax.swing.JLabel();
        yellowcards = new javax.swing.JLabel();
        redcards = new javax.swing.JLabel();
        ratings = new javax.swing.JLabel();
        NameTF = new javax.swing.JTextField();
        AgeTF = new javax.swing.JTextField();
        TotalGoal = new javax.swing.JComboBox<>();
        HoursplayedTF = new javax.swing.JTextField();
        YellowCards = new javax.swing.JComboBox<>();
        RedCards = new javax.swing.JComboBox<>();
        Ratings = new javax.swing.JComboBox<>();
        Save = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        HeightTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ShowP = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Pcountry = new javax.swing.JComboBox<>();
        Pteamname = new javax.swing.JComboBox<>();
        Positionc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Players Registration Form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        name.setText("Name");

        age1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        age1.setText("Age");

        country.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        country.setText("Country");

        height.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        height.setText("Height");

        position.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        position.setText("Position");

        totalgoal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalgoal.setText("Total Goal");

        hoursplayed.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hoursplayed.setText("Hours Played");

        yellowcards.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yellowcards.setText("Yellow Cards");

        redcards.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        redcards.setText("Red cards");

        ratings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ratings.setText("Ratings");

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });

        AgeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgeTFActionPerformed(evt);
            }
        });

        TotalGoal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));

        YellowCards.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        RedCards.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));

        Ratings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));

        Save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ball.png"))); // NOI18N

        ShowP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShowP.setText("Show");
        ShowP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Team Name");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Pcountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));

        Pteamname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arizona Cardinals", "Atlanta Falcons", "Baltimore Ravens", "Buffalo Bills", "Carolina Panthers", "Chicago Bears", "Cincinnati Bengals", "Cleveland Browns", "Dallas Cowboys", "Denver Broncos", "Detroit Lions", "Green Bay Packers", "Houston Texans", "Indianapolis Colts", "Jacksonville Jaguars", "Kansas City Chiefs", "Los Angeles Chargers", "Los Angeles Rams", "Miami Dolphins", "Minnesota Vikings", "New England Patriots", "New Orleans Saints", "New York Giants", "New York Jets", "Oakland Raiders", "Philadelphia Eagles", "Pittsburgh Steelers", "San Francisco 49ers", "Seattle Seahawks", "Tampa Bay Buccaneers", "Tennessee Titans", "Washington Redskins" }));

        Positionc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age1)
                            .addComponent(country)
                            .addComponent(height)
                            .addComponent(position)
                            .addComponent(totalgoal))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(AgeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                                .addComponent(NameTF))
                            .addComponent(HeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TotalGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Positionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hoursplayed)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yellowcards)
                                .addComponent(ratings)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(redcards, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoursplayedTF, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pteamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(RedCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(YellowCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Ratings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1018, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(Save)
                .addGap(32, 32, 32)
                .addComponent(ShowP)
                .addGap(40, 40, 40)
                .addComponent(Reset)
                .addGap(58, 58, 58)
                .addComponent(jButton1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age1)
                    .addComponent(AgeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country)
                            .addComponent(Pcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(height)
                        .addGap(15, 15, 15)
                        .addComponent(position))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(HeightTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Positionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalgoal)
                    .addComponent(TotalGoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoursplayed)
                            .addComponent(HoursplayedTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yellowcards)
                            .addComponent(YellowCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redcards)
                            .addComponent(RedCards, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ratings)
                    .addComponent(Ratings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Pteamname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save)
                    .addComponent(Reset)
                    .addComponent(ShowP)
                    .addComponent(jButton1))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed

    }//GEN-LAST:event_NameTFActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        String pName = null;
        int pAge = 0;
        int pYC = 0;
        String pCountry = null;
        float pHeight = 0;
        String Position = null;
        int pTotalGoal = 0;
        float pHoursPlayed = 0;
        int pRC = 0;
        float pRatings = 0;
         String pteamname=null;
        
        try {
            pName = NameTF.getText();
        } catch (Exception e) {
             pName="";
            System.out.println("Please fill up name correctly");
        }
        try {
           
            pAge = Integer.parseInt(AgeTF.getText().toString());
            
        } catch (Exception e) {
            pAge=0;
            System.out.println("Please fill up age correctly");
        }
      
        try {
            pHeight = Float.parseFloat(HeightTF.getText().toString());
        } catch (Exception e) {
            pHeight=(float) 0.00;
            System.out.println("Please fill up Height correctly");
        }
        try {
            Position = Positionc.getSelectedItem().toString();
        } catch (Exception e) {
            Position="";
            System.out.println("Please fill up position correctly");
        }
          pCountry=(String) Pcountry.getSelectedItem();  
       
        pYC = Integer.parseInt(YellowCards.getSelectedItem().toString());
        pTotalGoal = Integer.parseInt(TotalGoal.getSelectedItem().toString());
        pRatings = Float.parseFloat(Ratings.getSelectedItem().toString());
        try {
            pHoursPlayed = Float.parseFloat(HoursplayedTF.getText().toString());
        } catch (Exception e) {
              pHoursPlayed=(float) 0.00;
            System.out.println("Please fill up Hours correctly");
        }
        pRC = Integer.parseInt(RedCards.getSelectedItem().toString());
  
      pteamname=(String) Pteamname.getSelectedItem();  
        Players player = new Players(pAge, pName,pCountry, 
                Float.parseFloat(HeightTF.getText()), PositionTF.getText(),
                Integer.parseInt(TotalGoal.getSelectedItem().toString()),
                Float.parseFloat(HoursplayedTF.getText()),
                pYC,
                Integer.parseInt(RedCards.getSelectedItem().toString()),
                Float.parseFloat(Ratings.getSelectedItem().toString()),pteamname);
        System.out.println(player.getAge());

        System.out.println(player.getPlayerName());
        System.out.println(player.getAge());
        System.out.println(player.getCountry());
        System.out.println(player.getHeight());
        System.out.println(player.getPosition());
        System.out.println(player.getGoalScored());
        System.out.println(player.getHoursPlayed());
        System.out.println(player.getYellowCard());
        System.out.println(player.getRedCard());
        System.out.println(player.getRating());
          System.out.println(player.getTeamName());

        try {
            PreparedStatement pst = connection.prepareStatement("insert into Players "
                    + "(Age,Name,Country,Height,Position,TotalGoal,HoursPlayed,Yellowcards,RedCards,Ratings,teamname) "
                    + "values(?,?,?,?,?,?,?,?,?,?,?)");
         
            pst.setInt(1, pAge);
            pst.setString(2, pName);
           String country;
            country=Pcountry.getSelectedItem().toString();
        pst.setString(3,pCountry);
            pst.setFloat(4, pHeight);
            pst.setString(5, Positionc.getSelectedItem().toString());
            int goal;
            goal = Integer.parseInt(TotalGoal.getSelectedItem().toString());

            pst.setInt(6, pTotalGoal);

            pst.setFloat(7, pHoursPlayed);
            int ycard;

            ycard = Integer.parseInt(YellowCards.getSelectedItem().toString());
            pst.setInt(8, pYC);
            int rcard;
            rcard = Integer.parseInt(RedCards.getSelectedItem().toString());

            pst.setInt(9, pRC);
            float rate;
            rate = Float.parseFloat(Ratings.getSelectedItem().toString());

            pst.setFloat(10, pRatings);
              String pteam;
       pteam=Pteamname.getSelectedItem().toString();
                 
           pst.setString(11,pteamname);
            
            pst.execute();
               AgeTF.setText("");
        NameTF.setText("");
        Pcountry.setSelectedIndex(0);
        HeightTF.setText("");
        Positionc.setSelectedIndex(0);
        TotalGoal.setSelectedIndex(0);
        HoursplayedTF.setText("");
        YellowCards.setSelectedIndex(0);
        RedCards.setSelectedIndex(0);
        Ratings.setSelectedIndex(0);
        Pteamname.setSelectedIndex(0);
            
            JOptionPane.showMessageDialog(null, "Inserted Successfully");

        } catch (SQLException ex) {
            //Logger.getLogger(FootballTournament.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_SaveActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        AgeTF.setText("");
        NameTF.setText("");
        Pcountry.setSelectedIndex(0);
        HeightTF.setText("");
        Positionc.setSelectedIndex(0);
        TotalGoal.setSelectedIndex(0);
        HoursplayedTF.setText("");
        YellowCards.setSelectedIndex(0);
        RedCards.setSelectedIndex(0);
        Ratings.setSelectedIndex(0);
        Pteamname.setSelectedIndex(0);
    }//GEN-LAST:event_ResetActionPerformed

    private void AgeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgeTFActionPerformed

    private void ShowPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPActionPerformed
        // TODO add your handling code here:
          new ShowUser().setVisible(true);
    }//GEN-LAST:event_ShowPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         new MainPage().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ShowActionPerformed() {

    }

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
            java.util.logging.Logger.getLogger(FootballTournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FootballTournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FootballTournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FootballTournament.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FootballTournament().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AgeTF;
    private javax.swing.JTextField HeightTF;
    private javax.swing.JTextField HoursplayedTF;
    private javax.swing.JTextField NameTF;
    private javax.swing.JComboBox<String> Pcountry;
    private javax.swing.JComboBox<String> Positionc;
    private javax.swing.JComboBox<String> Pteamname;
    private javax.swing.JComboBox<String> Ratings;
    private javax.swing.JComboBox<String> RedCards;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Save;
    private javax.swing.JButton ShowP;
    private javax.swing.JComboBox<String> TotalGoal;
    private javax.swing.JComboBox<String> YellowCards;
    private javax.swing.JLabel age1;
    private javax.swing.JLabel country;
    private javax.swing.JLabel height;
    private javax.swing.JLabel hoursplayed;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel position;
    private javax.swing.JLabel ratings;
    private javax.swing.JLabel redcards;
    private javax.swing.JLabel totalgoal;
    private javax.swing.JLabel yellowcards;
    // End of variables declaration//GEN-END:variables
}
