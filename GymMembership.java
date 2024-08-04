/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Student
 */
public class GymMembership extends JFrame{
    //panels
    private JPanel headingPnl;
    private JPanel clientPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel idNoPnl;
    private JPanel genderPnl;
    private JPanel contractPnl;
    private JPanel personalTrainerOptionPnl;
    private JPanel membershipPnl;
    private JPanel commentsPnl;
    private JPanel btnsPnl;
    private JPanel headingClientCombinedPnl;
    private JPanel membershipCommentsCombinedPnl;
    private JPanel mainPnl;
    //labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel idNoLbl;
    private JLabel genderLbl;
    private JLabel personalTrainerLbl;
    private JLabel contractTypeLbl;
    //textfields
    private JTextField nameTxtField;
    private JTextField surnameTxtField;
    private JTextField idNoTxtField;
    //comboBox
    private JComboBox genderComboBox;
    //radioButtons
    private JRadioButton monthToMonthRadBtn;
    private JRadioButton sixMonthsRadBtn;
    private JRadioButton annualRadBtn;
    //checkBox
    private JCheckBox personalTrainerChBx;
    //buttongroup
    private ButtonGroup btnGrp;
    //check box
    private JTextArea commentsArea;
    //scrollPane
    private JScrollPane scrollableTxtArea;
    //private button
    private JButton applyBtn;

    //constructors
    public GymMembership(){
        setTitle("Gym membership");
        setSize(500,550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFrame.setDefaultLookAndFeelDecorated(true);
        //create panels
        headingPnl=new JPanel(new FlowLayout(FlowLayout.CENTER));
        clientPnl=new JPanel(new GridLayout(4,1,1,1));
        clientPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Client details"));
        namePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        idNoPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        contractPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        personalTrainerOptionPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        membershipPnl=new JPanel(new GridLayout(2,1,1,1));
        membershipPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Contract options"));
        commentsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnsPnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingClientCombinedPnl=new JPanel(new BorderLayout());
        membershipCommentsCombinedPnl=new JPanel(new BorderLayout());
        mainPnl=new JPanel(new BorderLayout());
        //create Labels
        headingLbl=new JLabel("Membership form");
        headingLbl.setFont(new Font(Font.SANS_SERIF,Font.ITALIC+Font.BOLD,20));
        headingLbl.setForeground(Color.BLUE);
        headingLbl.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        
        nameLbl=new JLabel("Name:    ");
        surnameLbl=new JLabel("Surname:    ");
        idNoLbl=new JLabel("Id no:    ");
        genderLbl=new JLabel("Gender:    ");
        contractTypeLbl=new JLabel("Type of contact:    ");
        personalTrainerLbl=new JLabel("Select the chekbox if you need a prsonla trainer");
        //create textfields
        nameTxtField=new JTextField(10);
        surnameTxtField=new JTextField(10);
        idNoTxtField=new JTextField(10);
        //create comboBox
        genderComboBox=new JComboBox();
        genderComboBox.addItem("Male");
        genderComboBox.addItem("female");
        //create radio buttons
        monthToMonthRadBtn=new JRadioButton("Month-to-month");
        sixMonthsRadBtn=new JRadioButton("Six months");
        annualRadBtn=new JRadioButton("Annual");
        //create check box
        personalTrainerChBx=new JCheckBox();
        //create button group
        btnGrp=new ButtonGroup();
        btnGrp.add(monthToMonthRadBtn);
        btnGrp.add(sixMonthsRadBtn);
        btnGrp.add(annualRadBtn);
        //create text area
        commentsArea=new JTextArea(15,50);
        commentsArea.setEditable(false);
        commentsArea.setBorder(new TitledBorder(new LineBorder(Color.black,1),"Comments"));
        scrollableTxtArea=new JScrollPane(commentsArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        //create button
        applyBtn=new JButton("REGISTER");
        //applyBtn.addActionListener(new RegisterBtnListener());

        
        //add comments to panels
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtField);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtField);
        
        idNoPnl.add(idNoLbl);
        idNoPnl.add(idNoTxtField);
        
        genderPnl.add(genderLbl);
        genderPnl.add(genderComboBox);
        
        clientPnl.add(namePnl);
        clientPnl.add(surnamePnl);
        clientPnl.add(idNoPnl);
        clientPnl.add(genderPnl);
        
        headingClientCombinedPnl.add(headingPnl,BorderLayout.NORTH);
        headingClientCombinedPnl.add(clientPnl,BorderLayout.CENTER);
        
        contractPnl.add(contractTypeLbl);
        contractPnl.add(monthToMonthRadBtn);
        contractPnl.add(sixMonthsRadBtn);
        contractPnl.add(annualRadBtn);
        
        personalTrainerOptionPnl.add(personalTrainerLbl);
        personalTrainerOptionPnl.add(personalTrainerChBx);
        
        membershipPnl.add(contractPnl);
        membershipPnl.add(personalTrainerOptionPnl);
        
        commentsPnl.add(scrollableTxtArea);
        
        membershipCommentsCombinedPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
        membershipCommentsCombinedPnl.add(commentsPnl,BorderLayout.CENTER);
        
        btnsPnl.add(applyBtn);
        
        mainPnl.add(headingClientCombinedPnl,BorderLayout.NORTH);
        mainPnl.add(membershipCommentsCombinedPnl,BorderLayout.CENTER);
        mainPnl.add(btnsPnl,BorderLayout.SOUTH);
        
        add(mainPnl);
        
        pack();
        setVisible(true);
    }
}
