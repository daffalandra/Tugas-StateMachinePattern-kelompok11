package StateMachine;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {

        Phone phone = new Phone();
        JButton home = new JButton("Home");
        home.addActionListener(e -> phone.state.onHome());
        JButton onOff = new JButton("On/Off");
        onOff.addActionListener(e -> phone.state.onOffOn());

        simulatePhoneClicks(phone);

    }

    private static void simulatePhoneClicks(Phone phone) {

        //Off state to Locked State with clickPower()
        System.out.println("\nFrom Off state to Locked State with clickPower() then to home with clickHome():");
        System.out.println(phone.clickPower());
        System.out.println(phone.clickHome());
        System.out.println();

        //Lock the phone
        System.out.println("Lock the phone from Home Screen");
        System.out.println(phone.clickPower());
        System.out.println();

        //Off state to Locked State with clickHome()
        System.out.println("From Off state to Locked State with clickHome() then to home with clickHome():");
        System.out.println(phone.clickHome());
        System.out.println(phone.clickHome());
        System.out.println();

        //Lock the phone
        System.out.println("Lock the phone from Home Screen");
        System.out.println(phone.clickPower());
        System.out.println();

        //Off state to Locked State with click Power()
        System.out.println("From Off state to Locked State with clickPower() then turn it off again with clickPower():");
        System.out.println(phone.clickPower());
        System.out.println(phone.clickPower());

    }

}