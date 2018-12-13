/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.CANTalon;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
	final double DISTANCE_PER_REVOLUTION = (4.0 * Math.PI) / 12; // measured in feet
	final double DISTANCE_PER_PULSE = DISTANCE_PER_REVOLUTION / 1000;
	final double MINIMUM_MOTOR_SPEED = .3;
	final CANTalon motorLeftFront = new CANTalon(RobotMap.LEFT_MOTOR1);
	final CANTalon motorLeftBack = new CANTalon(RobotMap.LEFT_MOTOR2);
	final CANTalon motorRightFront = new CANTalon(RobotMap.RIGHT_MOTOR1);
	final CANTalon motorRightBack = new CANTalon(RobotMap.RICHT_MOTOR2);
	final RobotDrive robotDrive = new RobotDrive(motorLeftFront, motorLeftBack, motorRightFront, motorRightBack);
	final DoubleSolenoid solenoid = new DoubleSolenoid(RobotMap.HIGH_GEAR, RobotMap.LOW_GEAR);
	public final Encoder leftEnc = new Encoder(RobotMap.LEFT_ENCODER_FIRST, RobotMap.LEFT_ENCODER_SECOND, false,
			Encoder.EncodingType.k4X);
	public final Encoder rightEnc = new Encoder(RobotMap.RIGHT_ENCODER_FIRST, RobotMap.RIGHT_ENCODER_SECOND, false,
			Encoder.EncodingType.k4X);
	boolean isReverseEnabled = true;
	boolean isCrawlEnabled = false;
    double crawlTrim = 1;
    public DriveSubsystem() {
		motorLeftFront.setInverted(true);
		motorLeftBack.setInverted(true);
		motorRightFront.setInverted(true);
		motorRightBack.setInverted(true);
		
		InitializeEncoders();
	}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
