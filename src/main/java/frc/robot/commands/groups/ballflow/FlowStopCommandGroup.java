/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.groups.ballflow;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.commands.groups.GripperRetractCommandGroup;
import frc.robot.commands.thrower.ThrowerStopCommand;
import frc.robot.commands.tunnel.TunnelStopCommand;
import frc.robot.subsystems.GripperSubsystem;
import frc.robot.subsystems.ThrowerSubsystem;
import frc.robot.subsystems.TunnelSubsystem;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/latest/docs/software/commandbased/convenience-features.html
public class FlowStopCommandGroup extends ParallelCommandGroup {
  /**
   * Creates a new FlowStopRace.
   */
  public FlowStopCommandGroup(GripperSubsystem gripperSubsystem, TunnelSubsystem tunnelSubsystem, ThrowerSubsystem throwerSubsystem) {
    super(new GripperRetractCommandGroup(gripperSubsystem), new TunnelStopCommand(tunnelSubsystem), new ThrowerStopCommand(throwerSubsystem));
  }
}
