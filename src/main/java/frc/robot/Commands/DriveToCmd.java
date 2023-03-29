package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.Subsystems.ClawSys;
import frc.robot.Subsystems.DriveSys;
import frc.robot.Subsystems.ExtenderSys;
import frc.robot.Subsystems.VisionSys;

public class DriveToCmd extends CommandBase {
    private DriveSys driveSubsystem;
    private VisionSys visionSubsytem;
    private ExtenderSys extenderSubsystem;
    //private ClawSys clawSubsystem;

    public DriveToCmd() {
        driveSubsystem = Robot.driveSubsystem;
        visionSubsytem = Robot.visionSubsytem;
        extenderSubsystem = Robot.extenderSubsystem;
        //clawSubsystem = Robot.clawSubsystem;
        addRequirements(driveSubsystem);
        addRequirements(visionSubsytem);
        addRequirements(extenderSubsystem);
        //addRequirements(clawSubsystem);
    }

    @Override
    public void initialize() {
        
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean interrupted) {
        driveSubsystem.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
