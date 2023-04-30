 
package timerandstopwatch;

 
public class timer extends javax.swing.JFrame {

    static int minute=0;
    static int hour =0;
    static int second =0;
    static int milisecond =0 ;
    static boolean state = true;
    static int count=0;
    
    static int minute1=02;
    static int hour1 =0;
    static int second1 =0;
    static int milisecond1 =0 ;
    static boolean state1 = true;
    public timer() {
        initComponents();
    }

     
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        timer = new javax.swing.JButton();
        stopwatch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tabelpanel = new javax.swing.JTabbedPane();
        panel2 = new javax.swing.JPanel();
        minutes = new javax.swing.JLabel();
        hours = new javax.swing.JLabel();
        seconds = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        start = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        miliseconds = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        flag0 = new javax.swing.JLabel();
        flag1 = new javax.swing.JLabel();
        flag2 = new javax.swing.JLabel();
        flag3 = new javax.swing.JLabel();
        flag4 = new javax.swing.JLabel();
        flag5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panel3 = new javax.swing.JPanel();
        minutes1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        gethour = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        getminute = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        getsecond = new javax.swing.JTextField();
        seconds1 = new javax.swing.JLabel();
        hours1 = new javax.swing.JLabel();
        start1 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        miliseconds1 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(102, 255, 255));

        timer.setBackground(new java.awt.Color(102, 255, 255));
        timer.setForeground(new java.awt.Color(102, 255, 255));
        timer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timerandstopwatch/icons8-timer-50.png"))); // NOI18N
        timer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerActionPerformed(evt);
            }
        });

        stopwatch.setBackground(new java.awt.Color(102, 255, 255));
        stopwatch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timerandstopwatch/icons8-stopwatch-64.png"))); // NOI18N
        stopwatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopwatchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel4.setText("Stopwatch");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Timer");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timer)
                            .addComponent(stopwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(stopwatch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(timer, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(110, 110, 110))
        );

        tabelpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelpanel.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        panel2.setBackground(new java.awt.Color(255, 255, 255));

        minutes.setFont(new java.awt.Font("Arial Black", 1, 100)); 
        minutes.setText("00:");

        hours.setFont(new java.awt.Font("Arial Black", 1, 100));
        hours.setText("00:");

        seconds.setFont(new java.awt.Font("Arial Black", 1, 100)); 
        seconds.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        seconds.setText("00:");

        stop.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        stop.setIcon(new javax.swing.ImageIcon("C:\\Users\\sourabh chouhan\\Downloads\\button (1).png")); 
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });

        start.setFont(new java.awt.Font("Tahoma", 1, 36)); 
        start.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timerandstopwatch/button.png"))); 
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 36));
        reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\sourabh chouhan\\Downloads\\button (2).png")); 
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        miliseconds.setFont(new java.awt.Font("Arial Black", 1, 60)); 
        miliseconds.setText("00");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(153, 153, 153)));

        flag0.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        flag0.setText(" ");

        flag1.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        flag1.setText(" ");

        flag2.setFont(new java.awt.Font("Arial Black", 0, 14));
        flag2.setText(" ");

        flag3.setFont(new java.awt.Font("Arial Black", 0, 14));
        flag3.setText(" ");

        flag4.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        flag4.setText(" ");

        flag5.setFont(new java.awt.Font("Arial Black", 0, 14)); 
        flag5.setText(" ");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); 
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Flags   ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(flag5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flag4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flag3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flag2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flag1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flag0, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag0, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(flag5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(miliseconds, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hours, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miliseconds, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tabelpanel.addTab("Stopwatch", panel2);

        panel3.setBackground(new java.awt.Color(255, 255, 255));

        minutes1.setFont(new java.awt.Font("Arial Black", 0, 100)); // NOI18N
        minutes1.setText("00: ");

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Hour");

        gethour.setText("00");
        gethour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gethourActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Minute");

        getminute.setText("00");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setText("Second");

        getsecond.setText("00");
        getsecond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getsecondActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(gethour, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(getminute, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(getsecond, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(getsecond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getminute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(gethour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        seconds1.setFont(new java.awt.Font("Arial Black", 0, 100)); // NOI18N
        seconds1.setText("00: ");

        hours1.setFont(new java.awt.Font("Arial Black", 0, 100)); // NOI18N
        hours1.setText("00: ");

        start1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        start1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sourabh chouhan\\Downloads\\button (3).png")); // NOI18N
        start1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start1ActionPerformed(evt);
            }
        });

        reset1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        reset1.setIcon(new javax.swing.ImageIcon("C:\\Users\\sourabh chouhan\\Downloads\\button (4).png")); // NOI18N
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/timerandstopwatch/edit.png"))); // NOI18N
        edit.setText(" ");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Edit");

        miliseconds1.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        miliseconds1.setText("00");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(start1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(hours1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(minutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(seconds1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(miliseconds1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(177, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hours1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seconds1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miliseconds1))
                .addGap(70, 70, 70)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(start1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(41, 41, 41))
        );

        tabelpanel.addTab("Timer", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabelpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stopwatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopwatchActionPerformed
        tabelpanel.setSelectedIndex(0);
    }//GEN-LAST:event_stopwatchActionPerformed

    private void timerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerActionPerformed
         tabelpanel.setSelectedIndex(1);
    }//GEN-LAST:event_timerActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        state=false;
        if(count ==0)
        {
            flag0.setText(hour+":"+minute+":"+second);
            count++;
        }
        else if(count ==1)
        {
            flag1.setText(hour+":"+minute+":"+second);
            count++;
        }
        else if(count ==2)
        {
            flag2.setText(hour+":"+minute+":"+second);
            count++;
        }
        else if(count ==3)
        {
            flag3.setText(hour+":"+minute+":"+second);
            count++;
        }
        else if(count ==4)
        {
            flag4.setText(hour+":"+minute+":"+second);
            count++;
        }
        else if(count==5)
        {
            flag5.setText(hour+":"+minute+":"+second);
            count=0;
        }
    }//GEN-LAST:event_stopActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        state = true;

        Thread t1 = new Thread()
        {
            public void run()
            {
                for(;;)
                {
                    if(state == true)
                    {
                        try
                        {
                            sleep(1);
                            if(milisecond >1000)
                            {
                                second++;
                                milisecond = 0;
                            }
                            if(second > 59)
                            {
                                minute++;
                                second =0;
                                milisecond = 0;
                            }
                            if(minute > 59)
                            {
                                hour++;
                                minute=0;
                                second=0;
                                milisecond = 0;
                            }
                            miliseconds.setText(milisecond+"");
                            milisecond++;
                            if(hour<=9)
                               hours.setText("0"+hour+": ");
                            else
                              hours.setText(hour+": ");
                            
                            if(minute <=9)
                               minutes.setText("0"+minute+": ");
                            else
                               minutes.setText(minute+": ");
                            
                            if(second<=9)
                              seconds.setText("0"+second+": ");
                            else
                              seconds.setText(second+": ");

                        }
                        catch(Exception e)
                        {

                        }

                    }
                    else
                    {
                        break;
                    }
                }
            }
        };
        t1.start();
    }//GEN-LAST:event_startActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        state=false;

        hour=0;
        minute=0;
        second=0;
        miliseconds.setText("00");
        seconds.setText("00:");
        minutes.setText("00:");
        hours.setText("00:");
        
        
    }//GEN-LAST:event_resetActionPerformed

    private void gethourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gethourActionPerformed
        
    }//GEN-LAST:event_gethourActionPerformed

    private void getsecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getsecondActionPerformed
         
    }//GEN-LAST:event_getsecondActionPerformed

    private void start1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start1ActionPerformed
        state1=true;
        Thread t = new Thread()
        {
            public void run()
            {
                for(; ;)
                {
                     if(hour1==0 && minute1 == 0 && second1==0)
                                {

                                    hour1=0;
                                    minute1=2;
                                    second1=0;
                                    miliseconds1.setText("00");
                                    seconds1.setText("00:");
                                    minutes1.setText("00:");
                                    hours1.setText("00:");
                                    state= false;
                                    break;
                                }
                    if(state1 == true)
                    {

                        try
                        {
                            sleep(1);
                            if(milisecond1 > 1000)
                            {
                                second1--;
                                milisecond1=0;
                            }
                            if(second1 < 0)
                            {
                                minute1--;
                                second1=59;
                                milisecond1=0;
                            }
                            if(minute1 < 0)
                            {
                                
                                hour1--;
                                minute1=59;
                                second1=59;
                                milisecond1=0;

                            }
                             miliseconds1.setText(milisecond1+"");
                            milisecond1++;
                            if(second1 <=9)
                               seconds1.setText("0"+second1+":");
                            else
                                seconds1.setText(second1+":");
                            if(minute1<=9)
                               minutes1.setText("0"+minute1+":");
                            else
                               minutes1.setText(minute1+":");
                            if(hour1<=9)
                               hours1.setText("0"+hour1+":");
                            else
                                hours1.setText(hour1+":");
                             

                        }
                        catch(Exception E)
                        {

                        }

                    }
                    else
                    {
                        break;
                    }

                }
            }
        };
        t.start();
    }//GEN-LAST:event_start1ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        state1=false;
        hour1=0;
        minute1=2;
        second1=0;
        miliseconds1.setText(" 00 ");
        seconds1.setText(" 00: ");
        minutes1.setText(" 02: ");
        hours1.setText(" 00:");
    }//GEN-LAST:event_reset1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        state1=false;
        hour1=Integer.parseInt(gethour.getText());
        minute1=Integer.parseInt(getminute.getText());
        second1=Integer.parseInt(getsecond.getText());
             if(second1 <=9)
                  seconds1.setText("0"+second1+":");
             else
                  seconds1.setText(second1+":");
             if(minute1<=9)
                  minutes1.setText("0"+minute1+":");
             else
                  minutes1.setText(minute1+":");
            if(hour1<=9)
                 hours1.setText("0"+hour1+":");
            else
                hours1.setText(hour1+":");
    } 

    
    public static void main(String args[]) {
       
          
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(timer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
         

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new timer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JLabel flag0;
    private javax.swing.JLabel flag1;
    private javax.swing.JLabel flag2;
    private javax.swing.JLabel flag3;
    private javax.swing.JLabel flag4;
    private javax.swing.JLabel flag5;
    private javax.swing.JTextField gethour;
    private javax.swing.JTextField getminute;
    private javax.swing.JTextField getsecond;
    private javax.swing.JLabel hours;
    private javax.swing.JLabel hours1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel miliseconds;
    private javax.swing.JLabel miliseconds1;
    private javax.swing.JLabel minutes;
    private javax.swing.JLabel minutes1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JLabel seconds;
    private javax.swing.JLabel seconds1;
    private javax.swing.JButton start;
    private javax.swing.JButton start1;
    private javax.swing.JButton stop;
    private javax.swing.JButton stopwatch;
    private javax.swing.JTabbedPane tabelpanel;
    private javax.swing.JButton timer;
    // End of variables declaration//GEN-END:variables
}
