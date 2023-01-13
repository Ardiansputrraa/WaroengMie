import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    JComboBox menuJC;
    JLabel totalJT, totalMieA, totalMieB, statusJL;
    JLabel menuPaketJL, mieJL;
    JLabel hargaMieA, hargaMieB, menuMieA, menuMieB;
    JLabel totalJL, minumJL;
    JPanel menuJP, menuPaketJP, mieJP, minumJP;
    JLabel hargaA, hargaB, hargaC, hargaD;
    JLabel menuA, menuB, menuC, menuD;
    JButton plusA, plusB, plusC, plusD;
    JButton minA, minB, minC, minD;
    JButton plusMinumA, plusMinumB, plusMinumC, plusMinumD;
    JButton minMinumA, minMinumB, minMinumC, minMinumD;
    JLabel totalA, totalB, totalC, totalD;
    JButton plusMieA, plusMieB, minMieA, minMieB;
    JLabel minumA, minumB, minumC, minumD;
    JLabel hargaMinumA, hargaMinumB, hargaMinumC, hargaMinumD;
    JLabel totalMinumA, totalMinumB, totalMinumC, totalMinumD;
    JLabel pembayaranJL;
    JRadioButton cashJR, transferJR;
    ButtonGroup group;
    JPanel status;
    double totalMenuPaket, kembali;
    Border border = BorderFactory.createLineBorder(Color.white, 5);

    Frame() {

        this.setTitle("WarungMie-TI");
        this.setSize(500, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        // this.getContentPane().setBackground(new Color(255, 204, 153));
        this.setVisible(true);

        menuJP = new JPanel();
        menuJP.setSize(500, 550);
        menuJP.setBackground(new Color(255, 204, 153));
        menuJP.setLayout(null);
        this.add(menuJP);

        JLabel titleJL = new JLabel("WARMI-TI");
        titleJL.setBounds(40, 35, 200, 35);
        titleJL.setFont(new Font("Times New Roman", Font.BOLD, 35));
        titleJL.setForeground(new Color(204, 0, 0));
        menuJP.add(titleJL);

        JLabel title2JL = new JLabel("Warung Mie Teknik Informatika");
        title2JL.setBounds(49, 65, 270, 35);
        title2JL.setFont(new Font("Times New Roman", Font.BOLD, 12));
        menuJP.add(title2JL);

        JLabel menuJL = new JLabel("Menu Pilihan");
        menuJL.setBounds(40, 110, 100, 35);
        menuJL.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 14));
        menuJP.add(menuJL);

        // String[] selectMenu = { "Menu Paket", "Mie", "Minuman" };
        menuJC = new JComboBox<>();
        menuJC.addItem("Menu Paket");
        menuJC.addItem("Mie");
        menuJC.addItem("Minuman");
        menuJC.setBounds(40, 150, 170, 30);
        menuJP.add(menuJC);

        totalJL = new JLabel("Total Harga");
        totalJL.setBounds(355, 110, 100, 35);
        totalJL.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 14));
        menuJP.add(totalJL);

        totalJT = new JLabel("RP. 0");
        totalJT.setBounds(325, 145, 125, 50);
        totalJT.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 17));
        totalJT.setBackground(new Color(255, 204, 153));
        totalJT.setForeground(Color.black);
        totalJT.setBorder(border);
        menuJP.add(totalJT);

        menuPaketJL = new JLabel("Menu Paket");
        menuPaketJL.setBounds(45, 190, 200, 40);
        menuPaketJL.setFont(new Font("Times New Roman", Font.BOLD, 14));
        menuJP.add(menuPaketJL);

        menuPaketJP = new JPanel();
        menuPaketJP.setBackground(Color.white);
        menuPaketJP.setBounds(45, 225, 400, 185);
        menuJP.add(menuPaketJP);
        menuPaketJP.setLayout(null);
        // menuJC.addActionListener(this);

        hargaA = new JLabel("Rp. 5500");
        hargaA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaA.setBounds(20, 15, 70, 35);
        menuPaketJP.add(hargaA);

        menuA = new JLabel("Mie + Air Biasa");
        menuA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuA.setBounds(100, 15, 200, 35);
        menuPaketJP.add(menuA);

        plusA = new JButton("+");
        plusA.setBounds(250, 15, 45, 25);
        plusA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusA.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(plusA);

        minA = new JButton("-");
        minA.setBounds(305, 15, 45, 25);
        minA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minA.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(minA);

        totalA = new JLabel("0");
        totalA.setBounds(365, 15, 35, 25);
        totalA.setFont(new Font("Times New Roman", Font.BOLD, 18));
        menuPaketJP.add(totalA);

        hargaB = new JLabel("Rp. 8500");
        hargaB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaB.setBounds(20, 55, 70, 35);
        menuPaketJP.add(hargaB);

        menuB = new JLabel("Mie Special + Air Biasa");
        menuB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuB.setBounds(100, 55, 200, 35);
        menuPaketJP.add(menuB);

        plusB = new JButton("+");
        plusB.setBounds(250, 55, 45, 25);
        plusB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusB.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(plusB);

        minB = new JButton("-");
        minB.setBounds(305, 55, 45, 25);
        minB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minB.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(minB);

        totalB = new JLabel("0");
        totalB.setBounds(365, 55, 35, 25);
        totalB.setFont(new Font("Times New Roman", Font.BOLD, 18));
        menuPaketJP.add(totalB);

        hargaC = new JLabel("RP 7000");
        hargaC.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaC.setBounds(20, 95, 70, 35);
        menuPaketJP.add(hargaC);

        menuC = new JLabel("Mie + Teh Manis");
        menuC.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuC.setBounds(100, 95, 200, 35);
        menuPaketJP.add(menuC);

        plusC = new JButton("+");
        plusC.setBounds(250, 95, 45, 25);
        plusC.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusC.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(plusC);

        minC = new JButton("-");
        minC.setBounds(305, 95, 45, 25);
        minC.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minC.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(minC);

        totalC = new JLabel("0");
        totalC.setBounds(365, 95, 35, 25);
        totalC.setFont(new Font("Times New Roman", Font.BOLD, 18));
        menuPaketJP.add(totalC);

        hargaD = new JLabel("Rp. 10000");
        hargaD.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaD.setBounds(20, 135, 70, 35);
        menuPaketJP.add(hargaD);

        menuD = new JLabel("Mie Special + Teh Manis");
        menuD.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuD.setBounds(100, 135, 200, 35);
        menuPaketJP.add(menuD);

        plusD = new JButton("+");
        plusD.setBounds(250, 135, 45, 25);
        plusD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusD.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(plusD);

        minD = new JButton("-");
        minD.setBounds(305, 135, 45, 25);
        minD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minD.setBackground(new Color(255, 204, 153));
        menuPaketJP.add(minD);

        totalD = new JLabel("0");
        totalD.setBounds(365, 135, 35, 25);
        totalD.setFont(new Font("Times New Roman", Font.BOLD, 18));
        menuPaketJP.add(totalD);

        mieJL = new JLabel("Mie");
        mieJL.setBounds(45, 190, 200, 40);
        mieJL.setFont(new Font("Times New Roman", Font.BOLD, 14));
        mieJL.setVisible(false);
        menuJP.add(mieJL);

        mieJP = new JPanel();
        mieJP.setBackground(Color.white);
        mieJP.setBounds(45, 225, 400, 185);
        mieJP.setLayout(null);
        mieJP.setVisible(false);
        menuJP.add(mieJP);

        hargaMieA = new JLabel("Rp. 5000");
        hargaMieA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMieA.setBounds(15, 15, 50, 35);
        mieJP.add(hargaMieA);

        menuMieA = new JLabel("Mie");
        menuMieA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuMieA.setBounds(90, 15, 50, 35);
        mieJP.add(menuMieA);

        plusMieA = new JButton("+");
        plusMieA.setBounds(250, 15, 45, 25);
        plusMieA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMieA.setBackground(new Color(255, 204, 153));
        mieJP.add(plusMieA);

        minMieA = new JButton("-");
        minMieA.setBounds(305, 15, 45, 25);
        minMieA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMieA.setBackground(new Color(255, 204, 153));
        mieJP.add(minMieA);

        totalMieA = new JLabel("0");
        totalMieA.setBounds(365, 15, 35, 25);
        totalMieA.setFont(new Font("Times New Roman", Font.BOLD, 18));
        mieJP.add(totalMieA);

        hargaMieB = new JLabel("Rp. 8000");
        hargaMieB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMieB.setBounds(15, 55, 70, 35);
        mieJP.add(hargaMieB);

        menuMieB = new JLabel("Mie Special (Telor + Sayur)");
        menuMieB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        menuMieB.setBounds(90, 55, 200, 35);
        mieJP.add(menuMieB);

        plusMieB = new JButton("+");
        plusMieB.setBounds(250, 55, 45, 25);
        plusMieB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMieB.setBackground(new Color(255, 204, 153));
        mieJP.add(plusMieB);

        minMieB = new JButton("-");
        minMieB.setBounds(305, 55, 45, 25);
        minMieB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMieB.setBackground(new Color(255, 204, 153));
        mieJP.add(minMieB);

        totalMieB = new JLabel("0");
        totalMieB.setBounds(365, 55, 35, 25);
        totalMieB.setFont(new Font("Times New Roman", Font.BOLD, 18));
        mieJP.add(totalMieB);

        minumJL = new JLabel("Minuman");
        minumJL.setBounds(45, 190, 200, 40);
        minumJL.setFont(new Font("Times New Roman", Font.BOLD, 14));
        minumJL.setVisible(false);
        menuJP.add(minumJL);

        minumJP = new JPanel();
        minumJP.setBackground(Color.white);
        minumJP.setBounds(45, 225, 400, 185);
        minumJP.setLayout(null);
        minumJP.setVisible(false);
        menuJP.add(minumJP);

        hargaMinumA = new JLabel("Rp. 1000");
        hargaMinumA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMinumA.setBounds(20, 15, 70, 35);
        minumJP.add(hargaMinumA);

        minumA = new JLabel("Air Biasa");
        minumA.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        minumA.setBounds(100, 15, 200, 35);
        minumJP.add(minumA);

        plusMinumA = new JButton("+");
        plusMinumA.setBounds(250, 15, 45, 25);
        plusMinumA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMinumA.setBackground(new Color(255, 204, 153));
        minumJP.add(plusMinumA);

        minMinumA = new JButton("-");
        minMinumA.setBounds(305, 15, 45, 25);
        minMinumA.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMinumA.setBackground(new Color(255, 204, 153));
        minumJP.add(minMinumA);

        totalMinumA = new JLabel("0");
        totalMinumA.setBounds(365, 15, 35, 25);
        totalMinumA.setFont(new Font("Times New Roman", Font.BOLD, 18));
        minumJP.add(totalMinumA);

        hargaMinumB = new JLabel("Rp. 3000");
        hargaMinumB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMinumB.setBounds(20, 55, 70, 35);
        minumJP.add(hargaMinumB);

        minumB = new JLabel("Teh Manis");
        minumB.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        minumB.setBounds(100, 55, 200, 35);
        minumJP.add(minumB);

        plusMinumB = new JButton("+");
        plusMinumB.setBounds(250, 55, 45, 25);
        plusMinumB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMinumB.setBackground(new Color(255, 204, 153));
        minumJP.add(plusMinumB);

        minMinumB = new JButton("-");
        minMinumB.setBounds(305, 55, 45, 25);
        minMinumB.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMinumB.setBackground(new Color(255, 204, 153));
        minumJP.add(minMinumB);

        totalMinumB = new JLabel("0");
        totalMinumB.setBounds(365, 55, 35, 25);
        totalMinumB.setFont(new Font("Times New Roman", Font.BOLD, 18));
        minumJP.add(totalMinumB);

        hargaMinumC = new JLabel("RP 3000");
        hargaMinumC.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMinumC.setBounds(20, 95, 70, 35);
        minumJP.add(hargaMinumC);

        minumC = new JLabel("Teh ga Manis");
        minumC.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        minumC.setBounds(100, 95, 200, 35);
        minumJP.add(minumC);

        plusMinumC = new JButton("+");
        plusMinumC.setBounds(250, 95, 45, 25);
        plusMinumC.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMinumC.setBackground(new Color(255, 204, 153));
        minumJP.add(plusMinumC);

        minMinumC = new JButton("-");
        minMinumC.setBounds(305, 95, 45, 25);
        minMinumC.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMinumC.setBackground(new Color(255, 204, 153));
        minumJP.add(minMinumC);

        totalMinumC = new JLabel("0");
        totalMinumC.setBounds(365, 95, 35, 25);
        totalMinumC.setFont(new Font("Times New Roman", Font.BOLD, 18));
        minumJP.add(totalMinumC);

        hargaMinumD = new JLabel("Rp. 1000");
        hargaMinumD.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        hargaMinumD.setBounds(20, 135, 70, 35);
        minumJP.add(hargaMinumD);

        minumD = new JLabel("+ Es");
        minumD.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 13));
        minumD.setBounds(100, 135, 200, 35);
        minumJP.add(minumD);

        plusMinumD = new JButton("+");
        plusMinumD.setBounds(250, 135, 45, 25);
        plusMinumD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        plusMinumD.setBackground(new Color(255, 204, 153));
        minumJP.add(plusMinumD);

        minMinumD = new JButton("-");
        minMinumD.setBounds(305, 135, 45, 25);
        minMinumD.setFont(new Font("Times New Roman", Font.BOLD, 12));
        minMinumD.setBackground(new Color(255, 204, 153));
        minumJP.add(minMinumD);

        totalMinumD = new JLabel("0");
        totalMinumD.setBounds(365, 135, 35, 25);
        totalMinumD.setFont(new Font("Times New Roman", Font.BOLD, 18));
        minumJP.add(totalMinumD);

        pembayaranJL = new JLabel("Menu Pembayaran");
        pembayaranJL.setBounds(40, 420, 200, 35);
        pembayaranJL.setFont(new Font("Times New Roman", Font.BOLD, 14));
        menuJP.add(pembayaranJL);

        cashJR = new JRadioButton("Cash");
        cashJR.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cashJR.setBounds(40, 450, 70, 35);
        cashJR.setBackground(new Color(255, 204, 153));
        menuJP.add(cashJR);

        transferJR = new JRadioButton("Transfer");
        transferJR.setFont(new Font("Times New Roman", Font.BOLD, 14));
        transferJR.setBounds(110, 450, 100, 35);
        transferJR.setBackground(new Color(255, 204, 153));
        menuJP.add(transferJR);

        group = new ButtonGroup();
        group.add(cashJR);
        group.add(transferJR);

        status = new JPanel();
        status.setBackground(Color.gray);
        status.setBounds(250, 440, 200, 35);
        menuJP.add(status);

        statusJL = new JLabel("Status Pembayaran");
        statusJL.setForeground(Color.WHITE);
        statusJL.setBounds(255, 440, 200, 45);
        statusJL.setFont(new Font("Times New Roman", Font.BOLD, 18));
        status.add(statusJL);
    }

}
