/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
        /**
         * Import the Pneumatic cylinders
         * Import the PNW talons
         * Import the Bag motors
         * Import the Limit swiches(I have absolutly no idea how to use sensors so i 
         * dont really know what to do with these)
         */

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

        /**
         * little confused what to add here, what the cyliders and the moters do and control
         * potenially name things.
         */

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    setDefaultCommand(LowerIntake.java())
  }
}
