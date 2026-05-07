package org.firstinspires.ftc.teamcode.Subsystems;

public class Degrees_Radians {
    //formula: 1° × π/180 = 0.01745rad
    public double converter_d_r (double degrees) {
        double radians = degrees * Math.PI / 180;
        return radians;
    }
    //formula: 1rad × 180/π = 57.296°
    public double converter_r_d (double radians) {
        double degrees = radians * 180 / Math.PI;
        return degrees;
    }
}
