package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Flywheel_Controller {
    private final DcMotor Flywheel;

    //Need semicolon after everything
    private double Time;
    private double endTime;
    public Flywheel_Controller(
            DcMotor Flywheel
    ) {
        this.Flywheel = Flywheel;
    }
    public void update(double currentTime) {
        Time = currentTime;
        if (currentTime >= endTime) {
            Flywheel.setPower(0);
        }
    }
    public void onFor(double TimeLength) {
        endTime = Time + TimeLength;
        //Actual: Something RPM, not just 1
        Flywheel.setPower(1);
    }
}
