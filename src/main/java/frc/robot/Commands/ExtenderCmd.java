package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.Subsystems.ExtenderSys;

public class ExtenderCmd extends CommandBase {
    
    private ExtenderSys subsystem;

    public ExtenderCmd() {
        subsystem = Robot.extenderSubsystem;
        addRequirements(subsystem);
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        if(Robot.jController.getRawAxis(Constants.J_EXTEND_TRIGGER) > 0.1) {
            subsystem.extend(1);
        } else if(Robot.jController.getRawAxis(Constants.J_RETRACT_TRIGGER) > 0.1) {
            subsystem.extend(-0.5);
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
