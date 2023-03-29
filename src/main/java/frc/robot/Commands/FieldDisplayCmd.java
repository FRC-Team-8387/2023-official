package frc.robot.Commands;

import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.Subsystems.VisionSys;

public class FieldDisplayCmd extends CommandBase {
    private VisionSys subsystem;
    private Field2d fieldDisplay;
    
    public FieldDisplayCmd() {
        subsystem = Robot.visionSubsytem;
        addRequirements(subsystem);
        fieldDisplay = new Field2d();
        SmartDashboard.putData("Field", fieldDisplay);
    }

    @Override
    public void initialize() {
       
    }

    @Override
    public void execute() {
        fieldDisplay.setRobotPose(subsystem.getPosition().toPose2d());
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
