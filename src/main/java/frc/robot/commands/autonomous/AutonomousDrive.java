/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.autonomous;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.GripperSubsystem;
import frc.robot.subsystems.ThrowerSubsystem;
import frc.robot.subsystems.TunnelSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class AutonomousDrive extends ParallelCommandGroup {
  /**
   * Creates a new autonomousDrive.
   */
  public AutonomousDrive(GripperSubsystem gripperSubsystem, ThrowerSubsystem throwerSubsystem, TunnelSubsystem tunnelSubsystem, DriveSubsystem driveSubsystem) {
    super(new AutonomousSystemControlCommandGroup(gripperSubsystem, throwerSubsystem, tunnelSubsystem),
      new TrajectoryDrive(driveSubsystem));
      // super(new AutonomousSystemControlCommandGroup(gripperSubsystem, throwerSubsystem, tunnelSubsystem));
  }
}
