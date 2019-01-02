/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 * An example command.  You can replace me with your own command.
 */
public class OpenIntake extends Command {
  public OpenIntake() {
    // Use requires() here to declare subsystem dependencies
    requires(Robot.IntakeSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
          /**
           * tell the cylinder to extend to open the Intake 
           * do something with (DoubleSolenoid.Value.kForward)
           * 2018 robot code had something like this 
           * if (open) {robot.intakeOpener.set(DoubleSolenoid.Value.kForward);}
           */
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
