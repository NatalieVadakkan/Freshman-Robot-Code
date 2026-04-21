package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.IMU;

import java.security.KeyStore;
@TeleOp(name = "Test ")
public class Test extends OpMode {

    private DcMotor frontRight;
    private DcMotor backRight;
    private DcMotor frontLeft;
    private DcMotor backLeft;
    IMU imu;
    public void init() {
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        frontRight.setDirection(DcMotor.Direction.REVERSE);
        backRight = hardwareMap.get(DcMotor.class, "backRight");
        backRight.setDirection(DcMotor.Direction.REVERSE);
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontLeft.setDirection(DcMotor.Direction.FORWARD);
        backLeft = hardwareMap.get(DcMotor.class, "backLeft");
        backLeft.setDirection(DcMotor.Direction.FORWARD);
        imu = hardwareMap.get(IMU.class, "imu");
        IMU.Parameters parameters = new IMU.Parameters(
                new RevHubOrientationOnRobot(
                        RevHubOrientationOnRobot.LogoFacingDirection.UP,
                        RevHubOrientationOnRobot.UsbFacingDirection.FORWARD
                )
        );
        imu.initialize(parameters);
    }
    public void init_loop() {

    }

    public void start() {

    }

    public void loop() {
        double y = -gamepad1.left_stick_y;
        double x = gamepad1.left_stick_x;
        double rx = gamepad1.right_stick_x;

        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);
        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);

    }
    public void stop() {

    }
}