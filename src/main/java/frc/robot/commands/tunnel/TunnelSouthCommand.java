/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.tunnel;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.TunnelSubsystem;

public class TunnelSouthCommand extends CommandBase {

  private TunnelSubsystem m_subsystem;

  /**
   * Creates a new TunnelSouthCommand.
   */
  public TunnelSouthCommand(TunnelSubsystem subsystem) {
    m_subsystem = subsystem;

    addRequirements(m_subsystem);
  }

  @Override
  public void initialize() {
    m_subsystem.runReverse();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
