package views;

import controllers.DonationController;
import paws_and_care.MainFrame;

import java.time.LocalDate;
import javax.swing.JOptionPane;
import models.Donation;

public class DonationFrame extends javax.swing.JFrame {

    /**
     * Creates new form DonationForm
     */
    public DonationFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addDonationPanel = new javax.swing.JPanel();
        donationLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        donatorNameLabel = new javax.swing.JLabel();
        donatorName = new javax.swing.JTextField();
        donationAmountLabel = new javax.swing.JLabel();
        donationField = new javax.swing.JTextField();
        updateDonation = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        withdrawalPanel = new javax.swing.JPanel();
        donationLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        withdrawerNameLabel = new javax.swing.JLabel();
        withdrawerNameFeild = new javax.swing.JTextField();
        withdrawalAmountLabel = new javax.swing.JLabel();
        withdrawalField = new javax.swing.JTextField();
        withDrawButton = new javax.swing.JButton();
        secondaryPanel = new javax.swing.JPanel();
        balancePanel = new javax.swing.JPanel();
        accBalanceLabel = new javax.swing.JLabel();
        accountBalance = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        checkDonationLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        donationSearch = new javax.swing.JTextField();
        checkDonations = new javax.swing.JButton();
        transactionDonationName = new javax.swing.JLabel();
        transactionwithdrawalName = new javax.swing.JLabel();
        donationTransactions = new javax.swing.JLabel();
        withdrawalTransactions = new javax.swing.JLabel();
        searchMode = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donation Management");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        MainPanel.setBackground(new java.awt.Color(255, 255, 204));

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Donation Management");

        addDonationPanel.setBackground(new java.awt.Color(204, 255, 204));
        addDonationPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        donationLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        donationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donationLabel.setText("Add Donation");

        donatorNameLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        donatorNameLabel.setText("Donator Name");

        donatorName.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        donationAmountLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        donationAmountLabel.setText("Add Donation Amount");

        donationField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        updateDonation.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        updateDonation.setText("Update");
        updateDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDonationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addDonationPanelLayout = new javax.swing.GroupLayout(addDonationPanel);
        addDonationPanel.setLayout(addDonationPanelLayout);
        addDonationPanelLayout.setHorizontalGroup(
            addDonationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDonationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDonationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donatorName)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addDonationPanelLayout.createSequentialGroup()
                        .addGroup(addDonationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(donatorNameLabel)
                            .addComponent(donationAmountLabel)
                            .addGroup(addDonationPanelLayout.createSequentialGroup()
                                .addComponent(donationField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateDonation, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addDonationPanelLayout.setVerticalGroup(
            addDonationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDonationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donatorNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donatorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(donationAmountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addDonationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateDonation))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        homeButton.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        homeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home.png"))); // NOI18N
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        withdrawalPanel.setBackground(new java.awt.Color(255, 204, 204));
        withdrawalPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        donationLabel1.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        donationLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donationLabel1.setText("Withdrawal");

        withdrawerNameLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        withdrawerNameLabel.setText("Withdrawer Name");

        withdrawerNameFeild.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        withdrawalAmountLabel.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        withdrawalAmountLabel.setText("Withdrawal Amount");

        withdrawalField.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        withDrawButton.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        withDrawButton.setText("Withdraw");
        withDrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withDrawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout withdrawalPanelLayout = new javax.swing.GroupLayout(withdrawalPanel);
        withdrawalPanel.setLayout(withdrawalPanelLayout);
        withdrawalPanelLayout.setHorizontalGroup(
            withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(donationLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdrawerNameFeild)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(withdrawalPanelLayout.createSequentialGroup()
                        .addGroup(withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(withdrawerNameLabel)
                            .addComponent(withdrawalAmountLabel)
                            .addGroup(withdrawalPanelLayout.createSequentialGroup()
                                .addComponent(withdrawalField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(withDrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        withdrawalPanelLayout.setVerticalGroup(
            withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(donationLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawerNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawerNameFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(withdrawalAmountLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(withdrawalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdrawalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withDrawButton))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        balancePanel.setBackground(new java.awt.Color(255, 255, 102));

        accBalanceLabel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        accBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accBalanceLabel.setText("Account Balance");

        accountBalance.setFont(new java.awt.Font("Cambria", 0, 36)); // NOI18N
        accountBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountBalance.setText("$ 0.00");

        javax.swing.GroupLayout balancePanelLayout = new javax.swing.GroupLayout(balancePanel);
        balancePanel.setLayout(balancePanelLayout);
        balancePanelLayout.setHorizontalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(accBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(accountBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        balancePanelLayout.setVerticalGroup(
            balancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balancePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(accBalanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(accountBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        checkDonationLabel.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        checkDonationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkDonationLabel.setText("Check Transactions");

        donationSearch.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        donationSearch.setToolTipText("");
        donationSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        donationSearch.setName(""); // NOI18N

        checkDonations.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        checkDonations.setText("Check");
        checkDonations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDonationsActionPerformed(evt);
            }
        });

        transactionDonationName.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        transactionDonationName.setText("Donations : ");

        transactionwithdrawalName.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        transactionwithdrawalName.setText("Withdrawals:");

        donationTransactions.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        donationTransactions.setText("$ 0.00 ");

        withdrawalTransactions.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        withdrawalTransactions.setText("$ 0.00");

        searchMode.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        searchMode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donator Name", "Date" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkDonationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(donationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchMode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDonations, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(transactionwithdrawalName)
                        .addGap(18, 18, 18)
                        .addComponent(withdrawalTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(transactionDonationName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donationTransactions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkDonationLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkDonations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(donationSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchMode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionDonationName)
                    .addComponent(donationTransactions))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transactionwithdrawalName)
                    .addComponent(withdrawalTransactions))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout secondaryPanelLayout = new javax.swing.GroupLayout(secondaryPanel);
        secondaryPanel.setLayout(secondaryPanelLayout);
        secondaryPanelLayout.setHorizontalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(balancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        secondaryPanelLayout.setVerticalGroup(
            secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondaryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondaryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balancePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(homeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(addDonationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(homeButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addDonationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(secondaryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        // Goto MainFrame
        MainFrame newMainFrame = new MainFrame();
        newMainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed

    private void updateDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDonationActionPerformed
        
            // Get the updated value for donation
            String donation_text = (String) donationField.getText();
            double donation = Double.parseDouble(donation_text);
            
            String donator_name = (String) donatorName.getText();
            String type = "Donation";
            LocalDate date = LocalDate.now();
            String dateText = date.toString();
            
            // Create donation object
            Donation donation_obj = new Donation(dateText, type, donation, donator_name);
            
            // Initialize the controller
            DonationController controller = new DonationController();
            int rowsAffected = controller.updateDonation(donation_obj);
            
            if(rowsAffected > 0){
                donationField.setText("");
                donatorName.setText("");
                double balance = controller.getAccountBalance();
                accountBalance.setText("$ " + String.format("%.2f", balance));
                JOptionPane.showMessageDialog(null, "Donation Successfull!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Donation Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
    }//GEN-LAST:event_updateDonationActionPerformed

    private void withDrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withDrawButtonActionPerformed
        
        // Get the updated value for withdrawals
            String withdrawal_text = (String) withdrawalField.getText();
            double withdrawal_amount = Double.parseDouble(withdrawal_text);
            
            String withdrawer_name = (String) withdrawerNameFeild.getText();
            String type = "Withdraw";
            LocalDate date = LocalDate.now();
            String dateText = date.toString();
            
            // Create donation object
            Donation withdraw_obj = new Donation(dateText, type, withdrawal_amount, withdrawer_name);
            
            
            
            // Initialize the controller
            DonationController controller = new DonationController();
            
            // Check the remaining balance
            double remainingBalance = controller.getAccountBalance();
            if (remainingBalance < withdraw_obj.getAmount()){
                JOptionPane.showMessageDialog(null, "Amount cannot be withdrawed. Please enter small amount!", "Can't withdraw", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            int rowsAffected = controller.updateDonation(withdraw_obj);
            
            if(rowsAffected > 0){
                withdrawalField.setText("");
                withdrawerNameFeild.setText("");
                double balance = controller.getAccountBalance();
                accountBalance.setText("$ " + String.format("%.2f", balance));
                JOptionPane.showMessageDialog(null, "Withdrawal Successfull!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "Withdrawal Failed!", "Error", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_withDrawButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Set the Balance text
        DonationController controller = new DonationController();
        double balance = controller.getAccountBalance();
        accountBalance.setText("$ " + String.format("%.2f", balance));
    }//GEN-LAST:event_formWindowOpened

    private void checkDonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDonationsActionPerformed
        
            // Get the type to search
            String dataType = (String) searchMode.getSelectedItem();
            
            DonationController controller = new DonationController();
            
            // Get the entered value
            String input = donationSearch.getText();
            
            if (dataType.equals("Date")){
                try{
                    String donations = String.format("%.2f", controller.getAmountAt(input, "Donation"));
                    String withdrawals = String.format("%.2f", controller.getAmountAt(input, "Withdraw"));
                    
                    donationTransactions.setText("$ " + donations);
                    withdrawalTransactions.setText("$ " + withdrawals);
                    

                }
                catch (Exception e){
                    donationSearch.setText("");
                    JOptionPane.showMessageDialog(null, "Insert Date in YYYY-MM-DD format and try again.", "Incorrect Date or Missing Date", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else{
               try{
                    String donations = String.format("%.2f", controller.getAmountOf(input, "Donation"));
                    String withdrawals = String.format("%.2f", controller.getAmountOf(input, "Withdraw"));
                    
                    donationTransactions.setText("$ " + donations);
                    withdrawalTransactions.setText("$ " + withdrawals);
                    
                }
                catch (Exception e){
                    donationSearch.setText("");
                    JOptionPane.showMessageDialog(null, "Please check the name and try again!", "Incorrect or Missing User", JOptionPane.ERROR_MESSAGE);
                } 
            }
    }//GEN-LAST:event_checkDonationsActionPerformed

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
            java.util.logging.Logger.getLogger(DonationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel accBalanceLabel;
    private javax.swing.JLabel accountBalance;
    private javax.swing.JPanel addDonationPanel;
    private javax.swing.JPanel balancePanel;
    private javax.swing.JLabel checkDonationLabel;
    private javax.swing.JButton checkDonations;
    private javax.swing.JLabel donationAmountLabel;
    private javax.swing.JTextField donationField;
    private javax.swing.JLabel donationLabel;
    private javax.swing.JLabel donationLabel1;
    private javax.swing.JTextField donationSearch;
    private javax.swing.JLabel donationTransactions;
    private javax.swing.JTextField donatorName;
    private javax.swing.JLabel donatorNameLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> searchMode;
    private javax.swing.JPanel secondaryPanel;
    private javax.swing.JLabel transactionDonationName;
    private javax.swing.JLabel transactionwithdrawalName;
    private javax.swing.JButton updateDonation;
    private javax.swing.JButton withDrawButton;
    private javax.swing.JLabel withdrawalAmountLabel;
    private javax.swing.JTextField withdrawalField;
    private javax.swing.JPanel withdrawalPanel;
    private javax.swing.JLabel withdrawalTransactions;
    private javax.swing.JTextField withdrawerNameFeild;
    private javax.swing.JLabel withdrawerNameLabel;
    // End of variables declaration//GEN-END:variables
}
