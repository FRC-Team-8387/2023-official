package frc.robot.Commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.Subsystems.ClawSys;

public class ClawCmd extends CommandBase {

    private ClawSys subsystem;

    public ClawCmd() {
        subsystem = Robot.clawSubsystem;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        SmartDashboard.putNumber("ClawEncoder", subsystem.getEncoderPos());
        if(Robot.jController.getRawButton(Constants.J_CLAW_OPEN_BUTTON)) {
            subsystem.closeClaw();
        } else if(Robot.jController.getRawButton(Constants.J_CLAW_CLOSE_BUTTON)) {
            subsystem.openClaw();
        } else {
            subsystem.stop();
        }
    }

    @Override
    public void end(boolean interrupted) {
        subsystem.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}