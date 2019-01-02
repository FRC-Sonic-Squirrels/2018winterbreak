/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PWMTalonSRX; 
import edu.wpi.first.wpilibj.Counter;
        /**
         * when it came to the limit switch there were diffrent ways I found to use them 
         * so i am just using a counter. this could be very wrong 
         */

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class IntakeSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  DoubleSolenoid IntakePositionSolenoid = new DoubleSolenoid(0, 1);
  DoubleSolenoid IntakeOpenCloseSolenoid = new DoubleSolenoid(2, 3);
  PWMTalonSRX IntakeMotor = new PWMTalonSRX(4);
  Counter Counter = new Counter(limitswitch);

        /**
         * little confused what to add here, what the cyliders and the moters do and control
         * potenially name things. I probably need to add more than I did but I cant really
         * think of anything else to add 
         */

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    setDefaultCommand(LowerIntake.java())
  }
}
