// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
//import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID;
import frc.robot.Commands.ClawCmd;
import frc.robot.Commands.DriveCmd;
import frc.robot.Commands.PneumaticCmd;
//import frc.robot.Commands.SetExtenderCmd;
import frc.robot.Commands.ExtenderCmd;
import frc.robot.Commands.FieldDisplayCmd;
import frc.robot.Subsystems.ClawSys;
import frc.robot.Subsystems.DriveSys;
import frc.robot.Subsystems.ExtenderSys;
import frc.robot.Subsystems.PneumaticSys;
import frc.robot.Subsystems.VisionSys;

public class Robot extends TimedRobot {

  public static final DriveSys driveSubsystem = new DriveSys();
  public static final ExtenderSys extenderSubsystem = new ExtenderSys();
  public static final PneumaticSys pneumaticSubsystem = new PneumaticSys();
  public static final VisionSys visionSubsytem = new VisionSys();
  public static final ClawSys clawSubsystem = new ClawSys();
  public static final GenericHID jController = new GenericHID(Constants.J_CONTROLLER_PORT_ID);
  public static final GenericHID mController = new GenericHID(Constants.M_CONTROLLER_PORT_ID);

  @Override
  public void robotInit() {
      driveSubsystem.setDefaultCommand(new DriveCmd());
      extenderSubsystem.setDefaultCommand(new ExtenderCmd());
      pneumaticSubsystem.setDefaultCommand(new PneumaticCmd());
      visionSubsytem.setDefaultCommand(new FieldDisplayCmd());
      clawSubsystem.setDefaultCommand(new ClawCmd());
  }

  @Override
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void disabledExit() {}

  @Override
  public void autonomousInit() {

  }
  
  @Override
  public void autonomousPeriodic() {}

  @Override
  public void autonomousExit() {}

  @Override
  public void teleopInit() {

  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void teleopExit() {}

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void testExit() {}
}
