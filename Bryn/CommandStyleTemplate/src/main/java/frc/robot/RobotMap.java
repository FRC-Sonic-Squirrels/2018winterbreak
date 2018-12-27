/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved. */
/* Open Source Software - may be modified and shared by FRC teams. The code */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project. */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into to a variable name.
 * This provides flexibility changing wiring, makes checking the wiring easier and significantly
 * reduces the number of magic numbers floating around.
 */
public class RobotMap {

  //
  // Drive Train
  //

  // 4 x CAN Talons Drive motors
  public static final int LEFT_MOTOR1 = 1;
  public static final int LEFT_MOTOR2 = 2;
  public static final int RIGHT_MOTOR1 = 3;
  public static final int RIGHT_MOTOR2 = 4;

  // 4 x Encoders for Drive motors
  public static final int LEFT_MOTOR1_ENCODER = 0;
  public static final int LEFT_MOTOR2_ENCODER = 1;
  public static final int RIGHT_MOTOR1_ENCODER = 2;
  public static final int RIGHT_MOTOR2_ENCODER = 3;

  //
  // Intake mechanism
  //

  // Pneumatic cylinders to raise and lower the intake mechanism

  // Limit switches to verify the operation of the raise/lower mechanism.

  // Pneumatic cylinders to open close the jaws of the intake mechanism

  // Limit switches to verify the operation of the jaw mechanism.

  // Two BAG motors paired with PWM Talons and compliant wheels

  // Versaplanetary Gearbox Encoders mounted in the gear box to measure intake speed

  //
  // Catapult for launching said space orb into the outer atmosphere
  //

  // Pneumatically armed over-top-dead-center launch mechanism.

  // Pneumatic trigger to release tension in the catapult mechanism.

  // Proximity sensor to verify space orb is in the correct position.

  // Range finder to verify robot is in the correct distance away



  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
