package org.firstinspires.ftc.teamcode.robot.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Intake {
    private final DcMotor feeder;

    public Intake(HardwareMap hardwareMap) {
        feeder = hardwareMap.get(DcMotor.class, "feeder");
        feeder.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    }
    public void intakePower(double power){
        feeder.setPower(power);
    }
}