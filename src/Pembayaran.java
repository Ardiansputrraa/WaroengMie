import javax.swing.*;
import javax.swing.border.Border;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pembayaran extends Frame implements ActionListener {
    JDialog cashJD, transferJD;
    JLabel hargaCash, hasilCaptcha;
    JTextField masukanUang, uangKembalian, kodeCaptcha;
    JButton bayar, random, bayarTF;

    Pembayaran() {

        cashJD = new JDialog();
        cashJD.setTitle("Pembayaran Cash");
        cashJD.setSize(350, 400);
        cashJD.setLayout(null);
        cashJD.setLocationRelativeTo(null);
        cashJD.setVisible(false);
        cashJD.getContentPane().setBackground(new Color(255, 204, 153));

        totalJL = new JLabel("Total Harga");
        totalJL.setBounds(30, 20, 300, 35);
        totalJL.setFont(new Font("Times New Roman", Font.BOLD, 15));
        cashJD.add(totalJL);

        hargaCash = new JLabel();
        hargaCash.setBounds(30, 55, 200, 50);
        hargaCash.setFont(new Font("Times New Roman", Font.BOLD, 24));
        hargaCash.setBorder(border);
        cashJD.add(hargaCash);

        JLabel label = new JLabel("Silahkan membayar");
        label.setBounds(30, 115, 200, 35);
        label.setFont(new Font("Calibri", Font.BOLD, 15));
        cashJD.add(label);

        JLabel rp = new JLabel("Rp.");
        rp.setFont(new Font("Times New Roman", Font.BOLD, 15));
        rp.setBounds(30, 145, 50, 35);
        cashJD.add(rp);

        masukanUang = new JTextField();
        masukanUang.setFont(new Font("Times New Roman", Font.BOLD, 18));
        masukanUang.setBounds(65, 145, 230, 35);
        cashJD.add(masukanUang);

        bayar = new JButton("BAYAR");
        bayar.setBounds(200, 195, 100, 35);
        bayar.setFont(new Font("Times New Roman", Font.BOLD, 14));
        cashJD.add(bayar);

        JLabel kembalian = new JLabel("Uang Kembalian");
        kembalian.setBounds(30, 245, 200, 35);
        kembalian.setFont(new Font("Calibri", Font.BOLD, 15));
        cashJD.add(kembalian);

        uangKembalian = new JTextField("Rp. 0");
        uangKembalian.setFont(new Font("Times New Roman", Font.BOLD, 18));
        uangKembalian.setBounds(30, 285, 270, 35);
        uangKembalian.setEnabled(false);
        uangKembalian.setHorizontalAlignment(JTextField.CENTER);
        cashJD.add(uangKembalian);

        transferJD = new JDialog();
        transferJD.setTitle("Pembayaran Transfer");
        transferJD.setSize(300, 450);
        transferJD.setLayout(null);
        transferJD.setLocationRelativeTo(null);
        transferJD.setVisible(false);
        transferJD.getContentPane().setBackground(new Color(255, 204, 153));

        JLabel scan = new JLabel("Scan captcha dibawah ini!");
        scan.setBounds(43, 30, 250, 40);
        scan.setFont(new Font("Times New Roman", Font.BOLD, 17));
        transferJD.add(scan);

        random = new JButton("random captcha");
        random.setBounds(30, 185, 130, 40);
        transferJD.add(random);

        JLabel kodeJL = new JLabel("Masukan Kode Captcha");
        kodeJL.setBounds(30, 245, 250, 40);
        kodeJL.setFont(new Font("Times New Roman", Font.BOLD, 17));
        transferJD.add(kodeJL);

        kodeCaptcha = new JTextField();
        kodeCaptcha.setBounds(30, 285, 220, 35);
        kodeCaptcha.setFont(new Font("Times New Roman", Font.BOLD, 17));
        kodeCaptcha.setHorizontalAlignment(JTextField.CENTER);
        transferJD.add(kodeCaptcha);

        bayarTF = new JButton("BAYAR");
        bayarTF.setBounds(150, 335, 100, 35);
        bayarTF.setFont(new Font("Times New Roman", Font.BOLD, 14));
        transferJD.add(bayarTF);

        hasilCaptcha = new JLabel(ambilChaptcha(5));
        hasilCaptcha.setBounds(75, 85, 200, 50);
        hasilCaptcha.setFont(new Font("Times New Roman", Font.BOLD, 45));
        transferJD.add(hasilCaptcha);

        menuJC.addActionListener(this);
        plusA.addActionListener(this);
        minA.addActionListener(this);
        plusB.addActionListener(this);
        minB.addActionListener(this);
        plusC.addActionListener(this);
        minC.addActionListener(this);
        plusD.addActionListener(this);
        minD.addActionListener(this);
        plusMieA.addActionListener(this);
        minMieA.addActionListener(this);
        plusMieB.addActionListener(this);
        minMieB.addActionListener(this);
        plusMinumA.addActionListener(this);
        minMinumA.addActionListener(this);
        plusMinumB.addActionListener(this);
        minMinumB.addActionListener(this);
        plusMinumC.addActionListener(this);
        minMinumC.addActionListener(this);
        plusMinumD.addActionListener(this);
        minMinumD.addActionListener(this);
        cashJR.addActionListener(this);
        transferJR.addActionListener(this);
        bayar.addActionListener(this);
        random.addActionListener(this);
        bayarTF.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == menuJC) {
            if (menuJC.getSelectedIndex() == 0) {
                menuPaketJP.setVisible(true);
                menuPaketJL.setVisible(true);
                mieJL.setVisible(false);
                mieJP.setVisible(false);
                minumJL.setVisible(false);
                minumJP.setVisible(false);
            } else if (menuJC.getSelectedIndex() == 1) {
                menuPaketJP.setVisible(false);
                menuPaketJL.setVisible(false);
                mieJL.setVisible(true);
                mieJP.setVisible(true);
                minumJL.setVisible(false);
                minumJP.setVisible(false);
            } else if (menuJC.getSelectedIndex() == 2) {
                menuPaketJP.setVisible(false);
                menuPaketJL.setVisible(false);
                mieJL.setVisible(false);
                mieJP.setVisible(false);
                minumJL.setVisible(true);
                minumJP.setVisible(true);
            }
        }
        if (e.getSource() == plusA) {
            int total1 = Integer.parseInt(totalA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total1++;
            totalMenuPaket = totalMenuPaket + 5500;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalA.setText(Integer.toString(total1));
        } else if (e.getSource() == minA) {
            int total1 = Integer.parseInt(totalA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total1--;
            if (total1 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 5500;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalA.setText(Integer.toString(total1));
        }

        if (e.getSource() == plusB) {
            int total2 = Integer.parseInt(totalB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total2++;
            totalMenuPaket = totalMenuPaket + 8500;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalB.setText(Integer.toString(total2));
        } else if (e.getSource() == minB) {
            int total2 = Integer.parseInt(totalB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total2--;
            if (total2 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 8500;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalB.setText(Integer.toString(total2));
        }

        if (e.getSource() == plusC) {
            int total3 = Integer.parseInt(totalC.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total3++;
            totalMenuPaket = totalMenuPaket + 7000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalC.setText(Integer.toString(total3));
        } else if (e.getSource() == minC) {
            int total3 = Integer.parseInt(totalC.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total3--;
            if (total3 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 7000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalC.setText(Integer.toString(total3));
        }

        if (e.getSource() == plusD) {
            int total4 = Integer.parseInt(totalD.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total4++;
            totalMenuPaket = totalMenuPaket + 10000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalD.setText(Integer.toString(total4));
        } else if (e.getSource() == minD) {
            int total4 = Integer.parseInt(totalD.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            total4--;
            if (total4 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 10000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalD.setText(Integer.toString(total4));
        }

        if (e.getSource() == plusMieA) {
            int totalMie1 = Integer.parseInt(totalMieA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMie1++;
            totalMenuPaket = totalMenuPaket + 5000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMieA.setText(Integer.toString(totalMie1));
        } else if (e.getSource() == minMieA) {
            int totalMie1 = Integer.parseInt(totalMieA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMie1--;
            if (totalMie1 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 5000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMieA.setText(Integer.toString(totalMie1));
        }

        if (e.getSource() == plusMieB) {
            int totalMie2 = Integer.parseInt(totalMieB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMie2++;
            totalMenuPaket = totalMenuPaket + 8000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMieB.setText(Integer.toString(totalMie2));
        } else if (e.getSource() == minMieB) {
            int totalMie2 = Integer.parseInt(totalMieB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMie2--;
            if (totalMie2 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 8000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMieB.setText(Integer.toString(totalMie2));
        }

        if (e.getSource() == plusMinumA) {
            int totalMinum1 = Integer.parseInt(totalMinumA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum1++;
            totalMenuPaket = totalMenuPaket + 1000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumA.setText(Integer.toString(totalMinum1));
        } else if (e.getSource() == minMinumA) {
            int totalMinum1 = Integer.parseInt(totalMinumA.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum1--;
            if (totalMinum1 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 1000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumA.setText(Integer.toString(totalMinum1));
        }

        if (e.getSource() == plusMinumB) {
            int totalMinum2 = Integer.parseInt(totalMinumB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum2++;
            totalMenuPaket = totalMenuPaket + 3000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumB.setText(Integer.toString(totalMinum2));
        } else if (e.getSource() == minMinumB) {
            int totalMinum2 = Integer.parseInt(totalMinumB.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum2--;
            if (totalMinum2 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 3000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumB.setText(Integer.toString(totalMinum2));
        }
        if (e.getSource() == plusMinumC) {
            int totalMinum3 = Integer.parseInt(totalMinumC.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum3++;
            totalMenuPaket = totalMenuPaket + 3000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumC.setText(Integer.toString(totalMinum3));
        } else if (e.getSource() == minMinumC) {
            int totalMinum3 = Integer.parseInt(totalMinumC.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum3--;
            if (totalMinum3 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 3000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumC.setText(Integer.toString(totalMinum3));
        }
        if (e.getSource() == plusMinumD) {
            int totalMinum4 = Integer.parseInt(totalMinumD.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum4++;
            totalMenuPaket = totalMenuPaket + 1000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumD.setText(Integer.toString(totalMinum4));
        } else if (e.getSource() == minMinumD) {
            int totalMinum4 = Integer.parseInt(totalMinumD.getText());
            totalMenuPaket = Double.parseDouble(totalJT.getText().substring(4));
            totalMinum4--;
            if (totalMinum4 < 0) {
                JOptionPane.showInternalMessageDialog(null, "Tidak dapat melakukan pemesanan kurang dari 0", "Message",
                        JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            totalMenuPaket = totalMenuPaket - 1000;
            totalJT.setText("Rp. " + Double.toString(totalMenuPaket));
            totalMinumD.setText(Integer.toString(totalMinum4));
        }
        if (e.getSource() == cashJR) {
            hargaCash.setText(totalJT.getText());
            cashJD.setVisible(true);
        } else if (e.getSource() == transferJR) {
            transferJD.setVisible(true);
        }
        if (e.getSource() == bayar) {
            int uang = Integer.parseInt(masukanUang.getText());
            if (totalMenuPaket > uang) {
                JOptionPane.showMessageDialog(null, "Uang yang anda masukan tidak cukup!", "Message",
                        JOptionPane.ERROR_MESSAGE);
                status.setBackground(Color.RED);
                statusJL.setText("PEMBAYARAN GAGAL");
                statusJL.setFont(new Font("Times New Roman", Font.BOLD, 16));
            } else {
                kembali = uang - totalMenuPaket;
                uangKembalian.setText("Rp. " + kembali);
                status.setBackground(Color.green);
                statusJL.setText("PEMBAYARAN BERHASIL");
                statusJL.setFont(new Font("Times New Roman", Font.BOLD, 16));
            }
        }
        if (e.getSource() == random) {
            hasilCaptcha.setText(ambilChaptcha(5));
        }
        if (e.getSource() == bayarTF) {
            if (hasilCaptcha.getText().equals(kodeCaptcha.getText())) {
                JOptionPane.showMessageDialog(null, "Saldo Anda Berkurang " + totalJT.getText(),
                        "Pembayarang Berhasil!",
                        JOptionPane.PLAIN_MESSAGE);
                status.setBackground(Color.green);
                statusJL.setText("PEMBAYARAN BERHASIL");
                statusJL.setFont(new Font("Times New Roman", Font.BOLD, 16));
                transferJD.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Captcha Yang Anda Masukan Salah!", "Information",
                        JOptionPane.INFORMATION_MESSAGE);
                status.setBackground(Color.RED);
                statusJL.setText("PEMBAYARAN GAGAL");
                statusJL.setFont(new Font("Times New Roman", Font.BOLD, 16));
            }
        }
    }

    public static String ambilChaptcha(int n) {

        Random random = new Random(62);
        String character = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        String captcha = "";
        while (n-- > 0) {
            int index = (int) (Math.random() * 62);
            captcha += character.charAt(index);
        }

        return captcha;
    }
}
