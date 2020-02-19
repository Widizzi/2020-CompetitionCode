/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.climber;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ClimberSubsystem;
import frc.robot.subsystems.DriveSubsystem;

public class ClimbUPCommand extends CommandBase {

  private final ClimberSubsystem m_subsystem;

  private DriveSubsystem m_driveSubsystem;

  /**
   * Creates a new ClimbUPCommand.
   */
  public ClimbUPCommand(ClimberSubsystem subsystem, DriveSubsystem driveSubsystem) {
    m_subsystem = subsystem;
    m_driveSubsystem = driveSubsystem;

    addRequirements(m_subsystem, driveSubsystem);
  }

  public ClimbUPCommand(ClimberSubsystem subsystem) {
    m_subsystem = subsystem;

    addRequirements(m_subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_subsystem.climb();
  }
  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
}
