package frc.robot.Subsystems;
import frc.robot.Constants;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class ClawSys extends SubsystemBase {
    private double CLAW_MOTOR_SPEED = 1.0; // -1.0 <= SPEED <= 1.0
    private CANSparkMax clawMotor;
    private Encoder clawEncoder;

    public ClawSys() {
        clawMotor = new CANSparkMax(Constants.CLAW_MOTOR_ID, MotorType.kBrushed);
        clawEncoder = new Encoder(0,1);
    }

    public void closeClaw() {
        clawMotor.set(CLAW_MOTOR_SPEED);
    }

    public void openClaw() {
        clawMotor.set(-CLAW_MOTOR_SPEED);
    }

    public int getEncoderPos() {
        return clawEncoder.get();
    }

    public void stop() {
        clawMotor.stopMotor();
    }
}	