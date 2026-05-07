package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.LED;

public class Lights_For_Geetha {
    private final LED Red_LED;
    private final LED Green_LED;

    public Lights_For_Geetha (
            LED Red_LED,
            LED Green_LED
    ) {
        this.Red_LED = Red_LED;
        this.Green_LED = Green_LED;
    }

    public void State_of_Geetha_LEDS(boolean closed) {
        if (!closed) {
            Red_LED.on();
            Green_LED.off();
        }
        else {
            Green_LED.on();
            Red_LED.off();
        }
    }
}
